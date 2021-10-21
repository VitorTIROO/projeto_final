package br.com.ifmt.view;

import br.com.ifmt.model.*;

/**
 * @author Vitor Ribeiro dos Santos, Livia Mara
 */
public class JDVisualizarInformacoes extends javax.swing.JDialog {

    private NFe nfe;
    private CTe cte;
    
    public JDVisualizarInformacoes(java.awt.Frame parent, boolean modal, NFe nfe, CTe cte) {
        super(parent, modal);
        this.cte = cte;
        this.nfe = nfe;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPInformacoes = new javax.swing.JPanel();
        jPInfNfe = new javax.swing.JPanel();
        jTFEmitenteNfe = new javax.swing.JTextField();
        jTFFimPrestacaoNfe = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFVlrMercadoriaNfe = new javax.swing.JTextField();
        jTFDestinatarioNfe = new javax.swing.JTextField();
        jTFVlrReceberNfe = new javax.swing.JTextField();
        jTFCfopNfe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFTomadorNfe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFIniPrestacaoNfe = new javax.swing.JTextField();
        jTFNNotaNfe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFChaveNotaNfe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTFCnpjEmitenteNfe = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTFCnpjDestinatarioNfe = new javax.swing.JTextField();
        jTFPlacaNfe = new javax.swing.JTextField();
        jLPlaca = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTFPesoNfe = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTFFreteNfe = new javax.swing.JTextField();
        jPInfCte = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTFEmitenteCte = new javax.swing.JTextField();
        jTFFimPrestacaoCte = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTFVlrMercadoriaCte = new javax.swing.JTextField();
        jTFDestinatarioCte = new javax.swing.JTextField();
        jTFVlrReceberCte = new javax.swing.JTextField();
        jTFCfopCte = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTFTomadorCte = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTFIniPrestacaoCte = new javax.swing.JTextField();
        jTFNNotaCte = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTFChaveNotaCte = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTFCnpjEmitenteCte = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTFCnpjDestinatario = new javax.swing.JTextField();
        jTFPlacaCte = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTFPesoCte = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTFFreteCte = new javax.swing.JTextField();
        jBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Infromações dos Documentos");
        setResizable(false);

        jPInformacoes.setPreferredSize(new java.awt.Dimension(780, 513));

        jPInfNfe.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTFEmitenteNfe.setEditable(false);
        jTFEmitenteNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFEmitenteNfe.setText(nfe.getEmitente());

        jTFFimPrestacaoNfe.setEditable(false);
        jTFFimPrestacaoNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFFimPrestacaoNfe.setText(nfe.getTerminoPrestacao());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Vlr. Receber:");

        jTFVlrMercadoriaNfe.setEditable(false);
        jTFVlrMercadoriaNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFVlrMercadoriaNfe.setText(nfe.getValorMercadoria());

        jTFDestinatarioNfe.setEditable(false);
        jTFDestinatarioNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFDestinatarioNfe.setText(nfe.getDestinatario());

        jTFVlrReceberNfe.setEditable(false);
        jTFVlrReceberNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFVlrReceberNfe.setText(nfe.getValorReceber());

        jTFCfopNfe.setEditable(false);
        jTFCfopNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFCfopNfe.setText(nfe.getCfop());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Chave Nota:");

        jTFTomadorNfe.setEditable(false);
        jTFTomadorNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFTomadorNfe.setText(nfe.getTomador());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Vlr. Mercadoria:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Destinatario:");

        jTFIniPrestacaoNfe.setEditable(false);
        jTFIniPrestacaoNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFIniPrestacaoNfe.setText(nfe.getInicioPrestacao());

        jTFNNotaNfe.setEditable(false);
        jTFNNotaNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFNNotaNfe.setText(nfe.getNumNota());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ini. Prestação:");

        jTFChaveNotaNfe.setEditable(false);
        jTFChaveNotaNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFChaveNotaNfe.setText(nfe.getChaveNota());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Emitente:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CFOP:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Fim Prestação:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("N° Nota:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tomador:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("CNPJ:");

        jTFCnpjEmitenteNfe.setEditable(false);
        jTFCnpjEmitenteNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFCnpjEmitenteNfe.setText(nfe.getCnpjEmitente());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("CNPJ:");

        jTFCnpjDestinatarioNfe.setEditable(false);
        jTFCnpjDestinatarioNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFCnpjDestinatarioNfe.setText(nfe.getCnpjDestinatario());

        jTFPlacaNfe.setEditable(false);
        jTFPlacaNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFPlacaNfe.setText(nfe.getPlaca());

        jLPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLPlaca.setText("Placa:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Peso:");

        jTFPesoNfe.setEditable(false);
        jTFPesoNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFPesoNfe.setText(nfe.getPeso());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Frete:");

        jTFFreteNfe.setEditable(false);
        jTFFreteNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFFreteNfe.setText(nfe.getFretePorConta());

        javax.swing.GroupLayout jPInfNfeLayout = new javax.swing.GroupLayout(jPInfNfe);
        jPInfNfe.setLayout(jPInfNfeLayout);
        jPInfNfeLayout.setHorizontalGroup(
            jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInfNfeLayout.createSequentialGroup()
                .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPInfNfeLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInfNfeLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCfopNfe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                            .addComponent(jTFChaveNotaNfe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPInfNfeLayout.createSequentialGroup()
                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInfNfeLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFDestinatarioNfe, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFTomadorNfe, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFEmitenteNfe, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPInfNfeLayout.createSequentialGroup()
                                .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPInfNfeLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFFreteNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPInfNfeLayout.createSequentialGroup()
                                                .addComponent(jTFVlrMercadoriaNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTFVlrReceberNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPInfNfeLayout.createSequentialGroup()
                                                .addComponent(jTFNNotaNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPInfNfeLayout.createSequentialGroup()
                                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInfNfeLayout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInfNfeLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInfNfeLayout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCnpjDestinatarioNfe)
                            .addComponent(jTFCnpjEmitenteNfe)
                            .addGroup(jPInfNfeLayout.createSequentialGroup()
                                .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFPesoNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFPlacaNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPInfNfeLayout.createSequentialGroup()
                                .addComponent(jTFIniPrestacaoNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFFimPrestacaoNfe)))))
                .addContainerGap())
        );
        jPInfNfeLayout.setVerticalGroup(
            jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInfNfeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPInfNfeLayout.createSequentialGroup()
                        .addComponent(jTFCnpjEmitenteNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCnpjDestinatarioNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFFreteNfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFFimPrestacaoNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFIniPrestacaoNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPInfNfeLayout.createSequentialGroup()
                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFEmitenteNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFDestinatarioNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFPlacaNfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFTomadorNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPInfNfeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFPesoNfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInfNfeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFVlrMercadoriaNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFVlrReceberNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)))))
                .addGap(18, 18, 18)
                .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFChaveNotaNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFNNotaNfe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPInfNfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCfopNfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPInfNfeLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLPlaca, jLabel1, jLabel10, jLabel11, jLabel12, jLabel14, jLabel15, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jTFCfopNfe, jTFChaveNotaNfe, jTFCnpjDestinatarioNfe, jTFCnpjEmitenteNfe, jTFDestinatarioNfe, jTFEmitenteNfe, jTFFimPrestacaoNfe, jTFFreteNfe, jTFIniPrestacaoNfe, jTFNNotaNfe, jTFPesoNfe, jTFPlacaNfe, jTFTomadorNfe, jTFVlrMercadoriaNfe, jTFVlrReceberNfe});

        javax.swing.GroupLayout jPInformacoesLayout = new javax.swing.GroupLayout(jPInformacoes);
        jPInformacoes.setLayout(jPInformacoesLayout);
        jPInformacoesLayout.setHorizontalGroup(
            jPInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPInformacoesLayout.createSequentialGroup()
                .addComponent(jPInfNfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPInformacoesLayout.setVerticalGroup(
            jPInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPInfNfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Infromações NF-e", jPInformacoes);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTFEmitenteCte.setEditable(false);
        jTFEmitenteCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFEmitenteCte.setText(cte.getEmitente());

        jTFFimPrestacaoCte.setEditable(false);
        jTFFimPrestacaoCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFFimPrestacaoCte.setText(cte.getTerminoPrestacao());

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Vlr. Receber:");

        jTFVlrMercadoriaCte.setEditable(false);
        jTFVlrMercadoriaCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFVlrMercadoriaCte.setText(cte.getValorMercadoria());

        jTFDestinatarioCte.setEditable(false);
        jTFDestinatarioCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFDestinatarioCte.setText(cte.getDestinatario());

        jTFVlrReceberCte.setEditable(false);
        jTFVlrReceberCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFVlrReceberCte.setText(cte.getValorRecerber());

        jTFCfopCte.setEditable(false);
        jTFCfopCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFCfopCte.setText(cte.getCfop());

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Chave Nota:");

        jTFTomadorCte.setEditable(false);
        jTFTomadorCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFTomadorCte.setText(cte.getTomador());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Vlr. Mercadoria:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Destinatario:");

        jTFIniPrestacaoCte.setEditable(false);
        jTFIniPrestacaoCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFIniPrestacaoCte.setText(cte.getInicioPrestacao());

        jTFNNotaCte.setEditable(false);
        jTFNNotaCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFNNotaCte.setText(cte.getNumNota());

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Ini. Prestação:");

        jTFChaveNotaCte.setEditable(false);
        jTFChaveNotaCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFChaveNotaCte.setText(cte.getChaveNota());

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Emitente:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("CFOP:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Fim Prestação:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("N° Nota:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Tomador:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("CNPJ:");

        jTFCnpjEmitenteCte.setEditable(false);
        jTFCnpjEmitenteCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFCnpjEmitenteCte.setText(cte.getCnpjRemetente());

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("CNPJ:");

        jTFCnpjDestinatario.setEditable(false);
        jTFCnpjDestinatario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFCnpjDestinatario.setText(cte.getCnpjDestinatario());

        jTFPlacaCte.setEditable(false);
        jTFPlacaCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFPlacaCte.setText(cte.getPlaca());

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Placa:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Peso:");

        jTFPesoCte.setEditable(false);
        jTFPesoCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFPesoCte.setText(cte.getPeso());

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Frete:");

        jTFFreteCte.setEditable(false);
        jTFFreteCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFFreteCte.setText(cte.getFretePorConta());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel18)
                        .addComponent(jLabel25)
                        .addComponent(jLabel19)
                        .addComponent(jLabel21))
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jTFNNotaCte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFChaveNotaCte, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jTFFreteCte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFDestinatarioCte, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                    .addComponent(jTFTomadorCte, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFEmitenteCte, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jTFVlrMercadoriaCte, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFVlrReceberCte, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFPesoCte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFPlacaCte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCnpjDestinatario)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jTFIniPrestacaoCte, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(jTFFimPrestacaoCte, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFCnpjEmitenteCte, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTFCfopCte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFDestinatarioCte, jTFEmitenteCte, jTFTomadorCte});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFEmitenteCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFDestinatarioCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFVlrReceberCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFVlrMercadoriaCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jTFTomadorCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jTFCnpjEmitenteCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCnpjDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFPlacaCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFPesoCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFIniPrestacaoCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFFimPrestacaoCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFFreteCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jTFChaveNotaCte, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jTFNNotaCte, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCfopCte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel28, jTFPlacaCte, jTFTomadorCte});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel16, jLabel17, jLabel18, jLabel20, jLabel22, jLabel23, jLabel24, jLabel25, jLabel29, jLabel30, jTFCfopCte, jTFChaveNotaCte, jTFFimPrestacaoCte, jTFFreteCte, jTFIniPrestacaoCte, jTFNNotaCte, jTFPesoCte, jTFVlrMercadoriaCte, jTFVlrReceberCte});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel26, jLabel27, jTFCnpjDestinatario, jTFCnpjEmitenteCte});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel19, jLabel21, jTFDestinatarioCte, jTFEmitenteCte});

        javax.swing.GroupLayout jPInfCteLayout = new javax.swing.GroupLayout(jPInfCte);
        jPInfCte.setLayout(jPInfCteLayout);
        jPInfCteLayout.setHorizontalGroup(
            jPInfCteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInfCteLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPInfCteLayout.setVerticalGroup(
            jPInfCteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Informações CT-e", jPInfCte);

        jBVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifmt/imagens/24_login.png"))); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.setToolTipText("Voltar a tela principal");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(752, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDVisualizarInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDVisualizarInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDVisualizarInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDVisualizarInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDVisualizarInformacoes dialog = new JDVisualizarInformacoes(new javax.swing.JFrame(), false, null, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPInfCte;
    private javax.swing.JPanel jPInfNfe;
    private javax.swing.JPanel jPInformacoes;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTFCfopCte;
    private javax.swing.JTextField jTFCfopNfe;
    private javax.swing.JTextField jTFChaveNotaCte;
    private javax.swing.JTextField jTFChaveNotaNfe;
    private javax.swing.JTextField jTFCnpjDestinatario;
    private javax.swing.JTextField jTFCnpjDestinatarioNfe;
    private javax.swing.JTextField jTFCnpjEmitenteCte;
    private javax.swing.JTextField jTFCnpjEmitenteNfe;
    private javax.swing.JTextField jTFDestinatarioCte;
    private javax.swing.JTextField jTFDestinatarioNfe;
    private javax.swing.JTextField jTFEmitenteCte;
    private javax.swing.JTextField jTFEmitenteNfe;
    private javax.swing.JTextField jTFFimPrestacaoCte;
    private javax.swing.JTextField jTFFimPrestacaoNfe;
    private javax.swing.JTextField jTFFreteCte;
    private javax.swing.JTextField jTFFreteNfe;
    private javax.swing.JTextField jTFIniPrestacaoCte;
    private javax.swing.JTextField jTFIniPrestacaoNfe;
    private javax.swing.JTextField jTFNNotaCte;
    private javax.swing.JTextField jTFNNotaNfe;
    private javax.swing.JTextField jTFPesoCte;
    private javax.swing.JTextField jTFPesoNfe;
    private javax.swing.JTextField jTFPlacaCte;
    private javax.swing.JTextField jTFPlacaNfe;
    private javax.swing.JTextField jTFTomadorCte;
    private javax.swing.JTextField jTFTomadorNfe;
    private javax.swing.JTextField jTFVlrMercadoriaCte;
    private javax.swing.JTextField jTFVlrMercadoriaNfe;
    private javax.swing.JTextField jTFVlrReceberCte;
    private javax.swing.JTextField jTFVlrReceberNfe;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables
}
