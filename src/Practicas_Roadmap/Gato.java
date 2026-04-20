package Practicas_Roadmap;

public class Gato extends Animal {

 private String color;

 public Gato(boolean vegetariano, String comida, int numeroPatas) {
     super(vegetariano, comida, numeroPatas);
     this.color = "Blanco";
 }

 public Gato(boolean vegetariano, String comida, int numeroPatas, String color) {
     super(vegetariano, comida, numeroPatas);
     this.color = color;
 }

 public String getColor() {
     return color;
 }

 public void setColor(String color) {
     this.color = color;
 }

 @Override
 public void mostrarInfo() {
     super.mostrarInfo(); 
     System.out.println("Color: " + color);
 }
}