package Practicas_Roadmap;

public class PersonaAtributosYmetodos {

    // ATRIBUTOS (privados → encapsulación)
    private String nombre;
    private int edad;

    // CONSTRUCTOR
    public PersonaAtributosYmetodos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // MÉTODO PARA MOSTRAR DATOS
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // MÉTODO PARA CUMPLIR AÑOS
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // 🔹 SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad >= 0) { 
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
}