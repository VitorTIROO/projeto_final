package br.com.ifmt.view;

import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

//importa classe necessária para utilização da API
//import br.com.sankhya.service.SWServiceInvoker;
public class Main {
	public static void main(String[] args) {
		try {
			listarCidade();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void listarCidade() {
		SWServiceInvoker si = new SWServiceInvoker("http://192.168.1.231:8080/mge/", "Technolog", "tecH30#07");
		
		try{
			//SAVE
			//String xmlAsString = "<entity name='Cidade'><campo nome='CODCID'>12312</campo><campo nome='NOMECID'>Sao Paulo</campo><campo nome='UF'>1</campo></entity>";
			//Document docRet = serviceInvoker.call("crud.save", "mge", xmlAsString);
			//FIND
                        
      
                        
			String xmlAsString  = "<query viewName='VW_VIAGENS_CTE'>"
                                + "<where>VW_VIAGENS_CTE.CLIENT_ID = 78261252000676\n" +
                                    " </where>"
                                + "</query>";
			Document docRet = si.call("CRUDServiceProvider.loadView", "mge", xmlAsString);
			//REMOVE
			//String xmlAsString  = "<entity name='Cidade'><campo nome='CODCID'>12312</campo></entity>";
			//Document docRet = si.call("crud.remove", "mge", xmlAsString);
			printDocument(docRet);                        
		}catch(Exception e){
			e.printStackTrace();
		}
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
