/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Docente {
    Scanner bry= new Scanner(System.in);
    private String nombre; 
    private String apellido; 
    private String asignatura1;
    private String asignatura2;
    
    public void Nomnbre(){
        System.out.println("ingrese el nombre del docente");
        nombre=bry.next();
    }
    public void Apellido(){
        System.out.println("ingrese el apellido");
        apellido=bry.next();
    }
    public void Titulo_tercer(){
        System.out.println("Titulo 3 nivel :");
    }
    public void Titulo_cuarto(){
        System.out.println("Titulo 4 nivel : ");
    }
    public void Asignatura1(){
        System.out.println("Asignatura 1:");
    }
    public void Asignatura2(){
        System.out.println("Asignatura 2:");
    }
    
}
