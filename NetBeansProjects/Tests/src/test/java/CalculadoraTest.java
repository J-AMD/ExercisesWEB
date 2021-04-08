

import org.junit.Test;
import junit.framework.Assert;
import com.generation.tests.Calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Martinez
 */
public class CalculadoraTest {
    
   @Test
    public void probarCalculadora(){
        Calculadora calculadora = new Calculadora(4, 2);
        Assert.assertEquals(6, calculadora.suma());
    }
}
