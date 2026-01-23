package actividad2.erick.garcia.proceso;

public class Potencia {
    /**
    * Eleva una base a un exponente entero no negativo.
    * Implementado con multiplicaciones consecutivas.
    *
    * @param op1 base
    * @param op2 exponente (debe ser >= 0)
    * @return op1 elevado a op2
     */
    public static int realizarOperacion(int op1, int op2) {
        if (op2 < 0) {
            throw new IllegalArgumentException("El exponente debe ser >= 0");
        }
        if (op2 == 0) return 1; // Todo número elevado a 0 es 1

        int resultado = 1;
        for (int i = 0; i < op2; i++) {
            resultado = Multiplicacion.realizarOperacion(resultado, op1);
        }
        return resultado;
    }
}