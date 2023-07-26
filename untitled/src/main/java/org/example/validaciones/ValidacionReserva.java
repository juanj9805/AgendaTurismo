package org.example.validaciones;

import org.example.utilidades.Util;

public class ValidacionReserva {
    //ATRIBUTOS
    Util objetoUtil = new Util();

    //METODOS

    public Boolean validarAnio(Integer anio)throws Exception{
        if ((anio>0) &&(anio<2024)){
            return true;
        }else {
            throw new Exception("Señor usuario el año debe ser positivo y menor a 2024");
        }
    }

    public Boolean validarMes(Integer mes)throws Exception{
        if ((mes>0) &&(mes<13)){
            return true;
        }else {
            throw new Exception("Señor usuario el mes debe ser positivo y menor a 13");
        }
    }

    public Boolean validarDia(Integer dia)throws Exception{
        if ((dia>0) &&(dia<32)){
            return true;
        }else {
            throw new Exception("Señor usuario el dia debe ser positivo y menor a 32");
        }
    }

    public Boolean validarReservas(Integer reservas) throws Exception{
        if (!(reservas >4)){
            return true;
        }else {
            throw new Exception("Señor usuario no se puede hacer mas de 4 reservas");
        }
    }
}
