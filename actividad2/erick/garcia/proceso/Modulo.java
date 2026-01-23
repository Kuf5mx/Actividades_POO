package actividad2.erick.garcia.proceso;

public class Modulo {
    /**
    * Obtiene el residuo entero utilizando restas repetidas.
    *
    * @param op1 dividendo
    * @param op2 divisor
    * @return el residuo de op1 % op2
     */
    public static int realizarOperacion(int op1, int op2) {
        if (op2 == 0) {
            throw new ArithmeticException("/ by zero");
        }

        int residuoAbs = Math.abs(op1);
        int divisorAbs = Math.abs(op2);

        while (residuoAbs >= divisorAbs) {
            residuoAbs = Resta.realizarOperacion(residuoAbs, divisorAbs);
        }

        return op1 < 0 ? -residuoAbs : residuoAbs;
    }
}