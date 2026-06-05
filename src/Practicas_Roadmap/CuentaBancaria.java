// Ejemplo de gettters and setters para encapsulación
package Practicas_Roadmap;

public class CuentaBancaria {

    // Atributos privados (encapsulación)
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getter para titular
    public String getTitular() {
        return titular;
    }

    // Setter para titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter para saldo con validación
    public void setSaldo(double saldo) {

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("No se puede asignar un saldo negativo.");
        }
    }

    // Método para mostrar datos
    public void mostrarCuenta() {

        System.out.println("Titular: " + titular);
        System.out.println("Saldo: Q" + saldo);
    }
}