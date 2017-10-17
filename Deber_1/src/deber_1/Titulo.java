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
public class Titulo {
    private String nombre; 
    private String nombre_universidad;
    
    Scanner bry= new Scanner(System.in);
    
    public void Nombre(){
        System.out.println("ingrese el nombre del docente");
        nombre=bry.next();
        
    }
    public void Nombre_universidad(){
        System.out.println("ingrese el nomobre de la universidad");
        nombre_universidad=bry.next();
    }
    
    
}
