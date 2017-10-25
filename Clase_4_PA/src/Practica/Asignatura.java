/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;


public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    
 public Asignatura (Carrera nom){
     carrera=nom;
     nombre="informatica";
     creditos=5;
 }
    public void Establecer_nombre(String n){
     nombre=n;
 }
 public String Obtener_nombre(){
     return nombre;
 }
 public void Establecer_creditos(int x){
     creditos=x;
 }
 public int Obtener_creditos(){
     return creditos;
 }

 public Carrera obtener_carrera(){
     return carrera;
 }
    @Override
 public String toString(){
        String cadena = String.format("Asignatura \n"
                                    + "Nombre: %s \n"
                                    + "Creditos %d \n"
                                    + "%s", Obtener_nombre(), Obtener_creditos(), obtener_carrera());
        return cadena;
    }

}
