package erick.garcia.process;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class testsdeceros {

    public static class ComparadorCeros implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            if (a == 0 && b == 0) {
                return 0;
            }
            if (a == 0) {
                return 1; 
            }
            if (b == 0) {
                return -1;
            }
            return 0; 
        }
    }

    public static void moverCerosDerechaConSort(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return;
        }
        Collections.sort(numeros, new ComparadorCeros());
    }
   
    public static void moverCerosDerecha(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return;
        }

        int writeIndex = 0;
        for (int value : numeros) {
            if (value != 0) {
                numeros[writeIndex++] = value;
            }
        }

        while (writeIndex < numeros.length) {
            numeros[writeIndex++] = 0;
        }
    }

    public static List<Integer> moverCerosDerecha(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return numeros;
        }

        List<Integer> resultado = new ArrayList<>(numeros.size());
        int zeroCount = 0;
        for (Integer value : numeros) {
            if (value == 0) {
                zeroCount++;
            } else {
                resultado.add(value);
            }
        }

        for (int i = 0; i < zeroCount; i++) {
            resultado.add(0);
        }
        return resultado;
    }

    @Test
    public void testMoverCerosDerechaConSort() {
        List<Integer> input = new ArrayList<>(Arrays.asList(0, 2, 1, 4, 0, 2));
        moverCerosDerechaConSort(input);
        assertEquals(Arrays.asList(2, 1, 4, 2, 0, 0), input);
    }

    @Test
    public void testMoverCerosDerechaArray() {
        int[] input = {0, 2, 1, 4, 0, 2};
        moverCerosDerecha(input);
        assertArrayEquals(new int[] {2, 1, 4, 2, 0, 0}, input);
    }

    @Test
    public void testMoverCerosDerechaList() {
        List<Integer> input = Arrays.asList(0, 2, 1, 4, 0, 2);
        List<Integer> salida = moverCerosDerecha(input);
        assertEquals(Arrays.asList(2, 1, 4, 2, 0, 0), salida);
    }

    @Test
    public void testMoverCerosDerechaListNull() {
        assertNull(moverCerosDerecha((List<Integer>) null));
    }

}