package erick.garcia.process;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N3 (B) - Palíndromo
 * Otro test (en archivo aparte) como pidió el profe.
 */
public class N3_Palindromo_2 {

    /**
     * Misma lógica del ejercicio, pero con otra prueba.
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

    /** Caso donde SÍ es palíndromo. */
    @Test
    public void testPalindromoAna() {
        Assertions.assertTrue(esPalindromo("ana"));
    }
}
