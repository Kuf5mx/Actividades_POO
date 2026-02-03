package actividad2.erick.garcia.proceso;

public class Raiz {
    /**
    * Calcula la raíz entera (parte entera) de un radicando.
    * Busca por aproximación incrementando candidatos hasta pasarse.
    *
    * @param op1 grado de la raíz (por ejemplo 2 para raíz cuadrada)
    * @param op2 radicando (debe ser >= 0)
    * @return la raíz entera aproximada
     */
    public static int realizarOperacion(int op1, int op2) {
        if (op1 <= 0) {
            throw new IllegalArgumentException("El grado de la raíz debe ser > 0");
        }
        if (op2 < 0) {
            throw new IllegalArgumentException("No se soporta raíz entera de negativos");
        }

        int i = 1;
        // Probamos números 1, 2, 3... elevándolos a la potencia 'op1'
        // hasta alcanzar o superar 'op2'
        while (true) {
            int potencia = Potencia.realizarOperacion(i, op1);
            if (potencia == op2) {
                return i; // Raíz exacta encontrada
            } else if (potencia > op2) {
                return i - 1; // Si nos pasamos, devolvemos el entero anterior (truncado)
            }
            i++;
        }
    }
}