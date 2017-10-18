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
     Scanner bry= new Scanner(System.in);
 public void llamar_Arreglos(){
       
        
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
    public void ordenar(){
        
        for(i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j+1]<a[j]){
                    int aux=a[j+1];
                    a[j+1]=a[j];
                    a[j]=aux;
                }
            }
        }
        // Salida de datos
        System.out.println("El arreglo ordenado es:"); 
        for(i=0;i<lim;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println("");
        
    }
    public void eliminar(){
        
        System.out.println("Ingrese la posicion que quiere eliminar:");
        int num=bry.nextInt();
        if  (num!=i-1){
            for (int j=0;j<i;j++) {
                int aux=j;
                if (j==num) {
                    a[aux] = a[aux + 1];
                    a[i - 2] = a[i - 1];
                }
            }
        }
        for (int j=0;j<i-1;j++) {
            System.out.print(" "+a[j]);
        }
        System.out.println("");
    }
    public void buscar(){
        System.out.println("ingrese el elemento a buscar");
        int elemento=bry.nextInt();
        int pos=0; 
        for (int i = 0; i < a.length; i++) {
            if(a[i]==elemento){
                System.out.println("el elemento esta en la posiciosn"+pos);
            }
        }
        
    }
    
  
   }

