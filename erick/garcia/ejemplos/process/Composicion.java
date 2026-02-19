package erick.garcia.ejemplos.process;

public class Composicion {
    public static void main(String[] args) {
        Examen e = new Examen();
        System.out.println("El examen es de: " + e.pregunta.materia);
    }
}

class Examen {
    public Pregunta pregunta;

    public Examen() {
        this.pregunta = new Pregunta();
        this.pregunta.materia = "POO";
    }
}

class Pregunta {
    public String materia;
}
