/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias4;

/**
 *
 * @author Usuario
 */
public class Asignatura {
    private String nombre;
    private String tipo; 
    private double costo;
    
    //constructores

    public Asignatura(String n, String t, double c) {
        establecer_nombre(n);
        establecer_tipo(t);
        establecer_costo(c);
    }
    
    
    
    public void establecer_nombre(String n){
        nombre=n;
    }
    public String obtener_nombre(){
        return nombre;
    }
    public void establecer_tipo(String t){
        tipo=t;
    }
    public String obtener_tipo(){
        return tipo;
    }
    public void establecer_costo(double c){
        costo=c;
    }
    public double obtener_costo(){
        return costo;
    }
    // to estring 
    
    @Override
    public String toString(){
        String cadena=String.format("%s\n"
        +"%s\n"
         +"%f",obtener_nombre(),obtener_tipo(),obtener_costo());
        return cadena;
    }
}
