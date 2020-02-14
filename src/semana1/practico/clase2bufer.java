/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.practico;
import java.io.*;


/**
 *
 * @author FRANKLIN
 */
public class clase2bufer {

  
    public static void main(String[] args) throws IOException
    {
        //Notar que readLine() nos obliga a declarar IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
    int s1,s2,suma;
          System.out.print("ingrese el primer numero a sumar  :\n");
          s1 = Integer.parseInt(br.readLine());
         System.out.print("ingrese el segundo numero a sumar :\n ");
          s2 = Integer.parseInt(br.readLine());
          suma=s1+s2;
         System.out.println ("La suma es:  " + suma);
        
    }
} 

