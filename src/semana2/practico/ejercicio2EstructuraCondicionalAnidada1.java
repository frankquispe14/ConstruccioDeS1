/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.practico;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio2EstructuraCondicionalAnidada1 {
  
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nota1,nota2,nota3;
        System.out.println("ingrese nota 1");
        nota1=entrada.nextInt();
        System.out.println("ingrese nota 2");
        nota2=entrada.nextInt();
        System.out.println("ingrese nota 3");
        nota3=entrada.nextInt();
        int promedio=(nota1+nota2+nota3)/3;
        System.out.println(promedio);
        ejercicio2EstructuraCondicionalAnidada1  t=new ejercicio2EstructuraCondicionalAnidada1();
        t.mensaje(promedio);
    }
    public void mensaje(int prom){
        
        if(prom>=13){
            System.out.println("promocionado");
            
        } else { if(prom>=11){
                System.out.println("regular");
                }else {
                            System.out.println("reprobado");
                    }
            
        }
                  
    }
    
    }
  
