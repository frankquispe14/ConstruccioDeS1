/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2.teorico;

/**
 *
 * @author FRANKLIN
 */

class daddy{
void carrera (){
System.out.println("MEDICINA");
}
void univercidad(){
System.out.println("UNAS");
}
//final void deporte(){  no se puede instanciar)
 void deporte(){

System.out.println("FUTBOL");
}

}
class son extends daddy{


@Override
        void carrera(){
        System.out.println("sistemas");
        }
@Override
void deporte(){
System.out.println("basquet");

}

}
        
public class ejercicio6 {
    
}
