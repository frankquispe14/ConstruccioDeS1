/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.practico;

/**
 *
 * @author FRANKLIN
 */

class suma1
{
      private int a, b;
public void asignar(int a1, int b1)
{
	a=a1; 
	b=b1;	
}
public int calcular()
{     
       return(a+b);
}
}

    

class Principal1
{
public static void main(String [ ] ag)
{
     suma1 objr=new suma1();    
     objr.asignar(20,10);
     System.out.println(" suma:" + objr.calcular());
}
}           


