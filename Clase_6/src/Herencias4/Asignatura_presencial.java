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
public class Asignatura_presencial extends Asignatura {
    private int numero_horas;
    //constructor
    public Asignatura_presencial(String n, String t, double c,int h){
        super("Programacion","Comun",100);
        establecer_numero_horas(h);
        
    }
    public void establecer_numero_horas(int h){
        numero_horas=h;
    }
    public int obtener_numero_horas(){
        return numero_horas;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("Asignatura presencial\n"
        +"%s\n"
         +"numero de horas %d",super.toString(),obtener_numero_horas());
        return cadena;
    }
}
