package org.example.validaciones;

import org.example.utilidades.Util;

import static java.lang.Integer.*;

public class ValidacionUsuario {
    //ATRIBUTOS
    Util objetoUtil = new Util();



    //METODOS
    public Boolean validarNombre( String inputValidarNombre )throws Exception{

        String expresionRegular="^[A-Za-zñÑáéíóúÁÉÍÓÚ\s]+$";

        if (! objetoUtil.objetoRegex(expresionRegular,inputValidarNombre)){
            throw new Exception("Señor usuario su nombre no puede tener numeros, solo caracteres");
        } else if (inputValidarNombre.length()<10) {
            throw new Exception("Señor usuario su nombre debe contener como minimo 10 caracteres");

        } else{
            return true;
        }
    }

    public Boolean validarCorreo( String inputValidarCorreo )throws Exception{

        String expresionRegular="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        if (! objetoUtil.objetoRegex(expresionRegular,inputValidarCorreo)){
            throw new Exception("Señor usuario su correo no cumple los requisitos ");
        }else{
            return true;
        }
    }

    public Boolean validarUbicacion (Integer ubicacion) throws  Exception{

        if (ubicacion.equals(1) || ubicacion.equals(2) || ubicacion.equals(3) || ubicacion.equals(4)){
            return true;
        }else{
            throw new Exception("señor usuario el numero que usted digito no es valido");
        }
        }

}

/*    public Boolean validarUbicacion( String inputValidarUbicacion )throws Exception{

        String expresionRegular= "^[1-4]+$";
*//*
        Integer cambioStringEntero= parseInt(String.valueOf(inputValidarUbicacion));
*//*
 *//*       String cambioStringEnteroDos= Integer.toString(inputValidarUbicacion);
        String cambioStringEnteroTres= String.valueOf(inputValidarUbicacion);*//*

        if (! objetoUtil.objetoRegex(expresionRegular, (inputValidarUbicacion))){
            throw new Exception("Señor usuario su ubicacion no puede tener letras, solo numeros de 1 a 4 ");
        } else{
            return true;
        }
    }*/
