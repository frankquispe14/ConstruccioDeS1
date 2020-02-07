/*
 *implementar las clases: suma, multiplicacion y division 
con los metodos asinar y calculae.Ademas i,plementar los 
objetos en la clse preincipal.
 */
package semana2.practico;

/**
 *
 * @author FRANKLIN
 */
class suma
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


 class multiplicacion1 {
   
      private int a, b;
public void asignar(int a1, int b1)
{
	a=a1; 
	b=b1;	
}
public int calcular()
{     
       return(a*b);
}
}


 class division {
      private int a, b;
public void asignar(int a1, int b1)
{
	a=a1; 
	b=b1;	
}
public int calcular()
{     
       return(a/b);
}
}

      

public class PrincipalSMD {
    
public static void main(String [ ] ag)
{
    multiplicacion1 objr=new multiplicacion1();
     objr.asignar(20,10);
    suma1 objr2=new suma1();     
     objr2.asignar(20,10);
    division objr3=new division();
       objr3.asignar(20,10);
     System.out.println("la multiplicacion:" + objr.calcular());
     System.out.println("          la suma:" + objr2.calcular());
     System.out.println("   la division es:" + objr3.calcular());
}
}           


