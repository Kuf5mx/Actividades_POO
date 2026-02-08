package erick.garcia.proceso;

public class Suma extends Operacion {
    /**
     * Realiza la suma de dos números.
     * Es una clase hija de Operacion.
     *
     * @param op1 primer numero
     * @param op2 segundo numero
     * @return la suma de los dos
     */
    @Override
    public int realizarOperacion(int op1, int op2) {
        return op1 + op2;
    }
}
