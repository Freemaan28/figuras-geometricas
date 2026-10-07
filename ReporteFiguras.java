import java.util.ArrayList;

public class ReporteFiguras {
    public void mostrar(ArrayList<Figura> figuras) {
        for (Figura figura : figuras) {
            System.out.println(figura.getNombre() + " - Área: " + figura.calcularArea());
        }
    }
}