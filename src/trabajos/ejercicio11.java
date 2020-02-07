/*
   11) Una persona desea invertir su dinero en un banco, el cual le otorga un
    2% de interés. Cuál será la cantidad de dinero que esta persona tendrá al
    cabo de un año si la ganancia de cada mes es reinvertida?
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio11{
    
public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in); 
     int dinero,mes = 1;
      
      System.out.print("INGRESE LA CANTIDAD DE DINERO A INVERTIR:\n  "); 
      dinero =entrada.nextInt();

      while (mes<=12) {
      dinero = (int)(dinero * 1.02);
       mes++;
     }
  System.out.println("LA CANTIDAD DE DINERO AL AÑO SERA DE :\n $ "+dinero);
}
}
    
