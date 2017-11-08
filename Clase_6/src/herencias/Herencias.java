/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import Herencias4.Asignatura_presencial;

/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Profesor p= new Profesor(100.1);
        //System.out.println(p);
        
        //Profesor p1= new Profesor();
        //System.out.println(p1);
        
        //Profesor p2= new Profesor("bryan","Vasquez",20,200.2);
        //System.out.println(p2);
        
        //Estudiante e = new Estudiante("René", "Elizalde",16, 100.2);
        //System.out.println(e);
        Asignatura_presencial a=new Asignatura_presencial("programaion", "comun",100, 180);
        Asignatura_presencial a1=new Asignatura_presencial("Literatuta", "troncal",300.2, 200);
        Asignatura_presencial[] asigna={a,a1};
        Estudiante e= new Estudiante("rene","Elizalde",34,asigna);
        System.out.println(e);
    }
    
}
