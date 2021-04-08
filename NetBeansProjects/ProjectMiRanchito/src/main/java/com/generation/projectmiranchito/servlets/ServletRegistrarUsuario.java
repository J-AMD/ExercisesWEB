/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.projectmiranchito.servlets;

import com.generation.projectmiranchito.models.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Jesus Martinez
 */
@WebServlet(name = "ServletRegistrarUsuario", urlPatterns = {"/ServletRegistrarUsuario"})
public class ServletRegistrarUsuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        
        String nombre = req.getParameter("nombre");
        String apellidoP = req.getParameter("apellidoP");
        String apellidoM = req.getParameter("apellidoM");
        String negocio = req.getParameter("nombreNegocio");
        String sexo = req.getParameter("sexo");
        String fecha = req.getParameter("fechaNacimiento");
        String correo = req.getParameter("correo");
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("contrasenia");
        
      
        registrarUser(nombre, apellidoP, apellidoM, negocio, sexo, fecha, correo, usuario, password);
        resp.sendRedirect("registroNegocio.jsp");
    }

    //////////////////////////////////////////////////Conexion con BD
    public static final String PERSISTENCE_UNIT_NAME = "RanchitoPU";
    private EntityManager entityManager;
    
    
    public void registrarUser(String nombre, String apellidoP, String apellidoM, String negocio, String sexo, String fecha, String correo, String usuario, String pass){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        
        assertNotNull(emf);
        System.out.println("Se creo el entity Manager Factory");
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo el Entity Manager");
        
        entityManager.getTransaction().begin();
        
        Usuario user = new Usuario();
        user.setNombre(nombre);
        user.setApellidoP(apellidoP);
        user.setApellidoM(apellidoM);
        user.setNegocio(negocio);
        user.setSexo(sexo);
        user.setNacimiento(fecha);
        user.setEmail(correo);
        user.setUser(usuario);
        user.setPassword(pass);
        
        entityManager.persist(user);
        
        assertTrue(user.getId() > 0);
        
        //En dado caso se creen mas objetos deben ir antes del commit
        entityManager.getTransaction().commit();
        
        entityManager.close();
        
        assertTrue(!entityManager.isOpen());
        System.out.println("Se cerro la conexion");
    }

}
