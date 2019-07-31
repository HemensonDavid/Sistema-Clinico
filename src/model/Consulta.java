package model;

import java.io.Serializable;
import model.pessoa.Medico;
import model.pessoa.Paciente;

public class Consulta implements Serializable{
    private String id;
    private Data data;
    private Paciente paciente;
    private Medico medico;
    private String sintoma;
    
    public Consulta(Data data, Paciente paciente, Medico medico, String sintoma, String id) {
        this.id = id;
        this.data = data;
        this.paciente = paciente;
        this.medico = medico;
        this.sintoma = sintoma;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
    
    @Override
    public String toString() {
        return "data: " + data + ", paciente: " + paciente + ", medico: " + medico + ", sintoma: " + sintoma + ", id: " + id;
    }    
}
