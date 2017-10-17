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
public class Ejercico_14 {
    public static void main(String[] args) {
      Scanner dat= new Scanner(System.in);
        int [][]a;  
      int aux=0, x=0, y=0;
        System.out.println("ingrese el limite de la matriz");
        int limi=dat.nextInt();
        a= new int[limi][limi];
        
        for (int i = 0; i < limi; i++) {
            for (int j = 0; j < limi; j++) {
                System.out.println("ingrese los valores de la matriz ");
                a[i][j]=dat.nextInt();
            }
            
        }
        
     
    for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                for(x=0;x<a.length;x++){
                    for(y=0;y<a.length;y++){
                        // comparar los numero de la matriz para ordenarla 
                        if (a[i][j]>=a[x][y]){
                            a[i][j]=a[i][j];  
                        }else{
                            aux=a[x][y];
                            a[x][y]=a[i][j];
                            a[i][j]=aux;
                        }    
                    }
                }
            } 
        }
    // aqui presentamos la matriz ordenada    
    System.out.println("La matriz ordenada es:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }
    }
        
}
    

