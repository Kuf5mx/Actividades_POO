package Erick.Garcia.Actividad.Process;

/**
 * Clase para hacer la serie de Fibonacci.
 */
public class Fibonacci {
    // Cantidad de numeros a mostrar
    private int cantidad;

    /**
     * Constructor sin argumentos
     */
    public Fibonacci() {
        this.cantidad = 0;
    }

    /**
     * Constructor con la cantidad
     */
    public Fibonacci(int cantidad) {
        setCantidad(cantidad);
    }

    /**
     * Validamos que la cantidad no sea negativa
     */
    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor o igual a 0.");
        }
        this.cantidad = cantidad;
    }

    /**
     * Metodo que genera el arreglo con la serie
     */
    public long[] generarSerie() {
        if (this.cantidad == 0) return new long[0];
        long[] serie = new long[this.cantidad];
        long a = 0, b = 1;

        // Llenamos el arreglo con los valores
        for (int i = 0; i < this.cantidad; i++) {
            serie[i] = a;
            long temp = a + b;
            a = b;
            b = temp;
        }
        return serie;
    }

    @Override
    public String toString() {
        long[] serie = generarSerie();
        StringBuilder sb = new StringBuilder("Sucesión Fibonacci (" + this.cantidad + "): ");
        for (int i = 0; i < serie.length; i++) {
            sb.append(serie[i]).append(i < serie.length - 1 ? ", " : "");
        }
        return sb.toString();
    }
}
