/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prctico;

import java.text.DecimalFormat;
import java.util.Scanner;

// * Dados 4 numeros enteros obtener el porcentaje de cada
// * uno en funcion a la suma de los numeros ingresados.
 //* @author FRANKLIN
 //*/
public class clase6 {
    private static Object formato;
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //* DecimalFormat formato=new DecimalFormat("###.###");
        int n1, n2, n3, n4,suma, porn1,porn2,porn3,porn4; //variables
   
        System.out.print("Ingrese primer numero a: ");
            n1 = sc.nextInt(); 
        System.out.print("Ingrese primer numero b: ");
            n2= sc.nextInt(); 
        System.out.print("Ingrese primer numero c: ");
            n3 = sc.nextInt();  
        System.out.print("Ingrese primer numero d: ");
            n4 = sc.nextInt();
 
          
            suma = n1 + n2 + n3 + n4;
            
   // System.out.println("porsentaje de "+n1+"de la suma total es"+formato.format((double)n1/(double)suma));
    System.out.println("porsentaje de "+n1+"de la suma total es"+((float)n1*100/(float)suma));
    System.out.println("porsentaje de "+n2+"de la suma total es"+((float)n2*100/(float)suma));
    System.out.println("porsentaje de "+n3+"de la suma total es"+((float)n3*100/(float)suma));
    System.out.println("porsentaje de "+n4+"de la suma total es"+((float)n4*100/(float)suma));
           
            System.out.println();
}
}
