
import com.sun.security.ntlm.Client;
import java.awt.PageAttributes.MediaType;
import java.awt.event.InvocationEvent;
import javax.xml.ws.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Martinez
 */
public class TestClasREST {
    
    public static final BASE_URL = "http://localhost8080/CanastaWS/api/canasta";
    public static void main(String[] args){
        
        Client client = ClienteBuilder.newClient();
        WebTarget target = client.target(BASE_URL);
        
        //Preparar peticion
        InvocationEvent.Builder builder = target.request(MediaType.APPLICATION_JSON);
        
         //Indicar el tipo de peticion la respuesta del servidor
        Response response = builder.get();
        System.out.println("Texto codigo repuesta "+ response.getStatusInfo());
        System.out.println("Respuesta "+ response.readEntity(String.class));
    }
    
    public static void crearRecurso(String action){
        
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(BASE_URL).path(action);
        
        Form form = new Form();
        form.param("nombre", "Granada");
        form.param("color", "Rojo");
        form.param("peso", "20.5");
        form.param("precio", "10");
        
        Invocation.Builder invocationBuilder = target.post(Entity.entity(form, MediaType.APPLICATION_JSON));
        
        Response response = invocationBuilder
    }
}
