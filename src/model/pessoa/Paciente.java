package model.pessoa;

import model.Data;
import model.Endereco;
import model.FichaClinica;

public class Paciente extends Pessoa{
    
    private FichaClinica fichaClinica;

    public Paciente(String nome, String rg, String cpf, String telefone, String email, Endereco endereco, Data nascimento, FichaClinica fichaClinica) {
        super(nome, rg, cpf, telefone, email, endereco, nascimento);
        this.fichaClinica = fichaClinica;
    }
    
    public FichaClinica getFichaClinica() {
        return fichaClinica;
    }

    public void setFichaClinica(FichaClinica fichaClinica) {
        this.fichaClinica = fichaClinica;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + fichaClinica.toString();
    }
    
}
