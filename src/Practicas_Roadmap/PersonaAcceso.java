//modificadores de accceso:public,private,protected,default
package Practicas_Roadmap;

public class PersonaAcceso {

    // private: solo accesible mediante getters/setters
    private String nombre;

    // protected: accesible en clases hijas
    protected int edad;

    // public: accesible desde cualquier clase
    public String pais;

    public PersonaAcceso(String nombre, int edad, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Pais: " + pais);
    }
}