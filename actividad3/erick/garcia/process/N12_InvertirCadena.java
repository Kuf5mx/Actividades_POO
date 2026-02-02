package erick.garcia.process;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N12 - Invertir cadena
 * Prohibido usar reverse.
 */
public class N12_InvertirCadena {

    
    /**
     * Invierte un texto recorriéndolo de atrás hacia adelante.
     *
     * @param texto texto de entrada
     * @return texto invertido; null si la entrada es null
     */
    public static String invertirCadena(String texto) {
        if (texto == null) {
            return null;
        }

        String salida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            salida += texto.charAt(i);
        }
        return salida;
    }

    /** Prueba rápida. */
    @Test
    public void testInvertirCadena() {
        Assertions.assertEquals("aloh", invertirCadena("hola"));
    }
}
