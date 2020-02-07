/*
10)Determinar cuántos hombres y cuantas mujeres se encuentran en un
   grupo de n personas, suponiendo que los datos son extraídos alumno por
   alumno.
 */
package trabajos;

import java.util.Scanner; 
/**
 *
 * @author FRANKLIN
 */
public class ejercicio10 {
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
     int numero, mujer=0, varon=0; 
     int sexo; 
    
    System.out.println("INGRESE EL NUMERO DE ALUMNOS: "); 
    numero = entrada.nextInt();
    for (int i=1; i<=numero;i++){
    System.out.println("SI ES VARON INGRESE EL #: 0  Y SI ES MUJER INGRESE EL #: 1 ");
    sexo = entrada.nextInt();
    if (sexo == 1){
        mujer++;
    } else 
           
       varon++; }
    System.out.println("El número de mujeres es "+mujer);
    System.out.println("El número de varones es "+varon);
} }
