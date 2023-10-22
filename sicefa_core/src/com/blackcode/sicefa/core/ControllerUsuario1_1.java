package com.blackcode.sicefa.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.blackcode.sicefa.db.ConexionMySQL;

public class ControllerUsuario1_1 {

    public boolean login(String nombreUsuario, String contrasenia) {
        // Realiza la lógica de autenticación aquí
        try {
            // Abre una conexión a la base de datos
            ConexionMySQL connMySQL = new ConexionMySQL();
            Connection conn = connMySQL.open();

            // Consulta para buscar un usuario con el nombre de usuario y contraseña proporcionados
            String sql = "SELECT * FROM usuarios WHERE nombreUsuario = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nombreUsuario);
            pstmt.setString(2, contrasenia);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Si se encontró un usuario, la autenticación es exitosa
                return true;
            } else {
                // Si no se encontró un usuario, la autenticación falla
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Maneja las excepciones adecuadamente
            return false;
        }
    }

}
