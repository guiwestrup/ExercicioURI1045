/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1045;

/**
 *
 * @author gui1_
 */
public class Auxiliar 
{
    public static double[] Ordena(double a[])
    {
        if(a[1]>a[0] && a[1]>a[2])
            {
                double aux = a[0];
                a[0] = a[1];
                a[1] = aux;
            }
            else if (a[2]>a[0] && a[2]>a[1])
            {
                double aux = a[0];
                a[0] = a[2];
                a[2] = aux;
            }
            else if (a[0]<a[2] && a[1]<a[0])
            {
                double aux = a[2];
                a[2] = a[1];
                a[1] = aux;
            }
            else if (a[0]<a[2] && a[0]<a[1])
            {
                double aux = a[2];
                a[2] = a[0];
                a[0] = aux;
            }
        return a;
    }
    public static String Triangulo (double a[])
    {
        String saida = "";
        /*
        if (...) {
          return "";
        } 
        
        // checa angulos
        if (a2 = b2 + c2) {
            // retangulo saida += "\n"
        } else if (a2 > b2 + c2) {        
            //obtusangulo
        } else {
            // acutangulo
        }
        
        if (a == b == c) {
            // equilatero
        } else if ( a == b && b != c || a == c && b != a || b == c && a != b ) {
            // isosceles
        }
        
        return saida; */
        
        if (a[0]>=(a[1]+a[2]))
        {
            
            return saida = "NAO FORMA TRIANGULO";
        }
        
        if((a[0]*a[0]) == ((a[1]*a[1])+(a[2]*a[2])))
        {
            saida += "TRIANGULO RETANGULO \n";
        }
        else if((a[0]*a[0])>((a[1]*a[1])+(a[2]*a[2])))
        {
            saida += "TRIANGULO OBTUSANGULO \n";
        }
        else
        {
            saida += "TRIANGULO ACUTANGULO \n";
        }
        if (a[0]==a[1] && a[0]==a[2])
        {
            return saida += "TRIANGULO EQUILATERO";
        }
        else if (a[0]==a[1] || a[0] == a[2])
        {
            return saida += "TRIANGULO ISOSCELES";
        }
        return saida;
    }
}
