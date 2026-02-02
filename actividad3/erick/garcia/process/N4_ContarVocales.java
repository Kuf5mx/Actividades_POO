package erick.garcia.process;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N4 - Contar vocales
 * Cuenta a/e/i/o/u sin importar mayúsculas.
 */
public class N4_ContarVocales {

    /**
     * Cuenta vocales en un texto.
     *
     * @param texto texto de entrada
     * @return número de vocales
     */
    public static int contarVocales(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    /** Prueba con "hola". */
    @Test
    public void testContarVocalesHola() {
        Assertions.assertEquals(2, contarVocales("hola"));
    }
}
