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
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner bry= new Scanner(System.in);
        int []a;
       
        a= new int [10000];
        for (int i = 1; i <= 100; i++) {
            
     a[i]=i*i;
            System.out.println(""+a[i]);
        }
        
    }
}
