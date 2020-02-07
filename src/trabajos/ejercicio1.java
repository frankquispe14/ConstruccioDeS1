/*
 * 1) Imprimir la tabla de multiplicar del número N
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio1 {
    public static void main (String[] args){
    Scanner entrada = new Scanner (System.in);
    int numero,n;
    System.out.println("----TABLA DE MULTIPLICAR----");
    System.out.println("INGRESE EL NUMERO DE LA TABLA");
    numero=entrada.nextInt();
     System.out.println("INGRESE HASTA QUE NUMERO DESES MULTIPLICAR");
    n=entrada.nextInt();
    System.out.println("TABLA DE MULTIPLICAR DEL NUMERO "+numero);
    for(int i=1;i<=n;i++){
    System.out.println( numero +"*" + i +"="+ numero*i);
    }
    }
}   

  