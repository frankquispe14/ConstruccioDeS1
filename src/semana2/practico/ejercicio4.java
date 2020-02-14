/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.practico;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio4 {
    public static void main(String [] args){
Scanner entrada=new Scanner(System.in);    

  int suma,f,valor,promedio,cont=0;
   suma=0;
   do{
    System.out.println("ingrese valor");
    valor=entrada.nextInt();
    cont++;
    suma=suma+valor;
    
    System.out.println("la suma es"+suma);
      promedio=suma/cont;
    System.out.println("promedio "+promedio);
     }
   while(valor!=-1);
      }
}

