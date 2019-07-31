package model.pessoa;

import model.Data;
import model.Endereco;

public class Funcionario extends Pessoa{
    
    private String id;
    private double salario;
    
    public Funcionario(){
        this.id="";
    }

    public Funcionario(String nome, String rg, String cpf, String telefone, String email, Endereco endereco, Data nascimento, String id, double salario) {
        super(nome, rg, cpf, telefone, email, endereco, nascimento);
        this.id = id;
        this.salario = salario;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" + "INFORMAÇÕES TRABALHISTAS" + "\n" + "Salário: R$ " + salario + "\n";
    }
    
    public void aumentarSalario(double porcentagem){
        double aumento = this.salario * porcentagem /100;
        
        this.salario += aumento;
    }
}
