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
public class ejercicio7 {

        public static void main (String [] args){
        double descuento, descuentosCategoria_1, descuentosCategoria_2, descuentosCategoria_3, descuentosCategoria_4;
        double descuentosCategoria_5, edad, precioUnico;
        String tecla_repetir;
        descuentosCategoria_1 = 0;
        descuentosCategoria_2 = 0;
        descuentosCategoria_3 = 0;
        descuentosCategoria_4 = 0;
        descuentosCategoria_5 = 0;
        
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese el precio unico en los asientos : ");
        precioUnico = entrada.nextDouble();
      
        do {
            System.out.print("Ingrese la edad: ");
            edad = entrada.nextDouble();
            descuento=0;
            if(edad<5)
                System.out.println("No puede entrar al teatro");
            if(edad>=5&&edad<15)
            {
                descuento=precioUnico*0.35;
                descuentosCategoria_1=descuentosCategoria_1+descuento;
            }
            if(edad>=15&&edad<20)
            {
                descuento=precioUnico*0.25;
                descuentosCategoria_2=descuentosCategoria_2+descuento;
            }
            if(edad>=20&&edad<46)
            {
                descuento=precioUnico*0.1;
                descuentosCategoria_3=descuentosCategoria_3+descuento;
            }
            if(edad>=46&&edad<66)
            {
                descuento=precioUnico*0.25;
                descuentosCategoria_4=descuentosCategoria_4+descuento;
            }
            if(edad>=66)
            {
                descuento=precioUnico*0.35;
                descuentosCategoria_5=descuentosCategoria_5+descuento;
            }
            System.out.println("Valor de descuento: " + descuento);
            System.out.println();
            
            
           
        } while (edad!=-1);
        System.out.println("Valor de descuentos por categoria 1: " + descuentosCategoria_1);
        System.out.println("Valor de descuentos por categoria 2: " + descuentosCategoria_2);
        System.out.println("Valor de descuentos por categoria 3: " + descuentosCategoria_3);
        System.out.println("Valor de descuentos por categoria 4: " + descuentosCategoria_4);
        System.out.println("Valor de descuentos por categoria 5: " + descuentosCategoria_5);
    }

}
 
