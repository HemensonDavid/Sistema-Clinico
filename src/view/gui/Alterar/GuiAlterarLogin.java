package view.gui.Alterar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.Arquivo;
import model.Clinica;
import model.Login;

public class GuiAlterarLogin extends javax.swing.JFrame {
    
    private Login login;
    
    public GuiAlterarLogin() {
        initComponents();
        Clinica clinica = (Clinica) Arquivo.loadObject("arquivos//clinica.arq");
        this.setTitle(clinica.getNome() + " - Login");
        this.setResizable(false);
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation((tela.width - getSize().width) / 2, (tela.height - getSize().height) / 2);
            }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfNovoLogin = new javax.swing.JTextField();
        lbNovoLogin = new javax.swing.JLabel();
        lbConfirmarLogin = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btOk = new javax.swing.JButton();
        lbAviso = new javax.swing.JLabel();
        tfConfirmarLogin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        tfNovoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNovoLoginActionPerformed(evt);
            }
        });

        lbNovoLogin.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        lbNovoLogin.setText("Novo login:");

        lbConfirmarLogin.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        lbConfirmarLogin.setText("Confirmar login:");

        btCancelar.setText("Cancelar");
        btCancelar.setFocusPainted(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        lbAviso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tfConfirmarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfConfirmarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbConfirmarLogin)
                            .addComponent(lbNovoLogin))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNovoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfConfirmarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAviso)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNovoLogin)
                    .addComponent(tfNovoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConfirmarLogin)
                    .addComponent(tfConfirmarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbAviso)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNovoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNovoLoginActionPerformed
        this.tfNovoLogin.setFocusable(false);
    }//GEN-LAST:event_tfNovoLoginActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        if(isConfirmacaoValida()){
            String loginAnt = JOptionPane.showInputDialog(null, "Por favor, insira seu login atual", "Solicitação", JOptionPane.DEFAULT_OPTION);
            Login l = (Login) Arquivo.loadObject("arquivos//login.arq");

            if(loginAnt.equals(l.getLogin())){
                try{
                    Arquivo.saveObject(this.login, "arquivos//login.arq");
                    JOptionPane.showMessageDialog(null, "Login alterado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Não foi possível salvar a alteração", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
                finally{
                    this.setVisible(false);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Login inválido", "Erro!", JOptionPane.ERROR_MESSAGE);
                this.setVisible(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Os logins não são iguais, por favor corrija o erro.", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void tfConfirmarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConfirmarLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConfirmarLoginActionPerformed

    public boolean isConfirmacaoValida(){
        String novoLogin = this.tfNovoLogin.getText();
        String confirmarLogin = this.tfConfirmarLogin.getText();
        
        Login l = (Login) Arquivo.loadObject("arquivos//login.arq");
        
        if(novoLogin.equals(confirmarLogin)){
            l.setLogin(novoLogin);
            this.login = l;
            return true;
        }
        else{
            return false; //Pra o inicio
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btOk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbConfirmarLogin;
    private javax.swing.JLabel lbNovoLogin;
    private javax.swing.JTextField tfConfirmarLogin;
    private javax.swing.JTextField tfNovoLogin;
    // End of variables declaration//GEN-END:variables
}
