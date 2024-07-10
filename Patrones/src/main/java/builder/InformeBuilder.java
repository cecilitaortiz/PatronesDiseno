/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;
import principal.*;
/**
 *
 * @author CltControl
 */
public abstract class InformeBuilder {
    protected Informe i;
    protected String nombre;
    protected String contenido;
    
    public void construirNombre(){
    //all
    }
    public void costruirContenido(){
    //all
    }

    public Informe getInforme() {
        return i;
    }
    
}
