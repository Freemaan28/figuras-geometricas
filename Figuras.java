public class Figuras {
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
    public static void main(String[] args) {
        System.out.println("Área círculo: " + calcularAreaCirculo(5));
        System.out.println("Área cuadrado: " + calcularAreaCuadrado(4));
        System.out.println("Área rectángulo: " + calcularAreaRectangulo(4, 6));
    }
}