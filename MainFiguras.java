import java.util.ArrayList;

public class MainFiguras {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5));
        figuras.add(new Cuadrado(4));
        figuras.add(new Rectangulo(4, 6));

        ReporteFiguras reporte = new ReporteFiguras();
        reporte.mostrar(figuras);
    }
}