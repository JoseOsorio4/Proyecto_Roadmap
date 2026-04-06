package Practicas_Roadmap;

public class EjemploBloques {

    // Variable estática
    static int numeroEstatico;

    // Variable de instancia
    int numero;

    // 🔹 Bloque estático
    static {
        numeroEstatico = 100;
        System.out.println("Bloque estático ejecutado");
    }

    // 🔹 Bloque de inicialización de instancia
    {
        numero = 50;
        System.out.println("Bloque de instancia ejecutado");
    }

    // 🔹 Constructor
    public EjemploBloques() {
        System.out.println("Constructor ejecutado");
    }

    // Método para mostrar valores
    public void mostrarDatos() {
        System.out.println("Número estático: " + numeroEstatico);
        System.out.println("Número de instancia: " + numero);
    }
}