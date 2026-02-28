//ejemplos de violacion de la letra L de SOLID
public class L_LSP {
    public static void main(String[] args) {
        System.out.println("Aquí hay hijos que no pueden hacer lo que sus padres prometieron.");
    }
}

// EJEMPLO 1: El teléfono que te deja colgado.
// Si heredas de Teléfono, ¡se supone que puedes llamar! Pero este Smartphone lanza errores.
class Telefono {
    public void llamar() { System.out.println("Llamando..."); }
}
class SmartphoneSinChip extends Telefono {
    @Override
    public void llamar() { throw new RuntimeException("¡Sorpresa! No tengo chip, no puedo llamar."); }
}

// EJEMPLO 2: La impresora 3D que no entiende el papel.
// Una impresora 3D no tiene por qué heredar de una de papel si no sabe qué hacer con las hojas.
class ImpresoraPapel {
    public void cargarHojas() { System.out.println("Hojas cargadas"); }
}
class Impresora3D extends ImpresoraPapel {
    @Override
    public void cargarHojas() {
        // ¿Qué hago con esto? Yo uso plástico, no hojas.
    }
}

// EJEMPLO 3: El control remoto de adorno.
// El código espera que el control remoto funcione, no que sea de plástico hueco.
class ControlRemoto {
    public void cambiarCanal() { }
}
class ControlJuguete extends ControlRemoto {
    @Override
    public void cambiarCanal() {
        // No hace nada. Si el usuario intenta cambiar el canal, se va a desesperar.
    }
}

// EJEMPLO 4: El coche eléctrico que "toma" gasolina.
// Si es eléctrico, no debería tener un método para cargar gasolina que solo lance errores.
class CocheGasolina {
    public void cargarGasolina() { }
}
class CocheElectrico extends CocheGasolina {
    @Override
    public void cargarGasolina() {
        throw new UnsupportedOperationException("¡Oye! Soy eléctrico, me vas a quemar.");
    }
}

// EJEMPLO 5: La calculadora que se olvidó de sumar.
// Si heredas de Calculadora, no puedes dejar el método sumar vacío. ¡Es tu único trabajo!
class CalculadoraBase {
    public void sumar() { }
}
class CalculadoraDañada extends CalculadoraBase {
    @Override
    public void sumar() {
        // No hace nada. Rompiste la confianza de quien usa la clase padre.
    }
}
