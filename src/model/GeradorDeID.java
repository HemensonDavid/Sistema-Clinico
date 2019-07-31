package model;

import java.util.Calendar;

public class GeradorDeID {
    public static String gerarID(){
        Calendar c = Calendar.getInstance();
        String segundos = Integer.toString(c.getTime().getSeconds());
        String minutos = Integer.toString(c.getTime().getMinutes());
        String horas = Integer.toString(c.getTime().getHours());
        String dia = Integer.toString(c.getTime().getDay());
        String mes = Integer.toString(c.getTime().getMonth());
        String ano = Integer.toString(c.getTime().getYear());
        
        String id = segundos + minutos + horas + dia + mes + ano;
        return id;
    }
}
