package erick.garcia.proceso;

/**
 * Clase padre para todas las operaciones de la calculadora.
 * Es abstracta porque no hace nada por sí misma, solo define qué deben hacer las hijas.
 * Así aplicamos herencia y polimorfismo.
 */
public abstract class Operacion {
    /**
     * @param op1 Primer numero
     * @param op2 Segundo numero
     * @return El resultado de la cuenta
     */
    public abstract int realizarOperacion(int op1, int op2);
}

