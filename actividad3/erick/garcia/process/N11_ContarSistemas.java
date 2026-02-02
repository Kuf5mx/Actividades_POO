package erick.garcia.process;

import java.util.Arrays;
import java.util.List;

import erick.garcia.models.Empleado;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N11 - Contar departamento sistemas
 */
public class N11_ContarSistemas {

    
    /**
     * Cuenta los empleados que están en sistemas.
     *
     * @param empleados lista de empleados
     * @return número de empleados en sistemas
     */
    public static int contarDepartamentoSistemas(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return 0;
        }

        int contador = 0;
        for (Empleado e : empleados) {
            if (e == null || e.departamento == null) {
                continue;
            }
            if (e.departamento.equalsIgnoreCase("sistemas")) {
                contador++;
            }
        }
        return contador;
    }

    /** Prueba con "sistemas" y "SISTEMAS". */
    @Test
    public void testContarDepartamentoSistemas() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("A", 20, 20000, "sistemas"),
                new Empleado("B", 30, 30000, "ventas"),
                new Empleado("C", 24, 25000, "SISTEMAS")
        );

        Assertions.assertEquals(2, contarDepartamentoSistemas(empleados));
    }
}
