package com.blackcode.sicefa.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMySQL {

    public Connection open() throws Exception {
        String user = "root";
        String password = "Taisf0rd.";
        String url = "jdbc:mysql://127.0.0.1:3306/sicefa?"
                + "useSSL=false&"
                + "allowPublicKeyRetrieval=true&"
                + "useUnicode=true&"
                + "characterEncoding=utf-8";
        Connection conn = null;

        //  Primero registramos el driver de la base de datos
        Class.forName("com.mysql.cj.jdbc.Driver");

        //  Abrimos una conexion con MySQL
        conn = DriverManager.getConnection(url, user, password);

        return conn;
    }
}
