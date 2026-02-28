//ejemplos de violacion de la letra O de SOLID
public class O_OCP {
    public static void main(String[] args) {
        System.out.println("Aquí hay clases que te obligan a usar mucho IF/ELSE para crecer.");
    }
}

// EJEMPLO 1: El sensor de clima caprichoso.
// Si mañana compro un sensor de viento, tengo que venir a este código y poner otro 'else if'.
class MonitorClima {
    public void leer(String tipo) {
        if (tipo.equals("Temperatura")) { /* ... */ }
        else if (tipo.equals("Humedad")) { /* ... */ }
    }
}

// EJEMPLO 2: La taquilla que no quiere a los abuelitos.
// Si quiero agregar descuento para adultos mayores, tengo que modificar la clase Taquilla.
class TaquillaCine {
    public double precio(String categoria) {
        if (categoria.equals("NIÑO")) return 50.0;
        if (categoria.equals("ADULTO")) return 100.0;
        return 0;
    }
}

// EJEMPLO 3: El exportador que se quedó en el pasado.
// Para agregar iCloud, tengo que abrir este archivo y meterle mano al código viejo.
class ExportadorContactos {
    public void exportar(String plataforma) {
        switch(plataforma) {
            case "GMAIL": break;
            case "OUTLOOK": break;
        }
    }
}

// EJEMPLO 4: El robot de cocina con menú cerrado.
// Si quiero cocinar Tacos, este robot no me deja a menos que le cambie los cables internos.
class CocinaAutomatica {
    public void cocinar(String receta) {
        if (receta.equals("Pasta")) { }
        else if (receta.equals("Pizza")) { }
    }
}

// EJEMPLO 5: El guardia que solo conoce dos papeles.
// Si aparece una Licencia de Conducir, el guardia no sabe qué hacer hasta que le edite el cerebro.
class ValidadorIdentidad {
    public void validar(String doc) {
        if (doc.equals("DNI") || doc.equals("PASAPORTE")) { /* ... */ }
    }
}
