/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        int n; 
        System.out.println("ingrese el numero de la tabla ");
        n= datos.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(""+n+"x"+i+"="+(n*i)+"");
        }
    }
    
}
