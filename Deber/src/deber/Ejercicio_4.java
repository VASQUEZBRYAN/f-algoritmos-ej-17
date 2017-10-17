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
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner dat= new Scanner(System.in);
        int [][]mat;
        int suma=0;
        
        System.out.println("ingrese el limite de la matriz");
        int a= dat.nextInt();
        mat= new int[a][a];
        
        System.out.println("llenamos la matriz");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.println("ingrese el valor"+"["+i+"]"+"de la matriz");
                mat[i][j]= dat.nextInt();
                }
            }
        System.out.println("presentar matriz");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" "+mat[i][j]);
            }
            System.out.println(" ");
        }
        
        System.out.println("diagonal principal");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(i==j){
                    System.out.println(""+mat[i][j]);
                    suma=suma+mat[i][j];
                }
                
            }
            
        }
        System.out.println("la suma de la diagonal principal es "+" "+suma);
    }
}
