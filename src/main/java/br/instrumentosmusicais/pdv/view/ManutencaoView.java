/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.instrumentosmusicais.pdv.view;

import br.instrumentosmusicais.pdv.controller.ManutencaoController;
import br.instrumentosmusicais.pdv.utils.Validador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo
 */
public class ManutencaoView extends javax.swing.JFrame {

    /**
     * Creates new form ManterCliente
     */
    public ManutencaoView() {
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

        pnlPrincipal = new javax.swing.JPanel();
        pnlCRUD = new javax.swing.JPanel();
        pnlTabelas = new javax.swing.JPanel();
        pnlProdutos = new javax.swing.JPanel();
        sPnlProdutos = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        pnlBuscaProduto = new javax.swing.JPanel();
        btnAtualizarProduto = new javax.swing.JButton();
        lblNomeProduto = new javax.swing.JLabel();
        btnAdicionarProduto = new javax.swing.JButton();
        txtProduto = new javax.swing.JTextField();
        btnPesquisarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        lblMensagemErroProduto = new javax.swing.JLabel();
        pnlClientes = new javax.swing.JPanel();
        pnlBuscaClientes = new javax.swing.JPanel();
        btnAtualizaCliente = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        btnAdicionarCliente = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        lblMensagemErroCliente = new javax.swing.JLabel();
        sPnlClientes = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnCliente = new javax.swing.JButton();
        btnProduto = new javax.swing.JButton();
        lblIcone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        pnlPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        pnlCRUD.setBackground(new java.awt.Color(102, 102, 102));
        pnlCRUD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        pnlTabelas.setLayout(new java.awt.CardLayout());

        pnlProdutos.setBackground(new java.awt.Color(102, 102, 102));

        tblProdutos.setBackground(new java.awt.Color(102, 102, 102));
        tblProdutos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Instrumento", "Cor", "Tipo", "Fabricante", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.setRowHeight(20);
        tblProdutos.setRowMargin(3);
        tblProdutos.setSelectionBackground(new java.awt.Color(51, 51, 51));
        sPnlProdutos.setViewportView(tblProdutos);

        pnlBuscaProduto.setBackground(new java.awt.Color(102, 102, 102));

        btnAtualizarProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnAtualizarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarProduto.setText("Atualizar");
        btnAtualizarProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAtualizarProduto.setContentAreaFilled(false);
        btnAtualizarProduto.setOpaque(true);
        btnAtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarProdutoActionPerformed(evt);
            }
        });

        lblNomeProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblNomeProduto.setText("Instrumento:");

        btnAdicionarProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionarProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnAdicionarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarProduto.setText("Adicionar");
        btnAdicionarProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAdicionarProduto.setContentAreaFilled(false);
        btnAdicionarProduto.setOpaque(true);
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        txtProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnPesquisarProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnPesquisarProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnPesquisarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarProduto.setText("Pesquisar");
        btnPesquisarProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnPesquisarProduto.setContentAreaFilled(false);
        btnPesquisarProduto.setOpaque(true);
        btnPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluirProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnExcluirProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnExcluirProduto.setContentAreaFilled(false);
        btnExcluirProduto.setOpaque(true);
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        lblMensagemErroProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N

        javax.swing.GroupLayout pnlBuscaProdutoLayout = new javax.swing.GroupLayout(pnlBuscaProduto);
        pnlBuscaProduto.setLayout(pnlBuscaProdutoLayout);
        pnlBuscaProdutoLayout.setHorizontalGroup(
            pnlBuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlBuscaProdutoLayout.createSequentialGroup()
                            .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)
                            .addComponent(btnAtualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlBuscaProdutoLayout.createSequentialGroup()
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblMensagemErroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBuscaProdutoLayout.setVerticalGroup(
            pnlBuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMensagemErroProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBuscaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarProduto)
                    .addComponent(btnExcluirProduto))
                .addContainerGap())
        );

        pnlBuscaProdutoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdicionarProduto, btnAtualizarProduto, btnExcluirProduto});

        javax.swing.GroupLayout pnlProdutosLayout = new javax.swing.GroupLayout(pnlProdutos);
        pnlProdutos.setLayout(pnlProdutosLayout);
        pnlProdutosLayout.setHorizontalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBuscaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sPnlProdutos))
        );
        pnlProdutosLayout.setVerticalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdutosLayout.createSequentialGroup()
                .addComponent(pnlBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sPnlProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlTabelas.add(pnlProdutos, "card4");

        pnlClientes.setBackground(new java.awt.Color(102, 102, 102));

        pnlBuscaClientes.setBackground(new java.awt.Color(102, 102, 102));

        btnAtualizaCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizaCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnAtualizaCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizaCliente.setText("Atualizar");
        btnAtualizaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAtualizaCliente.setContentAreaFilled(false);
        btnAtualizaCliente.setOpaque(true);
        btnAtualizaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaClienteActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblNome.setText("Nome:");

        btnAdicionarCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionarCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnAdicionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarCliente.setText("Adicionar");
        btnAdicionarCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAdicionarCliente.setContentAreaFilled(false);
        btnAdicionarCliente.setOpaque(true);
        btnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarClienteActionPerformed(evt);
            }
        });

        txtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnPesquisarCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnPesquisarCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnPesquisarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnPesquisarCliente.setContentAreaFilled(false);
        btnPesquisarCliente.setOpaque(true);
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluirCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnExcluirCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnExcluirCliente.setContentAreaFilled(false);
        btnExcluirCliente.setOpaque(true);
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        lblMensagemErroCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N

        javax.swing.GroupLayout pnlBuscaClientesLayout = new javax.swing.GroupLayout(pnlBuscaClientes);
        pnlBuscaClientes.setLayout(pnlBuscaClientesLayout);
        pnlBuscaClientesLayout.setHorizontalGroup(
            pnlBuscaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaClientesLayout.createSequentialGroup()
                .addGroup(pnlBuscaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscaClientesLayout.createSequentialGroup()
                        .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnAtualizaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscaClientesLayout.createSequentialGroup()
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(lblMensagemErroCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBuscaClientesLayout.setVerticalGroup(
            pnlBuscaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaClientesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblMensagemErroCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarCliente)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pnlBuscaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAtualizaCliente)
                        .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExcluirCliente))
                .addContainerGap())
        );

        pnlBuscaClientesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisarCliente, txtNome});

        pnlBuscaClientesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdicionarCliente, btnAtualizaCliente, btnExcluirCliente});

        sPnlClientes.setBorder(null);

        tblClientes.setBackground(new java.awt.Color(102, 102, 102));
        tblClientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setColumnSelectionAllowed(false);
        tblClientes.setRowHeight(20);
        tblClientes.setRowMargin(3);
        tblClientes.setSelectionBackground(new java.awt.Color(51, 51, 51));
        sPnlClientes.setViewportView(tblClientes);

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBuscaClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sPnlClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addComponent(pnlBuscaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sPnlClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );

        pnlTabelas.add(pnlClientes, "card4");

        btnCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("Editar Clientes");
        btnCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCliente.setContentAreaFilled(false);
        btnCliente.setOpaque(true);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        btnProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnProduto.setText("Editar Produtos");
        btnProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnProduto.setContentAreaFilled(false);
        btnProduto.setOpaque(true);
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/testeManu2.png"))); // NOI18N

        javax.swing.GroupLayout pnlCRUDLayout = new javax.swing.GroupLayout(pnlCRUD);
        pnlCRUD.setLayout(pnlCRUDLayout);
        pnlCRUDLayout.setHorizontalGroup(
            pnlCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCRUDLayout.createSequentialGroup()
                .addComponent(pnlTabelas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(lblIcone)
                .addGap(38, 38, 38))
        );

        pnlCRUDLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCliente, btnProduto});

        pnlCRUDLayout.setVerticalGroup(
            pnlCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCliente)))
                .addGap(11, 11, 11)
                .addComponent(pnlTabelas, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlCRUDLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCliente, btnProduto});

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaClienteActionPerformed
        CadastroClienteView telaAtualizarCliente = new CadastroClienteView();
       // telaAtualizarCliente.setVisible(true);
        
            int linhaSelecionada = tblClientes.getSelectedRow();
        int idSelecionado = 0;
        
        if(linhaSelecionada>=0){
            idSelecionado = Integer.parseInt(tblClientes.getValueAt(linhaSelecionada, 0).toString());
        }else{
            JOptionPane.showMessageDialog(this, "Escolha uma linha para atualizar!");
            return;
        }
        
        if(idSelecionado>0){
            CadastroClienteView telaClienteAlterar = new CadastroClienteView(idSelecionado);
            telaClienteAlterar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Escolha uma linha para atualizar!");
        }
        
    }//GEN-LAST:event_btnAtualizaClienteActionPerformed

    private void btnAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarProdutoActionPerformed
       int linhaSelecionada = tblProdutos.getSelectedRow();
        int idSelecionado = 0;
        
        if(linhaSelecionada>=0){
            idSelecionado = Integer.parseInt(tblProdutos.getValueAt(linhaSelecionada, 0).toString());
        }else{
            JOptionPane.showMessageDialog(this, "Escolha uma linha para atualizar!");
            return;
        }
        
        if(idSelecionado>0){
            CadastroProdutoView telaProdutoAlterar = new CadastroProdutoView(idSelecionado);
            telaProdutoAlterar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Escolha uma linha para atualizar!");
        }
        
    }//GEN-LAST:event_btnAtualizarProdutoActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        pnlClientes.setVisible(true);
        pnlProdutos.setVisible(false);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        pnlClientes.setVisible(false);
        pnlProdutos.setVisible(true);
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProdutoActionPerformed
        Validador objValidador = new Validador();
        objValidador.CampoVazio(txtProduto, lblMensagemErroProduto);

        String instrumento = txtProduto.getText();

        if (instrumento.equals("//")) {
            ArrayList<String[]> listaProdutos = ManutencaoController.manutencaoPesquisarTodosProdutos();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) tblProdutos.getModel();

            modelo.setRowCount(0);

            for (String[] dados : listaProdutos) {
                modelo.addRow(dados);
            }
        } else {
            ArrayList<String[]> listaProdutos = ManutencaoController.manutencaoPesquisarProduto(instrumento);
            
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) tblProdutos.getModel();
            
            modelo.setRowCount(0);
            
            if(listaProdutos.isEmpty()){
            JOptionPane.showMessageDialog(this, "Produto não encontrado");
            return;
            }else{
            for(String[] dados : listaProdutos){
            modelo.addRow(dados);
            }
            }
        }

    }//GEN-LAST:event_btnPesquisarProdutoActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        Validador objValidador = new Validador();
        objValidador.CampoVazio(txtNome, lblMensagemErroCliente);

        String nomeCliente = txtNome.getText();

        if (nomeCliente.equals("//")) {
            ArrayList<String[]> listaClientes = ManutencaoController.manutencaoPesquisarTodosClientes();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) tblClientes.getModel();

            modelo.setRowCount(0);

            for (String[] dados : listaClientes) {
                modelo.addRow(dados);
            }
        } else {
            ArrayList<String[]> listaClientes = ManutencaoController.manutencaoPesquisarCliente(nomeCliente);

            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) tblClientes.getModel();

            modelo.setRowCount(0);
            if (listaClientes.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Cliente não encontrado");
                return;
            }
            for (String[] dados : listaClientes) {
                modelo.addRow(dados);
            }

        }
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        CadastroProdutoView telaAdicionarProduto = new CadastroProdutoView();
        telaAdicionarProduto.setVisible(true);
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void btnAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarClienteActionPerformed
        CadastroClienteView telaAdicionarCliente = new CadastroClienteView();
        telaAdicionarCliente.setVisible(true);
    }//GEN-LAST:event_btnAdicionarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        int linhaSelecionada = tblClientes.getSelectedRow();

        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Para excluir, por favor selecione na tabela o registro a ser excluído");
            return;
        }
        int codCliente = Integer.parseInt(tblClientes.getValueAt(linhaSelecionada, 0).toString());

        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir ?");

        if (confirmacao == 0) {
            if (ManutencaoController.manutencaoExcluirCliente(codCliente)) {
                JOptionPane.showMessageDialog(this, "Exclusão realizada com sucesso");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir, tente novamente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Exclusão cancelada");
        }

    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        int linhaSelecionada = tblProdutos.getSelectedRow();

        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Para excluir, por favor selecione na tabela o registro a ser excluído");
            return;
        }
        int codInstrumento = Integer.parseInt(tblProdutos.getValueAt(linhaSelecionada, 0).toString());

        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir ?");

        if (confirmacao == 0) {
            if (ManutencaoController.manutencaoExcluirProduto(codInstrumento)) {
                JOptionPane.showMessageDialog(this, "Exclusão realizada com sucesso");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir, tente novamente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Exclusão cancelada");
        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(ManutencaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManutencaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManutencaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManutencaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManutencaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAtualizaCliente;
    private javax.swing.JButton btnAtualizarProduto;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarProduto;
    private javax.swing.JButton btnProduto;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblMensagemErroCliente;
    private javax.swing.JLabel lblMensagemErroProduto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JPanel pnlBuscaClientes;
    private javax.swing.JPanel pnlBuscaProduto;
    private javax.swing.JPanel pnlCRUD;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlProdutos;
    private javax.swing.JPanel pnlTabelas;
    private javax.swing.JScrollPane sPnlClientes;
    private javax.swing.JScrollPane sPnlProdutos;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
