/*
 12) En un supermercado un cajero captura los precios de los artículos que
    los clientes compran e indica a cada cliente cual es el monto de lo que
    deben pagar. Al final del día le indica a su supervisor cuanto fue lo que
    cobro en total a todos los clientes que pasaron por su caja.
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio12 {
     public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
     float sumproducto=0,sumdia=0,opc,prodcomp,valorprodc; 
       do{
               System.out.println("INGRESE 1 SI COMPRO ARTICULO O 2 PARA SALIR:");
         opc = sc.nextInt();
          if(opc==1){
                     
              System.out.println("INGRESE LA CANTIDAD DE PRODUCTOS COMPRADOS:");
               prodcomp = sc.nextInt();
            for(int x=0;x<prodcomp;x++){

                System.out.println("INGRESE EL VALOR DEL PRODUCTOS COMPRADOS:");
                    valorprodc = sc.nextInt();
                System.out.println("EL VALORDEL PRODUCTOES:$"+valorprodc);
                    sumproducto=sumproducto+valorprodc;
                System.out.println("\n");
                   }
              System.out.println("EL MONTO A PAGAR DEL  PRODUCTOS ES $:"+sumproducto);
                  sumdia=sumdia+sumproducto;
                    sumproducto=0;
              System.out.println("\n");
               }
              }
           while(opc==1);
          System.out.println("\n REPORTE DEL DIA ES :$"+sumdia);
         }
}
