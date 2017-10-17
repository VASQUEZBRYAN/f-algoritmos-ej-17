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
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner dat= new Scanner (System.in);
        int []a;
        int []b;
        int n;
        int j;
        
        System.out.println("ingrese el valor del limte del arreglo");
        n= dat.nextInt();
        a= new int [n];
        System.out.println("ingrese el valor de i");
        j=dat.nextInt();
        
        System.out.println("ingresemos los valores del arreglo");
        for (int i = 0; i < n; i++) {
            a[i]=dat.nextInt();
            }
        System.out.println("presentamos el arreglo");
        for (int i = 0; i < n; i++) {
            System.out.println(""+a[i]);
            
        }
        
        System.out.println("presentacion del nuevo arreglo");
        for (int i = 0; i < a.length; i++) {
            int res=a[i]/j;
            
            
            System.out.println(""+res);
        }
        
    }
}
