package erick.garcia.proceso;

public class Multiplicacion extends Operacion {
    /**
    * Multiplica dos números usando sumas repetidas con un ciclo for.
    * También maneja si el segundo número es negativo.
    *
    * @param op1 numero a multiplicar
    * @param op2 cuantas veces
    * @return el resultado de la multiplicacion
     */
    @Override
    public int realizarOperacion(int op1, int op2) {
        if (op2 == 0 || op1 == 0) {
            return 0;
        }

        int veces = Math.abs(op2);
        int resultado = 0;
        Suma suma = new Suma();
        for (int i = 0; i < veces; i++) {
            resultado = suma.realizarOperacion(resultado, op1);
        }

        if (op2 < 0) {
            return -resultado;
        }
        return resultado;
    }
}
