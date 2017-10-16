/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import exercicio1045.Exercicio1045;
import org.junit.Assert;
/**
 *
 * @author gui1_
 */
public class Teste1045 
{
    
    public Teste1045() 
    {
    }
    @Test
    public void Testar()
    {
        double[] num = {6,6,6};
        
        double[] esperado = {-14, 7, 21};
        
        Assert.assertArrayEquals("Deu errado", esperado, Ordena.ordena(num));
        int[] num2 = {-14,21,7};
        Assert.assertArrayEquals("Deu errado", esperado, Ordena.ordena(num2));
    }
}
