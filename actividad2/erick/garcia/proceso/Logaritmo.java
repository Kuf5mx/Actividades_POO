package actividad2.erick.garcia.proceso;

public class Logaritmo {
    /**
     * Calcula el logaritmo entero en base op1.
     * Devuelve el exponente máximo e tal que op1^e <= op2.
     *
     * @param op1 base (debe ser > 1)
     * @param op2 argumento (debe ser > 0)
     * @return logaritmo entero (floor)
     */
    public static int realizarOperacion(int op1, int op2) {
        if (op1 <= 1) {
            throw new IllegalArgumentException("La base debe ser > 1");
        }
        if (op2 <= 0) {
            throw new IllegalArgumentException("El argumento debe ser > 0");
        }

        int exponente = 0;
        int valorActual = 1;

        // Multiplicamos la base por sí misma hasta alcanzar el argumento
        while (valorActual < op2) {
            valorActual = Multiplicacion.realizarOperacion(valorActual, op1);
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
