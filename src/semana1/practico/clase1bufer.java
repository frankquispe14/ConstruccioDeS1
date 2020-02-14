/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1.practico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author FRANKLIN
 */
public class clase1bufer {

    public static void main(String[] args) throws IOException
    {
        //Notar que readLine() nos obliga a declarar IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"

        System.out.println("Por favor ingrese su nombre");//Se pide un dato al usuario

        String nombre = br.readLine(); //Se lee el nombre con readLine() que retorna un String con el dato

        
        System.out.println("HOLA " + nombre+ " TE DAMOS LA BIENVENIDA");
         System.out.println();
    }
}  

