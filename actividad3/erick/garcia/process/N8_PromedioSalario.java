package erick.garcia.process;

import java.util.Arrays;
import java.util.List;

import erick.garcia.models.Empleado;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N8 - Promedio de salario
 */
public class N8_PromedioSalario {

    /**
     * Suma los salarios y divide entre cuántos hay.
     *
     * @param empleados lista de empleados
     * @return promedio; si no hay datos regresa 0
     */
    public static double promedioSalario(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return 0;
        }

        double suma = 0;
        int contador = 0;
        for (Empleado e : empleados) {
            if (e == null) {
                continue;
            }
            suma += e.salario;
            contador++;
        }

        if (contador == 0) {
            return 0;
        }
        return suma / contador;
    }

    /** Prueba del promedio. */
    @Test
    public void testPromedioSalario() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("A", 20, 20000, "sistemas"),
                new Empleado("B", 30, 30000, "ventas")
        );

        Assertions.assertEquals(25000.0, promedioSalario(empleados), 0.0001);
    }
}
