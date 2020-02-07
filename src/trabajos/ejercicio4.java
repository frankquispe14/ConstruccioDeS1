/*
 4) Obtener el promedio de calificaciones de un grupo de n alumnos.
 */
package trabajos;

import java.util.*;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio4 {
 public static void main(String[] args) {
        int numero,suma=0,acum;
        double promedio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE ALUMNOS:");
        numero=entrada.nextInt();
   
        for(int i=1;i<=numero;i++)
        { 
         System.out.println("CALIFICACION DE ALUMNO "+i+"=");
         acum=entrada.nextInt();
         suma=suma+acum;                
        }   
        promedio=suma/numero;
        
         System.out.println("EL PROMEDIO ES:" +promedio);                               
    }   
}