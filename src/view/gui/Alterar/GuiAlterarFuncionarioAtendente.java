package view.gui.Alterar;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.Data;
import model.Endereco;
import model.pessoa.FuncionarioAtendente;

public class GuiAlterarFuncionarioAtendente extends javax.swing.JFrame {

    private FuncionarioAtendente funcionarioAtendente;
    
    public GuiAlterarFuncionarioAtendente(FuncionarioAtendente funcionarioAtendente){
     
        initComponents();
        
        this.funcionarioAtendente = funcionarioAtendente;
        
        this.tfNome.setText(funcionarioAtendente.getNome());
        this.tfRG.setText(funcionarioAtendente.getRg());
        this.ftfCPF.setText(funcionarioAtendente.getCpf());
        this.ftfNascimento.setText(funcionarioAtendente.getNascimento().getDataAnual());
        this.ftfTelefone.setText(funcionarioAtendente.getTelefone());
        this.tfEmail.setText(funcionarioAtendente.getEmail());
        this.tfPais.setText(funcionarioAtendente.getEndereco().getPais());
        this.tfCidade.setText(funcionarioAtendente.getEndereco().getCidade());
        this.tfCidade.setText(funcionarioAtendente.getEndereco().getCidade());
        this.tfNumero.setText(funcionarioAtendente.getEndereco().getNumero());
        this.tfBairro.setText(funcionarioAtendente.getEndereco().getBairro());
        this.tfReferencia.setText(funcionarioAtendente.getEndereco().getReferencia());
        this.tfFaculdade.setText(funcionarioAtendente.getFaculdade());
        this.tfConclusaoCurso.setText(funcionarioAtendente.getAnoDeConclusaoGraduacao());
        this.tfTCC.setText(funcionarioAtendente.getTituloTCC());
        this.tfSalario.setText(String.valueOf(funcionarioAtendente.getSalario()));
        
       
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation((tela.width - getSize().width) / 2, (tela.height - getSize().height) / 2);
        
        Image icone = Toolkit.getDefaultToolkit().getImage("imgs//icone.png");;
        this.setIconImage(icone);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbInfoPessoais = new javax.swing.JLabel();
        pnEndereco = new javax.swing.JPanel();
        lbPais = new javax.swing.JLabel();
        tfPais = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lbCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        lbRua = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        lbReferencia = new javax.swing.JLabel();
        tfReferencia = new javax.swing.JTextField();
        lbInfoTrabalhistas = new javax.swing.JLabel();
        pnInfoTrabalhistas = new javax.swing.JPanel();
        lbSalario = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        lbEndereco = new javax.swing.JLabel();
        lbFormacaoAcademica = new javax.swing.JLabel();
        pnFormacaoAcademica = new javax.swing.JPanel();
        lbFaculdade = new javax.swing.JLabel();
        tfFaculdade = new javax.swing.JTextField();
        lbConclusaoCurso = new javax.swing.JLabel();
        tfConclusaoCurso = new javax.swing.JTextField();
        lbTCC = new javax.swing.JLabel();
        tfTCC = new javax.swing.JTextField();
        pnInfoPessoais = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbNascimento = new javax.swing.JLabel();
        ftfNascimento = new javax.swing.JFormattedTextField();
        lbCPF = new javax.swing.JLabel();
        ftfCPF = new javax.swing.JFormattedTextField();
        lbRG = new javax.swing.JLabel();
        tfRG = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        ftfTelefone = new javax.swing.JFormattedTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionário atendente");
        setResizable(false);

        lbInfoPessoais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbInfoPessoais.setText("INFORMAÇÕES PESSOAIS");

        pnEndereco.setBackground(new java.awt.Color(166, 166, 166));

        lbPais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbPais.setText("País:");

        lbEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEstado.setText("Estado:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "Outro" }));

        lbCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCidade.setText("Cidade:");

        lbRua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRua.setText("Rua:");

        lbNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNumero.setText("N°:");

        lbBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbBairro.setText("Bairro:");

        lbReferencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbReferencia.setText("Referência:");

        javax.swing.GroupLayout pnEnderecoLayout = new javax.swing.GroupLayout(pnEndereco);
        pnEndereco.setLayout(pnEnderecoLayout);
        pnEnderecoLayout.setHorizontalGroup(
            pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEnderecoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addComponent(lbBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbReferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfReferencia))
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addComponent(lbRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumero))
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addComponent(lbPais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPais, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnEnderecoLayout.setVerticalGroup(
            pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEnderecoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCidade)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado)
                    .addComponent(tfPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRua)
                    .addComponent(lbNumero)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBairro)
                    .addComponent(lbReferencia)
                    .addComponent(tfReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lbInfoTrabalhistas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbInfoTrabalhistas.setText("INFORMAÇÕES TRABALHISTAS");

        pnInfoTrabalhistas.setBackground(new java.awt.Color(166, 166, 166));

        lbSalario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSalario.setText("Salário:");

        javax.swing.GroupLayout pnInfoTrabalhistasLayout = new javax.swing.GroupLayout(pnInfoTrabalhistas);
        pnInfoTrabalhistas.setLayout(pnInfoTrabalhistasLayout);
        pnInfoTrabalhistasLayout.setHorizontalGroup(
            pnInfoTrabalhistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoTrabalhistasLayout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(lbSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        pnInfoTrabalhistasLayout.setVerticalGroup(
            pnInfoTrabalhistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoTrabalhistasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnInfoTrabalhistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSalario)
                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        lbEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbEndereco.setText("ENDEREÇO");

        lbFormacaoAcademica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbFormacaoAcademica.setText("FORMAÇÃO ACADÊMICA");

        pnFormacaoAcademica.setBackground(new java.awt.Color(166, 166, 166));

        lbFaculdade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbFaculdade.setText("Faculdade:");

        lbConclusaoCurso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbConclusaoCurso.setText("Ano de conclusão de curso:");

        lbTCC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTCC.setText("Título do TCC:");

        javax.swing.GroupLayout pnFormacaoAcademicaLayout = new javax.swing.GroupLayout(pnFormacaoAcademica);
        pnFormacaoAcademica.setLayout(pnFormacaoAcademicaLayout);
        pnFormacaoAcademicaLayout.setHorizontalGroup(
            pnFormacaoAcademicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormacaoAcademicaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnFormacaoAcademicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnFormacaoAcademicaLayout.createSequentialGroup()
                        .addComponent(lbTCC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTCC))
                    .addGroup(pnFormacaoAcademicaLayout.createSequentialGroup()
                        .addComponent(lbFaculdade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFaculdade, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbConclusaoCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfConclusaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnFormacaoAcademicaLayout.setVerticalGroup(
            pnFormacaoAcademicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormacaoAcademicaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnFormacaoAcademicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFaculdade)
                    .addComponent(tfFaculdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbConclusaoCurso)
                    .addComponent(tfConclusaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFormacaoAcademicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTCC)
                    .addComponent(tfTCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnInfoPessoais.setBackground(new java.awt.Color(166, 166, 166));

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNome.setText("Nome:");

        lbNascimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNascimento.setText("Data de nascimento:");

        try {
            ftfNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfNascimento.setText("");

        lbCPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCPF.setText("CPF:");

        try {
            ftfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCPF.setText("");

        lbRG.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRG.setText("RG:");

        lbTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTelefone.setText("Telefone:");

        try {
            ftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfTelefone.setText("");

        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEmail.setText("Email:");

        javax.swing.GroupLayout pnInfoPessoaisLayout = new javax.swing.GroupLayout(pnInfoPessoais);
        pnInfoPessoais.setLayout(pnInfoPessoaisLayout);
        pnInfoPessoaisLayout.setHorizontalGroup(
            pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoPessoaisLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnInfoPessoaisLayout.createSequentialGroup()
                        .addComponent(lbTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmail))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInfoPessoaisLayout.createSequentialGroup()
                        .addComponent(lbNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInfoPessoaisLayout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnInfoPessoaisLayout.setVerticalGroup(
            pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoPessoaisLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNascimento)
                    .addComponent(ftfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCPF)
                    .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRG)
                    .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(ftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbInfoTrabalhistas)
                        .addComponent(pnInfoTrabalhistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbFormacaoAcademica)
                        .addComponent(pnFormacaoAcademica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbInfoPessoais)
                        .addComponent(pnInfoPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbInfoPessoais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnInfoPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbFormacaoAcademica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnFormacaoAcademica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbInfoTrabalhistas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnInfoTrabalhistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        
        String nome = tfNome.getText();
        String nascimento = ftfNascimento.getText();
        String cpf = ftfCPF.getText();
        String rg = tfRG.getText();
        String telefone = ftfTelefone.getText();
        String email = tfEmail.getText();
        String pais = tfPais.getText();
        String estado = cbEstado.getActionCommand();
        String cidade = tfCidade.getText();
        String rua = tfRua.getText();
        String numero = tfNumero.getText();
        String bairro = tfBairro.getText();
        String referencia = tfReferencia.getText();
        String faculdade = tfFaculdade.getText();
        String anoDeConclusao = tfConclusaoCurso.getText();
        String tituloTcc = tfTCC.getText();
        String salario = tfSalario.getText();
        
        Data dataNascimento = Data.parseData(nascimento);
        double salarioReal = Double.parseDouble(salario);
        Endereco endereco = new Endereco(pais, estado, cidade, bairro, rua, numero, referencia);

        this.funcionarioAtendente.setNome(nome);
        this.funcionarioAtendente.setRg(rg);
        this.funcionarioAtendente.setCpf(cpf);
        this.funcionarioAtendente.setTelefone(telefone);
        this.funcionarioAtendente.setNascimento(dataNascimento);
        this.funcionarioAtendente.setEmail(email);
        this.funcionarioAtendente.setEndereco(endereco);
        this.funcionarioAtendente.setFaculdade(faculdade);
        this.funcionarioAtendente.setAnoDeConclusaoGraduacao(anoDeConclusao);
        this.funcionarioAtendente.setTituloTCC(tituloTcc);
        this.funcionarioAtendente.setSalario(salarioReal);

        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Funcionáio alterado com sucesso!");        

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_btSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JFormattedTextField ftfCPF;
    private javax.swing.JFormattedTextField ftfNascimento;
    private javax.swing.JFormattedTextField ftfTelefone;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbConclusaoCurso;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbFaculdade;
    private javax.swing.JLabel lbFormacaoAcademica;
    private javax.swing.JLabel lbInfoPessoais;
    private javax.swing.JLabel lbInfoTrabalhistas;
    private javax.swing.JLabel lbNascimento;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbPais;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbReferencia;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbTCC;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JPanel pnEndereco;
    private javax.swing.JPanel pnFormacaoAcademica;
    private javax.swing.JPanel pnInfoPessoais;
    private javax.swing.JPanel pnInfoTrabalhistas;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfConclusaoCurso;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFaculdade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPais;
    private javax.swing.JTextField tfRG;
    private javax.swing.JTextField tfReferencia;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfTCC;
    // End of variables declaration//GEN-END:variables
}
