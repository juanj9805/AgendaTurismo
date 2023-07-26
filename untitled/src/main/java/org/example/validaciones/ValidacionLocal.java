package org.example.validaciones;

import org.example.utilidades.Util;

public class ValidacionLocal {
    //ATRIBUTOS
private Util objetoVinculoUtil = new Util();

    //METODOS



    public Boolean validarNit( String inputValidarNit )throws Exception{

        String expresionRegular="^[0-9]+$";

        if (! objetoVinculoUtil.objetoRegex(expresionRegular,inputValidarNit)){
            throw new Exception("Señor usuario su nombre no puede tener numeros, solo caracteres");
        } else if (inputValidarNit.equals(10)) {
            throw new Exception("Señor usuario su nombre debe contener como minimo 10 caracteres");

        } else{
            return true;
        }
    }


    public Boolean validarNombreEmpresa( String inputValidarNombreEmpresa )throws Exception{

        String expresionRegular="^[A-Za-zñÑáéíóúÁÉÍÓÚ\s]+$";

        if (! objetoVinculoUtil.objetoRegex(expresionRegular,inputValidarNombreEmpresa)){
            throw new Exception("Señor usuario su nombre no puede tener numeros, solo caracteres");
        } else if (inputValidarNombreEmpresa.length()>30) {
            throw new Exception("Señor usuario su nombre no debe sobrepasar los 30 caracteres");

        } else{
            return true;
        }
    }

}
