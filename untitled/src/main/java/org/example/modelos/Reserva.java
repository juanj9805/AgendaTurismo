package org.example.modelos;

import org.example.validaciones.ValidacionOferta;
import org.example.validaciones.ValidacionReserva;

import java.time.LocalDate;

public class Reserva {
    //ATRIBUTOS

    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;
    private Integer cantidadReserva;
    ValidacionReserva objetoVinculoValidacionReserva = new ValidacionReserva();



    //METODOS
    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva, Integer cantidadReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.cantidadReserva = cantidadReserva;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Integer anio, Integer mes,Integer dia) {
        try {
            objetoVinculoValidacionReserva.validarAnio(anio);
            objetoVinculoValidacionReserva.validarMes(mes);
            objetoVinculoValidacionReserva.validarDia(dia);

            LocalDate fechaJuan=LocalDate.of(anio,mes,dia);

            this.fechaReserva = fechaJuan;

        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Integer getCantidadReserva() {
        return cantidadReserva;
    }

    public void setCantidadReserva(Integer cantidadReserva) {
        try {objetoVinculoValidacionReserva.validarReservas(cantidadReserva);
            this.cantidadReserva = cantidadReserva;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }


        }
}


