package com.blackcode.sicefa.model;

public class Empleado {

    int id;
    String codigo;
    String email;
    String fechIngreso;
    String puesto;
    double salarioBruto;
    int activo;

    Persona persona;
    Usuario usuario;
    Sucursal sucursal;

    public Empleado() {
    }

    ////////    GETTER    ////////
    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEmail() {
        return email;
    }

    public String getFechIngreso() {
        return fechIngreso;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public int getActivo() {
        return activo;
    }

    public Persona getPersona() {
        return persona;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    ////////    SETTER    ////////
    public void setId(int id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechIngreso(String fechIngreso) {
        this.fechIngreso = fechIngreso;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

}
