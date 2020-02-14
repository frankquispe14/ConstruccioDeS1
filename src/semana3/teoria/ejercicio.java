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
      class workers {
        private String codigo;
        private String nombre;
        private String arealaboral;
        private double sueldo;
        private int extras;
        private String afiliaciones;

       public workers(String codigo, String nombre, String arealaboral, 
               double sueldo, int extras, String afiliaciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.arealaboral = arealaboral;
        this.sueldo = sueldo;
        this.extras = extras;
        this.afiliaciones = afiliaciones;
    }
        
        double montosExtras(){
        return(sueldo*extras)/240;  
      }
      double montoseguro(){
      if(afiliaciones.equals("AFP")){
      return sueldo*0.17;
      
      }else{ 
     return sueldo*0.05;
 }
      }
      double montosalud(){
      return sueldo*0.03;

}
      double montodescuento(){
      return this.montoseguro()+this.montosalud();
      }
      double montosueldobruto(){
        return this.sueldo +this.montosExtras(); 
      }
      
     double sueldoneto(){
      return montosueldobruto()-this.montodescuento();
}
      
    @Override
    public String toString() {
        return "workes{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", arealaboral=" + arealaboral + ", sueldo=" + sueldo + 
                ", extras=" + extras + ", afiliaciones=" + afiliaciones +
                ""+montosExtras()+
                ""+montoseguro()+
                ""+montosalud()+
                ""+montodescuento()+
                ""+montosueldobruto()+
                ""+sueldoneto()+'}';
    }
     
      }

public class ejercicio{
        public static void main(String[] args) {
    String laboral[]={"Sistemas","Administracion","Marketing"};
    String afi[]={"AFP","SNP"};
    workers w1=new workers("01","jose",laboral[aleatorio(0,3)],2000,10,afi[aleatorio(0,2)]);
        //System.out.println(aleatorio(0,3));
        System.out.println(w1.toString());
    }
    static int aleatorio(int min,int max){
        return (int)((Math.random()*(max-min))+min);
    }
    
}
              
    


