package model;

import java.io.Serializable;

public class FichaClinica implements Serializable{    
    private String observacao;
    private String convenio;
    
    public FichaClinica(String observacao, String convenio) {
        this.observacao = observacao;
        this.convenio = convenio;
        
    }
    
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    @Override
    public String toString() {
        return "FICHA CLÍNICA" + "\n" + "Observações: " + observacao + "\n" + "Convênio: " + convenio + "\n";
    }

    
}
