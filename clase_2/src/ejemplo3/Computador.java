/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

/**
 *
 * @author Usuario
 */
public class Computador {
    private double velocidad_procesador;
    
    public void establecer_velocidad_procesador(double vel){
        if(vel>5){
            velocidad_procesador=5.5;
        }else{
            velocidad_procesador=vel;
        }
        
    }
    public double obtener_velocidad_procesador(){
        return velocidad_procesador;
    }
    @Override
    public String toString(){
        String cadena= String.format("computadora\n"
        +"velocidad %f", obtener_velocidad_procesador());
         
        
        //String cadena2= String.format("computadora\n"
        //+"velocidad %f", velocidad_procesador);
        
        return cadena;
    }
    
}
