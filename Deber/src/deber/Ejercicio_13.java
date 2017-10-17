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
public class Ejercicio_13 {
    public static void main(String[] args) {
        int opcion;String o="";
        int [][]a;
        int [][]b;
        int [][]c;
        int n;
        Scanner bry=new Scanner(System.in); 
        
            System.out.println("escoja una opcion");
            System.out.println("1.multiplicacion de dos matrices");
            System.out.println("2. suma de matrizes");
            System.out.println("3.resta de matrices");
            System.out.println("4.multiplicacion por un escalar");
            System.out.println("5.transpuesta de una matriz");
            
            opcion=bry.nextInt();
        
        switch (opcion){
            
            case 1: 
                System.out.println("ingrese el limite");
                n= bry.nextInt();
                a= new int [n][n];
                b=new int [n][n];
                c= new int[10000][10000];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("ingrese los balos de la primera matriz");
                        a[i][j]=bry.nextInt();
                    }
                }
                for (int i = 0; i <n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("ingrese los elementos de la segunda matriz");
                        b[i][j]=bry.nextInt();
                        }
                    }
                
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" "+a[i][j]);
                        
                    }
                    System.out.println(" ");
                    
                }
               System.out.println(" ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        
                        System.out.print(" "+b[i][j]);
                    }
                      System.out.println(" ");
                }
                System.out.println(" ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <n; j++) {
                       c[i][j]=a[i][j]*b[i][j]; 
                        
                       System.out.print(" "+c[i][j]);
                    
                }
                    System.out.println(" ");
                    
                }
            break;
            case 2: 
                System.out.println("ingrese el limite");
                n= bry.nextInt();
                a= new int [n][n];
                b=new int [n][n];
                c= new int[10000][10000];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("ingrese los balos de la primera matriz");
                        a[i][j]=bry.nextInt();
                    }
                }
                for (int i = 0; i <n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("ingrese los elementos de la segunda matriz");
                        b[i][j]=bry.nextInt();
                        }
                    }
                
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" "+a[i][j]);
                        
                    }
                    System.out.println(" ");
                    
                }
               System.out.println(" ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        
                        System.out.print(" "+b[i][j]);
                    }
                      System.out.println(" ");
                }
                System.out.println(" ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <n; j++) {
                       c[i][j]=a[i][j]+b[i][j]; 
                        
                       System.out.print(" "+c[i][j]);
                    
                }
                    System.out.println(" ");
                    
                }break;
            case 3:
                System.out.println("ingrese el limite");
                n= bry.nextInt();
                a= new int [n][n];
                b=new int [n][n];
                c= new int[10000][10000];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("ingrese los balos de la primera matriz");
                        a[i][j]=bry.nextInt();
                    }
                }
                for (int i = 0; i <n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("ingrese los elementos de la segunda matriz");
                        b[i][j]=bry.nextInt();
                        }
                    }
                
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" "+a[i][j]);
                        
                    }
                    System.out.println(" ");
                    
                }
               System.out.println(" ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        
                        System.out.print(" "+b[i][j]);
                    }
                      System.out.println(" ");
                }
                System.out.println(" ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <n; j++) {
                       c[i][j]=a[i][j]-b[i][j]; 
                        
                       System.out.print(" "+c[i][j]);
                    
                }
                    System.out.println(" ");
                    
                }break;
            case 4: 
                System.out.println("ingrese el limite");
                n= bry.nextInt();
                System.out.println("ingrese el escalar");
                int m=bry.nextInt();
                a= new int [n][n];
               
                c= new int[10000][10000];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("ingrese los  de la primera matriz");
                        a[i][j]=bry.nextInt();
                    }
                }
                
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" "+a[i][j]);
                        
                    }
                    System.out.println(" ");
                    
                }
               System.out.println(" ");
                
                System.out.println(" ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <n; j++) {
                       c[i][j]=a[i][j]*m; 
                        
                       System.out.print(" "+c[i][j]);
                    
                }
                    System.out.println(" ");
                    
                }break;
            case 5: 
                System.out.println("ingrese el limite");
                n= bry.nextInt();
                System.out.println("ingrese el escalar");
                a= new int [n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("ingrese los  de la primera matriz");
                        a[i][j]=bry.nextInt();
                    }
                }
                
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" "+a[i][j]);
                        
                    }
                    System.out.println(" ");
                    
                }
               
                for (int i = 0; i <a.length; i++) {
                    for (int j = 0; j <a[i].length; j++) {
                        System.out.print(" "+a[j][i]);
                        
                    }
                    System.out.println(" ");
                }break;
            
            
                
        }
    }
}