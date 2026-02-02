package erick.garcia.process;

import java.util.Arrays;
import java.util.List;

import erick.garcia.models.Empleado;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N5 - Empleado mayor salario
 * Se recorre la lista y se va guardando el mayor.
 */
public class N5_EmpleadoMayorSalario {

    /**
     * Busca al empleado con el salario más alto.
     *
     * @param empleados lista de empleados
     * @return empleado con mayor salario o null si no hay
     */
    public static Empleado empleadoMayorSalario(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        Empleado mayor = null;
        for (Empleado e : empleados) {
            if (e == null) {
                continue;
            }
            if (mayor == null || e.salario > mayor.salario) {
                mayor = e;
            }
        }
        return mayor;
    }

    /** Prueba simple (debe ganar el que tiene 30,000). */
    @Test
    public void testEmpleadoMayorSalario() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("A", 20, 20000, "sistemas"),
                new Empleado("B", 30, 30000, "ventas"),
                new Empleado("C", 25, 25000, "sistemas")
        );

        Empleado mayor = empleadoMayorSalario(empleados);
        Assertions.assertNotNull(mayor);
        Assertions.assertEquals("B", mayor.nombre);
    }
}

