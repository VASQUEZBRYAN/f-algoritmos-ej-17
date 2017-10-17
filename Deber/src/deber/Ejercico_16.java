/*
 el limite de este ejemplo esta solo para un limite de 2 x 2 
 */
package deber;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercico_16 {
    public static void main(String[] args) {
        Scanner dat= new Scanner(System.in);
        int [][]a;
        int n; 
        int suma=0;
        int suma1=0;
        System.out.println("ingrese el limite ");
        n= dat.nextInt();
        a= new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("ingrese el "+"["+i+"]"+"valo de la matriz ");
                a[i][j]=dat.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" "+a[i][j]);
                
            }
            System.out.println(" ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i==j){
                    suma=suma+a[i][j];
                }
            }
            
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i+j==a.length-1){
                    suma1=suma1+a[i][j];
                    
                }
                
            }
            
        }
        int deter=suma-suma1;
        
        System.out.println("la determinante es");
        System.out.println(suma+"-"+suma1+"="+deter);
    }
}
