package view.gui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Clinica;
import model.ClinicaMail;
import model.Consulta;
import model.Data;
import model.GeradorDeID;
import model.pessoa.Medico;
import model.pessoa.Paciente;

public class GuiAgendamentoDeConsultas extends javax.swing.JFrame {
    
    private Clinica clinica; 
            
    public GuiAgendamentoDeConsultas(Clinica clinica) {
        initComponents();
        
        this.clinica=clinica;
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation((tela.width - getSize().width) / 2, (tela.height - getSize().height) / 2);
        
        Image icone = Toolkit.getDefaultToolkit().getImage("imgs//calendario.png");;
        this.setIconImage(icone);
        
        this.lbIcone.setIcon(new ImageIcon("imgs//calendario.png"));
        
        ArrayList<Paciente> pacientes = clinica.getPacientes();
        ArrayList<Medico> medicos = clinica.getMedicos();
        
        for(int i = 0; i<pacientes.size(); i++){
            this.cbListaDePacientes.addItem(pacientes.get(i).getNome());
        }
        
        for(int i = 0; i<medicos.size(); i++){
            this.cbListaDeMedicos.addItem(medicos.get(i).getNome());
        }
    }

    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnImagem = new javax.swing.JPanel();
        lbIcone = new javax.swing.JLabel();
        btAgendar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        cbListaDeMedicos = new javax.swing.JComboBox<>();
        lbMedico = new javax.swing.JLabel();
        lbDoença = new javax.swing.JLabel();
        lbData_Consulta = new javax.swing.JLabel();
        lbNomeDoPaciente = new javax.swing.JLabel();
        cbListaDePacientes = new javax.swing.JComboBox<>();
        ffDataDaConsulta = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSintomas = new javax.swing.JTextArea();
        lbData_Consulta1 = new javax.swing.JLabel();
        ffHorarioDaConsulta = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendar consulta");
        setPreferredSize(new java.awt.Dimension(416, 564));
        setResizable(false);

        pnImagem.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout pnImagemLayout = new javax.swing.GroupLayout(pnImagem);
        pnImagem.setLayout(pnImagemLayout);
        pnImagemLayout.setHorizontalGroup(
            pnImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnImagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        pnImagemLayout.setVerticalGroup(
            pnImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnImagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btAgendar.setBackground(new java.awt.Color(204, 204, 204));
        btAgendar.setText("Agendar consulta");
        btAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgendarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        cbListaDeMedicos.setToolTipText("");
        cbListaDeMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListaDeMedicosActionPerformed(evt);
            }
        });

        lbMedico.setText("Médico");

        lbDoença.setText("Sintomas");

        lbData_Consulta.setText("Data da consulta");

        lbNomeDoPaciente.setText("Nome do paciente");

        try {
            ffDataDaConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jScrollPane1.setPreferredSize(new java.awt.Dimension(50, 50));

        taSintomas.setColumns(20);
        taSintomas.setRows(5);
        jScrollPane1.setViewportView(taSintomas);

        lbData_Consulta1.setText("Horário:");

        try {
            ffHorarioDaConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNomeDoPaciente)
                            .addComponent(lbDoença)
                            .addComponent(lbMedico))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(cbListaDePacientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbListaDeMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbData_Consulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ffDataDaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbData_Consulta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ffHorarioDaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pnImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbListaDePacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeDoPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDoença)
                        .addGap(44, 44, 44)
                        .addComponent(lbMedico))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbListaDeMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbData_Consulta)
                    .addComponent(ffDataDaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbData_Consulta1)
                    .addComponent(ffHorarioDaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendarActionPerformed
        
        Data data = Data.parseData(this.ffDataDaConsulta.getText(), this.ffHorarioDaConsulta.getText());
        
        if(!(this.clinica.dataDeConsultaExistente(data))){
            String nome = this.cbListaDePacientes.getSelectedItem().toString();

            Paciente paciente = null;
            for(Paciente p: this.clinica.getPacientes()){
                if(p.getNome().equals(nome)){
                    paciente = p;
                }
            }

            nome = this.cbListaDeMedicos.getSelectedItem().toString();

            Medico medico = null;
            for(Medico m: this.clinica.getMedicos()){
                if(m.getNome().equals(nome)){
                    medico = m;
                }
            }        

            String sintoma = this.taSintomas.getText();

            Consulta consulta = new Consulta(data, paciente, medico, sintoma, GeradorDeID.gerarID());

            if(this.clinica.marcarConsulta(consulta)){
                JOptionPane.showMessageDialog(null, "Consulta marcada com sucesso" + "\n" + "ID da consulta: " + consulta.getId() + "\n"+ "Uma mensagem de confirmação foi enviada para: " + paciente.getEmail(), "Sucesso!", JOptionPane.DEFAULT_OPTION);
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao marcar a consulta", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "O horário já está ocupado, por favor, selecione outro horário", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAgendarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void cbListaDeMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListaDeMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbListaDeMedicosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgendar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JComboBox<String> cbListaDeMedicos;
    private javax.swing.JComboBox<String> cbListaDePacientes;
    private javax.swing.JFormattedTextField ffDataDaConsulta;
    private javax.swing.JFormattedTextField ffHorarioDaConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbData_Consulta;
    private javax.swing.JLabel lbData_Consulta1;
    private javax.swing.JLabel lbDoença;
    private javax.swing.JLabel lbIcone;
    private javax.swing.JLabel lbMedico;
    private javax.swing.JLabel lbNomeDoPaciente;
    private javax.swing.JPanel pnImagem;
    private javax.swing.JTextArea taSintomas;
    // End of variables declaration//GEN-END:variables
}
