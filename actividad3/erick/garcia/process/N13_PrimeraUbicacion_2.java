package erick.garcia.process;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N13 (B) - Primera ubicación
 * Segundo test en otro archivo.
 */
public class N13_PrimeraUbicacion_B {

    /**
     * Igual que el A, pero con otra prueba.
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

    /** Caso NO encontrado. */
    @Test
    public void testNoEncontrado() {
        Assertions.assertEquals(-1, primeraUbicacionCaracter("hola", 'r'));
    }
}
