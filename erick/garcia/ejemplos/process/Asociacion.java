package erick.garcia.ejemplos.process;

public class Asociacion {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        lap.marca = "Dell";

        Estudiante est = new Estudiante();
        est.nombre = "Erick";
        
        // El estudiante usa la laptop (Asociación)
        est.estudiar(lap);
    }
}

class Estudiante {
    public String nombre;
    public void estudiar(Laptop l) {
        System.out.println(nombre + " estudia en una " + l.marca);
    }
}

class Laptop {
    public String marca;
}
