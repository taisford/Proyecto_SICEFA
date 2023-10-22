package com.blackcode.sicefa.model;

public class Usuario {

    int id;
    String nombreUsuario;
    String password;
    String rol;

    public Usuario() {
    }

    ////////    GETTER    ////////
    public int getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public String getRol() {
        return rol;
    }

    ////////    SETTER    ////////
    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
