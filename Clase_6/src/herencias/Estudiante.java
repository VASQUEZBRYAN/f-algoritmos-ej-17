/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;
import Herencias4.Asignatura_presencial;
/**
 *
 * @author reroes
 */
public class Estudiante extends Persona{
    private Asignatura_presencial [] asigantura;
    
    public Estudiante(String n, String a, int e,Asignatura_presencial [] as ){
        super(n, a, e);
        asigantura=as;
    }

   public void establecer_Asigantura(Asignatura_presencial[] as) {
        asigantura = as;
    }
    public Asignatura_presencial[] obtener_Asigantura() {
        return asigantura;
    }

    
    public void setEdad(int e){
        if(e<18){
            edad=18;
        }else{
            edad=e;
        }
        
    }
    public double obtener_valor_matricula(){
        Asignatura_presencial [] A= obtener_Asigantura();
        double suma=0;
        for (int i = 0; i < A.length; i++) {
            Asignatura_presencial m=A[i];
            suma+= m.obtener_costo();
        }
        return suma;
    }
    
    @Override
    public String toString(){
    String cadena_asignaturas="";
        Asignatura_presencial []A= obtener_Asigantura();
        for (int i = 0; i < A.length; i++) {
            cadena_asignaturas=String.format("%s%s",cadena_asignaturas, A[i]);
        }
        return String.format("%s\n"
                +"costo de matricula: $ %f\n"
                + "lista de estudiante\n"
                + "%s", 
                super.toString(),obtener_valor_matricula(),cadena_asignaturas);
    }
    
    
    // @Override
    // public String toString(){
    
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
