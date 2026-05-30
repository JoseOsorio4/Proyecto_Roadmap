package Practicas_Roadmap;

public class EjemploExceptionHandling {

    public void dividir(int num1, int num2) {

        try {

            int resultado = num1 / num2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: No se puede dividir entre cero.");

        } finally {

            System.out.println("Operación finalizada.");
        }
    }
}