/*
 9) En un centro de verificación de automóviles se desea saber el promedio
  de puntos contaminantes de los primeros 25 automóviles que lleguen.
  Asimismo se desea saber los puntos contaminantes del carro que menos
  contamino y del que más contamino.
 */
package trabajos;
   import java.util.Scanner;
/**
 *
 * @author FRANKLIN
 */
public class ejercicio9 {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in); 
      int n, puntosc,
       sum=0, max, min; 
      System.out.print("INGRESE EL NUMERO DE AUTOS QUE LLEGARON A INGRESAR: "); 
      n =entrada.nextInt();
System.out.print("INGRESE EL PUNTO CONTAMINANTE DEL PRIMER AUTOMOVIL: "); 
puntosc =entrada.nextInt(); 
max = puntosc; min = puntosc;
int primerauto = puntosc;
for (int i=2; i<=n;i++){ 
    System.out.print("INGRESE LOS PUNTOS CONTAMINANTE DEL SIGUIENTE AUTOMOVIL: "); 
    puntosc =entrada.nextInt(); 
    if (puntosc>=max){ max = puntosc;} 
    if (puntosc<=min){ min = puntosc;}
    sum= sum+puntosc;
} 
int suma = primerauto+sum; 
System.out.println("EL PROMEDIO DE LOS PUNTOS CONTAMINANTES DE LOS: "+ n+" "
        + "AUTOS QUE INGRESARON ES DE "+(Math.round(suma/n))); 
System.out.println("EL AUTO QUE MENOS PUNTOS CONTAMINANTES FUE:"+min); 
System.out.print("EL AUTO QUE MAS PUNTOS CONTAMINANTES FUE:"+max);
System.out.print("\n");
   } 
}
