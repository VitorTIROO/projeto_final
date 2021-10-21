package br.com.ifmt.controller;

import br.com.ifmt.model.CTe;
import br.com.ifmt.model.NFe;
import br.com.ifmt.view.JFPrincipal;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 * @author Vitor Santos
 */
public class Util {

    private DefaultTableModel modelo = new DefaultTableModel();
    private final String CERTO = "16_Check.png";
    private final String ERRADO = "16_Delete.png";
    private Icon aprovar;

    public void setDados(JTable jTCampos, String campo, String valorNFe, String valorCTe, boolean certo) {

        modelo = (DefaultTableModel) jTCampos.getModel();
        
        JTableRenderer jTableRenderer = new JTableRenderer();

        jTableRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTCampos.getColumnModel().getColumn(3).setCellRenderer(jTableRenderer);

        modelo = (DefaultTableModel) jTCampos.getModel();
        
        Object[] dados = {campo, valorNFe, valorCTe, certo(certo)};
        modelo.addRow(dados);
    }

    public Icon certo(boolean certo) {
        if (certo) {
            aprovar = new ImageIcon(getClass().getResource("/br/com/ifmt/imagens/" + CERTO));
        } else {
            aprovar = new ImageIcon(getClass().getResource("/br/com/ifmt/imagens/" + ERRADO));
        }

        return aprovar;
    }

    public String pegaArquivo() {
        JFileChooser arquivo = new JFileChooser();
        int botao = arquivo.showOpenDialog(JFPrincipal.jPPrincipal);
        if (botao == JFileChooser.APPROVE_OPTION) {
            return arquivo.getSelectedFile().getPath();
        }
        return "";
    }

    public void verificaTextFields() {
        if (!JFPrincipal.jTFCte.getText().isEmpty() && !JFPrincipal.jTFNfe.getText().isEmpty()) {
            JFPrincipal.jBComparar.setEnabled(true);
        }
    }

