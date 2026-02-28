//ejemplos de violacion de la letra S de SOLID
public class S_SRP {
    public static void main(String[] args) {
        System.out.println("Aquí hay puras clases que hacen demasiadas cosas a la vez.");
    }
}

// EJEMPLO 1: El Doctor Multitask. 
// Un doctor debería curar, no andar cobrando en la caja.
class Doctor {
    public void diagnosticar() { /* Lógica médica */ }
    public void realizarCobro() { /* Esto debería hacerlo un Cajero o Contador */ }
}

// EJEMPLO 2: El Avión Chef.
// El avión está para volar, la cocina es otra responsabilidad distinta.
class Avion {
    public void despegar() { /* Lógica de vuelo */ }
    public void prepararCena() { /* El avión no debería saber de recetas */ }
}

// EJEMPLO 3: La Playlist que se manda sola.
// Una playlist solo debe guardar canciones, no andar bajando archivos de internet.
class Playlist {
    public void agregarCancion() { /* Lógica de lista */ }
    public void descargarDesdeServidor() { /* Esto lo debería hacer un Descargador */ }
}

// EJEMPLO 4: El Estudiante que es imprenta.
// Un estudiante estudia; generar archivos PDF es una tarea técnica que no le toca a él.
class Estudiante {
    public String nombre;
    public void estudiar() { }
    public void generarCertificadoPDF() { /* El pobre estudiante no sabe de formatos PDF */ }
}

// EJEMPLO 5: El Reloj que manda mensajes.
// Un reloj da la hora, si también manda SMS, ya se volvió un celular mal hecho.
class Reloj {
    public void darHora() { }
    public void enviarSMSAlarma() { /* Lógica de telefonía que no debería estar aquí */ }
}
