package Decorator;
import principal.Informe;

public class FuenteInforme extends InformeDecorator{
    
    public FuenteInforme(Informe informe) {
        super(informe);
    }
    
    private void cambiarFuente(){
        //cambia la fuente al informe
    }
    
    @Override
    public Informe generarInforme(){
        cambiarFuente();
        return super.informe;
    }
}
