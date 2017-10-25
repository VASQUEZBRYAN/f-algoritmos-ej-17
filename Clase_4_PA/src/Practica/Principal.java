/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;


/**
 *
 * @author Usuario
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Carrera c= new Carrera("Contabilidad","prsencial");
        Asignatura a= new Asignatura(c);
        Carrera b1= new Carrera("economia","distancia");
        Asignatura b=new Asignatura(b1);
        System.out.println(a);
        System.out.println(b);
    }
    
}
