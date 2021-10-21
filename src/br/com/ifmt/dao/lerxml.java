package br.com.ifmt.dao;

import br.com.ifmt.controller.Cfop;
import br.com.ifmt.controller.ModFrete;
import br.com.ifmt.model.NFe;
import br.com.ifmt.model.CTe;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author TADS
 */
public class LerXml {

    private static int veiculo = 0;
    private static String tomador = "";
    private static String fretePorConta = "";

    public static NFe lerNFe(File arquivoNfe) {
        System.out.println("Arquivo: " + arquivoNfe.getName());
        NFe infNFe = new NFe();
        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder;
            builder = factory.newDocumentBuilder();

            Document doc = builder.parse(arquivoNfe);

            NodeList chNfe = doc.getElementsByTagName("chNFe");

            for (int i = 0; i < chNfe.getLength(); i++) {
                Node ch = chNfe.item(i);
                if (ch.getNodeName().equals("chNFe")) {

                    String numnota = ch.getTextContent().substring(25, 34);
                    infNFe.setNumNota(numnota);
                    ////System.out.println("Chave NFe: " + ch.getTextContent() + "\nNº Nota: " + numnota);
                    infNFe.setChaveNota(ch.getTextContent());

                }
            }

            NodeList nfe = doc.getElementsByTagName("NFe");

            int tagsDaNFe = nfe.getLength();

            if (tagsDaNFe == 0) {
                JOptionPane.showMessageDialog(null, "Arquivo selecionado não corresponde ha uma NF-e.");
            } else {

                for (int k = 0; k < tagsDaNFe; k++) {

                    Node tagNFe = nfe.item(k);
                    ////System.out.println("Elemento : " + tagNFe.getNodeName());

                    if (tagNFe.getNodeType() == Node.ELEMENT_NODE) {

                        Element elementoInterno = (Element) tagNFe;
                        NodeList listTagsInfNFe = elementoInterno.getChildNodes();// listTagsInfNFe armazena uma lista de tags da TAG NFe
                        int tamanholistTags = listTagsInfNFe.getLength();// Quantidade de tags dentro da TAG NFe

                        ////System.out.println("São " + tamanholistTags + " tags pertencentes a TAG Nfe.");
                        for (int i = 0; i < tamanholistTags; i++) {
                            Node tagsInternasNFe = listTagsInfNFe.item(i);// tagsInternasNFe representa cada uma das tags da TAG NFe
                            ////System.out.println("Tag [" + i + "]: " + tagsInternasNFe.getNodeName());

                            if (tagsInternasNFe.getNodeType() == Node.ELEMENT_NODE) {

                                Element nosDaTagNFe = (Element) tagsInternasNFe;
                                NodeList tagsDaInfNFe = nosDaTagNFe.getChildNodes();
                                int qtdTagsEmitente = tagsDaInfNFe.getLength();

                                for (int j = 0; j < qtdTagsEmitente; j++) {
                                    Node nosNFe = tagsDaInfNFe.item(j);
                                    ////System.out.println("Propiedade [" + tagsInternasNFe.getNodeName() + "]: " + nosNFe.getNodeName());

                                    if (nosNFe.getNodeType() == Node.ELEMENT_NODE) {
                                        Element elementoFilho = (Element) nosNFe;
                                        NodeList tagsDoElementoFilho = elementoFilho.getChildNodes();
                                        int qtdElementosFilhos = tagsDoElementoFilho.getLength();
                                        ////System.out.println("Tags da " + nosNFe.getNodeName());
                                        for (int v = 0; v < qtdElementosFilhos; v++) {
                                            Node noFilho = tagsDoElementoFilho.item(v);
                                            ////System.out.println("Tag [" + v + "]: " + noFilho.getNodeName());
                                            //Elementos da tag <emit>
                                            if (nosNFe.getNodeName().equals("emit")) {
                                                if (noFilho.getNodeName().equals("CNPJ")) {
                                                    //                                 //System.out.println("CNPJ do Emitente: " + noFilho.getTextContent());
                                                    infNFe.setCnpjEmitente(noFilho.getTextContent());
                                                }
                                                ////System.out.println("Tag [" + i + "] da infNFe: " + tagInternadeinfNFe.getNodeName());
                                                if (noFilho.getNodeName().equals("xNome")) {
                                                    //                                       //System.out.println("Nome do Emitente: " + noFilho.getTextContent());
                                                    infNFe.setEmitente(noFilho.getTextContent());
                                                }

                                                if (noFilho.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element tagsDoEmit = (Element) noFilho;
                                                    NodeList nosEnderEmit = tagsDoEmit.getChildNodes();
                                                    int qtdTagEnderEmit = nosEnderEmit.getLength();

                                                    for (int l = 0; l < qtdTagEnderEmit; l++) {
                                                        Node noEnder = nosEnderEmit.item(l);
                                                        if (noEnder.getNodeName().equals("UF")) {
                                                            //                                                 //System.out.println("Inicio Prestação: " + noEnder.getTextContent());
                                                            infNFe.setInicioPrestacao(noEnder.getTextContent());
                                                        }
                                                    }
                                                }
                                            }
                                            //Elementos da tag <dest>
                                            if (nosNFe.getNodeName().equals("dest")) {
                                                if (noFilho.getNodeName().equals("CNPJ")) {
                                                    //                                            //System.out.println("CNPJ do Destinatario: " + noFilho.getTextContent());
                                                    infNFe.setCnpjDestinatario(noFilho.getTextContent());
                                                }
                                                if (noFilho.getNodeName().equals("xNome")) {
                                                    //                                             //System.out.println("Nome do Destinatario: " + noFilho.getTextContent());
                                                    infNFe.setDestinatario(noFilho.getTextContent());
                                                }

                                                if (noFilho.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element tagsDoDest = (Element) noFilho;
                                                    NodeList nosEnderDest = tagsDoDest.getChildNodes();
                                                    int qtdTagEnderDest = nosEnderDest.getLength();

                                                    for (int l = 0; l < qtdTagEnderDest; l++) {
                                                        Node noEnder = nosEnderDest.item(l);
                                                        if (noEnder.getNodeName().equals("UF")) {
                                                            //                                                       //System.out.println("Fim Prestação: " + noEnder.getTextContent());
                                                            infNFe.setTerminoPrestacao(noEnder.getTextContent());
                                                        }
                                                    }
                                                }
                                            }
                                            //Elementos da tag <transp>
                                            if (nosNFe.getNodeName().equals("transp")) {
                                                if (noFilho.getNodeName().equals("modFrete")) {
                                                    fretePorConta = noFilho.getTextContent();
                                                }

                                                if (noFilho.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element tagsDoTransp = (Element) noFilho;
                                                    NodeList nosTransp = tagsDoTransp.getChildNodes();
                                                    int qtdTagTransp = nosTransp.getLength();

                                                    for (int l = 0; l < qtdTagTransp; l++) {
                                                        Node noTransp = nosTransp.item(l);

                                                        if (noTransp.getNodeType() == Node.ELEMENT_NODE) {
                                                            Element tagsTransp = (Element) noTransp;
                                                            NodeList nosFilhoTransp = tagsTransp.getChildNodes();
                                                            int qtdFilhoTransp = nosFilhoTransp.getLength();

                                                            for (int m = 0; m < qtdFilhoTransp; m++) {
                                                                Node noFilhoTransp = nosFilhoTransp.item(m);

                                                                if (noFilho.getNodeName().equals("veicTransp")) {

                                                                    if (noTransp.getNodeName().equals("placa")) {
                                                                        //System.out.println("Placa: " + noTransp.getTextContent());
                                                                        infNFe.setPlaca(noFilhoTransp.getTextContent());
                                                                    }
                                                                }
                                                                if (noFilho.getNodeName().equals("vol")) {

                                                                    if (noTransp.getNodeName().equals("pesoB")) {
                                                                        //                                                            //System.out.println("Peso Carga: " + noTransp.getTextContent());
                                                                        infNFe.setPeso(noFilhoTransp.getTextContent());
                                                                    }
                                                                }

                                                            }

                                                        }
                                                    }
                                                }
                                            }
                                            //Elementos da tag <det>
                                            if (nosNFe.getNodeName().equals("det")) {
                                                if (noFilho.getNodeName().equals("prod")) {

                                                    if (noFilho.getNodeType() == Node.ELEMENT_NODE) {
                                                        Element noProd = (Element) noFilho;
                                                        NodeList nosProd = noProd.getChildNodes();
                                                        int tamanhoNosProd = nosProd.getLength();

                                                        for (int l = 0; l < tamanhoNosProd; l++) {
                                                            Node noFilhoProd = nosProd.item(l);

                                                            if (noFilhoProd.getNodeName().equals("CFOP")) {
                                                                //                                                    //System.out.println("CFOP: " + noFilhoProd.getTextContent());
                                                                infNFe.setCfop(noFilhoProd.getTextContent());

                                                                Cfop cfop = Enum.valueOf(Cfop.class, "_" + infNFe.getCfop());
                                                                infNFe.setCfop(cfop.descricao);

                                                            }

                                                        }

                                                    }
                                                }
                                            }
                                            //Elementos da tag <total>
                                            if (nosNFe.getNodeName().equals("total")) {

                                                if (noFilho.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element tagsDoTotal = (Element) noFilho;
                                                    NodeList nosTotal = tagsDoTotal.getChildNodes();
                                                    int qtdTagTotal = nosTotal.getLength();

                                                    for (int l = 0; l < qtdTagTotal; l++) {
                                                        Node noTotal = nosTotal.item(l);

                                                        if (noTotal.getNodeType() == Node.ELEMENT_NODE) {
                                                            Element tagsTotal = (Element) noTotal;
                                                            NodeList nosFilhoTotal = tagsTotal.getChildNodes();
                                                            int qtdFilhoTotal = nosFilhoTotal.getLength();

                                                            for (int m = 0; m < qtdFilhoTotal; m++) {
                                                                Node noFilhoTotal = nosFilhoTotal.item(m);

                                                                if (noFilho.getNodeName().equals("ICMSTot")) {

                                                                    if (noTotal.getNodeName().equals("vProd")) {
                                                                        //                                                               //System.out.println("Valor da Carga: " + noTotal.getTextContent());
                                                                        infNFe.setValorMercadoria(noFilhoTotal.getTextContent());
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            /* Modalidade do frete
                0 - Por conta do emitente
                1 - Por conta destinatario/remetente
                2 - Por conta de terceiros
                9 - Sem frete
             */
            if (fretePorConta.equals("0")) {
                ModFrete mod = Enum.valueOf(ModFrete.class, "_" + fretePorConta);
                infNFe.setFretePorConta(mod.descricao);
            } else if (fretePorConta.equals("1")) {
                ModFrete mod = Enum.valueOf(ModFrete.class, "_" + fretePorConta);
                infNFe.setFretePorConta(mod.descricao);
            } else if (fretePorConta.equals("2")) {
                ModFrete mod = Enum.valueOf(ModFrete.class, "_" + fretePorConta);
                infNFe.setFretePorConta(mod.descricao);
            } else if (fretePorConta.equals("9")) {
                ModFrete mod = Enum.valueOf(ModFrete.class, "_" + fretePorConta);
                infNFe.setFretePorConta(mod.descricao);
            }

            infNFe.setTomador(infNFe.getDestinatario());

        } catch (ParserConfigurationException | IOException | SAXException ex) {
            Logger.getLogger(LerXml.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infNFe;
    }

    public static CTe lerCTe(File arquivoCTe) {
        System.out.println("Arquivo: " + arquivoCTe.getName());
        CTe infCTe = new CTe();

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder;
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(arquivoCTe);

            NodeList nfe = doc.getElementsByTagName("CTe");

            int tagsDaCTe = nfe.getLength();

            if (tagsDaCTe == 0) {
                JOptionPane.showMessageDialog(null, "Arquivo selecionado não corresponde ha uma CT-e.");
                return null;
            } else {

                for (int k = 0; k < tagsDaCTe; k++) {

                    Node tagNFe = nfe.item(k);
                    ////System.out.println("Elemento : " + tagNFe.getNodeName());

                    if (tagNFe.getNodeType() == Node.ELEMENT_NODE) {

                        Element elementoInterno = (Element) tagNFe;
                        // listTagsInfNFe armazena uma lista de tags da TAG NFe
                        NodeList listTagsInfCTe = elementoInterno.getChildNodes();
                        // Quantidade de tags dentro da TAG NFe
                        int tamanholistTags = listTagsInfCTe.getLength();

                        ////System.out.println("São " + tamanholistTags + " tags pertencentes a TAG CT-e.");
                        for (int i = 0; i < tamanholistTags; i++) {
                            // tagsInternasNFe representa cada uma das tags da TAG NFe
                            Node noFilhodaTagCTe = listTagsInfCTe.item(i);
                            ////System.out.println("    Tag [" + i + "]: " + noFilhodaTagCTe.getNodeName() + " -> TAG INTERNA DO <CTe>");

                            if (noFilhodaTagCTe.getNodeType() == Node.ELEMENT_NODE) {

                                //tagInfCTe armazena a os atributos da tag <infCTe>
                                Element tagInfCTe = (Element) noFilhodaTagCTe;
                                // tagsDaInfCTe armazena uma lista de nos filhos da tag <infCTe>
                                NodeList tagsDaInfCTe = tagInfCTe.getChildNodes();
                                int qtdTagsEmitente = tagsDaInfCTe.getLength();
                                ////System.out.println("São " + qtdTagsEmitente + " tags pertencentes a TAG " + tagInfCTe.getTagName());

                                for (int j = 0; j < qtdTagsEmitente; j++) {
                                    Node nosCTe = tagsDaInfCTe.item(j);
                                    ////System.out.println("    Tag [" + j + "] pertencente a " + tagInfCTe.getTagName() + ": " + nosCTe.getNodeName());
                                    ////System.out.println("Propiedade [" + tagsInternasNFe.getNodeName() + "]: " + nosNFe.getNodeName());

                                    if (nosCTe.getNodeType() == Node.ELEMENT_NODE) {
                                        Element elementoFilho = (Element) nosCTe;
                                        NodeList tagsDoElementoFilho = elementoFilho.getChildNodes();
                                        int qtdElementosFilhos = tagsDoElementoFilho.getLength();
                                        // //System.out.println("São " + qtdElementosFilhos + " tags pertencentes a TAG " + elementoFilho.getTagName());
                                        ////System.out.println("Tags da " + nosNFe.getNodeName());
                                        for (int v = 0; v < qtdElementosFilhos; v++) {
                                            Node noFilho = tagsDoElementoFilho.item(v);
                                            ////System.out.println(" TAG [" + v + "] da tag " + elementoFilho.getTagName() + ": " + noFilho.getNodeName());
                                            ////System.out.println("Tag [" + v + "]: " + noFilho.getNodeName());

                                            if (nosCTe.getNodeName().equals("ide")) {
                                                //pegando o CFOP
                                                if (noFilho.getNodeName().equals("CFOP")) {
                                                    //System.out.println("CFOP: " + noFilho.getTextContent());
                                                    infCTe.setCfop(noFilho.getTextContent());
                                                    Cfop cfop = Enum.valueOf(Cfop.class, "_" + infCTe.getCfop());

                                                    if (!cfop.getDescricao().isEmpty()) {
                                                        infCTe.setCfop(cfop.descricao);
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "NFe com CFOP não cadastrado.\nCFOP do documento: " + infCTe.getCfop());
                                                    }
                                                }
                                                if (noFilho.getNodeName().equals("toma03")) {

                                                    NodeList nosToma03 = noFilho.getChildNodes();
                                                    int tamanhoNosToma03 = nosToma03.getLength();
                                                    for (int q = 0; q < tamanhoNosToma03; q++) {
                                                        Node noToma03 = nosToma03.item(q);

                                                        if (noToma03.getNodeType() == Node.ELEMENT_NODE) {

                                                            if (noToma03.getNodeName().equalsIgnoreCase("toma")) {

                                                                tomador = noToma03.getTextContent();

                                                                ////System.out.println("Tomador: " + tomador);
                                                                /*  0-Remetente; 
                                                                    1-Expedidor; 
                                                                    2-Recebedor; 
                                                                    3-Destinatário
                                                                 */
                                                            }
                                                        }
                                                    }
                                                }
                                            }

                                            //Pegando as informações do emitente
                                            if (nosCTe.getNodeName().equals("emit")) {
                                                if (noFilho.getNodeName().equals("xNome")) {
                                                    //System.out.println("Nome do Remetente: " + noFilho.getTextContent());
                                                    infCTe.setEmitente(noFilho.getTextContent());
                                                }
                                            }
                                            //Pegando as informações do remetente
                                            if (nosCTe.getNodeName().equals("rem")) {
                                                if (noFilho.getNodeName().equals("CNPJ")) {
                                                    //System.out.println("CNPJ do Remetente: " + noFilho.getTextContent());
                                                    infCTe.setCnpjRemetente(noFilho.getTextContent());
                                                }
                                                if (noFilho.getNodeName().equals("xNome")) {
                                                    //System.out.println("Nome do Remetente: " + noFilho.getTextContent());
                                                    infCTe.setRemetente(noFilho.getTextContent());
                                                }
                                            }
                                            //Pegando as informações do expedidor
                                            if (nosCTe.getNodeName().equals("exped")) {
                                                if (noFilho.getNodeName().equals("xNome")) {
                                                    //System.out.println("Nome do Remetente: " + noFilho.getTextContent());
                                                    infCTe.setExpedidor(noFilho.getTextContent());
                                                }
                                            }
                                            //Pegando as informações do recebedor
                                            if (nosCTe.getNodeName().equals("receb")) {
                                                if (noFilho.getNodeName().equals("xNome")) {
                                                    infCTe.setRecebedor(noFilho.getTextContent());
                                                }
                                            }
                                            //pegando as Informações do destinatario
                                            if (nosCTe.getNodeName().equals("dest")) {
                                                if (noFilho.getNodeName().equals("CNPJ")) {
                                                    infCTe.setCnpjDestinatario(noFilho.getTextContent());
                                                }
                                                if (noFilho.getNodeName().equals("xNome")) {
                                                    infCTe.setDestinatario(noFilho.getTextContent());
                                                }
                                            }
                                            //pegando as Informações do Valor a Receber
                                            if (nosCTe.getNodeName().equals("vPrest")) {
                                                if (noFilho.getNodeName().equals("vRec")) {
                                                    infCTe.setValorRecerber(noFilho.getTextContent());
                                                }
                                            }

                                            if (noFilho.getNodeType() == Node.ELEMENT_NODE) {
                                                Element elementoNeto = (Element) noFilho;
                                                NodeList tagsElementoNeto = elementoNeto.getChildNodes();
                                                int qtdTagsElementoNeto = tagsElementoNeto.getLength();
                                                ////System.out.println("São " + qtdTagsElementoNeto + " tags pertencentes a TAG " + elementoNeto.getTagName());

                                                for (int l = 0; l < qtdTagsElementoNeto; l++) {

                                                    Node noBisNeto = tagsElementoNeto.item(l);
                                                    ////System.out.println(" TAG [" + l + "] da tag " + elementoNeto.getTagName() + ": " + noBisNeto.getNodeName());

                                                    if (noBisNeto.getNodeType() == Node.ELEMENT_NODE) {

                                                        Element elementoTriNeto = (Element) noBisNeto;
                                                        NodeList tagsElementoTriNeto = elementoTriNeto.getChildNodes();
                                                        int qtdTagsElementoTriNeto = tagsElementoTriNeto.getLength();

                                                        ////System.out.println("São " + qtdTagsElementoTriNeto + " tags pertencentes a TAG " + elementoTriNeto.getTagName());
                                                        for (int x = 0; x < qtdTagsElementoTriNeto; x++) {

                                                            Node noTriNeto = tagsElementoTriNeto.item(x);
                                                            ////System.out.println(" TAG [" + x + "] da tag " + elementoTriNeto.getTagName() + ": " + noTriNeto.getNodeName());

                                                            if (nosCTe.getNodeName().equals("infCTeNorm")) {
                                                                if (noFilho.getNodeName().equals("infCarga")) {
                                                                    //pega valor da tag vCarga
                                                                    if (noBisNeto.getNodeName().equals("vCarga")) {
                                                                        //System.out.println("Valor da Carga: " + noBisNeto.getTextContent());
                                                                        infCTe.setValorMercadoria(noBisNeto.getTextContent());
                                                                    }
                                                                    //pega valor da qtd da carga tag vCarga
                                                                    if (noBisNeto.getNodeName().equals("infQ")) {
                                                                        if (noTriNeto.getNodeName().equals("qCarga")) {
                                                                            //System.out.println("Peso da Carga: " + noTriNeto.getTextContent());
                                                                            infCTe.setPeso(noTriNeto.getTextContent());
                                                                        }
                                                                    }
                                                                }
                                                                //Chave da NFe
                                                                if (noFilho.getNodeName().equals("infDoc")) {
                                                                    if (noBisNeto.getNodeName().equals("infNFe")) {
                                                                        if (noTriNeto.getNodeName().equals("chave")) {
                                                                            String chave = noTriNeto.getTextContent();

                                                                            String numnota = chave.substring(25, 34);

                                                                            infCTe.setChaveNota(chave);

                                                                            infCTe.setNumNota(StringUtils.leftPad(numnota, 9, "0"));

                                                                            if (chave.equals(StringUtils.leftPad(numnota, 9, "0"))) {
                                                                                //System.out.println("TRUE");
                                                                            }

                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            //Inicio prestação
                                                            if (nosCTe.getNodeName().equals("rem")) {
                                                                if (noFilho.getNodeName().equals("enderReme")) {
                                                                    if (noBisNeto.getNodeName().equals("UF")) {
                                                                        //System.out.println("Inicio Prestação: " + noTriNeto.getTextContent());
                                                                        infCTe.setInicioPrestacao(noTriNeto.getTextContent());
                                                                    }
                                                                }
                                                            }
                                                            //Fim da prestação
                                                            if (nosCTe.getNodeName().equals("dest")) {
                                                                if (noFilho.getNodeName().equals("enderDest")) {
                                                                    if (noBisNeto.getNodeName().equals("UF")) {
                                                                        //System.out.println("Fim Prestação: " + noTriNeto.getTextContent());
                                                                        infCTe.setTerminoPrestacao(noTriNeto.getTextContent());
                                                                    }
                                                                }
                                                            }

                                                            if (noTriNeto.getNodeType() == Node.ELEMENT_NODE) {

                                                                Element elementoQuaNeto = (Element) noTriNeto;
                                                                NodeList tagsElementoQuaNeto = elementoQuaNeto.getChildNodes();
                                                                int qtdTagsElementoQuaNeto = tagsElementoQuaNeto.getLength();
                                                                ////System.out.println("São " + qtdTagsElementoTriNeto + " tags pertencentes a TAG " + elementoTriNeto.getTagName());

                                                                for (int p = 0; p < qtdTagsElementoQuaNeto; p++) {
                                                                    Node noQuaNeto = tagsElementoQuaNeto.item(p);

                                                                    if (noQuaNeto.getNodeType() == Node.ELEMENT_NODE) {

                                                                        if (noBisNeto.getNodeName().equals("rodo")) {

                                                                            if (noTriNeto.getNodeName().equals("veic")) {

                                                                                if (noQuaNeto.getNodeName().equals("cInt")) {
                                                                                    veiculo = Integer.parseInt(noQuaNeto.getTextContent());
                                                                                }
                                                                                if (veiculo == 1) {
                                                                                    if (noQuaNeto.getNodeName().equals("placa")) {
                                                                                        //System.out.println("Placa: " + noQuaNeto.getTextContent());
                                                                                        infCTe.setPlaca(noQuaNeto.getTextContent());
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (tomador.equals("0")) {
                infCTe.setTomador(infCTe.getRemetente());
            } else if (tomador.equals("1")) {
                infCTe.setTomador(infCTe.getExpedidor());
            } else if (tomador.equals("2")) {
                infCTe.setTomador(infCTe.getRecebedor());
            } else if (tomador.equals("3")) {
                infCTe.setTomador(infCTe.getDestinatario());
            }

        } catch (ParserConfigurationException | IOException | SAXException ex) {
            Logger.getLogger(LerXml.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infCTe;
    }

}
