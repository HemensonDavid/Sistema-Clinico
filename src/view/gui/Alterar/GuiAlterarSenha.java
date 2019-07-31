package view.gui.Alterar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.Arquivo;
import model.Clinica;
import model.Login;

public class GuiAlterarSenha extends javax.swing.JFrame {

    private Login login;

    public GuiAlterarSenha() {
        initComponents();
        Clinica clinica = (Clinica) Arquivo.loadObject("arquivos//clinica.arq");
        this.setTitle(clinica.getNome() + " - Login");
        this.setResizable(false);
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation((tela.width - getSize().width) / 2, (tela.height - getSize().height) / 2);
        
        Image icone = Toolkit.getDefaultToolkit().getImage("imgs/icone.png");;
        this.setIconImage(icone);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNovaSenha = new javax.swing.JLabel();
        lbConfirmarSenha = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        pfConfirmarSenha = new javax.swing.JPasswordField();
        btOk = new javax.swing.JButton();
        pfNovaSenha = new javax.swing.JPasswordField();
        lbAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        lbNovaSenha.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        lbNovaSenha.setText("Nova senha:");

        lbConfirmarSenha.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        lbConfirmarSenha.setText("Confirmar senha:");

        btCancelar.setText("Cancelar");
        btCancelar.setFocusPainted(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        pfConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfConfirmarSenhaActionPerformed(evt);
            }
        });

        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        pfNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfNovaSenhaActionPerformed(evt);
            }
        });

        lbAviso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbConfirmarSenha)
                            .addComponent(lbNovaSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNovaSenha)
                    .addComponent(pfNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConfirmarSenha)
                    .addComponent(pfConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(lbAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void pfConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfConfirmarSenhaActionPerformed
        this.pfConfirmarSenha.setFocusable(false);
    }//GEN-LAST:event_pfConfirmarSenhaActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        if(isConfirmacaoValido()){
            String senhaAnt = JOptionPane.showInputDialog(null, "Por favor, insira a senha atual", "Solicitação", JOptionPane.DEFAULT_OPTION);
            Login l = (Login) Arquivo.loadObject("arquivos//login.arq");
            
            if(senhaAnt.equals(l.getSenha())){
                try{
                    Arquivo.saveObject(this.login, "arquivos//login.arq");
                    JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Não foi possível salvar a alteração", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
                finally{
                    this.setVisible(false);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Senha inválida", "Erro!", JOptionPane.ERROR_MESSAGE);
                this.setVisible(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "As senhas não são iguais, por favor corrija o erro.", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void pfNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfNovaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfNovaSenhaActionPerformed

    public boolean isConfirmacaoValido(){
        String novaSenha = String.valueOf(this.pfNovaSenha.getPassword());
        String confirmarSenha = String.valueOf(this.pfConfirmarSenha.getPassword());
        
        Login l = (Login) Arquivo.loadObject("arquivos//login.arq");
        
        if(novaSenha.equals(confirmarSenha)){
            l.setSenha(novaSenha);
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
    private javax.swing.JLabel lbConfirmarSenha;
    private javax.swing.JLabel lbNovaSenha;
    private javax.swing.JPasswordField pfConfirmarSenha;
    private javax.swing.JPasswordField pfNovaSenha;
    // End of variables declaration//GEN-END:variables

}
