/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifmt.view;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SWServiceInvoker {
	private String	domain;
	private String	user;
	private String	pass;
	private boolean	debug;
	private boolean	silentMode;

	public SWServiceInvoker(String domain, String user, String pass) {
		this.domain = domain;
		this.user = user;
		this.pass = pass;
	}

	public void setSilentMode(boolean silentMode) {
		this.silentMode = silentMode;
	}

	public void setDebugMode() {
		this.debug = true;
	}

	public Document call(String serviceName, String module, String body) throws Exception {
		String jsessionid = doLogin();

		URLConnection conn = openConn(serviceName, module, jsessionid);

		Document docResp = callService(conn, body, serviceName);

		doLogout(jsessionid);

		return docResp;
	}

	private String doLogin() throws Exception {
		URLConnection conn = openConn("MobileLoginSP.login", "mge", null);

		StringBuffer bodyBuf = new StringBuffer();

		bodyBuf.append("<NOMUSU>").append(user).append("</NOMUSU>");
		bodyBuf.append("<INTERNO>").append(pass).append("</INTERNO>");

		Document docResp = callService(conn, bodyBuf.toString(), "MobileLoginSP.login");

		Node jsessionNode = (Node) xpath(docResp, "//jsessionid", XPathConstants.NODE);

		return jsessionNode.getTextContent().trim();
	}

	private void doLogout(String jsessionid) throws Exception {
		try {
			URLConnection conn = openConn("MobileLoginSP.logout", "mge", jsessionid);

			callService(conn, null, "MobileLoginSP.logout");
		} catch (Exception e) {
			e.printStackTrace(); // pode ser ignorado
		}
	}

	private void checkResultStatus(Node sr) throws Exception {
		Node statusNode = sr.getAttributes().getNamedItem("status");

		String status = statusNode.getTextContent().trim();

		if (!"1".equals(status) && !silentMode) {
			String msg = getChildNode("statusMessage", sr).getTextContent();
			throw new Exception(decodeB64(msg.trim()));
		}
	}

	private Node getChildNode(String name, Node parent) {
		NodeList l = parent.getChildNodes();

		for (int i = 0; i < l.getLength(); i++) {
			Node n = l.item(i);

			if (n.getNodeName().equalsIgnoreCase(name)) {
				return n;
			}
		}

		return null;
	}

	private String decodeB64(String s) {
		return new String(Base64.decodeBase64(s.getBytes()));
	}

	private Object xpath(Document d, String query, QName type) throws Exception {
		XPath xp = XPathFactory.newInstance().newXPath();

		XPathExpression xpe = xp.compile(query);
		return xpe.evaluate(d, type);
	}

	private void printNode(Node n) {
		System.out.println(n.toString());

		NodeList l = n.getChildNodes();

		if (l != null && l.getLength() > 0) {
			for (int i = 0; i < l.getLength(); i++) {
				printNode(l.item(i));
			}
		}
	}

	private Document callService(URLConnection conn, String body, String serviceName) throws Exception {
		OutputStream out = null;
		InputStream inp = null;

		try {
			out = conn.getOutputStream();
			OutputStreamWriter wout = new OutputStreamWriter(out, "ISO-8859-1");

			String requestBody = buildRequestBody(body, serviceName);

			if (debug) {
				System.out.println(requestBody);
			}
			wout.write(requestBody);

			wout.flush();

			inp = conn.getInputStream();

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			Document doc = null;
			NodeList nodes = null;

			try {
				doc = db.parse(inp);
				
				if(debug) {
					printDocument(doc);
				}

				nodes = doc.getElementsByTagName("serviceResponse");
				
				if(debug) {
					printNode(nodes.item(0));
				}
			
				if (nodes == null || nodes.getLength() == 0) {
					throw new Exception("XML de resposta não possui um elemento de resposta");
				}
			} catch (Exception e) {
				Exception error = new Exception("Erro ao interpretar resposta do servidor");
				error.initCause(e);
				throw error;
			}

			checkResultStatus(nodes.item(0));

			return doc;
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
				}
			}

			if (inp != null) {
				try {
					inp.close();
				} catch (Exception e) {
				}
			}
		}
	}

	private String buildRequestBody(String body, String serviceName) {
		StringBuffer buf = new StringBuffer();

		buf.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n");
		buf.append("<serviceRequest serviceName=\"").append(serviceName).append("\">\n");
		buf.append("<requestBody>\n");
		buf.append(body == null ? "" : body);
		buf.append("</requestBody>\n");
		buf.append("</serviceRequest>");

		return buf.toString();
	}

	private URLConnection openConn(String serviceName, String module, String sessionID) throws Exception {
		StringBuffer buf = new StringBuffer();

		buf.append(domain).append(domain.endsWith("/") ? "" : "/").append(module == null ? "mge" : module).append("/service.sbr");

		/*if (sessionID != null) {
			buf.append(";JSESSIONID=").append(sessionID);
		}*/

		buf.append("?serviceName=").append(serviceName);

		if (sessionID != null) {
			buf.append("&mgeSession=").append(sessionID);
		}

		URL u = new URL(buf.toString());

		URLConnection uc = u.openConnection();
		HttpURLConnection connection = (HttpURLConnection) uc;

		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setRequestMethod("POST");
		connection.setRequestProperty("content-type", "text/xml");
		
		if(sessionID != null) {
			connection.setRequestProperty("Cookie", "JSESSIONID=" + sessionID);
		}
		
		connection.setRequestProperty("User-Agent", "SWServiceInvoker");

		return connection;
	}

	private static void printDocument(Document doc) throws Exception {
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		StreamResult result = new StreamResult(new StringWriter());
		DOMSource source = new DOMSource(doc);
		transformer.transform(source, result);
		String xmlString = result.getWriter().toString();
		System.out.println("----inicio---");
		System.out.println(xmlString);
		System.out.println("----fim-----");
	}
}
