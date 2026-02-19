package erick.garcia.ejemplos.process;
public class Agregacion {
    public static void main(String[] args) {
        Mochila m = new Mochila();
        Pluma p = new Pluma();
        p.color = "Azul";

        // La mochila tiene la pluma (Agregación)
        m.plumaEnMochila = p;

        System.out.println("En la mochila hay una pluma " + m.plumaEnMochila.color);
    }
}

class Mochila {
    public Pluma plumaEnMochila;
}

class Pluma {
    public String color;
}
