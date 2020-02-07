/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prctico;

import java.util.Scanner;

public class clase5 {
public static void main(String[] args){

    Scanner n= new Scanner(System.in);
    int a,b;
    
    System.out.println("Ingrese el valor de a: ");
    a=n.nextInt();
    System.out.println("Ingrese el valor de b: ");
    b=n.nextInt();
    
    double c;
    
    c=((4*Math.pow(a,2))+(3*b*a)+(Math.pow(b,2)))/((Math.pow(a,2))-(Math.pow(b,2)));
    
    double d;
    
    d=((3*Math.pow(c,2))+a+b)/4;
    
    System.out.println("El valor de c: "+ c +" Y "+"El valor de d: "+d);
   
    }
}