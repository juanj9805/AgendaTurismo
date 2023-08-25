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
        String nitCorrecto="129";
        //act
        Assertions.assertDoesNotThrow(()->validacionLocal.validarNit(nitCorrecto));
    }

    @Test
    public void validarNitCuandoTieneCaracteresIncorrectos(){
        //arrange
        String nitIncorrecto="asd";
        //act
        Exception exception=Assertions.assertThrows(Exception.class,()->validacionLocal.validarNit(nitIncorrecto));
        //assertion
        Assertions.assertEquals(Mensaje.SOLO_NUMEROS.getMensaje(),exception.getMessage());
    }
    @Test
    public void validarNitCorrectoCuandoLosCaracteresSonDiez(){
        //arrange
        String nitCorrecto="1234558s99";
        //act
        Assertions.assertDoesNotThrow(()->validacionLocal.validarNitExtension(nitCorrecto));
    }
    @Test
    public void validarNitIncorrectoCuandoNoSonDiezCaracteres(){
        String nitIncorrecto="12345678m";

        Exception exception=Assertions.assertThrows(Exception.class,()->validacionLocal.validarNitExtension(nitIncorrecto));

        Assertions.assertEquals(Mensaje.CANTIDAD_DIGITOS_NO_IGUALES_DIEZ.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarNombreCorrectoSoloLetrasEmpresa(){
        String nombreCorrecto="asde";

        Assertions.assertDoesNotThrow(()->validacionLocal.validarNombreEmpresa(nombreCorrecto));

    }

    @Test
    public void validarNombreIncorrectoSoloLetrasEmpresa(){
        String nombreIncorrecto="1asdaf2";

        Exception exception=Assertions.assertThrows(Exception.class,()->validacionLocal.validarNombreEmpresa(nombreIncorrecto));

        Assertions.assertEquals(Mensaje.SOLO_LETRAS.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarNombreCorrectoExtensionEmpresa(){
        String nombreCorrecto="asdeadaf";

        Assertions.assertDoesNotThrow(()->validacionLocal.validarExtensionEmpresa(nombreCorrecto));

    }

    @Test
    public void validarNombreIncorrectoExtensionEmpresa(){
        String nombreIncorrecto="1asdadaffffffffffffffffffffffffffffffgggggggggggggggggggggggggaaaaaaaaaaaaaaf2";

        Exception exception=Assertions.assertThrows(Exception.class,()->validacionLocal.validarExtensionEmpresa(nombreIncorrecto));

        Assertions.assertEquals(Mensaje.EXTENSION_MAYOR_TREINTA.getMensaje(),exception.getMessage());
    }






}