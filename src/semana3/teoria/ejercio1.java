/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3.teoria;

/**
 *
 * @author FRANKLIN
 */
interface padre{
 // constante de la variable
   int CAD=14;
    //metos abstractos: esos metodos no an sido creados solo nombrados
    void dormir();
    int comer();
    int comer(int a );   // metodo con argumento
    int comer(int p, float y );
    
}

abstract class canino{
     abstract void comer();
     abstract void dormir();
      abstract void caminar();
 }
abstract class perro extends canino{
      @Override
      void comer(){}
      @Override
      void dormir(){}
      void ccaminar(){}
  
}
//se crea classes abstractas para comportarse como super clasees
abstract public class ejercio1 {
   public static void main(String [] args){
       canino p1=new canino();
   }
}