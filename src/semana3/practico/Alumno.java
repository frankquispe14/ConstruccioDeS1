/*
 plantear una clase llamada alumno y definircomo atributos su nombre y su edad. 
en el construcctor realizar loa carga de datos. definir otros dos metodos para 
imprimir los datos ingresados y un mensaje si es mayor o no de edad(edad>=18).
 */
package semana3.practico;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */

public class Alumno {
    private String nombre;
    private int edad;
    
 /*   public void cargaDatos() {
        Scanner entrada =new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre=entrada.next();
        System.out.print("Ingrese edad:");
        edad=entrada.nextInt();
    }*/
    
    public void imprimir() {
        System.out.println("NOMBRE:"+nombre);
        System.out.println("EDAD:"+edad);
    }
    
    public void esMayorEdad() {
        if (edad>=18) {
            System.out.print(nombre+" ES MAYOR DE EDAD:");   
        }else{
        System.out.print(nombre+" ES MENOR DE EDAD:");
    }
    }
    public static void main(String[] ar) {
        Persona persona1;
        persona1=new Persona();
        persona1.cargaDatos();
        persona1.imprimir();
        persona1.esMayorEdad();
    }   
}
