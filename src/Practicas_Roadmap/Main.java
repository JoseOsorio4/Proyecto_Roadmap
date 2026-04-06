package Practicas_Roadmap;

public class Main {

    public static void main(String[] args) {
        ejercicioEnum();
        ejercicioInitializerBlock();
        ejercicioBloques();
        ejercicioEncapsulacion(); // 👈 agregamos esto
    }

    private static void ejercicioEnum() {
        Dias dia = Dias.LUNES;

        if (dia == Dias.SABADO || dia == Dias.DOMINGO) {
            System.out.println("Hoy " + dia + " es dia de descanso.");
        } else {
            System.out.println("Hoy " + dia + " es dia de hacer tareas.");
        }
    }

    private static void ejercicioInitializerBlock() {
        estudiante estudiante1 = new estudiante("Jose", "Osorio", 26);
        estudiante1.asignarMaterias("Fisica 1", "Progra 1", "Ingles Intermedio", "Calculo 1");

        estudiante estudiante2 = new estudiante("Jose", "Oliva", 24);
        estudiante2.asignarMaterias("Fisica", "Matematica", "Comunicacion", "Quimica 1");

        estudiante estudiante3 = new estudiante("Briana", "Maria", 20);
        estudiante3.asignarMaterias("Proceso informatico", "Espanol", "Historia", "Comunicacion");

        estudiante estudiante4 = new estudiante("Sara", "Espino", 23);
        estudiante4.asignarMaterias("Fisica", "Programacion 2", "Ingles avanzado", "Fisica 2");

        estudiante1.mostrar();
        estudiante2.mostrar();
        estudiante3.mostrar();
        estudiante4.mostrar();
    }

    private static void ejercicioBloques() {
        System.out.println("Inicio del main");

        EjemploBloques obj1 = new EjemploBloques();
        obj1.mostrarDatos();

        System.out.println("-----");

        EjemploBloques obj2 = new EjemploBloques();
        obj2.mostrarDatos();
    }

    // 
    private static void ejercicioEncapsulacion() {

        PersonaEncapsulacion persona1 = new PersonaEncapsulacion("Jose", 26);

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());

        System.out.println("-----");

        persona1.setNombre("Carlos");
        persona1.setEdad(30);

        System.out.println("Nombre actualizado: " + persona1.getNombre());
        System.out.println("Edad actualizada: " + persona1.getEdad());
    }
}