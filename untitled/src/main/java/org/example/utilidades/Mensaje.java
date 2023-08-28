package org.example.utilidades;

public enum Mensaje {
    SOLO_NUMEROS("Señor usuario su nombre solo puede tener numeros"),
    CANTIDAD_DIGITOS_NO_IGUALES_DIEZ("Señor usuario su nit debe contener 10 caracteres"),
    EXTENSION_MAYOR_TREINTA("Señor usuario su nombre no debe sobrepasar los 30 caracteres"),
    SOLO_LETRAS("Señor usuario su nombre no puede tener numeros, solo caracteres"),
    EXTENSION_MAYOR_VEINTE("Señor usuario su titulo no debe sobrepasar los 20 caracteres"),
    NUMEROS_NEGATIVOS("Señor usuario es ilogico hacer una reserva con un valor negativo"),
    NUMEROS_SUPERIOR_CUATRO("Señor usuario no se puede hacer mas de 4 reservas"),
    FORMATO_FECHA_INVALIDO("Señor usuario la fecha esta incorrecta"),
    FECHA_ILOGICA("Señor usuario su fecha es ilogica"),
    COSTO_PERSONA_NEGATIVO("Señor usuario el costo no puede ser negativo"),
    CORREO_INVALIDO("Señor usuario su correo no cumple los requisitos "),
    NUMERO_INVALIDO("señor usuario el numero que usted digito no es valido"),




    ;



    private String mensaje;
    Mensaje(String mensaje) {
    }

    public String getMensaje() {
        return mensaje;
    }
}
