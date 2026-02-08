package erick.garcia.proceso;

public class Modulo extends Operacion {
    /**
    * Calcula el residuo de la división o sea lo que sobra.
    * Usa restas sucesivas igual que la división.
    *
    * @param op1 numero original
    * @param op2 entre cuanto dividimos
    * @return lo que sobró
     */
    @Override
    public int realizarOperacion(int op1, int op2) {
        if (op2 == 0) {
            throw new ArithmeticException("/ by zero");
        }

        int residuoAbs = Math.abs(op1);
        int divisorAbs = Math.abs(op2);
        Resta resta = new Resta();

    
        while (residuoAbs >= divisorAbs) {
            residuoAbs = resta.realizarOperacion(residuoAbs, divisorAbs);
        }

        return op1 < 0 ? -residuoAbs : residuoAbs;
    }
}