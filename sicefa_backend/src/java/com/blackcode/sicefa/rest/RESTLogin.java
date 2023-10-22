package com.blackcode.sicefa.rest;

import com.blackcode.sicefa.core.ControllerUsuario1_1;
import com.blackcode.sicefa.model.Usuario;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("usuario")

public class RESTLogin {

    @Path("login")
    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public Response autenticar(Usuario usuario) {
        ControllerUsuario1_1 cu = new ControllerUsuario1_1();

        if (cu.login(usuario.getNombreUsuario(), usuario.getPassword())) {
            // Credenciales válidas, devuelve una respuesta exitosa.
            return Response.ok("Autenticación exitosa").build();
        } else {
            // Credenciales inválidas, devuelve una respuesta de error.
            return Response.status(Response.Status.UNAUTHORIZED).entity("Autenticación fallida").build();
        }
    }

}
