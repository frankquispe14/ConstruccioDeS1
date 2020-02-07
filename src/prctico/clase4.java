/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prctico;

import java.util.Scanner;

/**
 * en java dada una cantidad de milimetros, expresar 
 * en la maxima cantidad de metros, el resto en centinmetros, 
 * decimetros y milimetros.
 *
 * @author FRANKLIN
 */
public class clase4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int METRO = 1000, DECIMETRO = 100, CENTIMETRO = 10;
         int si,m,dm,cm; 
        System.out.print(" INGRESE CANTIDAD EN MILIMETROS\n");
            si = sc.nextInt(); 
            
            m = si / METRO;
            si = si % METRO;
            dm = si / DECIMETRO;
            si = si % DECIMETRO;
            cm = si / CENTIMETRO;
            si = si % CENTIMETRO;
            
            System.out.println("Cantidad en Metros : " + m);
            System.out.println("Cantidad en Decimetros : " + dm);
            System.out.println("Cantidad en Centimetros : " + cm);
            System.out.println("Cantidad en Milimetros : " + si);
}
}
