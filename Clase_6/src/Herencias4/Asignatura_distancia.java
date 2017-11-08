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
public class Asignatura_distancia extends Asignatura {
    private int numero_creditos;
    public Asignatura_distancia(String n, String t, double c,int cr){
        super("Programacion","Comun",300);
        establecer_numero_creditos(cr);
        
    }
    public void establecer_numero_creditos(int c){
        numero_creditos=c;
    }
    public int obtener_numero_creditos(){
        return numero_creditos;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("Asignatura distancia\n"
        +"%s\n"
         +"numero de horas%d",super.toString(),obtener_numero_creditos());
        return cadena;
    }
}
