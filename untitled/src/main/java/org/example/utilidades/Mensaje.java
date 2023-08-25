package org.example.utilidades;

public enum Mensaje {
    SOLO_NUMEROS("Señor usuario su nombre solo puede tener numeros"),
    CANTIDAD_DIGITOS_NO_IGUALES_DIEZ("Señor usuario su nit debe contener 10 caracteres"),
    EXTENSION_MAYOR_TREINTA("Señor usuario su nombre no debe sobrepasar los 30 caracteres"),
    SOLO_LETRAS("Señor usuario su nombre no puede tener numeros, solo caracteres"),
    EXTENSION_MAYOR_VEINTE("Señor usuario su titulo no debe sobrepasar los 20 caracteres"),




    ;



    private String mensaje;
    Mensaje(String mensaje) {
    }

    public String getMensaje() {
        return mensaje;
    }
}
