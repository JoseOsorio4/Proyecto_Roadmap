package Practicas_Roadmap;

public class EjemplopasoporReferenciayporValor {

    public int num;

    // Constructor
    public EjemplopasoporReferenciayporValor(int num) {
        this.num = num;
    }

    // Método para modificar primitivas
    public static void modificarPrimitivos(int x, int y) {
        x = 5;
        y = 10;
    }

    // Método para modificar objetos
    public static void modificarObjetos(EjemplopasoporReferenciayporValor a,
                                        EjemplopasoporReferenciayporValor b) {
        a.num++;   // sí afecta al original

        b = new EjemplopasoporReferenciayporValor(1);
        b.num++;   // NO afecta al original
    }
}
