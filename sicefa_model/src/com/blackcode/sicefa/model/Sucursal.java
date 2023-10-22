package com.blackcode.sicefa.model;

public class Sucursal {

    int idSucursal;
    int status;
    String nombre;
    String titular;
    String rfc;
    String domicilio;
    String colonia;
    String codigoPostal;
    String ciudad;
    String estado;
    String telefono;
    String latitud;
    String longitud;

    public Sucursal() {
    }

    ////////    GETTER    ////////
    public int getIdSucursal() {
        return idSucursal;
    }

    public int getStatus() {
        return status;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTitular() {
        return titular;
    }

    public String getRfc() {
        return rfc;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getColonia() {
        return colonia;
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

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    ////////    SETTER    ////////
    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
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

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    
}
