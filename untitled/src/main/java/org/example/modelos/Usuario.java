package org.example.modelos;

import org.example.validaciones.ValidacionUsuario;

public class Usuario {
    //ATRIBUTOS
private String id;
private String nombres;
private String documento;
private Integer ubicacion;
private String correoElectronico;

private ValidacionUsuario objetoVinculoValidacionUsuario = new ValidacionUsuario();

    //METODOS

    //CONSTRUCTOR VACIO


    public Usuario() {
    }

    //CONSTRUCTOR LLENO

    public Usuario(String id, String nombres, String documento, Integer ubicacion, String correoElectronico, ValidacionUsuario objetoVinculoValidacionUsuario) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
        this.objetoVinculoValidacionUsuario = objetoVinculoValidacionUsuario;
    }


    //GETERS Y SETERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) throws Exception {

        try{
            objetoVinculoValidacionUsuario.validarNombre(nombres);
            this.nombres = nombres;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) throws Exception {
        try {
            objetoVinculoValidacionUsuario.validarUbicacion(ubicacion);
            this.ubicacion = ubicacion;

        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico)throws Exception {
        try {
            objetoVinculoValidacionUsuario.validarCorreo(correoElectronico);
            this.correoElectronico = correoElectronico;

        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public ValidacionUsuario getObjetoVinculoValidacionUsuario() {
        return objetoVinculoValidacionUsuario;
    }

    public void setObjetoVinculoValidacionUsuario(ValidacionUsuario objetoVinculoValidacionUsuario) {
        this.objetoVinculoValidacionUsuario = objetoVinculoValidacionUsuario;
    }


}
