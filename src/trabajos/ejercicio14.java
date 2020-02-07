/*
 14) Un Zoólogo pretende determinar el porcentaje de animales que hay en
     las siguientes tres categorías de edades: de 0 a 1 año, de más de 1 año y
     menos de 3 y de 3 o más años. El zoológico todavía no está seguro del
     animal que va a estudiar. Si se decide por elefantes solo tomara una
     muestra de 20 de ellos; si se decide por las jirafas, tomara 15 muestras, y
     si son chimpancés tomara 40.
 */
package trabajos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 *
 * @author FRANKLIN
 */
public class ejercicio14 {
    
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 
    public static void main(String[] args) throws IOException {
        System.out.println("1.- Elefante");
        System.out.println("2.- Jirafas");
        System.out.println("3.- Chimpances");
        System.out.println("Eliga uno de los 3 Animales:");
        int num = Integer.parseInt(bf.readLine());
        int edad;
        float nino = 0;
        float joven = 0;
        float adulto = 0;
        float rs1;
        float rs2;
        float rs3;
 
        switch (num) {
            case 1:
                System.out.println("Elefantes");
                for (int i = 1; i <= 20; i++) {
                    System.out.println("Edad del Animal Nº" + i + ":");
                    edad = Integer.parseInt(bf.readLine());
 
                    if (edad == 0 || edad == 1) {
                        nino++;
                    } else if (edad > 1 && edad < 3) {
                        joven++;
                    } else if (edad >= 3) {
                        adulto++;
                    }
                }
                rs1=(nino/20)*100 ;
                rs2=(joven/20)*100 ;
                rs3=(adulto/20)*100 ;
                System.out.println("Procentajes de Animales entre 0-1: "+rs1);
                System.out.println("Procentajes de Animales entre 1-3: "+rs2);
                System.out.println("Procentajes de Animales entre 3-a mas: "+rs3);
                break;
            case 2:
                System.out.println("Jirafas");
                for (int i = 1; i <= 15; i++) {
                    System.out.println("Edad del Animal Nº" + i + ":");
                    edad = Integer.parseInt(bf.readLine());
 
                    if (edad == 0 || edad == 1) {
                        nino++;
                    } else if (edad > 1 && edad < 3) {
                        joven++;
                    } else if (edad >= 3) {
                        adulto++;
                    }
                }
                 rs1=(nino/15)*100 ;
                 rs2=(joven/15)*100 ;
                 rs3=(adulto/15)*100 ;
                System.out.println("Procentajes de Animales entre 0-1: "+rs1);
                System.out.println("Procentajes de Animales entre 1-3: "+rs2);
                System.out.println("Procentajes de Animales entre 3-a mas: "+rs3);
                break;
            case 3:
                System.out.println("Chimpances");
                for (int i = 1; i <= 40; i++) {
                    System.out.println("Edad del Animal Nº" + i + ":");
                    edad = Integer.parseInt(bf.readLine());
 
                    if (edad == 0 || edad == 1) {
                        nino++;
                    } else if (edad > 1 && edad < 3) {
                        joven++;
                    } else if (edad >= 3) {
                        adulto++;
                    }
                }
                 rs1=(nino/40)*100 ;
                 rs2=(joven/40)*100 ;
                 rs3=(adulto/40)*100 ;
                System.out.println("Procentajes de Animales entre 0-1: "+rs1);
                System.out.println("Procentajes de Animales entre 1-3: "+rs2);
                System.out.println("Procentajes de Animales entre 3-a mas: "+rs3);
                break;
        }
          
    }
}

