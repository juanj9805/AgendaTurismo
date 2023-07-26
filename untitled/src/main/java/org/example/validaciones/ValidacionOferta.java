package org.example.validaciones;

import org.example.utilidades.Util;

import java.time.LocalDate;

public class ValidacionOferta {
    //ATRIBUTOS

    private Util objetoVinculoUtilOferta = new Util();

    //METODOS


    public Boolean validarTitulo( String inputValidarTituloOferta )throws Exception{

        String expresionRegular="^[A-Za-zñÑáéíóúÁÉÍÓÚ\s]+$";

        if (! objetoVinculoUtilOferta.objetoRegex(expresionRegular,inputValidarTituloOferta)){
            throw new Exception("Señor usuario su titulo no puede tener numeros, solo caracteres");
        } else if (inputValidarTituloOferta.length()<21) {
            throw new Exception("Señor usuario su titulo no debe sobrepasar los 20 caracteres");

        } else{
            return true;
        }
    }

    public Boolean validarDosFechas(LocalDate fechaInicio,LocalDate fechaFin)throws Exception{
        if (!objetoVinculoUtilOferta.diferenciaFechas(fechaInicio,fechaFin)){
            throw new Exception("Señor usuario las fechas son ilogicas por que la fecha fin no puede ser menor a la fecha inicio ");
        }else {
            return true;
        }
    }

    public Boolean validarAnio(Integer anio)throws Exception{
        if ((anio>0) &&(anio<2024)){
            return true;
        }else {
            throw new Exception("Señor usuario el año debe ser positivo y menor a 2024");
        }
    }

    public Boolean validarMes(Integer mes)throws Exception{
        if ((mes>0) &&(mes<13)){
            return true;
        }else {
            throw new Exception("Señor usuario el mes debe ser positivo y menor a 13");
        }
    }

    public Boolean validarDia(Integer dia)throws Exception{
        if ((dia>0) &&(dia<32)){
            return true;
        }else {
            throw new Exception("Señor usuario el dia debe ser positivo y menor a 32");
        }
    }

    public Boolean validarCosto (Double inputCostoPersona) throws Exception {
        if (inputCostoPersona <0 ){
            throw new Exception("Señor usuario el costo no puede ser un valor menor a 0");
        }
        return true;
    }





}

