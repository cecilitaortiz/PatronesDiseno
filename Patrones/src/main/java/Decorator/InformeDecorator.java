package Decorator;

public abstract class InformeDecorator extends Informe{
    
    protected Informe informe;

    public InformeDecorator(Informe informe) {
        this.informe = informe;
    }
}
