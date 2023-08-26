package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;

public class ValidacionOferta {
    //ATRIBUTOS

    private Util objetoVinculoUtilOferta = new Util();

    //METODOS
    public Boolean validarTitulo(String inputValidarTituloOferta) throws Exception {

        String expresionRegular = "^[A-Za-zñÑáéíóúÁÉÍÓÚ\s]+$";

        if (!objetoVinculoUtilOferta.objetoRegex(expresionRegular, inputValidarTituloOferta)) {
            throw new Exception(Mensaje.SOLO_LETRAS.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarTituloExtencion(String input) throws Exception {
        if (input.length() > 20) {
            throw new Exception(Mensaje.EXTENSION_MAYOR_VEINTE.getMensaje());

        } else {
            return true;
        }
    }
    public Boolean validarLogicaFecha(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if (fechaInicio.isAfter(fechaFin) || fechaFin.isBefore(fechaInicio)) {
            throw new Exception(Mensaje.FECHA_ILOGICA.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarCosto(Double costoPersona) throws Exception {
        if (costoPersona < 0) {
            throw new Exception(Mensaje.COSTO_PERSONA_NEGATIVO.getMensaje());
        }
        return true;
    }

    public Boolean validarFormatoFecha(String inputFecha) throws Exception {
        String expresionRegular = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

        if (!objetoVinculoUtilOferta.objetoRegex(expresionRegular, inputFecha)) {
            throw new Exception(Mensaje.FORMATO_FECHA_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }
}

