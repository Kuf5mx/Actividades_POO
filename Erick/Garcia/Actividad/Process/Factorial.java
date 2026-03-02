package Erick.Garcia.Actividad.Process;

/**
 * Calculamos el factorial de un numero
 */
public class Factorial {
    // Variable para guardar el numero
    private int numero;

    /**
     * Constructor vacio
     */
    public Factorial() {
        this.numero = 0;
    }

    /**
     * Constructor con parametros
     */
    public Factorial(int numero) {
        setNumero(numero);
    }

    /**
     * Metodo set para validar que no sea negativo
     */
    public void setNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    /**
     * Aqui se hace el calculo del factorial multiplicando
     */
    public long calcular() {
        long result = 1;
        // Ciclo para multiplicar los numeros
        for (int i = 1; i <= this.numero; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public String toString() {
        return "El factorial de " + this.numero + " es: " + calcular();
    }
}
