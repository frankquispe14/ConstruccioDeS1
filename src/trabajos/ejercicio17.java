/*
 * Un negocio de copias tiene un limite de producción diaria de 10 000 copias si el tipo de impresión es offset y de 50
   000 si el tipo es estándar. Si hay una solicitud de un el empleado tiene que verificar que las copias pendientes hasta el
   momento y las copias solicitadas no excedan del limite de producción. Si el limite de producción se excediera el trabajo
   solicitado no podría ser aceptado. El empleado necesita llevar un buen control de las copias solicitadas hasta el
   momento para decidir en forma rápida si los trabajos que se soliciten en el día se deben aceptar o no.
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio17 {
  public static void main(String []args){
  int numEmp,valHrs,numHrs,totalPagar=0;
  Scanner entrada= new Scanner(System.in);
  System.out.println("INGRESE EL NUMERO DE EMPLEADOS:");
  numEmp=entrada.nextInt();
  int i=1;
  while(i<=numEmp);
  System.out.println("INGRES EL NUMERO DE HORAS");
  valHrs=entrada.nextInt();
  System.out.println("INGRESE EL NUMERO DE HORAS");
  numHrs=entrada.nextInt();
  if(numHrs<=40){
  totalPagar=valHrs*numHrs;
  }
  else 
      if(numHrs<=48){
      totalPagar=(valHrs*40)+ (numHrs -40)*(valHrs*2);
          }
  else
       if(numHrs>48){
         totalPagar=(valHrs*40)+ (valHrs*2*8)+(numHrs-48)*(valHrs*3);
          }
  System.out.println("EL TOTAL A PAGAR ES"+totalPagar);
  i=+1;
  }
  }
  
 

