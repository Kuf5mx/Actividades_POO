package erick.garcia.process;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N1 - Ceros a la derecha
 * La idea es dejar el orden de los demás números igual.
 */
public class N1_CerosDerecha {

    /**
     * Método que recorre la lista y manda los 0 al final.
     *
     * @param numeros lista de números (puede venir null o vacía)
     * @return lista con ceros al final (si entra null/vacía se regresa igual)
     */
    public static List<Integer> moverCerosDerecha(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return numeros;
        }

        List<Integer> resultado = new ArrayList<>();
        int ceros = 0;

        
        for (Integer n : numeros) {
            if (n != null && n == 0) {
                ceros++;
            } else {
                resultado.add(n);
            }
        }

        for (int i = 0; i < ceros; i++) {
            resultado.add(0);
        }

        return resultado;
    }

    /** Prueba rápida con ceros intercalados. */
    @Test
    public void testMoverCerosDerecha() {
        List<Integer> input = Arrays.asList(0, 2, 1, 4, 0, 2);
        Assertions.assertEquals(Arrays.asList(2, 1, 4, 2, 0, 0), moverCerosDerecha(input));
    }
}

