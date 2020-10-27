/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.instrumentosmusicais.pdv.view;

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
        lblNomeOU = new javax.swing.JLabel();
        lblNomeInicio = new javax.swing.JLabel();
        txtNomeInicio = new javax.swing.JFormattedTextField();
        lblNomeFinal = new javax.swing.JLabel();
        lblNomeAte = new javax.swing.JLabel();
        btnPesquisaPersonalizada = new javax.swing.JButton();
        txtNomeFinal = new javax.swing.JFormattedTextField();
        pnlRelatorio = new javax.swing.JPanel();
        pnlTabelaVender = new javax.swing.JScrollPane();
        tbTabelaProdutosVenda = new javax.swing.JTable();

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
        btnPesquisaMes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnPesquisaMes.setContentAreaFilled(false);
        btnPesquisaMes.setOpaque(true);

        lblNomeOU.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeOU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeOU.setText("OU");
        lblNomeOU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblNomeInicio.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeInicio.setText("Início");

        txtNomeInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNomeInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtNomeInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblNomeFinal.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeFinal.setText("Final");

        lblNomeAte.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeAte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeAte.setText("Até");

        btnPesquisaPersonalizada.setBackground(new java.awt.Color(51, 51, 51));
        btnPesquisaPersonalizada.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnPesquisaPersonalizada.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaPersonalizada.setText("<html> Pesquisa <br>Personalizada");
        btnPesquisaPersonalizada.setContentAreaFilled(false);
        btnPesquisaPersonalizada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisaPersonalizada.setOpaque(true);

        txtNomeFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNomeFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtNomeFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlPesquisaLayout = new javax.swing.GroupLayout(pnlPesquisa);
        pnlPesquisa.setLayout(pnlPesquisaLayout);
        pnlPesquisaLayout.setHorizontalGroup(
            pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPesquisaLayout.createSequentialGroup()
                        .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                                .addComponent(txtNomeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeOU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNomeAte, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                            .addGroup(pnlPesquisaLayout.createSequentialGroup()
                                .addComponent(lblNomeInicio)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPesquisaLayout.createSequentialGroup()
                                .addComponent(lblNomeFinal)
                                .addGap(116, 116, 116))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPesquisaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPesquisaPersonalizada, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPesquisaLayout.createSequentialGroup()
                        .addComponent(jcbNomeMeses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(btnPesquisaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPesquisaLayout.createSequentialGroup()
                        .addComponent(lblTituloRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGap(45, 45, 45)
                .addComponent(lblNomeOU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNomeFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNomeAte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(btnPesquisaPersonalizada, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlRelatorio.setBackground(new java.awt.Color(102, 102, 102));
        pnlRelatorio.setForeground(new java.awt.Color(255, 255, 255));

        tbTabelaProdutosVenda.setBackground(new java.awt.Color(153, 153, 153));
        tbTabelaProdutosVenda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        tbTabelaProdutosVenda.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        tbTabelaProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Nº Ped", "Cliente", "Valor Ped", "+ INFO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTabelaProdutosVenda.setCellSelectionEnabled(true);
        tbTabelaProdutosVenda.setGridColor(new java.awt.Color(51, 51, 51));
        tbTabelaProdutosVenda.setRowHeight(20);
        tbTabelaProdutosVenda.setRowMargin(3);
        tbTabelaProdutosVenda.setSelectionBackground(new java.awt.Color(51, 51, 51));
        pnlTabelaVender.setViewportView(tbTabelaProdutosVenda);

        javax.swing.GroupLayout pnlRelatorioLayout = new javax.swing.GroupLayout(pnlRelatorio);
        pnlRelatorio.setLayout(pnlRelatorioLayout);
        pnlRelatorioLayout.setHorizontalGroup(
            pnlRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTabelaVender, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlRelatorioLayout.setVerticalGroup(
            pnlRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTabelaVender, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbNomeMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeMesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNomeMesesActionPerformed

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
    private javax.swing.JButton btnPesquisaMes;
    private javax.swing.JButton btnPesquisaPersonalizada;
    private javax.swing.JComboBox<String> jcbNomeMeses;
    private javax.swing.JLabel lblNomeAte;
    private javax.swing.JLabel lblNomeFinal;
    private javax.swing.JLabel lblNomeInicio;
    private javax.swing.JLabel lblNomeOU;
    private javax.swing.JLabel lblTituloRelatorio;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlPesquisa;
    private javax.swing.JPanel pnlRelatorio;
    private javax.swing.JScrollPane pnlTabelaVender;
    private javax.swing.JTable tbTabelaProdutosVenda;
    private javax.swing.JFormattedTextField txtNomeFinal;
    private javax.swing.JFormattedTextField txtNomeInicio;
    // End of variables declaration//GEN-END:variables
}