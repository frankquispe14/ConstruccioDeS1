/*
 *construya un aplicativo que manipule un arreglo de objetos de la clase persona y que muetre la siguiente informacion:
a)Nombre delempleado que tenga el mayorsueldo neto.
b)promedio del sueldo neto del area de marketing
///falata  c)Numero de empleados cuyo monto de seguro superen lo 100 soles
           d)numero de empleados del arera de sistemas cuyo monto de horas estan entre 500 y 800 soles.
           e)empleado del snp con el menor monto de descuento.
           f)total que gasta en pagar a todos tus empleados. .
 */
package ejercicio2;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author FRANKLIN
 */

class worker{
    private String codigo;
    private String nombre;
    private String areaLaboral;
    private double sueldo;
    private int hextras;
    private String afilacion;
    

    public worker(String codigo, String nombre, String areaLaboral, double sueldo, int hextras, String afilacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaLaboral = areaLaboral;
        this.sueldo = sueldo;
        this.hextras = hextras;
        this.afilacion = afilacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAreaLaboral() {
        return areaLaboral;
    }
    
    double montoHextras(){
        return (sueldo*hextras)/240;
    }
    double montoseguro(){
        if(afilacion.equals("AFP")){
            return sueldo*0.17;
        }else{
            return sueldo*0.05;
        }
    }
    double montoessalud(){
        return sueldo*0.03;
    }
    double montosdescuento(){
        return this.montoseguro()+this.montoessalud();
    }
    double montosueldobruto(){
        return this.sueldo+this.montoHextras();
    }
    double sueldoneto(){
        return this.montosueldobruto()-this.montosdescuento();
    }
    String laboral[]={"Sistemas","Administracion","Marketing"};
    String afi[]={"AFP","SNP"};

    @Override
    public String toString() {
        return  "worker{" + "\ncodigo=" + codigo + "\nnombre=" + nombre + "\nareaLaboral=" + areaLaboral + "\nsueldo=" + sueldo + "\nhextras=" + hextras + "\nafilacion=" + afilacion 
                + "\nMONTO EXTRA " + montoHextras()
                + "\nMONTO SEGURO " + montoseguro()
                + "\nMONTO ESSALUD " + montoessalud()
                + "\nMONTO DESCUENTO " + montosdescuento()
                + "\nMONTO SUELDO  BRUTO " + montosueldobruto()
                + "\nMONTO SUELDO NETO " + sueldoneto() + "\n";
    }
        
}
class person implements Iterable<worker>{
    ArrayList<worker> list= new ArrayList<>();
    void add(worker p1){
        list.add(p1);
    }
    String NombreEmpSueldo(){ 
        String cad="";
        double sueldotemp=0.0;
        for(worker w:list){
            if(w.sueldoneto()>=sueldotemp){
                sueldotemp =w.sueldoneto();
//                cad=w.getNombre();
            }
        }
        for(worker w:list){
            if(w.sueldoneto()== sueldotemp){
                cad+=w.getNombre()+" ";
            }
        }
        return cad;
    }
    double sueldoNetoAreas(String area){
         double acu=0;
         for(worker w:list){
            if(w.getAreaLaboral()== area){
                acu+=w.sueldoneto();
            }
        }
         return acu;
    }
    @Override
    public Iterator iterator(){
        return list.iterator();
    }
}
public class ejemplo08 {
    public static void main(String[] args){
        String laboral[]={"Sistemas","Administracion","Marketing"};
        String afi[]={"AFP","SNP"};
        DecimalFormat dt=new DecimalFormat("#.##");
        person list=new person();
        worker w1=new worker("1","Jose",laboral[aleatorio(0,3)],2000,10,afi[aleatorio(0,2)]);
        worker w2=new worker("2","Mario",laboral[aleatorio(0,3)],2100,10,afi[aleatorio(0,2)]);
        worker w3=new worker("3","Antonio",laboral[aleatorio(0,3)],2200,10,afi[aleatorio(0,2)]);
        worker w4=new worker("4","Miguel",laboral[aleatorio(0,3)],2300,10,afi[aleatorio(0,2)]);
        worker w5=new worker("5","Pablo",laboral[aleatorio(0,3)],1500,10,afi[aleatorio(0,2)]);
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);
        for(worker w:list){
            System.out.println(w.toString());
        }
        System.out.println("Empleado que tiene mayor sueldo neto: "+list.NombreEmpSueldo());
        System.out.println("Sueldo neto de marketing: "+dt.format(list.sueldoNetoAreas("Marketing")));
    }
    static int aleatorio(int min,int max){
        return (int)(Math.random()*(max-min)+min);
    }
}

