/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio16 {
public static void main (String [] args){
Scanner entrada=new Scanner(System.in);
int  votcand1=0, votcand2=0, votcand3=0, votos, total;
System.out.println("INGRESA LA CANTIDAD DE VOTANTES");
votos=entrada.nextInt();
for (int i=0; i<votos ;i++){
int opc=(int)(Math.random()*3+1);
if(opc==1){
votcand1++;
}else 
if(opc==2){
votcand2++;
}
else{
votcand3++;
}
System.out.println("voto #"+(i+1)+"es:"+opc);
}
System.out.println("EL CANDIDATO # 1 OBTUVO:"+votcand1+"  VOTOS");
System.out.println("EL CANDIDATO # 2 OBTUVO:"+votcand2+"  VOTOS");
System.out.println("EL CANDIDATO # 3 OBTUVO:"+votcand3+"  VOTOS");
if(votcand1==votcand2 && votcand2==votcand3){
System.out.println("EMPATE");
}else if (votcand1 > votcand2 && votcand1==votcand3){
System.out.println("EL GANADOR ES # 1\n"+votcand1+"  VOTOS");
}else if (votcand2>votcand1 && votcand2==votcand3){
System.out.println("EL GANADOR ES # 2\n"+votcand2+"  VOTOS");
}else{
System.out.println("EL GANADOR ES # 3\n"+votcand3+"  VOTOS");
}}}   

