//ejemplos de violacion de la letra I de SOLID
public class I_ISP {
    public static void main(String[] args) {
        System.out.println("Aquí verás interfaces tan grandes que las clases sufren por cumplirlas.");
    }
}

// EJEMPLO 1: El Refri que no sabe de ropa.
// ¿Por qué obligar a un refrigerador a tener un botón de "lavar"?
interface IElectrodomestico {
    void lavar();
    void enfriar();
}
class Refrigerador implements IElectrodomestico {
    public void enfriar() { }
    public void lavar() { /* ¡Yo solo guardo chescos, no lavo calcetines! */ }
}

// EJEMPLO 2: El corredor que no vuela.
// No todos los atletas saltan con garrocha. No los obligues a saber cómo hacerlo.
interface IAtleta {
    void correr();
    void saltarGarrocha();
}
class Corredor100Metros implements IAtleta {
    public void correr() { }
    public void saltarGarrocha() { /* No es lo mío, jefe. */ }
}

// EJEMPLO 3: La silla que no es cama.
// Una silla es para sentarse. Si la interfaz dice que también es para dormir, la silla va a fallar.
interface IMueble {
    void sentarse();
    void acostarse();
}
class SillaComedor implements IMueble {
    public void sentarse() { }
    public void acostarse() { /* Si te duermes aquí, te va a doler la espalda. */ }
}

// EJEMPLO 4: El teclado que no hace clicks.
// Un teclado no es un mouse. No le pongas métodos de mouse a una interfaz de entrada genérica.
interface IEntrada {
    void teclear();
    void hacerClick();
}
class Teclado implements IEntrada {
    public void teclear() { }
    public void hacerClick() { /* El teclado no tiene botones de click... */ }
}

// EJEMPLO 5: La cámara digital que no es Polaroid.
// Si mi cámara es digital, no me obligues a tener un método para "imprimir instantánea".
interface ICamara {
    void tomarFoto();
    void imprimirInstantanea();
}
class CamaraDigital implements ICamara {
    public void tomarFoto() { }
    public void imprimirInstantanea() { /* Guardo fotos en la SD, no tengo papel. */ }
}
