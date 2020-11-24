/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.instrumentosmusicais.pdv.view;

import br.instrumentosmusicais.pdv.controller.RelatorioSinteticoController;
import br.instrumentosmusicais.pdv.utils.Validador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Computador
 */
public class RelatorioSinteticoView extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatorioSintetico
     */
    public RelatorioSinteticoView() {
        initComponents();
        tblTabelaProdutosVenda.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblTabelaProdutosVenda.getColumnModel().getColumn(1).setPreferredWidth(15);
        tblTabelaProdutosVenda.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblTabelaProdutosVenda.getColumnModel().getColumn(3).setPreferredWidth(30);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        pnlPesquisa = new javax.swing.JPanel();
        lblTituloRelatorio = new javax.swing.JLabel();
        jcbNomeMeses = new javax.swing.JComboBox<>();
        btnPesquisaMes = new javax.swing.JButton();
        btnPesquisaPersonalizada = new javax.swing.JButton();
        pnlFiltro = new javax.swing.JPanel();
        lblNomeFinal = new javax.swing.JLabel();
        txtDataFinal = new javax.swing.JFormattedTextField();
        lblNomeInicio = new javax.swing.JLabel();
        lblNomeAte = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JFormattedTextField();
        lblMensagemErroDataFinal = new javax.swing.JLabel();
        lblMensagemErroDataInicio = new javax.swing.JLabel();
        pnlRelatorio = new javax.swing.JPanel();
        pnlTabelaVender = new javax.swing.JScrollPane();
        tblTabelaProdutosVenda = new javax.swing.JTable();
        btnPesquisaAnalitica = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlFundo.setBackground(new java.awt.Color(51, 51, 51));

        pnlPesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblTituloRelatorio.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblTituloRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TesteRelatorios2.png"))); // NOI18N
        lblTituloRelatorio.setText("Relatório Sintético X Analítico");

        jcbNomeMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        jcbNomeMeses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcbNomeMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeMesesActionPerformed(evt);
            }
        });

        btnPesquisaMes.setBackground(new java.awt.Color(51, 51, 51));
        btnPesquisaMes.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnPesquisaMes.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaMes.setText("Pesquisar");
        btnPesquisaMes.setToolTipText("Pesquisa o mês inteiro");
        btnPesquisaMes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnPesquisaMes.setContentAreaFilled(false);
        btnPesquisaMes.setOpaque(true);
        btnPesquisaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaMesActionPerformed(evt);
            }
        });

        btnPesquisaPersonalizada.setBackground(new java.awt.Color(51, 51, 51));
        btnPesquisaPersonalizada.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnPesquisaPersonalizada.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaPersonalizada.setText("<html> Pesquisa <br>Personalizada");
        btnPesquisaPersonalizada.setContentAreaFilled(false);
        btnPesquisaPersonalizada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisaPersonalizada.setOpaque(true);
        btnPesquisaPersonalizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaPersonalizadaActionPerformed(evt);
            }
        });

        lblNomeFinal.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeFinal.setText("Final");

        txtDataFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            txtDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblNomeInicio.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeInicio.setText("Início");

        lblNomeAte.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeAte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeAte.setText("Até");

        txtDataInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataInicioActionPerformed(evt);
            }
        });

        lblMensagemErroDataFinal.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N

        lblMensagemErroDataInicio.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N

        javax.swing.GroupLayout pnlFiltroLayout = new javax.swing.GroupLayout(pnlFiltro);
        pnlFiltro.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFiltroLayout.createSequentialGroup()
                        .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFiltroLayout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(lblNomeFinal)
                                .addGap(114, 114, 114))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFiltroLayout.createSequentialGroup()
                                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFiltroLayout.createSequentialGroup()
                                        .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(lblNomeAte, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                    .addComponent(lblNomeInicio))
                                .addGap(37, 37, 37)
                                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMensagemErroDataFinal)
                                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(pnlFiltroLayout.createSequentialGroup()
                        .addComponent(lblMensagemErroDataInicio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlFiltroLayout.setVerticalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNomeFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeAte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensagemErroDataFinal)
                    .addComponent(lblMensagemErroDataInicio)))
        );

        pnlFiltroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDataFinal, txtDataInicio});

        javax.swing.GroupLayout pnlPesquisaLayout = new javax.swing.GroupLayout(pnlPesquisa);
        pnlPesquisa.setLayout(pnlPesquisaLayout);
        pnlPesquisaLayout.setHorizontalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPesquisaLayout.createSequentialGroup()
                        .addComponent(jcbNomeMeses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(btnPesquisaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPesquisaLayout.createSequentialGroup()
                        .addComponent(lblTituloRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPesquisaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPesquisaPersonalizada, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(pnlFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPesquisaLayout.setVerticalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloRelatorio)
                .addGap(32, 32, 32)
                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbNomeMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(pnlFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnPesquisaPersonalizada, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pnlRelatorio.setBackground(new java.awt.Color(102, 102, 102));
        pnlRelatorio.setForeground(new java.awt.Color(255, 255, 255));

        tblTabelaProdutosVenda.setBackground(new java.awt.Color(153, 153, 153));
        tblTabelaProdutosVenda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        tblTabelaProdutosVenda.setFont(new java.awt.Font("Bookman Old Style", 1, 10)); // NOI18N
        tblTabelaProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Nº Compra", "Cliente", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabelaProdutosVenda.setCellSelectionEnabled(true);
        tblTabelaProdutosVenda.setGridColor(new java.awt.Color(51, 51, 51));
        tblTabelaProdutosVenda.setRowHeight(20);
        tblTabelaProdutosVenda.setRowMargin(3);
        tblTabelaProdutosVenda.setSelectionBackground(new java.awt.Color(51, 51, 51));
        pnlTabelaVender.setViewportView(tblTabelaProdutosVenda);

        btnPesquisaAnalitica.setBackground(new java.awt.Color(51, 51, 51));
        btnPesquisaAnalitica.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnPesquisaAnalitica.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaAnalitica.setText("Pesquisar");
        btnPesquisaAnalitica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnPesquisaAnalitica.setContentAreaFilled(false);
        btnPesquisaAnalitica.setOpaque(true);
        btnPesquisaAnalitica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaAnaliticaActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lblTotal.setText("Total:");

        txtTotal.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlRelatorioLayout = new javax.swing.GroupLayout(pnlRelatorio);
        pnlRelatorio.setLayout(pnlRelatorioLayout);
        pnlRelatorioLayout.setHorizontalGroup(
            pnlRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTabelaVender, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisaAnalitica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRelatorioLayout.setVerticalGroup(
            pnlRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTabelaVender, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisaAnalitica, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlRelatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbNomeMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeMesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNomeMesesActionPerformed

    private void btnPesquisaAnaliticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaAnaliticaActionPerformed
        RelatorioAnaliticoView telaAnalitico = new RelatorioAnaliticoView();
        
        DefaultTableModel listaSintetica = (DefaultTableModel) tblTabelaProdutosVenda.getModel();
        int linhaSelecionada = tblTabelaProdutosVenda.getSelectedRow();
        
        if(linhaSelecionada == -1){
        JOptionPane.showMessageDialog(this, "Selecione um registro na tabela!!!","Aviso", JOptionPane.WARNING_MESSAGE);
        }else{
        telaAnalitico.setVisible(true);
        }
    }//GEN-LAST:event_btnPesquisaAnaliticaActionPerformed

    private void btnPesquisaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaMesActionPerformed
        if(jcbNomeMeses.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Selecione um mês!!!","Aviso", JOptionPane.WARNING_MESSAGE);
        }
        else{            
            //Chamar função
            int mes = jcbNomeMeses.getSelectedIndex();
            ArrayList<String[]> listaCompras = RelatorioSinteticoController.pesquisaMes(mes);

            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) tblTabelaProdutosVenda.getModel();

            modelo.setRowCount(0);

            for (String[] dados : listaCompras) {
                modelo.addRow(dados);
            }            
        }
    }//GEN-LAST:event_btnPesquisaMesActionPerformed

    private void btnPesquisaPersonalizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaPersonalizadaActionPerformed
        Validador objValidador = new Validador();
        if(jcbNomeMeses.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Selecione um mês!!!","Aviso", JOptionPane.WARNING_MESSAGE);
        }
        objValidador.CampoVazioFormatado(txtDataInicio, lblMensagemErroDataInicio );
        objValidador.CampoVazioFormatado(txtDataFinal, lblMensagemErroDataFinal);
        
    }//GEN-LAST:event_btnPesquisaPersonalizadaActionPerformed

    private void txtDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataInicioActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioSinteticoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioSinteticoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioSinteticoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioSinteticoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioSinteticoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisaAnalitica;
    private javax.swing.JButton btnPesquisaMes;
    private javax.swing.JButton btnPesquisaPersonalizada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbNomeMeses;
    private javax.swing.JLabel lblMensagemErroDataFinal;
    private javax.swing.JLabel lblMensagemErroDataInicio;
    private javax.swing.JLabel lblNomeAte;
    private javax.swing.JLabel lblNomeFinal;
    private javax.swing.JLabel lblNomeInicio;
    private javax.swing.JLabel lblTituloRelatorio;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlFiltro;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlPesquisa;
    private javax.swing.JPanel pnlRelatorio;
    private javax.swing.JScrollPane pnlTabelaVender;
    private javax.swing.JTable tblTabelaProdutosVenda;
    private javax.swing.JFormattedTextField txtDataFinal;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
