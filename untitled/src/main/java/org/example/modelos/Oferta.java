
package org.example.modelos;

import org.example.utilidades.Util;
import org.example.validaciones.ValidacionOferta;

import java.time.LocalDate;

public class Oferta {
    //ATRIBUTOS
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
    private Integer idLocal;
    private ValidacionOferta objetoVinculoValidacionOferta = new ValidacionOferta();
    private  Util objetoUtil = new Util();




    //METODOS


    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Integer idLocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.idLocal = idLocal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception {

        try{
            objetoVinculoValidacionOferta.validarTitulo(titulo);
            this.titulo = titulo;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Integer anio, Integer mes,Integer dia) {
        try {
            objetoVinculoValidacionOferta.validarAnio(anio);
            objetoVinculoValidacionOferta.validarMes(mes);
            objetoVinculoValidacionOferta.validarDia(dia);



            LocalDate fechaJuan=LocalDate.of(anio,mes,dia);
            this.fechaInicio = fechaJuan;

        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Integer anioFin, Integer mesFin,Integer diaFin)  {
        try {
            objetoVinculoValidacionOferta.validarAnio(anioFin);
            objetoVinculoValidacionOferta.validarMes(mesFin);
            objetoVinculoValidacionOferta.validarDia(diaFin);
            LocalDate fechaFin =LocalDate.of(anioFin,mesFin,diaFin);
            objetoVinculoValidacionOferta.validarDosFechas(this.fechaInicio,fechaFin);
            this.fechaFin = fechaFin;

        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        try {
        this.objetoVinculoValidacionOferta.validarCosto(costoPersona);
            this.costoPersona = costoPersona;

        }catch (Exception error){
            System.out.println(error.getMessage());        }

    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}

