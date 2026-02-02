package erick.garcia.process;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import erick.garcia.models.Empleado;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N6 - Edad más común
 * Cuenta repeticiones con un mapa.
 */
public class N6_EdadMasComun {

    /**
     * Saca la edad que más se repite.
     *
     * @param empleados lista de empleados
     * @return edad más común, o -1 si no hay
     */
    public static int edadMasComun(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return -1;
        }

        Map<Integer, Integer> conteo = new HashMap<>();
        for (Empleado e : empleados) {
            if (e == null) {
                continue;
            }
            conteo.put(e.edad, conteo.getOrDefault(e.edad, 0) + 1);
        }

        int edad = -1;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                edad = entry.getKey();
            }
        }
        return edad;
    }

    /** Prueba donde 20 se repite más veces. */
    @Test
    public void testEdadMasComun() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("A", 20, 20000, "sistemas"),
                new Empleado("B", 20, 30000, "ventas"),
                new Empleado("C", 25, 25000, "sistemas")
        );

        Assertions.assertEquals(20, edadMasComun(empleados));
    }
}
