package erick.garcia.proceso;

public class Division extends Operacion {
    /**
    * Divide usando restas. Vamos quitando el divisor hasta que no se pueda más.
    * Checamos que no sea división entre cero.
    *
    * @param op1 el que vamos a dividir
    * @param op2 entre cuanto dividimos
    * @return cuantas veces cupo (cociente)
     */
    @Override
    public int realizarOperacion(int op1, int op2) {
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
        Resta resta = new Resta();

        while (acumulado >= divisor) {
            acumulado = resta.realizarOperacion(acumulado, divisor);
            cociente++;
        }

        boolean negativo = (op1 < 0) ^ (op2 < 0);
        return negativo ? -cociente : cociente;
    }
}
