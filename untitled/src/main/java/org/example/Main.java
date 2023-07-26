package org.example;

import org.example.modelos.Local;
/*import org.example.modelos.Oferta;*/
import org.example.modelos.Oferta;
import org.example.modelos.Usuario;
import org.example.utilidades.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //ATRIBUTOS
        Scanner input = new Scanner(System.in);
        Util utilMain = new Util();
        Usuario objetoUsuario = new Usuario();
        Local objetoLocal = new Local();
        Oferta objetoOferta = new Oferta();

        //METODOS


        //LOGICA


/*        System.out.println("Señor usuario digite su nombre");
        String inputDos= input.nextLine();
        objetoUsuario.setNombres(inputDos);*/
/*
        System.out.println("Señor usuario digite su ubicacion");
        String inputUbicacion= input.nextLine();
        objetoUsuario.setUbicacion(inputUbicacion);*/

/*
        System.out.println("Señor usuario digite su correo");
        String inputCorreo=input.nextLine();
        objetoUsuario.setCorreoElectronico(inputCorreo);
        System.out.println(objetoUsuario.getCorreoElectronico());
*/
   /*     System.out.println("Señor usuario digite el nombre de su empresa");
        String inputValidarNombreEmpresa= input.nextLine();
        objetoLocal.setNombre(inputValidarNombreEmpresa);
        System.out.println(objetoLocal.getNombre());
*/

     /*   System.out.println("Señor usuario digite el año de la fecha inicio");
        Integer anioInicio=input.nextInt();

        System.out.println("Señor usuario digite el mes de la fecha inicio");
        Integer mesInicio=input.nextInt();

        System.out.println("Señor usuario digite el dia de la fecha inicio");
        Integer diaInicio=input.nextInt();

        //***********************************************************************************************************
        objetoOferta.setFechaInicio(anioInicio,mesInicio,diaInicio);
        //***********************************************************************************************************
        System.out.println(objetoOferta.getFechaInicio());


        System.out.println("Señor usuario digite el año de la fecha fin");
        Integer anioFin=input.nextInt();

        System.out.println("Señor usuario digite el mes de la fecha fin");
        Integer mesFin=input.nextInt();

        System.out.println("Señor usuario digite el dia de la fecha fin");
        Integer diaFin=input.nextInt();


        //***********************************************************************************************************
        objetoOferta.setFechaFin(anioFin,mesFin,diaFin);
        //***********************************************************************************************************
        System.out.println(objetoOferta.getFechaFin());*/

        System.out.println("ingrese el costo persona");
        Double costoPersona=input.nextDouble();
        objetoOferta.setCostoPersona(costoPersona);
        System.out.println(objetoOferta.getCostoPersona());






    }



}
