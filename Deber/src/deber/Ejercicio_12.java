/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner dat= new Scanner(System.in);
        
        String []a;
        int n;
        String b;
        
        System.out.println("ingrese el limite");
        n=dat.nextInt();
        a= new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el"+"["+i+"]"+"nombre");
            a[i]=dat.next();
            }
        System.out.println("presentacion del arreglo ");
        for (int i = 0; i <n; i++) {
            System.out.println(a[i]);
            
        }
        System.out.println("ingresel el nombre a buscar");
        b= dat.next();
        for (int i = 0; i < a.length; i++) {
            if(b==a[i]){
                System.out.println("si esta");
            }else{
                System.out.println("no estaba");
            }
            
        }
    }
    
}
