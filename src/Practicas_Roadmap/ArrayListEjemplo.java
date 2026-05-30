package Practicas_Roadmap;

import java.util.ArrayList;

public class ArrayListEjemplo {

    private ArrayList<String> estudiantes;

    public ArrayListEjemplo() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre) {
        estudiantes.add(nombre);
    }

    public void eliminarEstudiante(String nombre) {
        estudiantes.remove(nombre);
    }

    public void buscarEstudiante(String nombre) {

        if (estudiantes.contains(nombre)) {
            System.out.println(nombre + " sí existe en la lista.");
        } else {
            System.out.println(nombre + " no existe en la lista.");
        }
    }

    public void mostrarEstudiantes() {

        System.out.println("Lista de estudiantes:");

        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }

        System.out.println("Total de estudiantes: " + estudiantes.size());
    }
}