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
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner dat= new Scanner(System.in);
        int []a;
        int suma=0;
        int res=0;
        int cero=0;
        
        System.out.println("escribir el limite del arreglo");
        int n= dat.nextInt();
        a= new int [n];
        System.out.println("Llenamos el arreglo");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrse el valor"+i);
            a[i]=dat.nextInt();
            }
        System.out.println("presentacion del arreglo");
        for (int i = 0; i <n; i++) {
            System.out.println(""+a[i]);
            
        }
        System.out.println("conteo de numeros ");
        for (int i = 0; i <a.length; i++) {
            if(a[i]>0){
                suma +=+1;
                
            }else{
                if(a[i]<0){
                   res +=+1;
                }else{
                    if(a[i]==0){
                        cero +=+1;
                        
                    }
                }
            }
            
            
        }
        System.out.println("la cantidad de numeros positivos son"+" "+suma);
        System.out.println("la cantidad de numeros negativos son"+" "+res);
        System.out.println("la cantidad de ceros hay "+" "+cero);
    }
    
}
