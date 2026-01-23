package actividad2.erick.garcia.proceso;

public class Multiplicacion{
    /**
    * Calcula el producto entero usando sumas repetidas.
    * También contempla multiplicadores negativos.
    *
    * @param op1 multiplicando
    * @param op2 multiplicador
    * @return el producto op1 * op2
     */
    public static int realizarOperacion(int op1, int op2) {
        if (op2 == 0 || op1 == 0) {
            return 0;
        }

        int veces = Math.abs(op2);
        int resultado = 0;
        for (int i = 0; i < veces; i++) {
            resultado = Suma.realizarOperacion(resultado, op1);
        }

        if (op2 < 0) {
            return -resultado;
        }
        return resultado;
    }
}
