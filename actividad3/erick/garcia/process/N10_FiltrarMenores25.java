package erick.garcia.process;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N10 - Filtrar menores de 25
 */
public class N10_FiltrarMenores25 {

    /**
     * Regresa una lista con los empleados menores de 25.
     *
     * @param empleados lista de empleados
     * @return lista filtrada (si no hay, regresa lista vacía)
     */
    public static List<Empleado> filtrarMenoresDe25(List<Empleado> empleados) {
        List<Empleado> salida = new ArrayList<>();
        if (empleados == null || empleados.isEmpty()) {
            return salida;
        }

        for (Empleado e : empleados) {
            if (e != null && e.edad < 25) {
                salida.add(e);
            }
        }
        return salida;
    }

    /** Checa que salgan 2 empleados. */
    @Test
    public void testFiltrarMenoresDe25() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("A", 20, 20000, "sistemas"),
                new Empleado("B", 30, 30000, "ventas"),
                new Empleado("C", 24, 25000, "sistemas")
        );

        List<Empleado> menores = filtrarMenoresDe25(empleados);
        Assertions.assertEquals(2, menores.size());
    }
}
