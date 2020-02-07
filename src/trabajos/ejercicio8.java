/*
  8) Al cerrar un expendio(ventas) de naranjas, 15 clientes que aun no han pagado
  recibirán un 15% de descuento si compran mas de 10 kilos. Determinar
  cuanto pagara cada cliente y cuanto percibirá la tienda por esas compras.
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio8 {
     public static void main( String arg[]){          
         
          Scanner entrada=new Scanner(System.in);
          int n;
   float gananciatiend=0,kilnaranjas,total,d,p;
   
   
System.out.println("INGRES EL VALOR DEL KILO DE NARANJAS");
kilnaranjas=entrada.nextFloat();

for(int x=0;x<15;x++){
System.out.println("\nINGRESE LA CANTIDAD DE KILO LLEVADOS");
n=entrada.nextInt();
System.out.println("LA CANTIDAD DE NARANJA EN KILOS ES:"+n+" KG ");
if(n<10){
total=n*kilnaranjas;
System.out.println("\n EL TOTAL ES  \n $ "+total);
gananciatiend=gananciatiend+total;
}
else{
p=n*kilnaranjas;
d=(float)(p*0.15);
total=p-d;
System.out.println("EL TOTAL A PAGAR ES : $"+total);
gananciatiend=gananciatiend+total;
System.out.println("\n\n");
  }
 }
System.out.println("\n\n");
System.out.println("LA LA GANANCIA DE LA TIENDA ES:$"+gananciatiend);
 }
}