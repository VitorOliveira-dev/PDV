/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pdv;

/**
 *
 * @author Computador
 */
public class TelaRelatorioAnalitico extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatorioAnalitico
     */
    public TelaRelatorioAnalitico() {
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
        txtDados = new javax.swing.JPanel();
        DadosCliente = new javax.swing.JPanel();
        lblNomeEndereco1 = new javax.swing.JLabel();
        txtNomeEndereco1 = new javax.swing.JLabel();
        lblNomeN1 = new javax.swing.JLabel();
        txtNomeN1 = new javax.swing.JLabel();
        lblNomeComplemento1 = new javax.swing.JLabel();
        txtNomeComplemento1 = new javax.swing.JLabel();
        lblNomeBairro1 = new javax.swing.JLabel();
        txtNomeBairro1 = new javax.swing.JLabel();
        lblNomeCidade1 = new javax.swing.JLabel();
        txtNomeComplemento3 = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JLabel();
        txtNomeCPF = new javax.swing.JLabel();
        lblNomeCPF = new javax.swing.JLabel();
        lblNomeNPedido = new javax.swing.JLabel();
        txtNomeNPedido = new javax.swing.JLabel();
        tblProduto = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        resumoGeral = new javax.swing.JPanel();
        lblNomeData = new javax.swing.JLabel();
        txtNomeData = new javax.swing.JLabel();
        lblNomeTotal = new javax.swing.JLabel();
        txtNomeTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlFundo.setBackground(new java.awt.Color(102, 102, 102));

        txtDados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNomeEndereco1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeEndereco1.setText("Endereço:");

        txtNomeEndereco1.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        txtNomeEndereco1.setText("Rua Carlos Ipiranga");

        lblNomeN1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeN1.setText("Nº:");

        txtNomeN1.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        txtNomeN1.setText("59");

        lblNomeComplemento1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeComplemento1.setText("Complemento:");

        txtNomeComplemento1.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        txtNomeComplemento1.setText("Casa 3");

        lblNomeBairro1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeBairro1.setText("Bairro:");

        txtNomeBairro1.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        txtNomeBairro1.setText("Ipiranga");

        lblNomeCidade1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeCidade1.setText("Cidade:");

        txtNomeComplemento3.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        txtNomeComplemento3.setText("São Paulo-SP");

        javax.swing.GroupLayout DadosClienteLayout = new javax.swing.GroupLayout(DadosCliente);
        DadosCliente.setLayout(DadosClienteLayout);
        DadosClienteLayout.setHorizontalGroup(
            DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DadosClienteLayout.createSequentialGroup()
                        .addGroup(DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DadosClienteLayout.createSequentialGroup()
                                .addComponent(lblNomeEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeEndereco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DadosClienteLayout.createSequentialGroup()
                                .addComponent(lblNomeBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblNomeCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DadosClienteLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(lblNomeN1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeN1))
                            .addGroup(DadosClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeComplemento3))))
                    .addGroup(DadosClienteLayout.createSequentialGroup()
                        .addComponent(lblNomeComplemento1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeComplemento1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DadosClienteLayout.setVerticalGroup(
            DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeN1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeN1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeComplemento1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeComplemento1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeBairro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNomeCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomeComplemento3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblNomeCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeCliente.setText("Cliente:");

        txtNomeCliente.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        txtNomeCliente.setText("Carlos Fernandes da Silva");

        txtNomeCPF.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        txtNomeCPF.setText("222.555.999-00");

        lblNomeCPF.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeCPF.setText("CPF:");

        lblNomeNPedido.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeNPedido.setText("Nº Pedido:");

        txtNomeNPedido.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        txtNomeNPedido.setText("10.539");

        javax.swing.GroupLayout txtDadosLayout = new javax.swing.GroupLayout(txtDados);
        txtDados.setLayout(txtDadosLayout);
        txtDadosLayout.setHorizontalGroup(
            txtDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeNPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeNPedido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCPF, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(DadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        txtDadosLayout.setVerticalGroup(
            txtDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(txtDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(txtDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição do Produto", "Preço Un.", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.setRowMargin(3);
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblProduto.setViewportView(jTable1);

        resumoGeral.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNomeData.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        lblNomeData.setText("DATA DA VENDA");

        txtNomeData.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        txtNomeData.setText("10/10/2020");

        lblNomeTotal.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        lblNomeTotal.setText("TOTAL DA VENDA:");

        txtNomeTotal.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        txtNomeTotal.setText("R$ 11.499,99");

        javax.swing.GroupLayout resumoGeralLayout = new javax.swing.GroupLayout(resumoGeral);
        resumoGeral.setLayout(resumoGeralLayout);
        resumoGeralLayout.setHorizontalGroup(
            resumoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resumoGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeData, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeData, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNomeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        resumoGeralLayout.setVerticalGroup(
            resumoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNomeData, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addComponent(txtNomeData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblNomeTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtNomeTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resumoGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resumoGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaRelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioAnalitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioAnalitico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DadosCliente;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNomeBairro1;
    private javax.swing.JLabel lblNomeCPF;
    private javax.swing.JLabel lblNomeCidade1;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeComplemento1;
    private javax.swing.JLabel lblNomeData;
    private javax.swing.JLabel lblNomeEndereco1;
    private javax.swing.JLabel lblNomeN1;
    private javax.swing.JLabel lblNomeNPedido;
    private javax.swing.JLabel lblNomeTotal;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel resumoGeral;
    private javax.swing.JScrollPane tblProduto;
    private javax.swing.JPanel txtDados;
    private javax.swing.JLabel txtNomeBairro1;
    private javax.swing.JLabel txtNomeCPF;
    private javax.swing.JLabel txtNomeCliente;
    private javax.swing.JLabel txtNomeComplemento1;
    private javax.swing.JLabel txtNomeComplemento3;
    private javax.swing.JLabel txtNomeData;
    private javax.swing.JLabel txtNomeEndereco1;
    private javax.swing.JLabel txtNomeN1;
    private javax.swing.JLabel txtNomeNPedido;
    private javax.swing.JLabel txtNomeTotal;
    // End of variables declaration//GEN-END:variables
}
