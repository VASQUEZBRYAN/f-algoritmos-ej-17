/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_4_pa;

/**
 *
 * @author Usuario
 */
public class Carrera {
    private String nombre; 
    private String modalidad;
    
    public Carrera(){
        modalidad="Distancia";
    }
    
    public Carrera(String md){
        modalidad=md;
    }
    
    
    public Carrera(String md, String x){
        modalidad=md;
        nombre=x;
    }
    public void set_nombre(String n){
        nombre=n;
    }
    public String get_nombre(){
        return nombre;
    }
    public void set_modalidad(String mod){
        modalidad=mod;
    }
    public String get_modalidad(){
        return modalidad;
    }
    
}
