/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prctico;

import java.util.Scanner;

/**
 * crear clase principal que permita el ingreso de un numero entero
 * y determinar la suma de sus digitos
-  ---num=123, sum=6
 *
 * @author FRANKLIN
 */
public class clase3 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,RESTO=0;
        System.out.print(" INGRESE EL NUMERO ENTERO:\n");
            N = sc.nextInt();   
            while(N>0){
            RESTO=RESTO+N%10;
            N=N/10;          
    }
            System.out.print(" LA SUMA ES *" + RESTO +"*" );
    }
}

       
