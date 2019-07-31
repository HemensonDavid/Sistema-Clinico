package view.gui;

import view.gui.Cadastro.GuiCadastroMedico;
import view.gui.Cadastro.GuiCadastroFuncionarioAtendente;
import view.gui.Cadastro.GuiCadastroPaciente;
import view.gui.Cadastro.GuiCadastroFuncionarioGeral;
import view.gui.Alterar.GuiAlterarMedico;
import view.gui.Alterar.GuiAlterarPaciente;
import view.gui.Alterar.GuiAlterarFuncionarioGeral;
import view.gui.Alterar.GuiAlterarLogin;
import view.gui.Alterar.GuiAlterarSenha;
import view.gui.Alterar.GuiAlterarConsulta;
import view.gui.Alterar.GuiAlterarFuncionarioAtendente;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Arquivo;
import model.Clinica;
import model.Consulta;
import model.pessoa.FuncionarioAtendente;
import model.pessoa.FuncionarioGeral;
import model.pessoa.Medico;
import model.pessoa.Paciente;
import view.gui.email.GuiEmail;
import view.gui.email.GuiEmailAtendente;
import view.gui.email.GuiEmailFuncGeral;
import view.gui.email.GuiEmailFuncionario;
import view.gui.email.GuiEmailMedico;
import view.gui.email.GuiEmailPaciente;

public class GuiPrincipal extends javax.swing.JFrame implements Runnable{
    
    private Clinica clinica;
    
