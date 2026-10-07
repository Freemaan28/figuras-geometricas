import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NumeroUtilTest {
    @Test
    void sieteEsPrimo() { assertTrue(NumeroUtil.esPrimo(7)); }

    @Test
    void cuatroNoEsPrimo() { assertFalse(NumeroUtil.esPrimo(4)); }

    @Test
    void unoNoEsPrimo() { assertFalse(NumeroUtil.esPrimo(1)); }

    @Test
    void rechazarNegativo() {
        assertThrows(IllegalArgumentException.class, () -> NumeroUtil.esPrimo(-5));
    }
}