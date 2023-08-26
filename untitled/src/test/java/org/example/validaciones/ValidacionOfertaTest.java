package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionOfertaTest {
    private ValidacionOferta validacionOferta;
    @BeforeEach
    public void setUp(){
        this.validacionOferta= new ValidacionOferta();
    }
    @Test
    public void validarTituloCorrectoSoloLetras(){
        String tituloCorrecto="asde";

        Assertions.assertDoesNotThrow(()->validacionOferta.validarTitulo(tituloCorrecto));
    }

    @Test
    public void validarTituloIncorrectoSoloLetras(){
        String tituloIncorrecto="123";
        Exception exception=Assertions.assertThrows(Exception.class,()-> validacionOferta.validarTitulo(tituloIncorrecto));
        Assertions.assertEquals(Mensaje.SOLO_LETRAS.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarTituloCorrectoExtencionMenorVeinte(){
        String tituloCorrecto="asde";

        Assertions.assertDoesNotThrow(()->validacionOferta.validarTituloExtencion(tituloCorrecto));
    }

    @Test
    public void validarTituloIncorrectoExtencionMenorVeinte(){
        String tituloIncorrecto="1faaaaaaaaaaaaaaassssssssssssssdafafgagaaaaaa23";
        Exception exception=Assertions.assertThrows(Exception.class,()-> validacionOferta.validarTituloExtencion(tituloIncorrecto));
        Assertions.assertEquals(Mensaje.SOLO_LETRAS.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarLogicaFechaCorrecto(){
        LocalDate fechaInicioCorrecta=LocalDate.of(2023,10,10);
        LocalDate fechaFinCorrecta=LocalDate.of(2023,11,10);
        Assertions.assertDoesNotThrow(()->validacionOferta.validarLogicaFecha(fechaInicioCorrecta,fechaFinCorrecta));

    }

    @Test
    public void validarLogicaFechaIncorrecto(){
        LocalDate fechaInicioIncorrecta=LocalDate.of(2023,10,10);
        LocalDate fechaFinIncorrecta=LocalDate.of(2023,9,10);
        Exception exception=Assertions.assertThrows(Exception.class,()->validacionOferta.validarLogicaFecha(fechaInicioIncorrecta,fechaFinIncorrecta));
        Assertions.assertEquals(Mensaje.FECHA_ILOGICA.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarCostoCorrecto(){
        Double costoOk=1.0;
        Assertions.assertDoesNotThrow(()->validacionOferta.validarCosto(costoOk));
    }

    @Test
    public void validarCostoIncorrecto(){
        Double costoIncorrecto=-1.0;
        Exception exception=Assertions.assertThrows(Exception.class,()-> validacionOferta.validarCosto(costoIncorrecto));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA_NEGATIVO.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarFormatoCorrectoFecha(){
        String formatoCorrecto="26/08/2023";

        Assertions.assertDoesNotThrow(()->validacionOferta.validarFormatoFecha(formatoCorrecto));
    }

    @Test
    public void validarFormatoIncorrectoFecha(){
        String formatoIncorrecto="2023/08/23";
        Exception exception=assertThrows(Exception.class,()->validacionOferta.validarFormatoFecha(formatoIncorrecto));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA_INVALIDO.getMensaje(),exception.getMessage());
    }


}