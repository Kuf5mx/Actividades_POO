package erick.garcia.process;

import java.util.Arrays;
import java.util.List;

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

/**
 * Clase sencilla para el ejercicio.
 * La dejamos aquí para no crear otro archivo.
 */
class Empleado {
    public String nombre;
    public int edad;
    public double salario;
    public String departamento;

    /**
     * Constructor.
     *
     * @param nombre nombre del empleado
     * @param edad edad del empleado
     * @param salario salario del empleado
     * @param departamento departamento del empleado
     */
    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }
}
