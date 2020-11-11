package br.instrumentosmusicais.pdv.view;

import br.instumentosmusicais.pdv.controller.PDVController;
import br.instumentosmusicais.pdv.utils.Validador;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class VendaView extends javax.swing.JFrame {

    /**
     * Creates new form TelaVendas
     */
    public VendaView() {
        initComponents();
        tbTabelaProdutosVenda.getColumnModel().getColumn(0).setPreferredWidth(15);
        tbTabelaProdutosVenda.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbTabelaProdutosVenda.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbTabelaProdutosVenda.getColumnModel().getColumn(3).setPreferredWidth(15);
        tbTabelaProdutosVenda.getColumnModel().getColumn(4).setPreferredWidth(30);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVenderEsq = new javax.swing.JPanel();
        pnlCliente = new javax.swing.JPanel();
        lblVender = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        lblCodCliente = new javax.swing.JLabel();
        btnPesquisarCliente = new javax.swing.JButton();
        lblMensagemErroNome = new javax.swing.JLabel();
        lblMensagemErroCPF = new javax.swing.JLabel();
        pnlProduto = new javax.swing.JPanel();
        lblQtdProduto = new javax.swing.JLabel();
        spnQtd = new javax.swing.JSpinner();
        lblCodProduto = new javax.swing.JLabel();
        btnAdicionarProduto = new javax.swing.JButton();
        txtNomeDoProduto = new javax.swing.JTextField();
        lblNomeDoProduto = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JTextField();
        lblMensagemErroCodProduto = new javax.swing.JLabel();
        pnlTabela = new javax.swing.JPanel();
        pnlValoresVender1 = new javax.swing.JPanel();
        lblDesconto1 = new javax.swing.JLabel();
        lblSubtotal1 = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        lblSubtotalValor1 = new javax.swing.JLabel();
        lblDescontoValor1 = new javax.swing.JLabel();
        lblSubtotalRS1 = new javax.swing.JLabel();
        lblDescontoRS1 = new javax.swing.JLabel();
        lblTotalValor1 = new javax.swing.JLabel();
        lblTotalRS1 = new javax.swing.JLabel();
        pnlTabelaVender = new javax.swing.JScrollPane();
        tbTabelaProdutosVenda = new javax.swing.JTable();
        btnFinalizarVenda = new javax.swing.JButton();
        lblicone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlVenderEsq.setBackground(new java.awt.Color(51, 51, 51));

        pnlCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblVender.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblVender.setText("Vender");

        lblNomeCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeCliente.setText("Nome do Cliente*");

        txtNomeCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtCPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setToolTipText("");

        lblCodCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblCodCliente.setText("CPF*");

        btnPesquisarCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnPesquisarCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnPesquisarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnPesquisarCliente.setContentAreaFilled(false);
        btnPesquisarCliente.setOpaque(true);
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        lblMensagemErroNome.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N

        lblMensagemErroCPF.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVender)
                    .addComponent(lblNomeCliente)
                    .addComponent(lblMensagemErroNome)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodCliente)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensagemErroCPF))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVender)
                .addGap(18, 18, 18)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(lblCodCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensagemErroNome)
                    .addComponent(lblMensagemErroCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblQtdProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblQtdProduto.setText("Quantidade");

        spnQtd.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnQtd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblCodProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblCodProduto.setText("Código do Produto*");

        btnAdicionarProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionarProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnAdicionarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarProduto.setText("Adicionar");
        btnAdicionarProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnAdicionarProduto.setContentAreaFilled(false);
        btnAdicionarProduto.setOpaque(true);
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        txtNomeDoProduto.setBackground(new java.awt.Color(102, 102, 102));
        txtNomeDoProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        txtNomeDoProduto.setText("Exemplo de produto");
        txtNomeDoProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        txtNomeDoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeDoProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeDoProdutoFocusLost(evt);
            }
        });
        txtNomeDoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDoProdutoActionPerformed(evt);
            }
        });

        lblNomeDoProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNomeDoProduto.setForeground(new java.awt.Color(204, 204, 204));
        lblNomeDoProduto.setText("Nome do Produto");

        txtCodProduto.setForeground(new java.awt.Color(204, 204, 204));
        txtCodProduto.setText("   Ex: 1234");
        txtCodProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtCodProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodProdutoFocusLost(evt);
            }
        });
        txtCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdutoActionPerformed(evt);
            }
        });
        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyTyped(evt);
            }
        });

        lblMensagemErroCodProduto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N

        javax.swing.GroupLayout pnlProdutoLayout = new javax.swing.GroupLayout(pnlProduto);
        pnlProduto.setLayout(pnlProdutoLayout);
        pnlProdutoLayout.setHorizontalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProdutoLayout.createSequentialGroup()
                        .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodProduto)
                            .addGroup(pnlProdutoLayout.createSequentialGroup()
                                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMensagemErroCodProduto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdutoLayout.createSequentialGroup()
                                .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))
                            .addGroup(pnlProdutoLayout.createSequentialGroup()
                                .addComponent(lblQtdProduto)
                                .addGap(70, 70, 70))))
                    .addGroup(pnlProdutoLayout.createSequentialGroup()
                        .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeDoProduto)
                            .addComponent(txtNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        pnlProdutoLayout.setVerticalGroup(
            pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodProduto)
                    .addComponent(lblQtdProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensagemErroCodProduto))
                .addGap(15, 15, 15)
                .addComponent(lblNomeDoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pnlProdutoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {spnQtd, txtCodProduto});

        pnlTabela.setBackground(new java.awt.Color(102, 102, 102));

        pnlValoresVender1.setBackground(new java.awt.Color(51, 51, 51));

        lblDesconto1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblDesconto1.setForeground(new java.awt.Color(255, 255, 255));
        lblDesconto1.setText("Desconto");

        lblSubtotal1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lblSubtotal1.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtotal1.setText("Subtotal");

        lblTotal1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal1.setText("Total");

        lblSubtotalValor1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lblSubtotalValor1.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtotalValor1.setText("0,00");

        lblDescontoValor1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lblDescontoValor1.setForeground(new java.awt.Color(255, 255, 255));
        lblDescontoValor1.setText("0,00");

        lblSubtotalRS1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lblSubtotalRS1.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtotalRS1.setText("R$");

        lblDescontoRS1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lblDescontoRS1.setForeground(new java.awt.Color(255, 255, 255));
        lblDescontoRS1.setText("R$");

        lblTotalValor1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblTotalValor1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalValor1.setText("0,00");

        lblTotalRS1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lblTotalRS1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalRS1.setText("R$");

        javax.swing.GroupLayout pnlValoresVender1Layout = new javax.swing.GroupLayout(pnlValoresVender1);
        pnlValoresVender1.setLayout(pnlValoresVender1Layout);
        pnlValoresVender1Layout.setHorizontalGroup(
            pnlValoresVender1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlValoresVender1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlValoresVender1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlValoresVender1Layout.createSequentialGroup()
                        .addGroup(pnlValoresVender1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDesconto1)
                            .addComponent(lblSubtotal1))
                        .addGap(34, 34, 34)
                        .addGroup(pnlValoresVender1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDescontoValor1)
                            .addComponent(lblSubtotalValor1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlValoresVender1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubtotalRS1)
                            .addComponent(lblDescontoRS1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlValoresVender1Layout.createSequentialGroup()
                                .addGap(0, 107, Short.MAX_VALUE)
                                .addComponent(lblTotalValor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalRS1))))
                    .addGroup(pnlValoresVender1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotal1)))
                .addGap(19, 19, 19))
        );
        pnlValoresVender1Layout.setVerticalGroup(
            pnlValoresVender1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresVender1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlValoresVender1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalValor1)
                    .addComponent(lblTotalRS1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlValoresVender1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtotal1)
                    .addComponent(lblSubtotalValor1)
                    .addComponent(lblSubtotalRS1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlValoresVender1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesconto1)
                    .addComponent(lblDescontoValor1)
                    .addComponent(lblDescontoRS1))
                .addGap(26, 26, 26))
        );

        tbTabelaProdutosVenda.setBackground(new java.awt.Color(153, 153, 153));
        tbTabelaProdutosVenda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        tbTabelaProdutosVenda.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        tbTabelaProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço", "Qtd", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

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

        btnFinalizarVenda.setBackground(new java.awt.Color(51, 51, 51));
        btnFinalizarVenda.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnFinalizarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarVenda.setText("<html>\nFinalizar\n<br>&nbsp;&nbsp;&nbsp;&nbsp;Venda\n</html>");
        btnFinalizarVenda.setContentAreaFilled(false);
        btnFinalizarVenda.setOpaque(true);

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlValoresVender1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTabelaVender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlTabelaLayout.setVerticalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTabelaVender, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(pnlValoresVender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        lblicone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MoedaTeste2.png"))); // NOI18N

        javax.swing.GroupLayout pnlVenderEsqLayout = new javax.swing.GroupLayout(pnlVenderEsq);
        pnlVenderEsq.setLayout(pnlVenderEsqLayout);
        pnlVenderEsqLayout.setHorizontalGroup(
            pnlVenderEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVenderEsqLayout.createSequentialGroup()
                .addGroup(pnlVenderEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVenderEsqLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVenderEsqLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lblicone))
                    .addGroup(pnlVenderEsqLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlVenderEsqLayout.setVerticalGroup(
            pnlVenderEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVenderEsqLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblicone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVenderEsqLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlVenderEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlVenderEsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodProdutoFocusGained
        if (txtCodProduto.getText().equals("   Ex: 1234")) {
            txtCodProduto.setText("");
            txtCodProduto.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtCodProdutoFocusGained

    private void txtCodProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodProdutoFocusLost
        if (txtCodProduto.getText().equals("")) {
            txtCodProduto.setText("   Ex: 1234");
            txtCodProduto.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtCodProdutoFocusLost

    private void txtCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdutoActionPerformed

    private void txtCodProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdutoKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números no código do produto !");
        }
    }//GEN-LAST:event_txtCodProdutoKeyTyped

    private void txtNomeDoProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeDoProdutoFocusGained
        if (txtNomeDoProduto.getText().equals("Exemplo de produto")) {
            txtNomeDoProduto.setText("");
            txtNomeDoProduto.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNomeDoProdutoFocusGained

    private void txtNomeDoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeDoProdutoFocusLost
        if (txtNomeDoProduto.getText().equals("")) {
            txtNomeDoProduto.setText("Exemplo de produto");
        }
    }//GEN-LAST:event_txtNomeDoProdutoFocusLost

    private void txtNomeDoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDoProdutoActionPerformed

    }//GEN-LAST:event_txtNomeDoProdutoActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed

        String nome = txtNomeCliente.getText().trim();
        String CPF = txtCPF.getText().replace(".", "").replace("-", "").trim();

        String[] infoCliente = PDVController.vendaBuscarCliente(nome, CPF);

        if (infoCliente == null) {
            JOptionPane.showMessageDialog(this, "ID não encontrado");
            Validador objValidar = new Validador();
            objValidar.CampoVazio(txtNomeCliente, lblMensagemErroNome);
            objValidar.CampoVazioFormatado(txtCPF, lblMensagemErroCPF);
            return;
        } else {
            txtNomeCliente.setText(infoCliente[0]);
            txtCPF.setText(infoCliente[1]);
            Validador objValidar = new Validador();
            objValidar.CampoVazio(txtNomeCliente, lblMensagemErroNome);
            objValidar.CampoVazioFormatado(txtCPF, lblMensagemErroCPF);

        }


    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        Validador objValidar = new Validador();
        if (txtCodProduto.getText().equals("   Ex: 1234")) {
            txtCodProduto.setText("");
            objValidar.CampoVazio(txtCodProduto, lblMensagemErroCodProduto);
        } else {
            txtCodProduto.setForeground(Color.BLACK);
            txtCodProduto.setBackground(Color.WHITE);
            objValidar.CampoVazio(txtCodProduto, lblMensagemErroCodProduto);
        }
        int linha = 0;

        int codigo = Integer.parseInt(txtCodProduto.getText());
        String instrumento = txtNomeDoProduto.getText();

        String[] addProduto = PDVController.vendaBuscarProduto(codigo, instrumento);
        float valor = Float.parseFloat(addProduto[2]);
        int quantidade = Integer.parseInt(spnQtd.getValue().toString());
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) tbTabelaProdutosVenda.getModel();
        
       if(addProduto == null){
       JOptionPane.showMessageDialog(this, "ID não encontrado");
       return;
       }else{
       txtCodProduto.setText(addProduto[0]);
       txtNomeDoProduto.setText(addProduto[1]);
       modelo.addRow(addProduto);
       modelo.setValueAt(spnQtd.getValue(), modelo.getRowCount()-1, 3);
       modelo.setValueAt(valor*quantidade, modelo.getRowCount()-1, 4);
       linha++;
       txtCodProduto.setText("");
       txtNomeDoProduto.setText("");
       }

    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JLabel lblCodCliente;
    private javax.swing.JLabel lblCodProduto;
    private javax.swing.JLabel lblDesconto1;
    private javax.swing.JLabel lblDescontoRS1;
    private javax.swing.JLabel lblDescontoValor1;
    private javax.swing.JLabel lblMensagemErroCPF;
    private javax.swing.JLabel lblMensagemErroCodProduto;
    private javax.swing.JLabel lblMensagemErroNome;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeDoProduto;
    private javax.swing.JLabel lblQtdProduto;
    private javax.swing.JLabel lblSubtotal1;
    private javax.swing.JLabel lblSubtotalRS1;
    private javax.swing.JLabel lblSubtotalValor1;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotalRS1;
    private javax.swing.JLabel lblTotalValor1;
    private javax.swing.JLabel lblVender;
    private javax.swing.JLabel lblicone;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlProduto;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JScrollPane pnlTabelaVender;
    private javax.swing.JPanel pnlValoresVender1;
    private javax.swing.JPanel pnlVenderEsq;
    private javax.swing.JSpinner spnQtd;
    private javax.swing.JTable tbTabelaProdutosVenda;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeDoProduto;
    // End of variables declaration//GEN-END:variables
}
