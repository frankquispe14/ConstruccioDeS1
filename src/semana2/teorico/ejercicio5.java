/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.teorico;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio5 {
 public static void main(String[] args)throws Exception {
     System.out.println("ingresar nombre");
     String cad=lectura();
     
}
static String lectura()throws Exception {
    String cad="";
BufferedReader br=new BufferedReader (
        new InputStreamReader(System.in));
     cad=br.readLine();
     return cad;
}

}
