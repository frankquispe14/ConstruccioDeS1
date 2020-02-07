/*
13) En una empresa se requiere calcular el salario semanal de cada uno de
   los n obreros que laboran en ella. El salario se obtiene de la siguiente forma: Si
   el obrero trabaja 40 horas o menos se le paga $20 por hora Si trabaja más
   de 40 horas se le paga $20 por cada una de las primeras 40 horas y $25
   por cada hora extra.
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio13 {
 
public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);

int maxHoras = 40;
int pagoxHora = 20;
int pagoxHextra = 25;
int hsTrabajadas = 0;
int sueldo = 0;

System.out.println("INGRESE EL TOTAL DE HORAS TRABAJADAS DURANTE LA SEMANA:");
hsTrabajadas = entrada.nextInt();

if (hsTrabajadas <= maxHoras ) {
 sueldo = hsTrabajadas*pagoxHora;
} else {
 sueldo = (hsTrabajadas-maxHoras )*pagoxHextra+maxHoras *pagoxHora;
 }
System.out.println("EL SALARIO TOTAL ES DE :$"+sueldo);
 }
}
