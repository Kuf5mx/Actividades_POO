package erick.garcia.proceso;

public class Logaritmo extends Operacion {
    /**
     * Calcula logaritmo entero multiplicando la base muchas veces.
     * Es como lo contrario a la potencia.
     *
     * @param op1 base del logaritmo
     * @param op2 numero a calcular
     * @return el resultado aproximado
     */
    @Override
    public int realizarOperacion(int op1, int op2) {
        if (op1 <= 1) {
            throw new IllegalArgumentException("La base debe ser > 1");
        }
        if (op2 <= 0) {
            throw new IllegalArgumentException("El argumento debe ser > 0");
        } 

        
        int exponente = 0;
        int valorActual = 1;
        Multiplicacion multiplicacion = new Multiplicacion();

        // Multiplicamos la base por sí misma hasta alcanzar el argumento
        while (valorActual < op2) {
            valorActual = multiplicacion.realizarOperacion(valorActual, op1);
            exponente++;
        }

        // Ajuste simple: si nos pasamos, verificamos si el anterior era el exacto o retornamos aprox
        if (valorActual > op2) {
            // Lógica simple para logaritmo entero (floor)
            return exponente - 1;
        }
        return exponente;
    }
}
