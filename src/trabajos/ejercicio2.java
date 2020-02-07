/*
2) Un número primo es una cantidad entera positiva únicamente divisible
por uno o por sí mismo. Calcular y tabular los n primeros números primos.
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio2 {
    public static void main(String[] args){
    Scanner entrada= new Scanner(System.in);
      int numero,i,n=4,cont=2;
        String cad="";
        System.out.println("---NUMEROS PRIMOS----");
        System.out.println("INGRESE LA CANTIDAD DE NUMEROS PRIMOS QUE DESES MOSTRAR");
        numero=entrada.nextInt();
        if(numero>2){
            cad="- 2 - 3";
            while(cont<numero){
                i=2;
                while(i<=n){
                    if(i==n){
                    cad=cad+" - "+n;
                    cont=cont+1;
                    }else{
                    if(n % i==0){
                    i=n;
                    }
                    }
                    i=i+1;
                }
                n=n+1;
            }
            System.out.println(cad);
      
        }        
     }
}