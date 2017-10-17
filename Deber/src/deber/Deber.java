/*
 
 */
package deber;

import java.util.Scanner;


public class Deber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner bry= new Scanner(System.in);
        int n; 
        int [][] mat;
        
      
        System.out.println("ingrese el limite ");
        n=bry.nextInt();
          mat= new int [n][n];
        // llenado de matriz 
        System.out.println("llennado de matriz ");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]=bry.nextInt();
                
            }
           
        }
        System.out.println("prsentacion de la matriz");
        //recorrido de la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+" ");
                
            }
            System.out.println(" ");
            
        }
        System.out.println("suma de las filas ");
        for (int i = 0; i <mat.length; i++) {
            int suma=0;
            for (int j = 0; j < mat[i].length; j++) {
                suma=suma+mat[i][j];
            }
            System.out.println(suma);
        }
        System.out.println("suma de las columnas ");
        for (int i = 0; i <mat[0].length; i++) {
            int sumac=0;
            for (int j = 0; j < mat.length; j++) {
                sumac=sumac+mat[j][i];
            }
            System.out.println(sumac);
        }
    }
}