    public String comparar(NFe infNfe, CTe infCTe) {

        String jTAResultados = "";
        Object[] obj;
        //1 - CNPJ Destinatario
        if (!infNfe.getCnpjDestinatario().equalsIgnoreCase(infCTe.getCnpjDestinatario())) {
            jTAResultados = jTAResultados + "\nCNPJ do destinatario: DIFERENTES";
            setDados(JFPrincipal.jTCampos, "CNPJ Destinatario", infNfe.getCnpjDestinatario(), infCTe.getCnpjDestinatario(), false);
        } else {
            jTAResultados = jTAResultados + "\nCNPJ do destinatario: OK";
            setDados(JFPrincipal.jTCampos, "CNPJ Destinatario", infNfe.getCnpjDestinatario(), infCTe.getCnpjDestinatario(), true);
        }
        //2 - CNPJ Emitente
        if (!infNfe.getCnpjEmitente().equalsIgnoreCase(infCTe.getCnpjRemetente())) {
            setDados(JFPrincipal.jTCampos, "CNPJ - Remetente", infNfe.getCnpjEmitente(), infCTe.getCnpjRemetente(), false);
            jTAResultados = jTAResultados + "\nCNPJ do remetente: DIFERENTES";
        } else {
            jTAResultados = jTAResultados + "\nCNPJ do remetente: OK";
            setDados(JFPrincipal.jTCampos, "CNPJ - Remetente", infNfe.getCnpjEmitente(), infCTe.getCnpjRemetente(), true);
        }
        //3 - Chave Nota
        if (!infNfe.getChaveNota().equalsIgnoreCase(infCTe.getChaveNota())) {
            jTAResultados = jTAResultados + "\nChave da NF-e: DIFERENTES";
            setDados(JFPrincipal.jTCampos, " Chave Nota", infNfe.getChaveNota(), infCTe.getChaveNota(), false);
        } else {
            jTAResultados = jTAResultados + "\nChave da NF-e: OK";
            setDados(JFPrincipal.jTCampos, "Chave Nota", infNfe.getChaveNota(), infCTe.getChaveNota(), true);
        }
        //4 - Placa
        if (!infNfe.getPlaca().equalsIgnoreCase(infCTe.getPlaca())) {
            jTAResultados = jTAResultados + "\nPlaca do Cavalo: DIFERENTES";
            setDados(JFPrincipal.jTCampos, "Placa", infNfe.getPlaca(), infCTe.getPlaca(), false);
        } else {
            jTAResultados = jTAResultados + "\nPlaca do Cavalo: OK";
            setDados(JFPrincipal.jTCampos, "Placa", infNfe.getPlaca(), infCTe.getPlaca(), true);
        }
        //5 - Remetente
        if (!infNfe.getEmitente().equalsIgnoreCase(infCTe.getRemetente())) {
            jTAResultados = jTAResultados + "\nRemetente: DIFERENTES";
            setDados(JFPrincipal.jTCampos, "Remetente", infNfe.getEmitente(), infCTe.getRemetente(), false);
        } else {
            jTAResultados = jTAResultados + "\nRemetente: OK";
            setDados(JFPrincipal.jTCampos, "Remetente", infNfe.getEmitente(), infCTe.getRemetente(), true);
        }
        //6 - Destinatario
        if (!infNfe.getDestinatario().equalsIgnoreCase(infCTe.getDestinatario())) {
            jTAResultados = jTAResultados + "\nDestinatario: DIFERENTES";
            setDados(JFPrincipal.jTCampos, "Destinatario", infNfe.getDestinatario(), infCTe.getDestinatario(), false);
        } else {
            jTAResultados = jTAResultados + "\nDestinatario: OK";
            setDados(JFPrincipal.jTCampos, "Destinatario", infNfe.getDestinatario(), infCTe.getDestinatario(), true);
        }
        //7 - CFOP
        if (!infNfe.getCfop().equalsIgnoreCase(infCTe.getCfop())) {
            jTAResultados = jTAResultados + "\nCFOP: DIFERENTES";
            setDados(JFPrincipal.jTCampos, "CFOP", infNfe.getCfop(), infCTe.getCfop(), false);
        } else {
            jTAResultados = jTAResultados + "\nCFOP: OK";
            setDados(JFPrincipal.jTCampos, "CFOP", infNfe.getCfop(), infCTe.getCfop(), true);
        }
        //8 - Vlr. Receber
        if (!infNfe.getValorReceber().equalsIgnoreCase(infCTe.getValorRecerber())) {
            jTAResultados = jTAResultados + "\nVlr. Receber: DIFERENTES";
            setDados(JFPrincipal.jTCampos, "Vlr. Receber", infNfe.getValorReceber(), infCTe.getValorRecerber(), false);
        } else {
            jTAResultados = jTAResultados + "\nVlr. Receber: OK";
            setDados(JFPrincipal.jTCampos, "Vlr. Receber", infNfe.getValorReceber(), infCTe.getValorRecerber(), true);
        }
        //9 - Vlr. Mercadoria
        if (!infNfe.getValorMercadoria().equalsIgnoreCase(infCTe.getValorMercadoria())) {
            jTAResultados = jTAResultados + "\nVlr. Mercadoria: DIFERENTES";
            setDados(JFPrincipal.jTCampos, "Vlr. Mercadoria", infNfe.getValorMercadoria(), infCTe.getValorMercadoria(), false);
        } else {
            jTAResultados = jTAResultados + "\nVlr. Mercadoria: OK";
            setDados(JFPrincipal.jTCampos, "Vlr. Mercadoria", infNfe.getValorMercadoria(), infCTe.getValorMercadoria(), true);
        }
        //10 - Peso
        if (!infNfe.getPeso().equalsIgnoreCase(infCTe.getPeso())) {
            jTAResultados = jTAResultados + "\nPeso: DIFERENTES";
            setDados(JFPrincipal.jTCampos, "Peso", infNfe.getPeso(), infCTe.getPeso(), false);
        } else {
            jTAResultados = jTAResultados + "\nPeso: OK";
            setDados(JFPrincipal.jTCampos, "Peso", infNfe.getPeso(), infCTe.getPeso(), true);
        }

        return jTAResultados;
    }

}//class
