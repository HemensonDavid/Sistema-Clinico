package view;

import javax.swing.UIManager;
import model.Arquivo;
import model.Clinica;
import view.gui.Cadastro.GuiCadastro;
import view.gui.GuiLogin;

public class Principal {
    
    public static void main(String args[]) {
        
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e){}
           
        try{
            Clinica clinica = (Clinica) Arquivo.loadObject("arquivos//clinica.arq");
            
            GuiLogin gl = new GuiLogin();
            gl.setVisible(true);
        }
        catch(Exception erro){
            GuiCadastro gc = new GuiCadastro();
            gc.setVisible(true);
        }
    }
}