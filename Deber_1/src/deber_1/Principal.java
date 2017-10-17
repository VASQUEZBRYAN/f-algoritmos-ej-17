/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_1;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
     Titulo b= new Titulo();
     Asignatura b1= new Asignatura();
     Docente d= new Docente();
     
        System.out.println("CASO 1");
        System.out.println(" ");
        System.out.println("DATOS DEL DOCENTE");
        d.Nomnbre();
        d.Apellido();
        System.out.println("tiene los cargos de la asignatura");
        d.Asignatura1(); b1.N_asignatura(); b1.Creditos();
        System.out.println("el docente tiene los siguientes titulos");
        
        
        
    }
    
}
