package model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Arquivo {
    public static ArrayList<String> loadArchive(String endereco){
        ArrayList<String> mensagem = new ArrayList<>();
       
        try{
            FileReader fr = new FileReader(endereco);
            BufferedReader bf = new BufferedReader(fr);
           
            String linha = "";
           
            while((linha = bf.readLine()) != null){
                mensagem.add(linha);
            }
           
            return mensagem;
        }
       
       catch(Exception e){
           return null;
       }
    }
   
    public static Object loadObject(String endereco){
        try{
            ObjectInputStream objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(endereco)));
            Object so = objectIn.readObject();
            objectIn.close();
                        
            return so;
        }
        catch(Exception e){
            e.printStackTrace();
            
            return null;
        }
    }
    
    public static boolean saveObject(Object ob, String endereco){
        try{
            ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(endereco)));			
            objectOut.writeObject(ob);
            objectOut.close(); 
            
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            
            return false;
        }
    }
}
