
package br.instrumentosmusicais.pdv.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SelecionarClienteView extends javax.swing.JFrame {
    
        public SelecionarClienteView() {
        initComponents();
        setLocationRelativeTo(null);

    }

    public void preencherTabela(ArrayList<String[]> clientes) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) tblClientes.getModel();

        for (int i = 0; i < clientes.size(); i++) {
            modelo.addRow(clientes.get(i));
        }

    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSelecionarClientes = new javax.swing.JPanel();
        btnSelecionarCliente = new javax.swing.JButton();
        sPnlClientes = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecione o Cliente");
        setBackground(new java.awt.Color(51, 51, 51));

        pnlSelecionarClientes.setBackground(new java.awt.Color(102, 102, 102));

        btnSelecionarCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnSelecionarCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnSelecionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarCliente.setText("Selecionar Cliente");
        btnSelecionarCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSelecionarCliente.setContentAreaFilled(false);
        btnSelecionarCliente.setOpaque(true);
        btnSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarClienteActionPerformed(evt);
            }
        });

        sPnlClientes.setBorder(null);

        tblClientes.setBackground(new java.awt.Color(102, 102, 102));
        tblClientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setRowHeight(20);
        tblClientes.setRowMargin(3);
        tblClientes.setSelectionBackground(new java.awt.Color(51, 51, 51));
        sPnlClientes.setViewportView(tblClientes);

        javax.swing.GroupLayout pnlSelecionarClientesLayout = new javax.swing.GroupLayout(pnlSelecionarClientes);
        pnlSelecionarClientes.setLayout(pnlSelecionarClientesLayout);
        pnlSelecionarClientesLayout.setHorizontalGroup(
            pnlSelecionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelecionarClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlSelecionarClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sPnlClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSelecionarClientesLayout.setVerticalGroup(
            pnlSelecionarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelecionarClientesLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(sPnlClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSelecionarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSelecionarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarClienteActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) tblClientes.getModel();

        int linhaSelecionada = tblClientes.getSelectedRow();

        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha");
        } else {
            String[] cliente = {
                String.valueOf(modelo.getValueAt(linhaSelecionada, 0)),
                String.valueOf(modelo.getValueAt(linhaSelecionada, 1)),
                String.valueOf(modelo.getValueAt(linhaSelecionada, 2))};

            VendaView telaVendas = new VendaView(cliente[0], cliente[1], cliente[2]);
            dispose();
            telaVendas.setVisible(true);
            
        }
    }//GEN-LAST:event_btnSelecionarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(SelecionarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecionarClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelecionarCliente;
    private javax.swing.JPanel pnlSelecionarClientes;
    private javax.swing.JScrollPane sPnlClientes;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
