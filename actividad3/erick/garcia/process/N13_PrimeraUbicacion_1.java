package erick.garcia.process;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N13 (A) - Primera ubicación
 * Prohibido usar indexOf.
 */
public class N13_PrimeraUbicacion_1 {

    /**
     * Busca la primera posición de un carácter en un texto.
     *
     * @param texto texto donde se busca
     * @param caracter carácter a buscar
     * @return índice de la primera aparición o -1 si no existe
     */
    public static int primeraUbicacionCaracter(String texto, char caracter) {
        if (texto == null) {
            return -1;
        }

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                return i;
            }
        }
        return -1;
    }

    /** Caso encontrado. */
    @Test
    public void testEncontrado() {
        Assertions.assertEquals(1, primeraUbicacionCaracter("hola", 'o'));
    }
}
