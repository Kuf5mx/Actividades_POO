package erick.garcia.process;

import java.util.Arrays;
import java.util.List;

import erick.garcia.models.Empleado;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N14 - Mayor salario (edad > 30)
 */
public class N14_MayorSalarioMayor30 {

    /**
     * Busca el mayor salario solo en los que tienen más de 30.
     *
     * @param empleados lista de empleados
     * @return empleado con mayor salario (edad > 30) o null si no existe
     */
    public static Empleado mayorSalarioMayor30(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        Empleado mayor = null;
        for (Empleado e : empleados) {
            if (e == null) {
                continue;
            }
            if (e.edad > 30) {
                if (mayor == null || e.salario > mayor.salario) {
                    mayor = e;
                }
            }
        }
        return mayor;
    }

    /** Prueba: debe regresar a B. */
    @Test
    public void testMayorSalarioMayor30() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("A", 31, 20000, "sistemas"),
                new Empleado("B", 35, 50000, "ventas"),
                new Empleado("C", 29, 100000, "sistemas")
        );

        Empleado mayor = mayorSalarioMayor30(empleados);
        Assertions.assertNotNull(mayor);
        Assertions.assertEquals("B", mayor.nombre);
    }
}
