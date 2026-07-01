package com.naman.learning.resource;

import java.util.List;

import com.naman.learning.dao.StudentDAO;
import com.naman.learning.model.Student;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/students")
public class StudentResource {

    StudentDAO dao = new StudentDAO();

    // Get all Students
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAllStudents(){
        return dao.getAllStudents();
    }

    // Get Student By ID
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentById(@PathParam("id") int id){
        Student student = dao.getStudentById(id);

        if(student == null){
            return Response.status(Response.Status.NOT_FOUND)
                            .entity("Student not found")
                            .build();
        }

        return Response.ok(student).build();
    }

    // Add Student
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addStudent(Student student){

        boolean status = dao.addStudent(student);

        if(status){
            return Response.status(Response.Status.CREATED)
                            .entity("Student Added Successfully")
                            .build();
        }

        return Response.status(Response.Status.BAD_REQUEST)
                        .entity("Unable to add Student")
                        .build();
    }


    // update Student
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateStudent(Student student){
        boolean status = dao.updateStudent(student);

        if(status){
            return Response.ok("Student Updated Successfully")
                            .build();
        }

        return Response.status(Response.Status.NOT_FOUND)
                .entity("Student Not Found")
                .build();
    }

    // Delete Student
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteStudent(@PathParam("id") int id){
        boolean status = dao.deleteStudent(id);

        if(status){
            return Response.ok("Student Deleted Successfully")
                            .build();
        }

        return Response.status(Response.Status.NOT_FOUND)
                        .entity("Student Not Found")
                        .build();
    }
}
