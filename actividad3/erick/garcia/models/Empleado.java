package erick.garcia.models;

/**
 * Empleado
 * Clase sencilla para los ejercicios de empleados.
 */
public class Empleado {
    public String nombre;
    public int edad;
    public double salario;
    public String departamento;

    
    /**
     * Constructor.
     *
     * @param nombre nombre del empleado
     * @param edad edad del empleado
     * @param salario salario del empleado
     * @param departamento departamento del empleado
     */
    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }
}
