package erick.garcia.process;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * N15 - Menor salario (edad menos común)
 * Primero se cuentan edades y luego se compara salarios.
 */
public class N15_MenorSalarioEdadMenosComun {

    /**
     * Regresa el empleado con menor salario, pero solo de las edades que menos se repiten.
     *
     * @param empleados lista de empleados
     * @return empleado candidato o null si no hay datos
     */
    public static Empleado menorSalarioConEdadMenosComun(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        Map<Integer, Integer> conteoEdades = new HashMap<>();
        for (Empleado e : empleados) {
            if (e != null) {
                conteoEdades.put(e.edad, conteoEdades.getOrDefault(e.edad, 0) + 1);
            }
        }

        int minFrecuencia = Integer.MAX_VALUE;
        for (int freq : conteoEdades.values()) {
            if (freq < minFrecuencia) {
                minFrecuencia = freq;
            }
        }

        Empleado candidato = null;
        for (Empleado e : empleados) {
            if (e == null) {
                continue;
            }
            if (conteoEdades.get(e.edad) == minFrecuencia) {
                if (candidato == null || e.salario < candidato.salario) {
                    candidato = e;
                }
            }
        }

        return candidato;
    }

    /** Prueba con edades menos comunes (30 y 40). */
    @Test
    public void testMenorSalarioConEdadMenosComun() {
        // edades: 20 (2 veces), 30 (1 vez), 40 (1 vez) => menos común: 30 y 40
        // entre edad 30 (salario 30000) y edad 40 (salario 20000) => debe ganar D
        List<Empleado> empleados = Arrays.asList(
                new Empleado("A", 20, 50000, "sistemas"),
                new Empleado("B", 20, 40000, "ventas"),
                new Empleado("C", 30, 30000, "ventas"),
                new Empleado("D", 40, 20000, "sistemas")
        );

        Empleado menor = menorSalarioConEdadMenosComun(empleados);
        Assertions.assertNotNull(menor);
        Assertions.assertEquals("D", menor.nombre);
    }
}
