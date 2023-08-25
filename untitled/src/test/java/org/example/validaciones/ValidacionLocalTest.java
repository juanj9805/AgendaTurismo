package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ValidacionLocalTest {
    //este es el objeto en forma de atributo y con este emulamos el ambiente de validacion local
    private ValidacionLocal validacionLocal;
    //con esta anotacion determinamos, seteamos todas las pruebas a partir de ste before each
    @BeforeEach
    //es un metodo que utilizamos para definir los parametros base de cada test (ingredientes)
    public void setUp(){
        //es un molde, plantilla con variaciones "es una caja de herramnienta, si necesito clavar uso el martillo"
        this.validacionLocal=new ValidacionLocal();
    }
    @Test
    public void validarNitCuandoSoloTieneNumeros(){
        //arrange
        String nitCorrecto="1234567899";
        //act
        Assertions.assertDoesNotThrow(()->validacionLocal.validarNit(nitCorrecto));
    }

    @Test
    public void validarNitCuandoTieneCaracteresIncorrectos(){

        String nitIncorrecto="asd";
        Exception exception=Assertions.assertThrows(Exception.class,()->validacionLocal.validarNit(nitIncorrecto));
        Assertions.assertEquals(Mensaje.SOLO_NUMEROS.getMensaje(),exception.getMessage());
    }
}