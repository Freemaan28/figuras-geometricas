public class NumeroUtil {
    public static boolean esPrimo(int numero) {
        validarNumero(numero);
        if (numero < 2) return false;
        return !tieneDivisor(numero);
    }

    private static void validarNumero(int numero) {
        if (numero < 0) throw new IllegalArgumentException("Número negativo");
    }

    private static boolean tieneDivisor(int numero) {
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) return true;
        }
        return false;
    }
}