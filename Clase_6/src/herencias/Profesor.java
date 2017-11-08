/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona {
    private double sueldo;
    
    public Profesor(){
        super("bryan","vasquez",22);
        setSueldo(200.2);
    }
    public void setEdad(int e){
        if(e<30){
            edad=30;
        }else{
            edad=e;
        }
    }
    public Profesor(double suel){
        super("bryan","vasquez",27);
        setSueldo(suel);
    }
    
    public Profesor(String n, String a,  int e, double suel){
        super(n, a, e);
        setSueldo(suel);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double suel) {
        sueldo = suel;
    }
    
}
