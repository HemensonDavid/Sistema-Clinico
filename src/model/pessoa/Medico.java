package model.pessoa;

import java.util.ArrayList;
import model.Data;
import model.Endereco;

public class Medico extends Funcionario {
    
    private ArrayList<String> especializacoes;
    private String crm;
    private ArrayList<String> telefonesEmergenciais;
    private ArrayList<String> listaDeConvenios;
    private ArrayList<String> horariosDeConsulta;
    private double valorDaConsulta;
    
    public Medico(){
        this.especializacoes = new ArrayList<>();
        this.crm="";
        this.telefonesEmergenciais = new ArrayList<>();
        this.listaDeConvenios = new ArrayList<>();
        this.horariosDeConsulta = new ArrayList<>();
    }
    
    public Medico(String crm, String nome, String rg, String cpf, String telefone, String email, Endereco endereco, Data nascimento, String id, double salario, double valorDaConsulta, ArrayList<String> especializacoes, ArrayList<String> telefonesEmergenciais, ArrayList<String> listaDeConvenios) {
        super(nome, rg, cpf, telefone, email, endereco, nascimento, id, salario);
        this.crm = crm;
        this.valorDaConsulta = valorDaConsulta;
        this.especializacoes = especializacoes;
        this.telefonesEmergenciais = telefonesEmergenciais;
        this.listaDeConvenios = listaDeConvenios;
    }

    public ArrayList<String> getEspecializacoes() {
        return especializacoes;
    }

    public void setEspecializacoes(ArrayList<String> especializacoes) {
        this.especializacoes = especializacoes;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    public double getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setValorDaColsulta(double valorDaColsulta) {
        this.valorDaConsulta = valorDaColsulta;
    }

    public ArrayList<String> getTelefonesEmergenciais() {
        return telefonesEmergenciais;
    }

    public void setTelefonesEmergenciais(ArrayList<String> telefonesEmergenciais) {
        this.telefonesEmergenciais = telefonesEmergenciais;
    }

    public ArrayList<String> getListaDeConvenios() {
        return listaDeConvenios;
    }

    public void setListaDeConvenios(ArrayList<String> listaDeConvenios) {
        this.listaDeConvenios = listaDeConvenios;
    }
    
    public ArrayList<String> getHorariosDeConsulta() {
        return horariosDeConsulta;
    }

    public void setHorariosDeConsulta(ArrayList<String> horariosDeConsulta) {
        this.listaDeConvenios = horariosDeConsulta;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "INFORMAÇÕES PROFISSIONAIS" + "\n" + "Especializações: " + especializacoes + "\n" + "CRM: " + crm + "\n" + "Telefones emergênciais: " + telefonesEmergenciais + "\n" + "Convênios: " + listaDeConvenios + "\n" + "Valor da consulta: R$" + valorDaConsulta + "\n";
    }

      
}
