/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generation.projectmiranchito.servlets;

import com.generation.projectmiranchito.models.Negocio;
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
@WebServlet(name = "ServletRegistrarNegocio", urlPatterns = {"/ServletRegistrarNegocio"})
public class ServletRegistrarNegocio extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        
        String nombre = req.getParameter("nombre");
        String ubicacion = req.getParameter("ubicacion");
        String telefono = req.getParameter("telefono");
        String horario = req.getParameter("horario");
        String correo = req.getParameter("correo");
        String img = req.getParameter("imagen");
        
        registrarNegocio(nombre, ubicacion, telefono, horario, correo, img);
        
        resp.sendRedirect("registroExitoso.jsp");
    }
    
        //////////////////////////////////////////////////Conexion con BD
    public static final String PERSISTENCE_UNIT_NAME = "RanchitoPU";
    private EntityManager entityManager;
    
    
    public void registrarNegocio(String nombre, String ubicacion, String telefono, String horario, String correo, String imagen){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        
        assertNotNull(emf);
        System.out.println("Se creo el entity Manager Factory");
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo el Entity Manager");
        
        entityManager.getTransaction().begin();
        
        Negocio neg = new Negocio();
        neg.setNombre(nombre);
        neg.setTelefono(telefono);
        neg.setHorario(horario);
        neg.setCorreo(correo);
        neg.setImagen(imagen);
        
        entityManager.persist(neg);
        
        assertTrue(neg.getId() > 0);
        
        //En dado caso se creen mas objetos deben ir antes del commit
        entityManager.getTransaction().commit();
        
        entityManager.close();
        
        assertTrue(!entityManager.isOpen());
        System.out.println("Se cerro la conexion");
    }

}
