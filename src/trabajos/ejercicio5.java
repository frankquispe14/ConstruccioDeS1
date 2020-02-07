/*
 5) Encontrar el menor valor de un conjunto de n números dados.
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */

public class ejercicio5 {
     public static void main( String arg[]){          
         
          Scanner entrada=new Scanner(System.in);
          int N,numero,acum=0;

          System.out.println("CUANTOS NUMEROS DESEAS INGRESAR?");
            N=entrada.nextInt();

          System.out.println("INGRESE NUMERO:");

            for(int i=0;i<N;i++)
               {  
                numero=entrada.nextInt();
              if(acum==0) { acum=numero; }
                 else{ 
                   if(numero<acum){ 
                      acum=numero;
                   }  
              }
           }
System.out.println("EL NUMERO MENOR ES:"+" "+acum);                   
   }
  }
