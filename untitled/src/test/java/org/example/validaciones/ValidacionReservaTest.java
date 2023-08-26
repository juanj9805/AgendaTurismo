package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionReservaTest {
    private ValidacionReserva validacionReserva;
    @BeforeEach
    public void SetUp(){
        this.validacionReserva=new ValidacionReserva();
    }
    @Test
    public void validacionReservaOk(){
        Integer reservaCorrecta=1;
        Assertions.assertDoesNotThrow(()->validacionReserva.validarReservas(reservaCorrecta));
    }
    @Test
    public void validacionReservaIncorrecta(){
        Integer reservaIncorrecta=5;
        Exception exception=assertThrows(Exception.class,()->validacionReserva.validarReservas(reservaIncorrecta));
        Assertions.assertEquals(Mensaje.NUMEROS_SUPERIOR_CUATRO.getMensaje(),exception.getMessage());
    }
    @Test
    public void validacionReservaIncorrectaNumerosNegativos(){
        Integer reservaIncorrecta=-1;
        Exception exception=assertThrows(Exception.class,()->validacionReserva.validarReservaNegativas(reservaIncorrecta));
        Assertions.assertEquals(Mensaje.NUMEROS_NEGATIVOS.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarFormatoCorrectoFecha(){
        String formatoCorrecto="26/08/2023";

        Assertions.assertDoesNotThrow(()->validacionReserva.validarFormatoFecha(formatoCorrecto));
    }

    @Test
    public void validarFormatoIncorrectoFecha(){
        String formatoIncorrecto="2023/08/23";
        Exception exception=assertThrows(Exception.class,()->validacionReserva.validarFormatoFecha(formatoIncorrecto));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA_INVALIDO.getMensaje(),exception.getMessage());
    }



}