package model.pessoa;

import model.Data;
import model.Endereco;

public class FuncionarioGeral extends Funcionario{
    
    private String funcao;

    public FuncionarioGeral(String nome, String rg, String cpf, String email, String telefone, Endereco endereco, Data nascimento, String id, double salario, String funcao) {
        super(nome, rg, cpf, telefone, email, endereco, nascimento, id, salario);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return super.toString() + "Função: " + funcao + "\n";
    }    
}
