package org.example.utilidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    //ATRIBUTOS


    //METODOS
//METODO CONVERTIR A EXPRESION REGULAR
    public Boolean objetoRegex(String buscarCoincidencia,String input){
        Pattern patron = Pattern.compile(buscarCoincidencia);
        Matcher coincidencia = patron.matcher(input);
        if (coincidencia.matches()){
            return true;
        }else {
            return false;
        }
    }
//METODO DIFERENCIA FECHAS
    public Boolean diferenciaFechas(LocalDate fechaInicio,LocalDate fechaFin){
        Long diferencia = ChronoUnit.DAYS.between(fechaInicio,fechaFin);
        if (diferencia>0){
            return true;
        }else {
            return false;
        }
    }

}
