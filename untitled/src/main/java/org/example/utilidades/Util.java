package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    //ATRIBUTOS


    //METODOS
//METODO CONVERTIR A EXPRESION REGULAR
    public  Boolean objetoRegex(String buscarCoincidencia,String input){
        Pattern patron = Pattern.compile(buscarCoincidencia);
        Matcher coincidencia = patron.matcher(input);
        if (coincidencia.matches()){
            return true;
        }else {
            return false;
        }
    }
//METODO DIFERENCIA FECHAS

    public static LocalDate formateoFechaStringLocalDate(String input,String formato){
        DateTimeFormatter formatoFecha =DateTimeFormatter.ofPattern(formato);
        LocalDate fechaFormateada =LocalDate.parse(input);
        return fechaFormateada;
    }

}
