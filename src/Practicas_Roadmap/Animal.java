//EJEMPLO DE HERENCIA =)
package Practicas_Roadmap;

public class Animal {

 protected boolean vegetariano;
 protected String comida;
 protected int numeroPatas;

 public Animal() {
 }

 public Animal(boolean vegetariano, String comida, int numeroPatas) {
     this.vegetariano = vegetariano;
     this.comida = comida;
     this.numeroPatas = numeroPatas;
 }

 public boolean isVegetariano() {
     return vegetariano;
 }

 public void setVegetariano(boolean vegetariano) {
     this.vegetariano = vegetariano;
 }

 public String getComida() {
     return comida;
 }

 public void setComida(String comida) {
     this.comida = comida;
 }

 public int getNumeroPatas() {
     return numeroPatas;
 }

 public void setNumeroPatas(int numeroPatas) {
     this.numeroPatas = numeroPatas;
 }

 public void mostrarInfo() {
     System.out.println("Vegetariano: " + vegetariano);
     System.out.println("Comida: " + comida);
     System.out.println("Número de patas: " + numeroPatas);
 }
}