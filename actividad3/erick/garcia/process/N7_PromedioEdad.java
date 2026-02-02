package erick.garcia.process;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N7 - Promedio de edad
 */
public class N7_PromedioEdad {

    /**
     * Calcula el promedio de edad.
     *
     * @param empleados lista de empleados
     * @return promedio; si no hay datos regresa 0
     */
    public static double promedioEdad(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return 0;
        }

        int suma = 0;
        int contador = 0;
        for (Empleado e : empleados) {
            if (e == null) {
                continue;
            }
            suma += e.edad;
            contador++;
        }

        if (contador == 0) {
            return 0;
        }
        return (double) suma / contador;
    }

    /** Prueba con dos empleados. */
    @Test
    public void testPromedioEdad() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("A", 20, 20000, "sistemas"),
                new Empleado("B", 30, 30000, "ventas")
        );

        Assertions.assertEquals(25.0, promedioEdad(empleados), 0.0001);
    }
}
