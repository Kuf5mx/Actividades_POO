package erick.garcia.proceso;

public class Resta extends Operacion {

    /**
     * Se encarga de restar dos números.
     * Hereda de la clase Operacion.
     *
     * @param op1 al que le vamos a quitar
     * @param op2 lo que vamos a quitar
     * @return la resta
     */
    @Override
    public int realizarOperacion(int op1, int op2) {
        return op1 - op2;
    }
}
