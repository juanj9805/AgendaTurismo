package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class ValidacionReserva {
    //ATRIBUTOS
    Util objetoUtil = new Util();

    //METODOS


    public Boolean validarReservas(Integer reservas) throws Exception{
        if (reservas >4){
            throw new Exception(Mensaje.NUMEROS_SUPERIOR_CUATRO.getMensaje());
        }
        else {
            return true;
        }
    }
    public Boolean validarFormatoFecha(String inputFecha) throws Exception{
        String expresionRegular="^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

        if (!objetoUtil.objetoRegex(expresionRegular, inputFecha)){
            throw new Exception(Mensaje.FORMATO_FECHA_INVALIDO.getMensaje());
        }else{
            return true;
        }
    }

    public Boolean validarReservaNegativas(Integer reservas) throws Exception{
        if (reservas <1){
            throw new Exception(Mensaje.NUMEROS_NEGATIVOS.getMensaje());
        }
        else {
            return true;
        }
    }


}
