package erick.garcia.process;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


/**
 * N2 - Contar pares
 * Solo cuenta los que sean divisibles entre 2.
 */
public class N2_ContarPares {


    /**
     * Cuenta cuántos números pares hay.
     *
     * @param numeros lista de enteros (puede traer null)
     * @return cantidad de pares
     */
    public static int contarPares(List<Integer> numeros) {
        int contador = 0;
        if (numeros == null) {
            return 0;
        }

        for (Integer n : numeros) {
            if (n != null && n % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }


    /** Test básico. */
    @Test
    public void testContarPares() {
        List<Integer> input = Arrays.asList(3, 4, 5, 7, 6);
        Assertions.assertEquals(2, contarPares(input));
    }
}
