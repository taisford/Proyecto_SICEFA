package com.blackcode.sicefa.rest;

import com.blackcode.sicefa.core.ControllerEmpleado;
import com.blackcode.sicefa.model.Empleado;
import com.google.gson.Gson;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("empleado")

////////    REST Empleado 1.0.0    ////////
public class RESTEmpleado {

    @Path("getAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getALL() {

        ControllerEmpleado ce = new ControllerEmpleado();
        List<Empleado> empleados = null;
        String out = null;
        Gson gson = new Gson();
        try {
            empleados = ce.getAlls("");
            out = gson.toJson(empleados);
        } catch (Exception e) {
            e.printStackTrace();
            out = "{\" exception\":" + e.toString().replaceAll("\"", "") + "\"}";
        }
        return Response.ok(out).build();
    }
}

////////    REST Empleado 1.0.1    ////////
//
/*
public class RESTEmpleado {

    @Path("getAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        ControllerEmpleado ce = new ControllerEmpleado();
        List<Empleado> empleados = null;
        String out = null;
        Gson gson = new Gson();

        try {
            empleados = ce.getAlls("");
            out = gson.toJson(empleados);
        } catch (Exception e) {
            e.printStackTrace();
            out = "{\"exception\":" + e.toString().replaceAll("\"", "") + "\"}";
        }
        return Response.ok(out).build();
    }
}
 */
