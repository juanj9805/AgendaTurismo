package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class ValidacionLocal {
    //ATRIBUTOS
private Util objetoVinculoUtil = new Util();

    //METODOS



    public Boolean validarNit( String inputValidarNit )throws Exception{

        String expresionRegular="^[0-9]+$";

        if (! objetoVinculoUtil.objetoRegex(expresionRegular,inputValidarNit)){
            throw new Exception(Mensaje.SOLO_NUMEROS.getMensaje());
        }else{
            return true;
        }
    }
    public Boolean validarNitExtension(String inputValidarNit) throws Exception{
        if (!(inputValidarNit.length() ==10)) {
            throw new Exception(Mensaje.CANTIDAD_DIGITOS_NO_IGUALES_DIEZ.getMensaje());

        }else {
            return true;
        }
    }

    public Boolean validarNombreEmpresa( String inputValidarNombreEmpresa )throws Exception{

        String expresionRegular="^[A-Za-zñÑáéíóúÁÉÍÓÚ\s]+$";

        if (! objetoVinculoUtil.objetoRegex(expresionRegular,inputValidarNombreEmpresa)){
            throw new Exception(Mensaje.SOLO_LETRAS.getMensaje());
        }else{
            return true;
        }
    }

    public Boolean validarExtensionEmpresa(String inputValidarExtensionEmpresa)throws Exception{

        if (inputValidarExtensionEmpresa.length()>30) {
            throw new Exception(Mensaje.EXTENSION_MAYOR_TREINTA.getMensaje());
        }else{
            return true;
        }
    }

}
