//ejemplo de acceso a atributos de la clase padre desde la clase hija
package Practicas_Roadmap;

public class EstudianteAcceso extends PersonaAcceso {

    private String carnet;

    public EstudianteAcceso(String nombre, int edad, String pais, String carnet) {
        super(nombre, edad, pais);
        this.carnet = carnet;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("===== DATOS DEL ESTUDIANTE =====");

        // nombre es private en la clase padre
        // por eso usamos getNombre()
        System.out.println("Nombre: " + getNombre());

        // edad es protected
        System.out.println("Edad: " + edad);

        // pais es public
        System.out.println("Pais: " + pais);

        System.out.println("Carnet: " + carnet);
    }
}