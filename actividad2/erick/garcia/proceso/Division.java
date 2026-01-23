package actividad2.erick.garcia.proceso;

public class Division {
    /**
    * Realiza división entera por restas sucesivas.
    * Si el divisor es 0, se lanza una excepción.
    *
    * @param op1 dividendo
    * @param op2 divisor
    * @return el cociente entero de op1 / op2 (truncado hacia 0)
     */
    public static int realizarOperacion(int op1, int op2) {
        if (op2 == 0) {
            throw new ArithmeticException("/ by zero");
        }

        if (op1 == 0) {
            return 0;
        }

        int dividendo = Math.abs(op1);
        int divisor = Math.abs(op2);
        int cociente = 0;
        int acumulado = dividendo;

        while (acumulado >= divisor) {
            acumulado = Resta.realizarOperacion(acumulado, divisor);
            cociente++;
        }

        boolean negativo = (op1 < 0) ^ (op2 < 0);
        return negativo ? -cociente : cociente;
    }
}
