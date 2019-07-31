package model.pessoa;

import java.io.Serializable;
import model.Data;
import model.Endereco;

public class Pessoa implements Serializable{
   
    private String nome;
    private String rg;
    private String cpf;
    private String telefone;
    private String email;
    private Data nascimento;
    private Endereco endereco;
    
    public Pessoa(){
        this.nome="";
        this.rg="";
        this.cpf="";
        this.telefone = "";
        this.email="";
        this.nascimento=new Data();
        this.endereco=new Endereco();
    }
        
    public Pessoa(String nome, String rg, String cpf, String telefone, String email, Endereco endereco, Data nascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    

    @Override
    public String toString() {
        return "INFORMAÇÕES PESSOAIS" + "\n" + "Nome: " + nome + "\n" + "Data de nascimento: " + nascimento + "\n" + "RG: " + rg + "\n" + "CPF: " + cpf + "\n" + "Email: " + email + "\n" + "Telefone: " + telefone + "\n" + "\n" + endereco.toString();
    }


    
       
}
