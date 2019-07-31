package model;

import java.io.Serializable;

public class Convenio implements Serializable{
    private String nome, sigla, telefone;

    public Convenio(String nome, String sigla, String telefone) {
        this.nome = nome;
        this.sigla = sigla;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", sigla: " + sigla + ", telefone: " + telefone;
    }
    
    
}
