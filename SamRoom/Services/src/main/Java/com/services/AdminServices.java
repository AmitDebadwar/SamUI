package com.services;

/**
 * Created by cwr.Amit.Debadwar on 7/21/2016.
 */


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.lang.String;


@Path("/adminServices")
public class AdminServices {

    @GET
    @Path("/validateUser")
    @Produces(MediaType.APPLICATION_JSON)
    public String validateUser() {
        return "sairahem786Success";
    }
}
