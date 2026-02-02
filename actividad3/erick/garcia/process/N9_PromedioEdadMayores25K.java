package erick.garcia.process;

import java.util.Arrays;
import java.util.List;

import erick.garcia.models.Empleado;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N9 - Promedio edad (sueldo > 25k)
 */
public class N9_PromedioEdadMayores25K {

    /**
     * Promedio de edad pero filtrando por salario.
     *
     * @param empleados lista de empleados
     * @return promedio; si nadie cumple regresa 0
     */
    public static double promedioEdadMayoresA25K(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return 0;
        }

        int suma = 0;
        int contador = 0;
        for (Empleado e : empleados) {
            if (e == null) {
                continue;
            }
            if (e.salario > 25000) {
                suma += e.edad;
                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        }
        return (double) suma / contador;
    }

    /** Prueba donde solo entran 2 empleados al promedio. */
    @Test
    public void testPromedioEdadMayoresA25K() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("A", 20, 20000, "sistemas"),
                new Empleado("B", 40, 40000, "ventas"),
                new Empleado("C", 30, 30000, "sistemas")
        );

        Assertions.assertEquals(35.0, promedioEdadMayoresA25K(empleados), 0.0001);
    }
}
