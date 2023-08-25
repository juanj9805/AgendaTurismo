package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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



}