/*
6) Encontrar el mayor valor de un conjunto de n números datos.
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio6 {
    
     public static void main( String arg[]){          
         
          Scanner entrada=new Scanner(System.in);
          int N,numero,aux=0;

          System.out.println("CUANTOS NUMEROS DESEAS INGRESAR?");
            N=entrada.nextInt();

          System.out.println("INGRESE NUMERO:");

            for(int i=0;i<N;i++)
               {  
                numero=entrada.nextInt();
              if(aux==0) { aux=numero; }
                 else{ 
                   if(numero>aux){ 
                      aux=numero;
                   }  
              }
           }
System.out.println("EL NUMERO MAYOR ES:"+" "+aux);                   
   }
  }


