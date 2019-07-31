package view.gui.email;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Clinica;
import model.ClinicaMail;
import model.pessoa.Funcionario;
import model.pessoa.FuncionarioGeral;

public class GuiEmailFuncionario extends javax.swing.JFrame {
    
    private Clinica clinica;
    private ClinicaMail cm;

    public GuiEmailFuncionario(Clinica clinica) {
        this.clinica = clinica;
        
        cm = new ClinicaMail(clinica.getEmail().getEmail(), clinica.getEmail().getSenha());
        
        initComponents();
        this.setVisible(true);
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation((tela.width - getSize().width) / 2, (tela.height - getSize().height) / 2);
        
        Image icone = Toolkit.getDefaultToolkit().getImage("imgs//gmail_logo.png");;
        this.setIconImage(icone);
    }
    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnEmail = new javax.swing.JPanel();
        lbMensagem = new javax.swing.JLabel();
        lbAssunto = new javax.swing.JLabel();
        tfAssunto = new javax.swing.JTextField();
        staMensagem = new javax.swing.JScrollPane();
        taMensagem = new javax.swing.JTextArea();
        btEnviar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Enviar mensagem para funcionarios");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        lbMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMensagem.setText("Mensagem");

        lbAssunto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAssunto.setText("Assunto");

        taMensagem.setColumns(20);
        taMensagem.setRows(5);
        staMensagem.setViewportView(taMensagem);

        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnEmailLayout = new javax.swing.GroupLayout(pnEmail);
        pnEmail.setLayout(pnEmailLayout);
        pnEmailLayout.setHorizontalGroup(
            pnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEmailLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnEmailLayout.createSequentialGroup()
                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(staMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnEmailLayout.createSequentialGroup()
                        .addGroup(pnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnEmailLayout.setVerticalGroup(
            pnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEmailLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        ArrayList<Funcionario> funcionarios = this.clinica.getFuncionarios();
        String assunto= tfAssunto.getText();
        String mensagem = taMensagem.getText();

        String nomesDasPessoasComErroNoEnvio = "";
        boolean algumErro = false;

        for(Funcionario f: funcionarios){
            if(!(this.cm.enviarEmail(mensagem, f.getEmail(), assunto))){
                algumErro = true;
                nomesDasPessoasComErroNoEnvio += (f.getNome() + "\n");
            }
        }

        if(!(algumErro)){
            JOptionPane.showMessageDialog(null, "Todos os emails enviados com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro ao enviar o email para as seguintes pessoas: \n\n" + nomesDasPessoasComErroNoEnvio, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_btEnviarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEnviar;
    private javax.swing.JLabel lbAssunto;
    private javax.swing.JLabel lbMensagem;
    private javax.swing.JPanel pnEmail;
    private javax.swing.JScrollPane staMensagem;
    private javax.swing.JTextArea taMensagem;
    private javax.swing.JTextField tfAssunto;
    // End of variables declaration//GEN-END:variables
}
