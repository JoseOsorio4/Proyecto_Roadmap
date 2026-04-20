//Ejemplo de Java Class and Objects =)

package Practicas_Roadmap;

public class Lampara {

    private boolean encendida;

    public void encender() {
        encendida = true;
        System.out.println("¿Lámpara encendida? " + encendida);
    }

    public void apagar() {
        encendida = false;
        System.out.println("¿Lámpara encendida? " + encendida);
    }

    public void mostrarEstado() {
        if (encendida) {
            System.out.println("La lámpara está ENCENDIDA");
        } else {
            System.out.println("La lámpara está APAGADA");
        }
    }
}