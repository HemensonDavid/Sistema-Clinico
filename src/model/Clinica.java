package model;

import java.io.Serializable;
import java.util.ArrayList;
import model.contrato.SistemaClinico;
import model.pessoa.Funcionario;
import model.pessoa.FuncionarioAtendente;
import model.pessoa.FuncionarioGeral;
import model.pessoa.Medico;
import model.pessoa.Paciente;
import model.pessoa.Pessoa; 

public class Clinica implements SistemaClinico, Serializable{
    
    private String nome;
    private String telefone;
    private ArrayList<Consulta> consultas;
    private Endereco endereco;
    private ArrayList<Pessoa> pessoas;
    private String estado;
    private ClinicaMail email;

    public Clinica(String nome, String telefone, Endereco endereco, ClinicaMail email) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.pessoas = new ArrayList<Pessoa>();
        this.consultas = new ArrayList<>();
        this.email = email;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ClinicaMail getEmail() {
        return email;
    }

    public void setEmail(ClinicaMail email) {
        this.email = email;
    }  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public ArrayList<Paciente> getPacientes(){
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        
        for(Pessoa p: this.pessoas){
            if(p instanceof Paciente){
                pacientes.add((Paciente) p);
            }
        }
        
        return pacientes;
    }

    public ArrayList<FuncionarioGeral> getFuncionariosGerais(){
        ArrayList<FuncionarioGeral> funcionariosGerais = new ArrayList<FuncionarioGeral>();
        
        for(Pessoa p: this.pessoas){
            if(p instanceof FuncionarioGeral){
                funcionariosGerais.add((FuncionarioGeral) p);
            }
        }
        
        return funcionariosGerais;
    }
        
    public ArrayList<Medico> getMedicos(){
        ArrayList<Medico> medicos = new ArrayList<Medico>();
        
        for(Pessoa p: this.pessoas){
            if(p instanceof Medico){
                medicos.add((Medico) p);
            }
        }
        
        return medicos;
    }
    
    public ArrayList<FuncionarioAtendente> getFuncionariosAtendentes(){
        ArrayList<FuncionarioAtendente> funcionariosAtendentes = new ArrayList<FuncionarioAtendente>();
        
        for(Pessoa p: this.pessoas){
            if(p instanceof FuncionarioAtendente){
                funcionariosAtendentes.add((FuncionarioAtendente) p);
            }
        }
        
        return funcionariosAtendentes;
    }
    
    public boolean addPessoa(Pessoa pessoa){
        return this.pessoas.add(pessoa);
    }
    
    public boolean removePessoa(String cpf){
        
        for(int i = 0; i < this.pessoas.size(); i ++){
            if(this.pessoas.get(i).getCpf().equalsIgnoreCase(cpf)){
                this.pessoas.remove(i);
                return true;
            }
        }
        
        return false;
    }

    public Pessoa getPessoa(String cpf){
        for(int i = 0; i<this.pessoas.size(); i++){
            if(this.pessoas.get(i).getCpf().equals(cpf)){
                return this.pessoas.get(i);
            }
        }
        
        return null;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "telefone: " + telefone + ", consultas: " + consultas + ", endereço: " + endereco + ", pessoas: " + pessoas + ", estado: " + estado;
    }

    @Override
    public boolean marcarConsulta(Consulta consulta) {
        
        for(int i = 0; i<this.consultas.size(); i++){
            if(this.consultas.get(i).getData().equals(consulta.getData())){
                return false;
            }
        }
        
        if(this.consultas.add(consulta)){
            String msg = this.getMensagemDeConsulta(consulta);
            
            this.email.enviarEmail(msg, consulta.getPaciente().getEmail(), "Consulta marcada.");
            
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean consultaExistente(Consulta consulta){
        for(int i=0;i<this.consultas.size();i++){
            if(this.consultas.get(i) == consulta){
                return true;
            }
        }
        return false;
    }
    
    public boolean dataDeConsultaExistente(Data data){
        for(Consulta consulta: this.consultas){
            if(consulta.getData() == data){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String getEstadoDaClinica() {
        return this.estado;
    }

    @Override
    public void setEstadoDaCLinica(String estado) {
        this.estado = estado;
    }    
    
    @Override
    public boolean desmarcarConsulta(String id) {
     
        for(int i=0;i<this.consultas.size();i++){
            
            if(this.consultas.get(i).getId().equals(id)){
                
                this.consultas.remove(i);
                
                return true;
            }
            
        }
        return false;
    }
    
    public FuncionarioAtendente getFuncionarioAtendente(String cpf){
        
        ArrayList <FuncionarioAtendente> funcionariosAtendentes = getFuncionariosAtendentes();
 
        for(int i = 0; i < funcionariosAtendentes.size(); i ++){
            if(funcionariosAtendentes.get(i).getCpf().equals(cpf)){
                FuncionarioAtendente funcionario = funcionariosAtendentes.get(i);
                return funcionario;
            }
        }
        return null;
    }
    
    public FuncionarioGeral getFuncionarioGeral(String cpf){
        
        ArrayList <FuncionarioGeral> funcionariosGerais = getFuncionariosGerais();
 
        for(int i = 0; i < funcionariosGerais.size(); i ++){
            if(funcionariosGerais.get(i).getCpf().equals(cpf)){
                FuncionarioGeral funcionario = funcionariosGerais.get(i);
                return funcionario;
            }
        }
        
        return null;
    }
    
    public Medico getMedico(String cpf){
        
        ArrayList <Medico> medicos = getMedicos();
 
        for(int i = 0; i < medicos.size(); i ++){
            if(medicos.get(i).getCpf().equals(cpf)){
                Medico medico = medicos.get(i);
                return medico;
            }
        }
        
        return null;
    }

    public Paciente getPaciente(String cpf){
        
        ArrayList <Paciente> pacientes = getPacientes();
 
        for(int i = 0; i < pacientes.size(); i ++){
            if(pacientes.get(i).getCpf().equals(cpf)){
                Paciente paciente = pacientes.get(i);
                return paciente;
            }
        }
        
        return null;
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
       
        for(int i = 0; i<this.pessoas.size(); i++){
            if(this.pessoas.get(i) instanceof Funcionario){
                funcionarios.add((Funcionario) this.pessoas.get(i));
            }
        }
        
        return funcionarios;
    }
    
    public boolean isConsultaExistente(Data horario){
        for(Consulta c: this.consultas){
            if(c.getData() == horario){
                return true;
            }
        }
        return false;
    }
    
    public String getMensagemDeConsulta(Consulta consulta){
        String mensagem = "";
        ArrayList<String> arquivo =  Arquivo.loadArchive("arquivos//MensagemDeConsulta.txt");

        for(int i = 0; i < arquivo.size(); i ++){
            mensagem += (String) arquivo.get(i);

        }

        mensagem = mensagem.replaceAll("NNNNNNN", consulta.getPaciente().getNome());
        mensagem = mensagem.replaceAll("-------", consulta.getId());
        mensagem = mensagem.replaceAll("DDDDDDD", consulta.getData().toString());
        mensagem = mensagem.replaceAll("CCCCCCC", this.nome);
        mensagem = mensagem.replaceAll("QQQQQQQ", "\n");

        String msg = "Sr(a). " + consulta.getPaciente().getNome()+ ",\n"
          + "Informamos que sua consulta de ID: "+ consulta.getId()+ ", foi agendada com sucesso para a seguinte data: " + consulta.getData() + ". Em caso de dúvida, contate-nos. \n"
          + "Att., Administração da Clínica " + this.nome;
        
        return msg;
    }
}

