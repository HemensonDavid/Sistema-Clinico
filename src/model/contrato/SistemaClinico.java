package model.contrato;

import model.Consulta;
import model.pessoa.Funcionario;
import model.pessoa.Paciente;

public interface SistemaClinico {
    //Clínica
    public boolean marcarConsulta(Consulta consulta);
    public boolean desmarcarConsulta(String id);
    public String getEstadoDaClinica();
    public void setEstadoDaCLinica(String estado);        
}
