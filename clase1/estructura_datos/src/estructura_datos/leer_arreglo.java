/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_datos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class leer_arreglo {
    
    public int lim;
    public int a [];
    public int i;
    public int n;
 public void llamar_Arreglos(){
        Scanner bry= new Scanner(System.in);
        
         System.out.println("ingrese el limite del arreglo");
         lim=bry.nextInt();
         a= new int[lim];
         for ( i = 0; i < lim; i++) {
             System.out.println("ingrese los valores valor"+i);
             a[i]=bry.nextInt();
        }
    }
    public void presentar(){
        System.out.println("el arreglo es");
         for ( i = 0; i < lim; i++) {
             System.out.println(+a[i]+"");
            
        }
    }
  
   }

