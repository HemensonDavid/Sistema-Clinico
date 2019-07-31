package model.pessoa;

import model.Data;
import model.Endereco;

public class FuncionarioAtendente extends Funcionario{
    
    private String anoDeConclusaoGraduacao;
    private String faculdade;
    private String tituloTCC;
                                  
    public FuncionarioAtendente(String nome, String rg, String cpf, String telefone, String email, Endereco endereco, Data nascimento, String id, double salario, String anoDeConclusaoGraduacao, String faculdade, String tituloTCC) {
        super(nome, rg, cpf, telefone, email, endereco, nascimento, id, salario);
        this.anoDeConclusaoGraduacao = anoDeConclusaoGraduacao;
        this.faculdade = faculdade;
        this.tituloTCC = tituloTCC;
    }

    public String getAnoDeConclusaoGraduacao() {
        return anoDeConclusaoGraduacao;
    }

    public void setAnoDeConclusaoGraduacao(String anoDeConclusaoGraduacao) {
        this.anoDeConclusaoGraduacao = anoDeConclusaoGraduacao;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "INFOMAÇÕES PROFISSIONAIS" + "\n" + "Ano de conclusao da graduação: " + anoDeConclusaoGraduacao + "\n" + "Faculdade: " + faculdade + "\n" + "Título do TCC: " + tituloTCC + "\n";
    }
}
