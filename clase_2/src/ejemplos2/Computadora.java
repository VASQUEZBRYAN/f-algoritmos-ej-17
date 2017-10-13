/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos2;

/**
 *
 * @author Usuario
 */
public class Computadora {
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
}
