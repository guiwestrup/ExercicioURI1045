/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1045;

import java.util.Scanner;

public class Exercicio1045 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        
        System.out.println("Entre com o primeiro lado");
        a = input.nextDouble();
        System.out.println("Entre com o segundo lado");
        b = input.nextDouble();
        System.out.println("Entre com o terceiro lado");
        c = input.nextDouble();
        if(b>a && b>c)
        {
            double aux = a;
            a = b;
            b = aux;
        }
        else if (c>a && c>b)
        {
            double aux = a;
            a = c;
            c = aux;
        }
        else if (b<c && b<a)
        {
            double aux = c;
            c = b;
            b = aux;
        }
        else if (a<c && a<b)
        {
            double aux = c;
            c = a;
            a = aux;
        }
        System.out.println("Ordem: "+a+" "+b+" "+c);
        if (a>=(b+c))
        {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if((a*a) == ((b*b)+(c*c)))
        {
            System.out.println("TRIANGULO RETANGULO");
            if (a==b && a==c)
            {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (a==b || a == c)
            {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        else if((a*a)>((b*b)+(c*c)))
        {
            System.out.println("TRIANGULO OBTUSANGULO");
            if (a==b && a==c)
            {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (a==b || a == c || b==c )
            {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        else if ((a*a)<((b*b)+(c*c)))
        {
            System.out.println("TRIANGULO ACUTANGULO");
            if (a==b && a==c)
            {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (a==b || a == c)
            {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        
    }
    
}
