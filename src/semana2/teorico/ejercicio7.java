/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.teorico;

import java.util.ArrayList;

/**
 *
 * @author FRANKLIN
 */
class numeros{
int x=10;
void setx(int a ){
    this.x=a;
}
int getx(){
return this.x;
}
}

public class ejercicio7 {
    public static void main(String[] args){
       numeros num=new numeros(); 
     ArrayList lista=new ArrayList();
     incrementar (num);
       System.out.println(num.getx());
    }
    static void incrementar(numeros a){
    a.setx(30);
    }
        
}
