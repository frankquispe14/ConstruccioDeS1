/*
 15) Los surtidores de una gasolinera registran las ventas por galones, pero
   el precio de la gasolina está fijada en litros. El programa debe calcular lo
   que los clientes deben pagar y el total recaudado por la gasolinera,
   tomando en cuenta lo siguiente:
   • Cada galón tiene 3,785 litros
   • El precio del litro es para el Tipo A 50 Soles, para el Tipo B 55 Soles y para
   el Tipo C 60 Soles.

  • El programa finaliza cuando se introduce una D como tipo de gasolina.
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio15 {
    public static void main(String[] args) {
    // TODO code application logic here
 
    double pagar=0;
    double total=0.0;
    String opcion="";
    double precio=0.0;
   int  galones=0;
   Scanner br=new Scanner(System.in);
    do {
        System.out.println("Tipo    Precio\n"
                          + "A       19,71\n"
                          + "B       17,06\n"
                          + "C       12,51\n"
                          + "D        0,0 \n ");
         System.out.println("Ingrese Tipo de gasolina");
         opcion=br.next();
        System.out.println("Ingrese cantidad de galones");
        galones=br.nextInt();
 
         precio=valor(galones,opcion);
         total+=precio;
         System.out.println("");
         if(precio!=0){
         System.out.println("usted debe pagar " + precio);
         }
 
    } while ( !opcion.equals("D"));
    System.out.println("Total de caja " + total);
}
private static double valor(int galones, String opcion) {
    double f=0.0;
    switch(opcion){
        case "A":
            f= 19.71*galones;
            break;
        case "B":
            f=17.06*galones;
            break;
         case "C":
             f=12.51*galones;
            break;
         default:
             System.out.println("Ingrese solo mayusculas desde la A hasta la C");
             break;
    }
    return f;
}
}
