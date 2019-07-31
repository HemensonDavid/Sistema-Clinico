package model;

import java.io.Serializable;

public class Endereco implements Serializable{
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String referencia;

    public Endereco(String pais, String estado, String cidade, String bairro, String rua, String numero, String referencia) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.referencia = referencia;
    }

    public Endereco() {
        
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String toString() {
        return "ENDEREÇO" + "País: " + pais + "\n" + "Estado: " + estado + "\n" + "Cidade: " + cidade + "\n" + "Bairro: " + bairro + "\n" + "Rua: " + rua + "\n" + "Número: " + numero + "\n" + "Referência: " + referencia + "\n";
    }
    
    
}
