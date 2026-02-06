package erick.garcia.proceso;

public class Raiz extends Operacion {
    /**
    * Calcula la raíz entera probando números hasta atinarle o pasarse.
    * Usa la clase Potencia para verificar.
    *
    * @param op1 que raiz queremos como 2 para cuadrada o 3 cubica
    * @param op2 numero al que le sacamos raiz
    * @return la raiz entera aprox
     */
    @Override
    public int realizarOperacion(int op1, int op2) {
        if (op1 <= 0) {
            throw new IllegalArgumentException("El grado de la raíz debe ser > 0");
        }
        if (op2 < 0) {
            throw new IllegalArgumentException("No se soporta raíz entera de negativos");
        }

        int i = 1;
        Potencia potenciaOp = new Potencia();
        // Probamos números 1, 2, 3... elevándolos a la potencia 'op1'
        // hasta alcanzar o superar 'op2'
        while (true) {
            int potencia = potenciaOp.realizarOperacion(i, op1);
            if (potencia == op2) {
                return i; // Raíz exacta encontrada
            } else if (potencia > op2) {
                return i - 1; // Si nos pasamos, devolvemos el entero anterior (truncado)
            }
            i++;
        }
    }
}