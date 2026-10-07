public class NumeroUtil {
    public static boolean esPrimo(int n) {
        if (n < 0) throw new IllegalArgumentException("Número negativo");
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}