public class Figuras {
    public static void main(String[] args) {
        String f = "circulo";
        double x = 5;
        double r = 0;
        if (f.equals("circulo")) {
            r = 3.14 * x * x;
        } else if (f.equals("cuadrado")) {
            r = x * x;
        }
        System.out.println(r);
    }
}