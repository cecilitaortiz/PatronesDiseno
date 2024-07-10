package Decorator;
import principal.Informe;

public class ColorInforme extends InformeDecorator{
    
    public ColorInforme(Informe informe) {
        super(informe);
    }
    
    private void agregarColor(){
        //agrega color al informe
    }
    
    @Override
    public Informe generarInforme(){
        agregarColor();
        return super.informe;
    }
}
