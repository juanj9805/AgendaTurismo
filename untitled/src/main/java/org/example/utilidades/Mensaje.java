package org.example.utilidades;

public enum Mensaje {
    SOLO_NUMEROS("Señor usuario su nombre solo puede tener numeros"),
    ;

    private String mensaje;
    Mensaje(String mensaje) {
    }

    public String getMensaje() {
        return mensaje;
    }
}
