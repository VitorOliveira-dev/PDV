/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.instrumentosmusicais.pdv.view;

import br.instrumentosmusicais.pdv.controller.PDVController;
import br.instrumentosmusicais.pdv.utils.Validador;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author paulohex000
 */
public class CadastroClienteView extends javax.swing.JFrame {

    int codCliente = 0;
    String modoTela = "Criar";

    public CadastroClienteView() {
        initComponents();
        lblCodigo.setVisible(false);
        setLocationRelativeTo(null);
        
    }

    public CadastroClienteView(int codCliente) {
        initComponents();
        setLocationRelativeTo(null);

        this.codCliente = codCliente;
         preencherCliente(codCliente);
        modoTela = "Alterar";

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSexo = new javax.swing.ButtonGroup();
        pnlInformacoesCliente = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        btnFeminino = new javax.swing.JRadioButton();
        btnMasculino = new javax.swing.JRadioButton();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblCodigo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pnlBotoes = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        lblCadastrarCliente = new javax.swing.JLabel();
        lblVlrCodigo = new javax.swing.JLabel();
        lblicone = new javax.swing.JLabel();
        jblMensagemNome = new javax.swing.JLabel();
        jblMensagemCpf = new javax.swing.JLabel();
        jblMensagemEndereco = new javax.swing.JLabel();
        jblMensagemCidade = new javax.swing.JLabel();
        jblMensagemTelefone = new javax.swing.JLabel();
        jblMensagemData = new javax.swing.JLabel();
        jblMensagemEmail = new javax.swing.JLabel();
        jData = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlInformacoesCliente.setBackground(new java.awt.Color(51, 51, 51));
        pnlInformacoesCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlInformacoesCliente.setPreferredSize(new java.awt.Dimension(760, 563));

        lblNome.setBackground(new java.awt.Color(255, 255, 255));
        lblNome.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblNome.setForeground(java.awt.Color.white);
        lblNome.setText("* Nome:");

        lblCPF.setBackground(new java.awt.Color(255, 255, 255));
        lblCPF.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblCPF.setForeground(java.awt.Color.white);
        lblCPF.setText("* CPF:");

        lblNascimento.setBackground(new java.awt.Color(255, 255, 255));
        lblNascimento.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblNascimento.setText("* Data de nasc:");

        lblSexo.setBackground(new java.awt.Color(255, 255, 255));
        lblSexo.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo:");

        lblTelefone.setBackground(new java.awt.Color(255, 255, 255));
        lblTelefone.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("* Telefone:");

        lblCidade.setBackground(new java.awt.Color(255, 255, 255));
        lblCidade.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblCidade.setForeground(java.awt.Color.white);
        lblCidade.setText("* Cidade:");

        lblEndereco.setBackground(new java.awt.Color(255, 255, 255));
        lblEndereco.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblEndereco.setForeground(java.awt.Color.white);
        lblEndereco.setText("* Endereço:");

        txtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        txtCidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCidadeKeyTyped(evt);
            }
        });

        txtEndereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        txtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnderecoKeyTyped(evt);
            }
        });

        btnFeminino.setBackground(new java.awt.Color(51, 51, 51));
        btnSexo.add(btnFeminino);
        btnFeminino.setForeground(new java.awt.Color(255, 255, 255));
        btnFeminino.setText("F");
        btnFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemininoActionPerformed(evt);
            }
        });

        btnMasculino.setBackground(new java.awt.Color(51, 51, 51));
        btnSexo.add(btnMasculino);
        btnMasculino.setForeground(new java.awt.Color(255, 255, 255));
        btnMasculino.setText("M");
        btnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasculinoActionPerformed(evt);
            }
        });

        txtCpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Codigo:");

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("* Email:");

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        pnlBotoes.setBackground(new java.awt.Color(153, 153, 153));
        pnlBotoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnVoltar.setBackground(new java.awt.Color(51, 51, 51));
        btnVoltar.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Cancelar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setOpaque(true);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionar.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Salvar");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAdicionar.setContentAreaFilled(false);
        btnAdicionar.setOpaque(true);
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdicionar, btnVoltar});

        lblCadastrarCliente.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        lblCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrarCliente.setText("Cadastrar Cliente");

        lblVlrCodigo.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblVlrCodigo.setForeground(new java.awt.Color(255, 255, 255));

        lblicone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TesteCli2.png"))); // NOI18N

        jblMensagemNome.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        jblMensagemNome.setForeground(new java.awt.Color(255, 255, 255));

        jblMensagemCpf.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        jblMensagemCpf.setForeground(new java.awt.Color(255, 255, 255));

        jblMensagemEndereco.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        jblMensagemEndereco.setForeground(new java.awt.Color(255, 255, 255));

        jblMensagemCidade.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        jblMensagemCidade.setForeground(new java.awt.Color(255, 255, 255));

        jblMensagemTelefone.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        jblMensagemTelefone.setForeground(new java.awt.Color(255, 255, 255));

        jblMensagemData.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        jblMensagemData.setForeground(new java.awt.Color(255, 255, 255));

        jblMensagemEmail.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        jblMensagemEmail.setForeground(new java.awt.Color(255, 255, 255));

        jData.setBackground(new java.awt.Color(51, 51, 51));
        jData.setDateFormatString("yyyy-MM-dd");
        jData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDataKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlInformacoesClienteLayout = new javax.swing.GroupLayout(pnlInformacoesCliente);
        pnlInformacoesCliente.setLayout(pnlInformacoesClienteLayout);
        pnlInformacoesClienteLayout.setHorizontalGroup(
            pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                        .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformacoesClienteLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTelefone)
                                    .addComponent(lblNascimento))
                                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jblMensagemTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jblMensagemData, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformacoesClienteLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblEmail)
                                .addGap(5, 5, 5)
                                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblMensagemEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformacoesClienteLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFeminino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMasculino))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformacoesClienteLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jblMensagemNome, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                                    .addComponent(txtNome)))
                            .addComponent(pnlBotoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformacoesClienteLayout.createSequentialGroup()
                                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                                            .addGap(65, 65, 65)
                                            .addComponent(lblCPF))
                                        .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lblEndereco, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblMensagemCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblMensagemEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(jblMensagemCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEndereco)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12))
                    .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                        .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(lblicone, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(lblCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(lblVlrCodigo)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlInformacoesClienteLayout.setVerticalGroup(
            pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCadastrarCliente)
                    .addComponent(lblicone))
                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblVlrCodigo))
                    .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblCodigo)))
                .addGap(28, 28, 28)
                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jblMensagemNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jblMensagemCpf)
                .addGap(10, 10, 10)
                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jblMensagemEndereco)
                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jblMensagemCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone))
                .addComponent(jblMensagemTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                        .addComponent(lblNascimento)
                        .addGap(0, 0, 0)
                        .addComponent(jblMensagemData)
                        .addGap(10, 10, 10)
                        .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addComponent(jblMensagemEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(btnFeminino)
                            .addComponent(btnMasculino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlInformacoesClienteLayout.createSequentialGroup()
                        .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pnlInformacoesClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCidade, txtCpf, txtEmail, txtEndereco, txtNome, txtTelefone});

        pnlInformacoesClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jblMensagemCidade, jblMensagemCpf, jblMensagemData, jblMensagemEmail, jblMensagemEndereco, jblMensagemNome});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInformacoesCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInformacoesCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        Validador objValidar = new Validador();
        objValidar.CampoVazio(txtNome, jblMensagemNome);
        objValidar.CampoVazioFormatado(txtCpf, jblMensagemCpf);
        objValidar.CampoVazio(txtEndereco, jblMensagemEndereco);
        objValidar.CampoVazio(txtCidade, jblMensagemCidade);
        objValidar.CampoVazioFormatado(txtTelefone, jblMensagemTelefone);
        //  objValidar.CampoVazioFormatado(jData, jblMensagemData);
        objValidar.CampoVazio(txtEmail, jblMensagemEmail);

        // enviar dados para controller
        String nomeCliente = "";
        String cpf = "";
        String endereco = "";
        String cidade = "";
        String telefone = "";
        String nasc = "";
        String email = "";
        String sexo = "";
        try {
            nomeCliente = txtNome.getText();
            cpf = txtCpf.getText().replace(".", "").replace("-", "").trim();
            endereco = txtEndereco.getText();
            cidade = txtCidade.getText();
            telefone = txtTelefone.getText().replace(")", "").replace("(", "").replace("-", "").trim();
            nasc = ((JTextField) jData.getDateEditor().getUiComponent()).getText();
            email = txtEmail.getText();
            sexo = genero;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falha ao converter os dados");
            return;

        }
        if (modoTela == "Criar") {  
            txtNome.setText("");
            txtCpf.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
            
            
            // Gravar no banco
            if (PDVController.salvarCliente(nomeCliente, cpf, endereco, cidade, telefone, nasc, email, sexo)) {
                JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao incluir cliente");
            }
        }
        else 
        {    if (PDVController.atualizarCliente(codCliente, nomeCliente, cpf, endereco, cidade, telefone, nasc, email, sexo)) {
                JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar cliente!");
            }

        }


    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost

    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained

    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        if (txtNome.getText().length() >= 40) {
            evt.consume();
            jblMensagemNome.setText("Máximo de 40 caracteres atingido!");
        } else {
            jblMensagemNome.setText("");
        }

    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoKeyTyped
        if (txtEndereco.getText().length() >= 40) {
            evt.consume();
            jblMensagemEndereco.setText("Máximo de 40 caracteres atingido!");
        } else {
            jblMensagemEndereco.setText("");
        }
    }//GEN-LAST:event_txtEnderecoKeyTyped

    private void txtCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyTyped
        if (txtCidade.getText().length() >= 40) {
            evt.consume();
            jblMensagemCidade.setText("Máximo de 40 caracteres atingido!");
        } else {
            jblMensagemCidade.setText("");
        }
    }//GEN-LAST:event_txtCidadeKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if (txtEmail.getText().length() >= 40) {
            evt.consume();
            jblMensagemEmail.setText("Máximo de 40 caracteres atingido!");
        } else {
            jblMensagemEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasculinoActionPerformed
        genero = "M";
    }//GEN-LAST:event_btnMasculinoActionPerformed

    private void btnFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemininoActionPerformed
        genero = "F";
    }//GEN-LAST:event_btnFemininoActionPerformed

    private void jDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDataKeyTyped

    }//GEN-LAST:event_jDataKeyTyped

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
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JRadioButton btnFeminino;
    private javax.swing.JRadioButton btnMasculino;
    private javax.swing.ButtonGroup btnSexo;
    private javax.swing.JButton btnVoltar;
    private com.toedter.calendar.JDateChooser jData;
    private javax.swing.JLabel jblMensagemCidade;
    private javax.swing.JLabel jblMensagemCpf;
    private javax.swing.JLabel jblMensagemData;
    private javax.swing.JLabel jblMensagemEmail;
    private javax.swing.JLabel jblMensagemEndereco;
    private javax.swing.JLabel jblMensagemNome;
    private javax.swing.JLabel jblMensagemTelefone;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastrarCliente;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblVlrCodigo;
    private javax.swing.JLabel lblicone;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlInformacoesCliente;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
String genero;

 private void preencherCliente(int CodCliente) {

        String[] retorno = PDVController.consultarCliente(CodCliente);
        lblVlrCodigo.setText(retorno[0]);
        txtNome.setText(retorno[1]);
        txtCpf.setText(retorno[2]);
        txtEndereco.setText(retorno[3]);
        txtCidade.setText(retorno[4]);
        txtTelefone.setText(retorno[5]);
      jData.setDateFormatString(retorno[6]);
      txtEmail.setText(retorno[7]);
      

    }
}
