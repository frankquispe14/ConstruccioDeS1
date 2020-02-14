/*
 *Realice  un  algoritmo  para  resolver  el  siguiente  problema: 
una  fábrica  de  pantalones  desea calcular  cuál  es  el  precio
final  de venta  y  cuánto  ganará  por  los  N  pantalones  que  
produzca con el corte de alguno de sus modelos, para esto se cuenta 
con la siguiente información:a) Tiene dos modelos A y B, tallas 30, 
32 y 36 para ambos modelos.b) Para el modelo A se utiliza 1.50 m de 
tela, y para el B 1.80 m.c) Al modelo A se le carga 80 % del costo de
la tela, por mano de obra. Al modelo B se le carga 95 % del costo de
la tela, por el mismo concepto.
 */
package semana2.practico;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN
 */
public class ejercicio3 {

    private int Npantalones;
    private int modelo;
    private int talla;
    private double metrosTela;
    private double precioFinal;
    private double cargoTalla;
    private double costoTela;
    private double manoObra;
    private double gananciaExtra;
    private double ganancia;

Scanner entrada=new Scanner(System.in);
    public ejercicio3() {
       this.ganancia=0; 
    }
public void PrecioFinalVentaInsisoA(){
       ganancia=0;
       System.out.println("ingrese la cantidad de N pantalones a producir");  
       Npantalones=entrada.nextInt();
       System.out.println("ingrese el valor por metro de tela");
       double PrecioMetro=entrada.nextDouble();
       System.out.println("ingrese el modelo 1=A o 2=B");
       do{
           
       modelo=entrada.nextInt();
       
       if(modelo!=1||modelo!=2)
                 
           System.out.println("ingrese nuevamente");
       
       }while(modelo!=1||modelo!=2);
           
       System.out.println("talla 1=30 2=32 3=36");
       talla=entrada.nextInt();
       
      
        do {
            talla = entrada.nextInt();
            if (talla<1||talla>3)
                System.out.print("Valor incorrecto Ingrese nuevamente ");
        } while (talla<1||talla>3);
        
        if(modelo==1){
            metrosTela=1.5*Npantalones;
            costoTela=metrosTela*PrecioMetro;
            manoObra=costoTela*0.8;
            

        }else if(modelo==2){
            metrosTela=1.8*Npantalones;
            costoTela=metrosTela*PrecioMetro;
                        manoObra=costoTela*0.95;

        }
        if(talla==2||talla==3){
            cargoTalla=manoObra*0.04;
            gananciaExtra=(costoTela+manoObra+cargoTalla)*0.3;
                    precioFinal=costoTela+manoObra+cargoTalla+gananciaExtra;
        ganancia=cargoTalla+gananciaExtra;

        }else if(talla==1){
            cargoTalla=manoObra*0;
            gananciaExtra=(costoTela+manoObra+cargoTalla)*0.3;
            precioFinal=costoTela+manoObra+cargoTalla+gananciaExtra;
        ganancia=cargoTalla+gananciaExtra;
        }
            
        
        
        System.out.println("Valor de cargo por talla: " + cargoTalla);
        System.out.println("Valor de costo de la tela: " + costoTela);
        System.out.println("Valor de ganancia: " + ganancia);
        System.out.println("Valor de ganancia extra: " + gananciaExtra);
        System.out.println("Valor de mano de obra: " + manoObra);
        System.out.println("Valor de metros de tela: " + PrecioMetro);
        System.out.println("Valor de precio final: " + precioFinal);
    }

}
