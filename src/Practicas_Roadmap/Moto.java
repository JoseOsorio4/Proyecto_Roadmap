    package Practicas_Roadmap;

	public class Moto extends Vehiculo {

	    // OVERRIDING
	    @Override
	    public void encender() {

	        System.out.println("La moto enciende con boton electrico.");

	    }

	    // OVERLOADING
	    public void acelerar() {

	        System.out.println("La moto esta acelerando.");

	    }

	    public void acelerar(int velocidad) {

	        System.out.println("La moto acelera a " + velocidad + " km/h.");

	    }

	    public void acelerar(String modo) {

	        System.out.println("La moto acelera en modo " + modo + ".");

	    }

	}
