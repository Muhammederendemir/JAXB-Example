package com.controller;

import com.model.Person;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/service")
public class PersonController {
    @POST
    @Path("/person")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getUserById(Person person){

        System.out.println("Person Id:"+person.getId());
        System.out.println("Person Name: "+person.getName());
        System.out.println("Person Surname: "+person.getSurname());

        return Response.status(200).entity("İşlem başarılı").build();
    }
}

