package Practicas_Roadmap;

public class Main {

    public static void main(String[] args) {
        ejercicioEnum();
        ejercicioInitializerBlock();
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
        estudiante estudiante1 = new estudiante("Jose",    "Osorio",     26);
        estudiante1.asignarMaterias("Fisica 1", "Progra 1", "Ingles Intermedio", "Calculo 1");

        estudiante estudiante2 = new estudiante("Jose ",   "Oliva",    24);
        estudiante2.asignarMaterias("fisica", "Matematica", "Comunicacion", "Quimica 1");

        estudiante estudiante3 = new estudiante("Briana",     "Maria", 20);
        estudiante3.asignarMaterias("Proceso informatico", "Espanol", "Historia", "Ciencias de la comunicacion");

        estudiante estudiante4 = new estudiante("Sara", "Espino",    23);
        estudiante4.asignarMaterias("Fisica", "Programacion 2", "Ingles avanzado", "Fisica 2");

        estudiante1.mostrar();
        estudiante2.mostrar();
        estudiante3.mostrar();
        estudiante4.mostrar();
    }
}