    public GuiPrincipal() {
        initComponents();
        
        this.clinica = (Clinica) Arquivo.loadObject("arquivos//clinica.arq");
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation((tela.width - getSize().width) / 2, (tela.height - getSize().height) / 2);
        
        Image icone = Toolkit.getDefaultToolkit().getImage("imgs//icone.png");;
        this.setIconImage(icone);
        
        this.setTitle(this.clinica.getNome());
        
        new Thread(this).start();
        
        this.lbLogo.setIcon(new ImageIcon("imgs//logo.png"));
        this.lbSAM.setIcon(new ImageIcon("imgs//LOGO_SAM.png"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        pnHora = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        lbSAM = new javax.swing.JLabel();
        mbBarraDeMenu = new javax.swing.JMenuBar();
        mnArquivo = new javax.swing.JMenu();
        mnConsulta = new javax.swing.JMenu();
        miAgendarConsulta = new javax.swing.JMenuItem();
        miEditarConsulta = new javax.swing.JMenuItem();
        miExcluirConsulta = new javax.swing.JMenuItem();
        miListarConsulta = new javax.swing.JMenuItem();
        mnGerenciamento = new javax.swing.JMenu();
        mnPaciente = new javax.swing.JMenu();
        miCadastrarPaciente = new javax.swing.JMenuItem();
        miEditarPaciente = new javax.swing.JMenuItem();
        miRemoverPaciente = new javax.swing.JMenuItem();
        miListarPacientes = new javax.swing.JMenuItem();
        mnFuncionario = new javax.swing.JMenu();
        mnFuncionarioGeral = new javax.swing.JMenu();
        miCadastrarFuncionarioGeral = new javax.swing.JMenuItem();
        miEditarFuncionarioGeral = new javax.swing.JMenuItem();
        miExcluirFuncionarioGeral = new javax.swing.JMenuItem();
        miListarFuncionarioGeral = new javax.swing.JMenuItem();
        mnMedico = new javax.swing.JMenu();
        miCadastrarMedico = new javax.swing.JMenuItem();
        miAlterarMedico = new javax.swing.JMenuItem();
        miRemoverMedico = new javax.swing.JMenuItem();
        miListarMedicos = new javax.swing.JMenuItem();
        mnFuncionarioAtendente = new javax.swing.JMenu();
        miCadastrarFuncionarioAtendente = new javax.swing.JMenuItem();
        miEditarFuncionarioAtendente = new javax.swing.JMenuItem();
        miRemoverFuncionarioAtendente = new javax.swing.JMenuItem();
        miListarFuncionariosAtendentes = new javax.swing.JMenuItem();
        mnBuscar = new javax.swing.JMenu();
        mnBuscarFuncionario = new javax.swing.JMenu();
        miBuscarAtendente = new javax.swing.JMenuItem();
        miBuscarGeral = new javax.swing.JMenuItem();
        miBuscarMedico = new javax.swing.JMenuItem();
        miBuscarPaciente = new javax.swing.JMenuItem();
        mnEnviarEmail = new javax.swing.JMenu();
        miNovoEmail = new javax.swing.JMenuItem();
        mnParaTodos = new javax.swing.JMenu();
        miFuncionarios = new javax.swing.JMenuItem();
        miMedicos = new javax.swing.JMenuItem();
        miPacientes = new javax.swing.JMenuItem();
        miFuncAtendentes = new javax.swing.JMenuItem();
        miFuncGerais = new javax.swing.JMenuItem();
        mnAlterar = new javax.swing.JMenu();
        miLogin = new javax.swing.JMenuItem();
        miSenha = new javax.swing.JMenuItem();
        miLoginSenha = new javax.swing.JMenuItem();
        miSalvar = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        mnHelp = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ojuara Sistemas - Sistema Clínico");
        setExtendedState(MAXIMIZED_BOTH);

        pnPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        lbHora.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        lbHora.setText("00:00:00");

        javax.swing.GroupLayout pnHoraLayout = new javax.swing.GroupLayout(pnHora);
        pnHora.setLayout(pnHoraLayout);
        pnHoraLayout.setHorizontalGroup(
            pnHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSAM, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnHoraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHora)
                        .addContainerGap())
                    .addGroup(pnHoraLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(217, Short.MAX_VALUE))))
        );
        pnHoraLayout.setVerticalGroup(
            pnHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoraLayout.createSequentialGroup()
                .addGroup(pnHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnHoraLayout.createSequentialGroup()
                        .addContainerGap(65, Short.MAX_VALUE)
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lbHora))
                    .addGroup(pnHoraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbSAM, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnArquivo.setText("Arquivo");

        mnConsulta.setText("Consulta");

        miAgendarConsulta.setText("Agendar");
        miAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgendarConsultaActionPerformed(evt);
            }
        });
        mnConsulta.add(miAgendarConsulta);

        miEditarConsulta.setText("Alterar");
        miEditarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarConsultaActionPerformed(evt);
            }
        });
        mnConsulta.add(miEditarConsulta);

        miExcluirConsulta.setText("Excluir");
        miExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExcluirConsultaActionPerformed(evt);
            }
        });
        mnConsulta.add(miExcluirConsulta);

        miListarConsulta.setText("Listar");
        miListarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarConsultaActionPerformed(evt);
            }
        });
        mnConsulta.add(miListarConsulta);

        mnArquivo.add(mnConsulta);

        mnGerenciamento.setText("Gerenciamento");

        mnPaciente.setText("Paciente");

        miCadastrarPaciente.setText("Cadastrar");
        miCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarPacienteActionPerformed(evt);
            }
        });
        mnPaciente.add(miCadastrarPaciente);

        miEditarPaciente.setText("Editar");
        miEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarPacienteActionPerformed(evt);
            }
        });
        mnPaciente.add(miEditarPaciente);

        miRemoverPaciente.setText("Remover");
        miRemoverPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverPacienteActionPerformed(evt);
            }
        });
        mnPaciente.add(miRemoverPaciente);

        miListarPacientes.setText("Listar");
        miListarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarPacientesActionPerformed(evt);
            }
        });
        mnPaciente.add(miListarPacientes);

        mnGerenciamento.add(mnPaciente);

        mnFuncionario.setText("Funcionario");

        mnFuncionarioGeral.setText("Geral");

        miCadastrarFuncionarioGeral.setText("Cadastrar");
        miCadastrarFuncionarioGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarFuncionarioGeralActionPerformed(evt);
            }
        });
        mnFuncionarioGeral.add(miCadastrarFuncionarioGeral);

        miEditarFuncionarioGeral.setText("Editar");
        miEditarFuncionarioGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarFuncionarioGeralActionPerformed(evt);
            }
        });
        mnFuncionarioGeral.add(miEditarFuncionarioGeral);

        miExcluirFuncionarioGeral.setText("Excluir");
        miExcluirFuncionarioGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExcluirFuncionarioGeralActionPerformed(evt);
            }
        });
        mnFuncionarioGeral.add(miExcluirFuncionarioGeral);

        miListarFuncionarioGeral.setText("Listar");
        miListarFuncionarioGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarFuncionarioGeralActionPerformed(evt);
            }
        });
        mnFuncionarioGeral.add(miListarFuncionarioGeral);

        mnFuncionario.add(mnFuncionarioGeral);

        mnMedico.setText("Médico");

        miCadastrarMedico.setText("Cadastar");
        miCadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarMedicoActionPerformed(evt);
            }
        });
        mnMedico.add(miCadastrarMedico);

        miAlterarMedico.setText("Editar");
        miAlterarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAlterarMedicoActionPerformed(evt);
            }
        });
        mnMedico.add(miAlterarMedico);

        miRemoverMedico.setText("Remover");
        miRemoverMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverMedicoActionPerformed(evt);
            }
        });
        mnMedico.add(miRemoverMedico);

        miListarMedicos.setText("Listar");
        miListarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarMedicosActionPerformed(evt);
            }
        });
        mnMedico.add(miListarMedicos);

        mnFuncionario.add(mnMedico);

        mnFuncionarioAtendente.setText("Atendente");

        miCadastrarFuncionarioAtendente.setText("Cadastrar");
        miCadastrarFuncionarioAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarFuncionarioAtendenteActionPerformed(evt);
            }
        });
        mnFuncionarioAtendente.add(miCadastrarFuncionarioAtendente);

        miEditarFuncionarioAtendente.setText("Editar");
        miEditarFuncionarioAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarFuncionarioAtendenteActionPerformed(evt);
            }
        });
        mnFuncionarioAtendente.add(miEditarFuncionarioAtendente);

        miRemoverFuncionarioAtendente.setText("Remover");
        miRemoverFuncionarioAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverFuncionarioAtendenteActionPerformed(evt);
            }
        });
        mnFuncionarioAtendente.add(miRemoverFuncionarioAtendente);

        miListarFuncionariosAtendentes.setText("Listar");
        miListarFuncionariosAtendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarFuncionariosAtendentesActionPerformed(evt);
            }
        });
        mnFuncionarioAtendente.add(miListarFuncionariosAtendentes);

        mnFuncionario.add(mnFuncionarioAtendente);

        mnGerenciamento.add(mnFuncionario);

        mnArquivo.add(mnGerenciamento);

        mnBuscar.setText("Buscar");

        mnBuscarFuncionario.setText("Funcionário");

        miBuscarAtendente.setText("Atendente");
        miBuscarAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarAtendenteActionPerformed(evt);
            }
        });
        mnBuscarFuncionario.add(miBuscarAtendente);

        miBuscarGeral.setText("Geral");
        miBuscarGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarGeralActionPerformed(evt);
            }
        });
        mnBuscarFuncionario.add(miBuscarGeral);

        miBuscarMedico.setText("Médico");
        miBuscarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarMedicoActionPerformed(evt);
            }
        });
        mnBuscarFuncionario.add(miBuscarMedico);

        mnBuscar.add(mnBuscarFuncionario);

        miBuscarPaciente.setText("Paciente");
        miBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarPacienteActionPerformed(evt);
            }
        });
        mnBuscar.add(miBuscarPaciente);

        mnArquivo.add(mnBuscar);

        mnEnviarEmail.setText("Enviar e-mail");

        miNovoEmail.setText("Novo email");
        miNovoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovoEmailActionPerformed(evt);
            }
        });
        mnEnviarEmail.add(miNovoEmail);

        mnParaTodos.setText("Para todos...");
        mnParaTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnParaTodosActionPerformed(evt);
            }
        });

        miFuncionarios.setText("Funcionarios");
        miFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFuncionariosActionPerformed(evt);
            }
        });
        mnParaTodos.add(miFuncionarios);

        miMedicos.setText("Medicos");
        miMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMedicosActionPerformed(evt);
            }
        });
        mnParaTodos.add(miMedicos);

        miPacientes.setText("Pacientes");
        miPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPacientesActionPerformed(evt);
            }
        });
        mnParaTodos.add(miPacientes);

        miFuncAtendentes.setText("Func. atendentes");
        miFuncAtendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFuncAtendentesActionPerformed(evt);
            }
        });
        mnParaTodos.add(miFuncAtendentes);

        miFuncGerais.setText("Func. gerais");
        miFuncGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFuncGeraisActionPerformed(evt);
            }
        });
        mnParaTodos.add(miFuncGerais);

        mnEnviarEmail.add(mnParaTodos);

        mnArquivo.add(mnEnviarEmail);

        mnAlterar.setText("Alterar");

        miLogin.setText("Login");
        miLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoginActionPerformed(evt);
            }
        });
        mnAlterar.add(miLogin);

        miSenha.setText("Senha");
        miSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSenhaActionPerformed(evt);
            }
        });
        mnAlterar.add(miSenha);

        miLoginSenha.setText("Login e senha");
        miLoginSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoginSenhaActionPerformed(evt);
            }
        });
        mnAlterar.add(miLoginSenha);

        mnArquivo.add(mnAlterar);

        miSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miSalvar.setText("Salvar");
        miSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalvarActionPerformed(evt);
            }
        });
        mnArquivo.add(miSalvar);

        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        mnArquivo.add(miSair);

        mbBarraDeMenu.add(mnArquivo);

        mnHelp.setText("Ajuda");
        mnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHelpActionPerformed(evt);
            }
        });

        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        mnHelp.add(miSobre);

        mbBarraDeMenu.add(mnHelp);

        setJMenuBar(mbBarraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miMarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMarcarConsultaActionPerformed
        GuiAgendamentoDeConsultas agCon = new GuiAgendamentoDeConsultas(this.clinica);
        agCon.setVisible(true);
    }//GEN-LAST:event_miMarcarConsultaActionPerformed

    private void miSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalvarActionPerformed
        if(Arquivo.saveObject(clinica, "arquivos//clinica.arq") && Arquivo.saveObject(clinica, "backup//clinica_copy.arq")){
            JOptionPane.showMessageDialog(null, "Sucesso");
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }//GEN-LAST:event_miSalvarActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSairActionPerformed

    private void miAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgendarConsultaActionPerformed
        GuiAgendamentoDeConsultas ac = new GuiAgendamentoDeConsultas(clinica);
        ac.setVisible(true);
    }//GEN-LAST:event_miAgendarConsultaActionPerformed

    private void miCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarPacienteActionPerformed
        GuiCadastroPaciente gcp = new GuiCadastroPaciente(clinica);
        gcp.setVisible(true);
    }//GEN-LAST:event_miCadastrarPacienteActionPerformed

    private void miExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExcluirConsultaActionPerformed
        String id = JOptionPane.showInputDialog(null, "Digite o id da consulta", "Informe o ID", JOptionPane.DEFAULT_OPTION);
        
        boolean resultado = this.clinica.desmarcarConsulta(id);
        
        if(resultado){
            JOptionPane.showMessageDialog(null, "Consulta excluida", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro ao excluir a consulta, por favor verifique se o ID informado está correto", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miExcluirConsultaActionPerformed

    private void miListarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarPacientesActionPerformed
        ArrayList<Paciente> pacientes = this.clinica.getPacientes();
       
        if(pacientes.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }else{
            String listaDePacientes = "";

            for(Paciente paciente: pacientes){
                int quantCaracteres = paciente.getNome().length();
                String pontos = "";
                
                for(int i = quantCaracteres; i<=200; i++){
                    pontos += ".";
                }
                
                listaDePacientes += paciente.getNome() + " " + pontos + " " + paciente.getCpf() + "\n";
            }

            JOptionPane.showMessageDialog(null, listaDePacientes, "Lista de pacientes", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_miListarPacientesActionPerformed

    private void miEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarPacienteActionPerformed
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do paciente", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        ArrayList<Paciente> pacientes = this.clinica.getPacientes();
        boolean pacientePresente = false;
        
        for(int i = 0; i<pacientes.size(); i++){
            if(pacientes.get(i).getCpf().equals(cpf)){
                GuiAlterarPaciente gap = new GuiAlterarPaciente(pacientes.get(i));
                gap.setVisible(true);
                
                pacientePresente = true;
                
                break;
            }
        }
        
        if(!pacientePresente){
            JOptionPane.showMessageDialog(null, "Paciente não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miEditarPacienteActionPerformed

    private void miRemoverPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverPacienteActionPerformed
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do paciente", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        boolean pacientePresente = false;
        
        if(this.clinica.removePessoa(cpf)){
            JOptionPane.showMessageDialog(null, "Paciente removido com sucesso", "Paciente removido", JOptionPane.INFORMATION_MESSAGE);
            pacientePresente = true;            
        }
        
        if(!pacientePresente){
            JOptionPane.showMessageDialog(null, "Paciente não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miRemoverPacienteActionPerformed

    private void miCadastrarFuncionarioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarFuncionarioGeralActionPerformed
        GuiCadastroFuncionarioGeral gcfg = new GuiCadastroFuncionarioGeral(clinica);
        gcfg.setVisible(true);
    }//GEN-LAST:event_miCadastrarFuncionarioGeralActionPerformed

    private void miEditarFuncionarioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarFuncionarioGeralActionPerformed
        
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do funcionario", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        ArrayList<FuncionarioGeral> funcionariosGerais = this.clinica.getFuncionariosGerais();
        boolean funcionarioGeralPresente = false;
        
        for(int i = 0; i<funcionariosGerais.size(); i++){
            if(funcionariosGerais.get(i).getCpf().equals(cpf)){
                GuiAlterarFuncionarioGeral gafg = new GuiAlterarFuncionarioGeral(funcionariosGerais.get(i));
                gafg.setVisible(true);
                
                funcionarioGeralPresente = true;
                
                break;
            }
        }
        
        if(!funcionarioGeralPresente){
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miEditarFuncionarioGeralActionPerformed

    private void miExcluirFuncionarioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExcluirFuncionarioGeralActionPerformed
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do funcionário", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        boolean funcionarioGeralPresente = false;
        
        if(this.clinica.removePessoa(cpf)){
            JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso", "Funcionário removido", JOptionPane.INFORMATION_MESSAGE);
            funcionarioGeralPresente = true;            
        }
        
        if(!funcionarioGeralPresente){
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miExcluirFuncionarioGeralActionPerformed

    private void miListarFuncionarioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarFuncionarioGeralActionPerformed
        ArrayList<FuncionarioGeral> funcionariosGerais = this.clinica.getFuncionariosGerais();
        
        String listaDeFuncionariosGerais = "";
        
        if(funcionariosGerais.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            
            for(FuncionarioGeral funcionarioGeral: funcionariosGerais){
                listaDeFuncionariosGerais += funcionarioGeral.getNome() + "........." + funcionarioGeral.getCpf() + "\n";
            }

            JOptionPane.showMessageDialog(null, listaDeFuncionariosGerais, "Lista de funcionários gerais", JOptionPane.DEFAULT_OPTION);
            
        }
    }//GEN-LAST:event_miListarFuncionarioGeralActionPerformed

    private void miCadastrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarMedicoActionPerformed
        GuiCadastroMedico gcm = new GuiCadastroMedico(clinica);
        gcm.setVisible(true);
    }//GEN-LAST:event_miCadastrarMedicoActionPerformed

    private void miAlterarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAlterarMedicoActionPerformed
  
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do médico", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        ArrayList<Medico> medicos = this.clinica.getMedicos();
        boolean medicoPresente = false;
        
        for(int i = 0; i<medicos.size(); i++){
            if(medicos.get(i).getCpf().equals(cpf)){
                GuiAlterarMedico gam = new GuiAlterarMedico(medicos.get(i));
                gam.setVisible(true);
                
                medicoPresente = true;
                
                break;
            }
        }
        
        if(!medicoPresente){
            JOptionPane.showMessageDialog(null, "Médico não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miAlterarMedicoActionPerformed

    private void miRemoverMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverMedicoActionPerformed
        
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do médico", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        boolean medicoPresente = false;
        
        if(this.clinica.removePessoa(cpf)){
            JOptionPane.showMessageDialog(null, "Médico removido com sucesso", "Médico removido", JOptionPane.INFORMATION_MESSAGE);
            medicoPresente = true;            
        }
        
        if(!medicoPresente){
            JOptionPane.showMessageDialog(null, "Médico não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miRemoverMedicoActionPerformed

    private void miListarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarMedicosActionPerformed
       
        ArrayList<Medico> medicos = this.clinica.getMedicos();
        
        String listaDeMedicos = "";
        
        if(medicos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nunhum médico cadastrado", "Erro!", JOptionPane.ERROR_MESSAGE);
        }else{
        
            for(Medico medico: medicos){
                listaDeMedicos += medico.getNome() + "........." + medico.getCpf() + "\n";
            }

            JOptionPane.showMessageDialog(null, listaDeMedicos, "Lista de médicos", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_miListarMedicosActionPerformed

    private void miCadastrarFuncionarioAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarFuncionarioAtendenteActionPerformed
        
        GuiCadastroFuncionarioAtendente gcfa = new GuiCadastroFuncionarioAtendente(clinica);
        gcfa.setVisible(true);
    }//GEN-LAST:event_miCadastrarFuncionarioAtendenteActionPerformed

    private void miEditarFuncionarioAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarFuncionarioAtendenteActionPerformed
                
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do funcionario", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        ArrayList<FuncionarioAtendente> funcionariosAtendentes= this.clinica.getFuncionariosAtendentes();
        boolean funcionarioAtendentePresente = false;
        
        for(int i = 0; i<funcionariosAtendentes.size(); i++){
            if(funcionariosAtendentes.get(i).getCpf().equals(cpf)){
                GuiAlterarFuncionarioAtendente gafa = new GuiAlterarFuncionarioAtendente(funcionariosAtendentes.get(i));
                gafa.setVisible(true);
                
                funcionarioAtendentePresente = true;
                
                break;
            }
        }
        
        if(!funcionarioAtendentePresente){
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miEditarFuncionarioAtendenteActionPerformed

    private void miRemoverFuncionarioAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverFuncionarioAtendenteActionPerformed
                
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do funcionário", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        boolean funcionarioAtendentePresente = false;
        
        if(this.clinica.removePessoa(cpf)){
            JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso", "Funcionário removido", JOptionPane.INFORMATION_MESSAGE);
            funcionarioAtendentePresente = true;            
        }
        
        if(!funcionarioAtendentePresente){
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miRemoverFuncionarioAtendenteActionPerformed

    private void miListarFuncionariosAtendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarFuncionariosAtendentesActionPerformed
                
        ArrayList<FuncionarioAtendente> funcionariosAtendentes = this.clinica.getFuncionariosAtendentes();
        
        String listaDeFuncionariosAtendentes = "";
        
        if(funcionariosAtendentes.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            for(FuncionarioAtendente funcionarioAtendente: funcionariosAtendentes){
                listaDeFuncionariosAtendentes += funcionarioAtendente.getNome() + "........." + funcionarioAtendente.getCpf() + "\n";
            }

            JOptionPane.showMessageDialog(null, listaDeFuncionariosAtendentes, "Lista de funcionários gerais", JOptionPane.DEFAULT_OPTION);
            
        }
    }//GEN-LAST:event_miListarFuncionariosAtendentesActionPerformed

    private void miEditarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarConsultaActionPerformed
        //String idEditar = JOptionPane.showInputDialog(null, "Digite o id da consulta", "Editar", JOptionPane.DEFAULT_OPTION);
        String idEditar=JOptionPane.showInputDialog("Digite o id da consulta");
        
        ArrayList<Consulta> c = clinica.getConsultas();
        boolean consultaPresente=false;
        
        for(int i=0;i<c.size();i++){
            if(c.get(i).getId().equalsIgnoreCase(idEditar)){
                GuiAlterarConsulta ac=new GuiAlterarConsulta(clinica, c.get(i));
                ac.setVisible(true);
                
                consultaPresente=true;
                break;
            }
        }
        
        if(!consultaPresente){
            JOptionPane.showMessageDialog(null, "Consulta não encontrada", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miEditarConsultaActionPerformed

    private void mnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHelpActionPerformed
        
    }//GEN-LAST:event_mnHelpActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        JOptionPane.showMessageDialog(null, this.clinica.getNome() + " - Clinica Control \n\n" + "By: Lucas Emanuel, Isadora Medeiros, Hemenson David e Gabriel de Araújo \n" + "Ano de fabricação: 2017 \n\n" + "Copyright © 2017 Grupo dos Monitores - todos os direitos reservados", "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miFuncAtendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFuncAtendentesActionPerformed
        GuiEmailAtendente gea = new GuiEmailAtendente(this.clinica);
        gea.setVisible(true);
    }//GEN-LAST:event_miFuncAtendentesActionPerformed

    private void miNovoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovoEmailActionPerformed
        GuiEmail ge = new GuiEmail(this.clinica.getEmail().getEmail(), this.clinica.getEmail().getSenha());
        ge.setVisible(true);
    }//GEN-LAST:event_miNovoEmailActionPerformed

    private void miBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarPacienteActionPerformed
        
                        
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do paciente", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        Paciente paciente = clinica.getPaciente(cpf);
        
        if(paciente == null){
            JOptionPane.showMessageDialog(null, "Paciente não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);            
        }
        
        else{
            JOptionPane.showMessageDialog(null, paciente.toString(), "Paciente", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_miBuscarPacienteActionPerformed

    private void miBuscarAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarAtendenteActionPerformed
                        
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do funcionário", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        FuncionarioAtendente funcionario = clinica.getFuncionarioAtendente(cpf);
        
        if(funcionario == null){
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);            
        }
        
        else{
            JOptionPane.showMessageDialog(null, funcionario.toString(), "Funcionário", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_miBuscarAtendenteActionPerformed

    private void miBuscarGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarGeralActionPerformed
                                  
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do funcionário", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        FuncionarioGeral funcionario = clinica.getFuncionarioGeral(cpf);
        
        if(funcionario == null){
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);            
        }
        
        else{
            JOptionPane.showMessageDialog(null, funcionario.toString(), "Funcionário", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_miBuscarGeralActionPerformed

    private void miBuscarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarMedicoActionPerformed
                                        
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do médico", "Informe o CPF", JOptionPane.DEFAULT_OPTION);
        
        Medico medico = clinica.getMedico(cpf);
        
        if(medico == null){
            JOptionPane.showMessageDialog(null, "Médico não encontrado", "Erro!", JOptionPane.ERROR_MESSAGE);            
        }
        
        else{
            JOptionPane.showMessageDialog(null, medico.toString(), "Médico", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_miBuscarMedicoActionPerformed

    private void miLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoginActionPerformed
        GuiAlterarLogin gal = new GuiAlterarLogin();
        gal.setVisible(true);   
    }//GEN-LAST:event_miLoginActionPerformed

    private void miSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSenhaActionPerformed
        GuiAlterarSenha gas = new GuiAlterarSenha();
        gas.setVisible(true);
    }//GEN-LAST:event_miSenhaActionPerformed

    private void mnParaTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnParaTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnParaTodosActionPerformed

    private void miMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMedicosActionPerformed
        GuiEmailMedico gem = new GuiEmailMedico(this.clinica);
        gem.setVisible(true);
    }//GEN-LAST:event_miMedicosActionPerformed

    private void miPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPacientesActionPerformed
        GuiEmailPaciente gep = new GuiEmailPaciente(this.clinica);
        gep.setVisible(true);
    }//GEN-LAST:event_miPacientesActionPerformed

    private void miFuncGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFuncGeraisActionPerformed
        GuiEmailFuncGeral gefg = new GuiEmailFuncGeral(this.clinica);
        gefg.setVisible(true);
    }//GEN-LAST:event_miFuncGeraisActionPerformed

    private void miFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFuncionariosActionPerformed
        GuiEmailFuncionario gef = new GuiEmailFuncionario(this.clinica);
        gef.setVisible(true);
    }//GEN-LAST:event_miFuncionariosActionPerformed

    private void miLoginSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoginSenhaActionPerformed
        GuiAlterarLogin gal= new GuiAlterarLogin();
        gal.setVisible(true);
        
        GuiAlterarSenha gas = new GuiAlterarSenha();
        gas.setVisible(true);
    }//GEN-LAST:event_miLoginSenhaActionPerformed

    private void miListarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarConsultaActionPerformed
        if(this.clinica.getConsultas().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            
            ArrayList<Consulta> consultas = this.clinica.getConsultas();
            
            String mensagem=null;
            
            for(int i=0;i<this.clinica.getConsultas().size();i++){
                mensagem= "Nome: "+consultas.get(i).getPaciente().getNome()+
                        "\nSintoma: "+consultas.get(i).getSintoma()+
                        "\nMedico: "+consultas.get(i).getMedico().getNome()+
                        "\nData: "+consultas.get(i).getData() +
                        "\nId da consulta: "+consultas.get(i).getId();
                        
                JOptionPane.showMessageDialog(null, mensagem, "Consulta de ID: "+consultas.get(i).getId(), JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_miListarConsultaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbSAM;
    private javax.swing.JMenuBar mbBarraDeMenu;
    private javax.swing.JMenuItem miAgendarConsulta;
    private javax.swing.JMenuItem miAlterarMedico;
    private javax.swing.JMenuItem miBuscarAtendente;
    private javax.swing.JMenuItem miBuscarGeral;
    private javax.swing.JMenuItem miBuscarMedico;
    private javax.swing.JMenuItem miBuscarPaciente;
    private javax.swing.JMenuItem miCadastrarFuncionarioAtendente;
    private javax.swing.JMenuItem miCadastrarFuncionarioGeral;
    private javax.swing.JMenuItem miCadastrarMedico;
    private javax.swing.JMenuItem miCadastrarPaciente;
    private javax.swing.JMenuItem miEditarConsulta;
    private javax.swing.JMenuItem miEditarFuncionarioAtendente;
    private javax.swing.JMenuItem miEditarFuncionarioGeral;
    private javax.swing.JMenuItem miEditarPaciente;
    private javax.swing.JMenuItem miExcluirConsulta;
    private javax.swing.JMenuItem miExcluirFuncionarioGeral;
    private javax.swing.JMenuItem miFuncAtendentes;
    private javax.swing.JMenuItem miFuncGerais;
    private javax.swing.JMenuItem miFuncionarios;
    private javax.swing.JMenuItem miListarConsulta;
    private javax.swing.JMenuItem miListarFuncionarioGeral;
    private javax.swing.JMenuItem miListarFuncionariosAtendentes;
    private javax.swing.JMenuItem miListarMedicos;
    private javax.swing.JMenuItem miListarPacientes;
    private javax.swing.JMenuItem miLogin;
    private javax.swing.JMenuItem miLoginSenha;
    private javax.swing.JMenuItem miMedicos;
    private javax.swing.JMenuItem miNovoEmail;
    private javax.swing.JMenuItem miPacientes;
    private javax.swing.JMenuItem miRemoverFuncionarioAtendente;
    private javax.swing.JMenuItem miRemoverMedico;
    private javax.swing.JMenuItem miRemoverPaciente;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSalvar;
    private javax.swing.JMenuItem miSenha;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenu mnAlterar;
    private javax.swing.JMenu mnArquivo;
    private javax.swing.JMenu mnBuscar;
    private javax.swing.JMenu mnBuscarFuncionario;
    private javax.swing.JMenu mnConsulta;
    private javax.swing.JMenu mnEnviarEmail;
    private javax.swing.JMenu mnFuncionario;
    private javax.swing.JMenu mnFuncionarioAtendente;
    private javax.swing.JMenu mnFuncionarioGeral;
    private javax.swing.JMenu mnGerenciamento;
    private javax.swing.JMenu mnHelp;
    private javax.swing.JMenu mnMedico;
    private javax.swing.JMenu mnPaciente;
    private javax.swing.JMenu mnParaTodos;
    private javax.swing.JPanel pnHora;
    private javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
    
    public void centralizar() {  
        int pontoLargura = ((this.getWidth() / 2) - pnHora.getWidth() / 2) - 2;  
        int pontoAltura = ((this.getHeight() / 2) - pnHora.getHeight() / 2) - 16;  
          
        this.pnHora.setLocation(pontoLargura, pontoAltura);  
    }  

    //Tudo que tiver aqui significa que será atualizado em tempo real
    public void run() {
        while(true){
            centralizar();
            Date d = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
            String horario = formato.format(d);
            this.lbHora.setText(horario);
            
        }
    }
}
