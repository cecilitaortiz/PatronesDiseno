package principal;
import Decorator.*;

public class Patrones {

    public static void main(String[] args) {
        Informe colorEstiloPDF = new ColorInforme(new EstiloInforme(new PDF()));
        colorEstiloPDF.generarInforme();
        
    }
}
