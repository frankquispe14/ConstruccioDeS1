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
public class ejercicio6 {
    public static void main (String [] args){
        Scanner entrada=new Scanner(System.in);    
          double pago=0;
        System.out.println("ingrese la cantidad de horas que trabajo ");   
        int horas=entrada.nextInt();
        System.out.println("ingrese el costo por hora ");
        double costoHora=entrada.nextInt();
        pago=horas*costoHora;
        if(horas>=40){
            pago=pago+(horas-40)*costoHora;
        }
        if(horas>48){
            pago =pago+(horas-48)*costoHora;
        }
        System.out.println("pago "+pago);
       
    }

}
