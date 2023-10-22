package com.blackcode.sicefa.model;

public class Persona {

    int id;
    String nombre, apellidoPaterno, apellidoMaterno,
            genero, fechaNacimiento, rfc, curp, domicilio,
            codigoPostal, ciudad, estado, telefono, foto;

    public Persona() {
    }

    ////////    GETTER    ////////
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getGenero() {
        return genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getRfc() {
        return rfc;
    }

    public String getCurp() {
        return curp;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFoto() {
        return foto;
    }

    ////////    SETTER    ////////
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}
