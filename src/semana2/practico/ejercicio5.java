/*
 Dado N y X calcular: x1/1+x3/3+x5/5+...........+x(2N)-1?;
 */
package semana2.practico;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio5 {
    public static void main(String []args){
    Scanner entrada=new Scanner(System.in);
    
    
   int i,n;
        System.out.println("N");
        n=entrada.nextInt();
       
    i=1;
    while(1<=2*n){
        if(i%2==0){
            System.out.println(".."+i);
        }
        i=i+1;
    } 
 
}
}

