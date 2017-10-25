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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carrera c= new Carrera();
        c.set_nombre("Informatica");
        c.set_modalidad("Distancia");
        System.out.println(c.get_nombre()+" "+c.get_modalidad());
        
        Carrera c2=new Carrera("Electronica");
        
        Carrera c3= new Carrera("Semipresencial,Sistemas");
        System.out.println(c3.get_modalidad());
        c3.set_modalidad("Distancia");
        System.out.println(c3.get_modalidad());
        c3.set_modalidad(c3.get_modalidad().toUpperCase());
        System.out.println(c3.get_modalidad());
    }
    
}
