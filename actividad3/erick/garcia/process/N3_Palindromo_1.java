package erick.garcia.process;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N3 (A) - Palíndromo
 * Se compara desde los extremos, sin usar reverse.
 */
public class N3_Palindromo_1 {

    
    /**
     * Revisa si un texto se lee igual al derecho y al revés.
     * Quita espacios y lo hace en minúsculas.
     *
     * @param texto texto a evaluar
     * @return true si es palíndromo
     */
    public static boolean esPalindromo(String texto) {
        if (texto == null) {
            return false;
        }

        String limpio = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c != ' ') {
                limpio += Character.toLowerCase(c);
            }
        }

        int i = 0;
        int j = limpio.length() - 1;
        while (i < j) {
            if (limpio.charAt(i) != limpio.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /** Caso donde NO es palíndromo. */
    @Test
    public void testPalindromoHolaMundo() {
        Assertions.assertFalse(esPalindromo("hola mundo"));
    }
}
