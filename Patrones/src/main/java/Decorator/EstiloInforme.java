package Decorator;
import principal.Informe;

public class EstiloInforme extends InformeDecorator{
    
    public EstiloInforme(Informe informe) {
        super(informe);
    }
    
    private void agregarEstilo(){
        //agrega un estilo al informe
    }
    
    @Override
    public Informe generarInforme(){
        agregarEstilo();
        return super.informe;
    }
    
}
