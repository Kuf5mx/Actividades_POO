//ejemplos de violacion de la letra D de SOLID
public class D_DIP {
    public static void main(String[] args) {
        System.out.println("Aquí hay clases que están 'casadas' con otra clase y no pueden cambiar.");
    }
}

// EJEMPLO 1: El Lector que solo lee papel.
// Si el Lector solo conoce el "LibroFisico", nunca va a poder leer un PDF o un Kindle.
class LibroFisico {
    public String leerPagina() { return "Texto en papel"; }
}
class Lector {
    private LibroFisico libro = new LibroFisico(); // ¡Error! Estás amarrado al papel.
    public void leer() { libro.leerPagina(); }
}

// EJEMPLO 2: La Cafetera que desprecia otros granos.
// Si la cafetera solo acepta "CafeArabigo", ¿qué pasa si quiero un Robusta?
class CafeArabigo {
    public void moler() { }
}
class Cafetera {
    private CafeArabigo cafe = new CafeArabigo(); // Muy mal, la cafetera debería aceptar cualquier café.
}

// EJEMPLO 3: El Soldado que solo sabe disparar una sola arma.
// Si se le acaban las balas a la AK47, el pobre soldado no sabe usar ni una resortera.
class FusilAK47 {
    public void disparar() { }
}
class Soldado {
    private FusilAK47 arma = new FusilAK47(); // Debería depender de una interfaz "Arma".
}

// EJEMPLO 4: El Stereo que vive en los 90s.
// Si el Stereo solo conoce el CD, no lo puedes conectar a tu Spotify por Bluetooth.
class CompactDisc {
    public void sonar() { }
}
class Stereo {
    private CompactDisc cd = new CompactDisc(); // Estás amarrado a una tecnología vieja.
}

// EJEMPLO 5: El Carpintero que solo tiene un martillo.
// Si el carpintero solo conoce el martillo de madera, no puede clavar nada en una pared de concreto.
class MartilloMadera {
    public void golpear() { }
}
class Carpintero {
    private MartilloMadera herramienta = new MartilloMadera(); // Debería depender de un "Martillo" genérico.
}
