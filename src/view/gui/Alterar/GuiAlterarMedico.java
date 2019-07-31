package view.gui.Alterar;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Clinica;
import model.Data;
import model.Endereco;
import model.pessoa.Medico;

public class GuiAlterarMedico extends javax.swing.JFrame {

    private Medico medico;
    private String id;
    private String convenio = "";
    private String especializacao = "";
    private String telefoneDeEmergencia = "";
    private ArrayList<String> convenios;
    private ArrayList<String> especializacoes;
    private ArrayList<String> telefonesEmergenciais;

    
    public GuiAlterarMedico(Medico medico) {
        initComponents();
        
        this.medico = medico;
        this.id = medico.getId();
        
        this.tfNome.setText(medico.getNome());
        this.ffNascimento.setText(medico.getNascimento().getDataAnual());
        this.ffCPF.setText(medico.getCpf());
        this.tfRG.setText(medico.getRg());
        this.ffTelefone.setText(medico.getTelefone());
        this.tfEmail.setText(medico.getEmail());
        this.tfPais.setText(medico.getEndereco().getPais());
        this.tfCidade.setText(medico.getEndereco().getCidade());
        this.tfRua.setText(medico.getEndereco().getRua());
        this.tfNumero.setText(medico.getEndereco().getNumero());
        this.tfBairro.setText(medico.getEndereco().getBairro());
        this.tfReferencia.setText(medico.getEndereco().getReferencia());
        this.tfSalario.setText(String.valueOf(medico.getSalario()));
        this.tfCRM.setText(medico.getCrm());
        this.tfValorDaConsulta.setText(Double.toString(medico.getValorDaConsulta()));
        //this.tfHorarioDeConsultas.setText(medico.getHorariosDeConsulta().toString());
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation((tela.width - getSize().width) / 2, (tela.height - getSize().height) / 2);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnInfoPessoais = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbNascimento = new javax.swing.JLabel();
        tfRG = new javax.swing.JTextField();
        lbRG = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        ffNascimento = new javax.swing.JFormattedTextField();
        ffCPF = new javax.swing.JFormattedTextField();
        lbTelefone = new javax.swing.JLabel();
        ffTelefone = new javax.swing.JFormattedTextField();
        lbInfoPessoais = new javax.swing.JLabel();
        lbInfoClinicas = new javax.swing.JLabel();
        pnEndereco = new javax.swing.JPanel();
        lbPais = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbRua = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        lbReferencia = new javax.swing.JLabel();
        tfReferencia = new javax.swing.JTextField();
        tfPais = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lbEndereco = new javax.swing.JLabel();
        pnInfoClinicas = new javax.swing.JPanel();
        lbCRM = new javax.swing.JLabel();
        lbSalario = new javax.swing.JLabel();
        lbValorDaConsulta = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        tfValorDaConsulta = new javax.swing.JTextField();
        tfCRM = new javax.swing.JTextField();
        btAddTelefonesEmergenciais = new javax.swing.JToggleButton();
        btAddConvenios = new javax.swing.JToggleButton();
        btAddEspecializacoes = new javax.swing.JToggleButton();
        lbHorarioDeConsulta = new javax.swing.JLabel();
        tfHorarioDeConsultas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnInfoPessoais.setBackground(new java.awt.Color(166, 166, 166));

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNome.setText("Nome:");

        lbNascimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNascimento.setText("Data de nascimento:");

        lbRG.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRG.setText("RG:");

        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEmail.setText("Email:");

        lbCPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCPF.setText("CPF:");

        try {
            ffNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ffNascimento.setText("");

        try {
            ffCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ffCPF.setText("");

        lbTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTelefone.setText("Telefone: ");

        try {
            ffTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ffTelefone.setText("");

        javax.swing.GroupLayout pnInfoPessoaisLayout = new javax.swing.GroupLayout(pnInfoPessoais);
        pnInfoPessoais.setLayout(pnInfoPessoaisLayout);
        pnInfoPessoaisLayout.setHorizontalGroup(
            pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoPessoaisLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInfoPessoaisLayout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnInfoPessoaisLayout.createSequentialGroup()
                            .addComponent(lbTelefone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ffTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbEmail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfEmail))
                        .addGroup(pnInfoPessoaisLayout.createSequentialGroup()
                            .addComponent(lbNascimento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ffNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbCPF)
                            .addGap(3, 3, 3)
                            .addComponent(ffCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbRG)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnInfoPessoaisLayout.setVerticalGroup(
            pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoPessoaisLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCPF)
                        .addComponent(ffNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ffCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbRG)
                        .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefone)
                    .addComponent(ffTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        lbInfoPessoais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbInfoPessoais.setText("INFORMAÇÕES PESSOAIS");

        lbInfoClinicas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbInfoClinicas.setText("INFORMAÇÕES TRABALHISTAS");

        pnEndereco.setBackground(new java.awt.Color(166, 166, 166));

        lbPais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbPais.setText("País:");

        lbEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEstado.setText("Estado:");

        lbCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCidade.setText("Cidade:");

        lbRua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRua.setText("Rua:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "Outro" }));

        lbNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNumero.setText("Nº:");

        lbBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbBairro.setText("Bairro:");

        lbReferencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbReferencia.setText("Referência:");

        javax.swing.GroupLayout pnEnderecoLayout = new javax.swing.GroupLayout(pnEndereco);
        pnEndereco.setLayout(pnEnderecoLayout);
        pnEnderecoLayout.setHorizontalGroup(
            pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEnderecoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addComponent(lbBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbReferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfReferencia))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEnderecoLayout.createSequentialGroup()
                        .addComponent(lbPais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPais, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCidade))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEnderecoLayout.createSequentialGroup()
                        .addComponent(lbRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnEnderecoLayout.setVerticalGroup(
            pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEnderecoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btSalvar.setText("Cadastrar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbEndereco.setText("ENDEREÇO");

        pnInfoClinicas.setBackground(new java.awt.Color(166, 166, 166));

        lbCRM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCRM.setText("CRM:");

        lbSalario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSalario.setText("Salário:");

        lbValorDaConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbValorDaConsulta.setText("Valor da Consulta:");

        btAddTelefonesEmergenciais.setText("Adicionar Telefones Emergenciais");
        btAddTelefonesEmergenciais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddTelefonesEmergenciaisActionPerformed(evt);
            }
        });

        btAddConvenios.setText("Adicionar Convênios");
        btAddConvenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddConveniosActionPerformed(evt);
            }
        });

        btAddEspecializacoes.setText("Adiconar Especializações");
        btAddEspecializacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddEspecializacoesActionPerformed(evt);
            }
        });

        lbHorarioDeConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHorarioDeConsulta.setText("Horário de Consulta:");

        javax.swing.GroupLayout pnInfoClinicasLayout = new javax.swing.GroupLayout(pnInfoClinicas);
        pnInfoClinicas.setLayout(pnInfoClinicasLayout);
        pnInfoClinicasLayout.setHorizontalGroup(
            pnInfoClinicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoClinicasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnInfoClinicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnInfoClinicasLayout.createSequentialGroup()
                        .addGroup(pnInfoClinicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnInfoClinicasLayout.createSequentialGroup()
                                .addComponent(lbSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbValorDaConsulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfValorDaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbCRM))
                            .addGroup(pnInfoClinicasLayout.createSequentialGroup()
                                .addComponent(lbHorarioDeConsulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfHorarioDeConsultas)
                                .addGap(67, 67, 67)
                                .addComponent(btAddConvenios)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnInfoClinicasLayout.createSequentialGroup()
                        .addComponent(btAddTelefonesEmergenciais)
                        .addGap(67, 67, 67)
                        .addComponent(btAddEspecializacoes)
                        .addGap(94, 94, 94))))
        );
        pnInfoClinicasLayout.setVerticalGroup(
            pnInfoClinicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoClinicasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnInfoClinicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnInfoClinicasLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnInfoClinicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbValorDaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValorDaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(pnInfoClinicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddConvenios)
                    .addComponent(lbHorarioDeConsulta)
                    .addComponent(tfHorarioDeConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInfoClinicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddEspecializacoes)
                    .addComponent(btAddTelefonesEmergenciais))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbInfoClinicas)
                        .addComponent(lbEndereco)
                        .addComponent(lbInfoPessoais)
                        .addComponent(pnInfoPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnInfoClinicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbInfoPessoais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnInfoPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lbEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lbInfoClinicas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnInfoClinicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btSair))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        String nome = tfNome.getText();
        String rg = tfRG.getText();
        String email = tfEmail.getText();
        String pais = tfPais.getText();
        String estado = cbEstado.getSelectedItem().toString();
        String cidade = tfCidade.getText();
        String rua = tfRua.getText();
        String numero = tfNumero.getText();
        String bairro = tfBairro.getText();
        String referencia = tfReferencia.getText();
        String nasc = this.ffNascimento.getText();
        String cpf = this.ffCPF.getText();
        String telefone = ffTelefone.getText();
        String crm = tfCRM.getText();
        String valorDaConsulta = tfValorDaConsulta.getText();
        String salario = tfSalario.getText();
        String horarioDeConsulta = tfHorarioDeConsultas.getText();

        Data dataNasc = Data.parseData(nasc);
        Endereco endereco = new Endereco(pais, estado, cidade, bairro, rua, numero, referencia);
        double valorRealDaConsulta = Double.parseDouble(valorDaConsulta);
        double salarioReal = Double.parseDouble(salario);
        Medico medico = new Medico(crm, nome, rg, cpf, email, telefone, endereco, dataNasc, id ,salarioReal, valorRealDaConsulta, convenios, especializacoes, telefonesEmergenciais);

        this.medico.setNome(nome);
        this.medico.setNascimento(dataNasc);
        this.medico.setCpf(cpf);
        this.medico.setRg(rg);
        this.medico.setTelefone(telefone);
        this.medico.setEmail(email);
        this.medico.setEndereco(endereco);
        this.medico.setSalario(salarioReal);

        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Paciente alterado com sucesso!"); 
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btSairActionPerformed

    private void btAddTelefonesEmergenciaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddTelefonesEmergenciaisActionPerformed

        telefoneDeEmergencia = JOptionPane.showInputDialog(null, "Informe um telefone emergencial", "Telefones adicionais", JOptionPane.DEFAULT_OPTION);

        telefonesEmergenciais = new ArrayList<String>();
        telefonesEmergenciais.add(telefoneDeEmergencia);

    }//GEN-LAST:event_btAddTelefonesEmergenciaisActionPerformed

    private void btAddConveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddConveniosActionPerformed

        convenio = JOptionPane.showInputDialog(null, "Informe um convenio", "Convênios", JOptionPane.DEFAULT_OPTION);

        convenios = new ArrayList<String>();
        convenios.add(convenio);

    }//GEN-LAST:event_btAddConveniosActionPerformed

    private void btAddEspecializacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddEspecializacoesActionPerformed
        especializacao = JOptionPane.showInputDialog(null, "Informe uma especializacao", "Especialisações", JOptionPane.DEFAULT_OPTION);

        especializacoes = new ArrayList<String>();
        especializacoes.add(especializacao);

    }//GEN-LAST:event_btAddEspecializacoesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btAddConvenios;
    private javax.swing.JToggleButton btAddEspecializacoes;
    private javax.swing.JToggleButton btAddTelefonesEmergenciais;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JFormattedTextField ffCPF;
    private javax.swing.JFormattedTextField ffNascimento;
    private javax.swing.JFormattedTextField ffTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCRM;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbHorarioDeConsulta;
    private javax.swing.JLabel lbInfoClinicas;
    private javax.swing.JLabel lbInfoPessoais;
    private javax.swing.JLabel lbNascimento;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbPais;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbReferencia;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbValorDaConsulta;
    private javax.swing.JPanel pnEndereco;
    private javax.swing.JPanel pnInfoClinicas;
    private javax.swing.JPanel pnInfoPessoais;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCRM;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfHorarioDeConsultas;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPais;
    private javax.swing.JTextField tfRG;
    private javax.swing.JTextField tfReferencia;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfValorDaConsulta;
    // End of variables declaration//GEN-END:variables
}
