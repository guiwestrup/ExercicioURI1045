/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1045;

import static exercicio1045.Auxiliar.Triangulo;
import static exercicio1045.Auxiliar.Ordena;
import java.util.Scanner;

public class Exercicio1045 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double[] a = new double[3];
        
        System.out.println("Entre com o primeiro lado");
        a[0] = input.nextDouble();
        System.out.println("Entre com o segundo lado");
        a[1] = input.nextDouble();
        System.out.println("Entre com o terceiro lado");
        a[2] = input.nextDouble();
        Ordena(a);
        imprime(Triangulo(a));
        
    }
    
    private static void imprime(String saida)
    {
        System.out.println(saida);
    }
}
