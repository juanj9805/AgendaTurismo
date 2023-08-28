package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionUsuarioTest {
    private ValidacionUsuario validacionUsuario;

    @BeforeEach

    public void setUp(){
    this.validacionUsuario= new ValidacionUsuario();
    }


    @Test
    public void validarNombreCorrectoSoloLetrasUsuario(){
        String nombreCorrecto="asde";

        Assertions.assertDoesNotThrow(()->validacionUsuario.validarNombre(nombreCorrecto));

    }

    @Test
    public void validarNombreIncorrectoSoloLetrasUsuario(){
        String nombreIncorrecto="1asdaf2";

        Exception exception=Assertions.assertThrows(Exception.class,()->validacionUsuario.validarNombre(nombreIncorrecto));

        Assertions.assertEquals(Mensaje.SOLO_LETRAS.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarCorreoCorrecto(){
        String correoCorrecto="asde@gmail.com";

        Assertions.assertDoesNotThrow(()->validacionUsuario.validarCorreo(correoCorrecto));

    }

    @Test
    public void validarCorreoIncorrecto(){
        String correoIncorrecto="juan";

        Exception exception=Assertions.assertThrows(Exception.class,()->validacionUsuario.validarCorreo(correoIncorrecto));

        Assertions.assertEquals(Mensaje.CORREO_INVALIDO.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarUbicacionCorrecto(){
        Integer ubicacionCorrecto= Integer.valueOf("1");

        Assertions.assertDoesNotThrow(()->validacionUsuario.validarUbicacion(ubicacionCorrecto));

    }

    @Test
    public void validarUbicacionIncorrecto(){
        Integer ubicacionIncorrecto= Integer.valueOf("5");

        Exception exception=Assertions.assertThrows(Exception.class,()->validacionUsuario.validarUbicacion(ubicacionIncorrecto));

        Assertions.assertEquals(Mensaje.CORREO_INVALIDO.getMensaje(),exception.getMessage());
    }



}