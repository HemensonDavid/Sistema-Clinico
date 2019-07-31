package model;

import java.io.Serializable;

/*
    Classe criada para ser usada diretamente com os atributos necessérios
*/

public class Data implements Serializable{
    private int dia, mes, ano;
    private int hora, minuto, segundo;

    public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    
    public Data(){
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano + ", horario: " + hora + ":" + minuto;
    }
    
    public static Data parseData(String data){
        int dia = Integer.parseInt(String.valueOf(data.charAt(0)) + String.valueOf(data.charAt(1)));
        int mes = Integer.parseInt(String.valueOf(data.charAt(3)) + String.valueOf(data.charAt(4)));
        int ano = Integer.parseInt(String.valueOf(data.charAt(6)) + String.valueOf(data.charAt(7)) + String.valueOf(data.charAt(8)) + String.valueOf(data.charAt(9)));
        return (new Data(dia, mes, ano));
    }
    public static Data parseData(String dataAnual, String horario){
        int dia = Integer.parseInt(String.valueOf(dataAnual.charAt(0)) + String.valueOf(dataAnual.charAt(1)));
        int mes = Integer.parseInt(String.valueOf(dataAnual.charAt(3)) + String.valueOf(dataAnual.charAt(4)));
        int ano = Integer.parseInt(String.valueOf(dataAnual.charAt(6)) + String.valueOf(dataAnual.charAt(7)) + String.valueOf(dataAnual.charAt(8)) + String.valueOf(dataAnual.charAt(9)));
        int hora = Integer.parseInt(String.valueOf(horario.charAt(0)) + String.valueOf(horario.charAt(1)));
        int minutos = Integer.parseInt(String.valueOf(horario.charAt(3)) + String.valueOf(horario.charAt(4)));
        int segundos = Integer.parseInt(String.valueOf(horario.charAt(6)) + String.valueOf(horario.charAt(7)));
        return (new Data(dia, mes, ano, hora, minutos, segundos));
    }
    
    public String getDataAnual(){
        String data = this.dia + "/" + this.mes + "/" + this.ano;
        
        return data;
    }
    
    public String getHorario(){
        String horario= this.hora + ":" + this.minuto+ ":"+ this.segundo;
        return horario;
    }
}
