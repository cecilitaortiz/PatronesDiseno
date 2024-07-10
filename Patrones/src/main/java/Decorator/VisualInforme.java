package Decorator;

public class VisualInforme extends InformeDecorator{
    
    public VisualInforme(Informe informe) {
        super(informe);
    }
    
    private void agregarVisual(){
        //agrega un visual al informe
    }
    
    @Override
    public Informe generarInforme(){
        agregarVisual();
        return super.informe;
    }
}
