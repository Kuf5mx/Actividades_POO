package erick.garcia.proceso;

public class Potencia extends Operacion {
    /**
    * Eleva un número a una potencia usando multiplicaciones en un ciclo.
    * Uso la clase Multiplicacion para no repetir código.
    *
    * @param op1 base
    * @param op2 exponente o las veces
    * @return resultado de la potencia
     */
    @Override
    public int realizarOperacion(int op1, int op2) {
        if (op2 < 0) {
            throw new IllegalArgumentException("El exponente debe ser >= 0");
        }
        if (op2 == 0) return 1; // Todo número elevado a 0 es 1

        
        int resultado = 1;
        Multiplicacion multiplicacion = new Multiplicacion();
        for (int i = 0; i < op2; i++) {
            resultado = multiplicacion.realizarOperacion(resultado, op1);
        }
        return resultado;
    }
}