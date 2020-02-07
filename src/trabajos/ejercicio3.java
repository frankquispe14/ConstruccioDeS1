/*
 3)Calcular el promedio de edades de hombres, mujeres y de todo un grupo
de alumnos.
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio3 {

 public static void main (String args[]) {
        Scanner entrada = new Scanner (System.in);
      double promeHombres = 0.0, promeMujeres = 0.0, promegeneral = 0.0;
        int alumnos, hombres = 0, mujeres = 0;  
        String suma;
        System.out.println ("INGRESAR LA CANTIDAD DE ALUMNOS");
        alumnos = entrada.nextInt();
        for (int i=0; i<alumnos; i++) {

            System.out.println ("Sexo m/f?");
            suma = entrada.next();
            System.out.println ("Ingresa edad");
            
            if (suma.equals("m")) {
                promeHombres= promeHombres + entrada.nextDouble();
               hombres++;
            }
            if (suma.equals("f")) {
                promeMujeres = promeMujeres + entrada.nextDouble();
                mujeres++;
            }  }

        promegeneral = (promeHombres + promeMujeres) / alumnos;
        promeHombres = promeHombres / hombres;                     
        promeMujeres = promeMujeres / mujeres;                   
        System.out.println ("Promedio hombres " + promeHombres);
        System.out.println ("Promedio mujeres " +promeMujeres);
        System.out.println ("Promedio grupo " + promegeneral);

  }}

