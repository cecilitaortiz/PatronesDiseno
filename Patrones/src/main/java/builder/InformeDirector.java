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
public class InformeDirector {
    private InformeBuilder i;
    protected Informe in;
    
    public InformeDirector(InformeBuilder informe){
    this.i=informe;
    }
    public void construirInforme(){
    //all
    }

    public Informe getInforme() {
        return in;
    }
    
    
    
}
