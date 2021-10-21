package br.com.ifmt.view;

import br.com.ifmt.controller.AbreTela;
import br.com.ifmt.controller.Util;
import br.com.ifmt.dao.LerXml;
import br.com.ifmt.model.CTe;
import br.com.ifmt.model.NFe;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.*;

/**
 *
 * @author Vitor Ribeiro dos Santos, Livia Mara
 */
public class JFPrincipal extends javax.swing.JFrame {

    private AbreTela abreTela = new AbreTela();
    private Util util = new Util();
    private NFe nfe = null;
    private CTe cte = null;

    public JFPrincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMVisualizarInformacoes = new javax.swing.JPopupMenu();
        jMIVisualizar = new javax.swing.JMenuItem();
        jPPrincipal = new javax.swing.JPanel();
        jTBInformacoes = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLNomeUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLTipoUsuario = new javax.swing.JLabel();
        jPSecundario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFNfe = new javax.swing.JTextField();
        jTFCte = new javax.swing.JTextField();
        jBLocalizarNfe = new javax.swing.JButton();
        jBLocalizarCte = new javax.swing.JButton();
        jBComparar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCampos = new javax.swing.JTable();
        jMenuBar = new javax.swing.JMenuBar();
        jMArquivo = new javax.swing.JMenu();
        jMILogoff = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMISair = new javax.swing.JMenuItem();
        jMRelatorio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMUsuario = new javax.swing.JMenu();
        jMIGerenciarUsuario = new javax.swing.JMenuItem();

        jPMVisualizarInformacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMVisualizarInformacoesMouseClicked(evt);
            }
        });

        jMIVisualizar.setText("Visualizar Informações");
        jMIVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisualizarActionPerformed(evt);
            }
        });
        jPMVisualizarInformacoes.add(jMIVisualizar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Comparação de Documentos Fiscais");
        setResizable(false);

        jTBInformacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTBInformacoes.setFloatable(false);
        jTBInformacoes.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("   Usuario: ");
        jTBInformacoes.add(jLabel1);

        jLNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLNomeUsuario.setText("<NOME_USUARIO>");
        jTBInformacoes.add(jLNomeUsuario);

        jLabel3.setText("                                 ");
        jTBInformacoes.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo: ");
        jTBInformacoes.add(jLabel4);

        jLTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLTipoUsuario.setText("<TIPO_USUARIO>");
        jTBInformacoes.add(jLTipoUsuario);

        jPSecundario.setBorder(javax.swing.BorderFactory.createTitledBorder("Localizar documentos"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("NF-e:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CT-e:");

        jTFNfe.setEditable(false);
        jTFNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTFCte.setEditable(false);
        jTFCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jBLocalizarNfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBLocalizarNfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifmt/imagens/botaoLocalizar.png"))); // NOI18N
        jBLocalizarNfe.setMnemonic(KeyEvent.VK_F8);
        jBLocalizarNfe.setText("Localizar NF-e (F8)");
        jBLocalizarNfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLocalizarNfeActionPerformed(evt);
            }
        });

        jBLocalizarCte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBLocalizarCte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifmt/imagens/botaoLocalizar.png"))); // NOI18N
        jBLocalizarCte.setMnemonic(KeyEvent.VK_F9);
        jBLocalizarCte.setText("Localizar CT-e (F9)");
        jBLocalizarCte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLocalizarCteActionPerformed(evt);
            }
        });

        jBComparar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBComparar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifmt/imagens/24_comparar.png"))); // NOI18N
        jBComparar.setMnemonic(KeyEvent.VK_F12);
        jBComparar.setText("Comparar Documentos (F12)");
        jBComparar.setToolTipText("Comparar documentos selecionados");
        jBComparar.setEnabled(false);
        jBComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCompararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSecundarioLayout = new javax.swing.GroupLayout(jPSecundario);
        jPSecundario.setLayout(jPSecundarioLayout);
        jPSecundarioLayout.setHorizontalGroup(
            jPSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSecundarioLayout.createSequentialGroup()
                .addGroup(jPSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPSecundarioLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFCte, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jTFNfe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBLocalizarNfe)
                            .addComponent(jBLocalizarCte)))
                    .addGroup(jPSecundarioLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jBComparar)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPSecundarioLayout.setVerticalGroup(
            jPSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSecundarioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFNfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLocalizarNfe))
                .addGap(18, 18, 18)
                .addGroup(jPSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFCte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLocalizarCte))
                .addGap(18, 18, 18)
                .addComponent(jBComparar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jPSecundarioLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBLocalizarCte, jBLocalizarNfe, jLabel6, jLabel7, jTFCte, jTFNfe});

        jTCampos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTCampos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campos", "NF-e", "CT-e", "Verificação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCampos.setComponentPopupMenu(jPMVisualizarInformacoes);
        jTCampos.setRowHeight(25);
        jTCampos.getTableHeader().setReorderingAllowed(false);
        jTCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCamposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCampos);
        if (jTCampos.getColumnModel().getColumnCount() > 0) {
            jTCampos.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTCampos.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTCampos.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTCampos.getColumnModel().getColumn(3).setResizable(false);
            jTCampos.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTBInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jTBInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
        );

        jMArquivo.setMnemonic('A');
        jMArquivo.setText("Arquivo");
        jMArquivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMILogoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMILogoff.setText("Logoff");
        jMILogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMILogoffActionPerformed(evt);
            }
        });
        jMArquivo.add(jMILogoff);
        jMArquivo.add(jSeparator1);

        jMISair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMISair.setText("Sair");
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMArquivo.add(jMISair);

        jMenuBar.add(jMArquivo);

        jMRelatorio.setMnemonic('R');
        jMRelatorio.setText("Relatorios");
        jMRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem1.setText("Comparação por Usuario");
        jMRelatorio.add(jMenuItem1);

        jMenuItem2.setText("Comparações do Mês");
        jMRelatorio.add(jMenuItem2);

        jMenuItem3.setText("Comparação Atual");
        jMRelatorio.add(jMenuItem3);

        jMenuBar.add(jMRelatorio);

        jMUsuario.setMnemonic('U');
        jMUsuario.setText("Usuarios");
        jMUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMIGerenciarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMIGerenciarUsuario.setText("Gerênciar Usuario");
        jMIGerenciarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGerenciarUsuarioActionPerformed(evt);
            }
        });
        jMUsuario.add(jMIGerenciarUsuario);

        jMenuBar.add(jMUsuario);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 585));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBLocalizarNfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLocalizarNfeActionPerformed
        String fileNfe = util.pegaArquivo();
        nfe = null;
        nfe = LerXml.lerNFe(new File(fileNfe));
        if (nfe != null) {
            jTFNfe.setText(fileNfe);
        } else {
            jTFNfe.setText("");
        }
        util.verificaTextFields();
    }//GEN-LAST:event_jBLocalizarNfeActionPerformed

    private void jMIGerenciarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGerenciarUsuarioActionPerformed
        abreTela.abreGerenciaUsuario(this);
    }//GEN-LAST:event_jMIGerenciarUsuarioActionPerformed

    private void jMILogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMILogoffActionPerformed

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja fechar o sistema?", "Logoff", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (resposta == 0) {
            this.dispose();
            abreTela.abreLogin();
        }

    }//GEN-LAST:event_jMILogoffActionPerformed

    private void jTCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCamposMouseClicked
        if (evt.getClickCount() == 2 && jTCampos.getSelectedRow() >= 0) {
            abreTela.abreVisualizaInformacoes(this, nfe, cte);
        }
    }//GEN-LAST:event_jTCamposMouseClicked

    private void jPMVisualizarInformacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMVisualizarInformacoesMouseClicked

    }//GEN-LAST:event_jPMVisualizarInformacoesMouseClicked

    private void jMIVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisualizarActionPerformed
        abreTela.abreVisualizaInformacoes(this, nfe, cte);
    }//GEN-LAST:event_jMIVisualizarActionPerformed

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISairActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja fechar o sistema?", "Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (resposta == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMISairActionPerformed

    private void jBCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCompararActionPerformed
        util.comparar(nfe, cte);
        jBComparar.setEnabled(false);
        jTFCte.setText("");
        jTFNfe.setText("");
    }//GEN-LAST:event_jBCompararActionPerformed

    private void jBLocalizarCteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLocalizarCteActionPerformed
        String fileCte = util.pegaArquivo();
        cte = null;
        cte = LerXml.lerCTe(new File(fileCte));

        if (cte != null) {
            jTFCte.setText(fileCte);
        } else {
            jTFCte.setText("");
        }
        util.verificaTextFields();
    }//GEN-LAST:event_jBLocalizarCteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jBComparar;
    private javax.swing.JButton jBLocalizarCte;
    public static javax.swing.JButton jBLocalizarNfe;
    private javax.swing.JLabel jLNomeUsuario;
    private javax.swing.JLabel jLTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMArquivo;
    private javax.swing.JMenuItem jMIGerenciarUsuario;
    private javax.swing.JMenuItem jMILogoff;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JMenuItem jMIVisualizar;
    private javax.swing.JMenu jMRelatorio;
    private javax.swing.JMenu jMUsuario;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPMVisualizarInformacoes;
    public static javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPSecundario;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jTBInformacoes;
    public static javax.swing.JTable jTCampos;
    public static javax.swing.JTextField jTFCte;
    public static javax.swing.JTextField jTFNfe;
    // End of variables declaration//GEN-END:variables
}
