package Decorator;
import principal.Informe;

public abstract class InformeDecorator extends Informe{
    
    protected Informe informe;

    public InformeDecorator(Informe informe) {
        this.informe = informe;
    }
    
    @Override
    public Informe generarInforme(){
        return null;
    }
    
}
