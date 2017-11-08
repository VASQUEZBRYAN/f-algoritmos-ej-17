/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias4;

import herencias.Estudiante;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
       
        //Asignatura_presencial a1= new Asignatura_presencial("literatura","troncal",300,6);
        //System.out.println(a1);
         //Asignatura_distancia a= new Asignatura_distancia("Programacion","Comun", 100, 180);
        //System.out.println(a);
        Asignatura_presencial a=new Asignatura_presencial("programaion", "comun",100, 180);
        Asignatura_presencial a1=new Asignatura_presencial("Literatuta", "troncal",300.2, 200);
        Asignatura_presencial[] asigna={a,a1};
        Estudiante e= new Estudiante("rene","Elizalde",34,asigna);
        System.out.println(e);
    }
}
