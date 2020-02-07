/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prctico;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class clase2 {


    
    public static void main (String[] args) {
    Scanner entrada  = new Scanner (System.in);
    float num1,num2,suma;
    System.out.println("INGRESE NUMERO1");
    num1=entrada.nextFloat();
    System.out.println("INGRESE NUMERO2");
    num2=entrada.nextFloat();
    
    suma=num1+num2;
    
    System.out.println("la suma es:"+suma);
    }
    
}
