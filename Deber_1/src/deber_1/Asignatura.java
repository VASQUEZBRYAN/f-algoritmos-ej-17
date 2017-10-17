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
public class Asignatura {
    
    Scanner bry= new Scanner(System.in);
    private String nombre,nombre1;
    private int creditos,creditos1;
   
    public void N_asignatura(){
        System.out.println("ingrese el nombre de la  primera asignatura");
        nombre=bry.next();
        System.out.println("ingrese el nombre de la segunda asignatura");
        nombre1=bry.next();
    }
    public void Creditos(){
        System.out.println("ingrese los creditos de la primera materia");
        creditos=bry.nextInt();
        System.out.println("ingrese los creditos de la segunda materia");
        creditos1=bry.nextInt();
        
    }
}
