package Practicas_Roadmap;

public class Main {

    public static void main(String[] args) {

    	    ejercicioEnum(); // enums
    	    ejercicioInitializerBlock(); // bloque de inicializacion, bloque estatico y bloque de instancia
    	    ejercicioBloques(); // bloques de inicializacion, bloques estaticos y bloques de instancia
    	    ejercicioEncapsulacion(); // encapsulacion
    	    ejercicioPasoPorValorYReferencia(); // paso por valor y referencia
    	    ejercicioAtributosYMetodos();// atributos y metodos
    	    ejercicioAnimal();//herencia
    	    ejercicioClasesYObjetos();// clases y objetos
    	    ejercicioTransporte(); // Polimorfismo
    	    ejercicioOverloadingYOverriding();
    	    ejercicioArrayList(); // ArrayList
    	    ejercicioExceptionHandling(); // Exception Handling
    	    ejercicioAccessModifiers(); // Access Modifiers
    	    ejercicioGettersYSetters(); // Getters y Setters
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

        estudiante estudiante1 = new estudiante("Jose", "Osorio", 26);
        estudiante1.asignarMaterias("Fisica 1", "Progra 1", "Ingles Intermedio", "Calculo 1");

        estudiante estudiante2 = new estudiante("Jose", "Oliva", 24);
        estudiante2.asignarMaterias("Fisica", "Matematica", "Comunicacion", "Quimica 1");

        estudiante estudiante3 = new estudiante("Briana", "Maria", 20);
        estudiante3.asignarMaterias("Proceso informatico", "Espanol", "Historia", "Comunicacion");

        estudiante estudiante4 = new estudiante("Sara", "Espino", 23);
        estudiante4.asignarMaterias("Fisica", "Programacion 2", "Ingles avanzado", "Fisica 2");

        estudiante1.mostrar();
        estudiante2.mostrar();
        estudiante3.mostrar();
        estudiante4.mostrar();
    }

    private static void ejercicioBloques() {

        System.out.println("Inicio del main");

        EjemploBloques obj1 = new EjemploBloques();
        obj1.mostrarDatos();

        System.out.println("-----");

        EjemploBloques obj2 = new EjemploBloques();
        obj2.mostrarDatos();
    }

    private static void ejercicioEncapsulacion() {

        PersonaEncapsulacion persona1 = new PersonaEncapsulacion("Jose", 26);

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());

        System.out.println("-----");

        persona1.setNombre("Carlos");
        persona1.setEdad(30);

        System.out.println("Nombre actualizado: " + persona1.getNombre());
        System.out.println("Edad actualizada: " + persona1.getEdad());
    }

    private static void ejercicioPasoPorValorYReferencia() {

        System.out.println("\n===== PASO POR VALOR Y REFERENCIA =====");

        int x = 1;
        int y = 2;

        System.out.println("Antes (primitivos): x=" + x + ", y=" + y);

        EjemplopasoporReferenciayporValor.modificarPrimitivos(x, y);

        System.out.println("Después (primitivos): x=" + x + ", y=" + y);

        EjemplopasoporReferenciayporValor a =
                new EjemplopasoporReferenciayporValor(1);

        EjemplopasoporReferenciayporValor b =
                new EjemplopasoporReferenciayporValor(1);

        System.out.println("\nAntes (objetos): a=" + a.num + ", b=" + b.num);

        EjemplopasoporReferenciayporValor.modificarObjetos(a, b);

        System.out.println("Después (objetos): a=" + a.num + ", b=" + b.num);
    }

    private static void ejercicioAtributosYMetodos() {

        System.out.println("\n===== ATRIBUTOS Y MÉTODOS =====");

        PersonaAtributosYmetodos persona1 =
                new PersonaAtributosYmetodos("Jose", 26);

        persona1.mostrarDatos();

        System.out.println("-----");

        persona1.cumplirAnios();

        System.out.println("-----");

        persona1.setNombre("Carlos");
        persona1.setEdad(30);

        persona1.mostrarDatos();
    }

    private static void ejercicioAnimal() {

        System.out.println("\n===== HERENCIA ANIMAL =====");

        Gato gato = new Gato(false, "leche", 4, "negro");

        System.out.println("¿Es vegetariano? " + gato.isVegetariano());
        System.out.println("Come: " + gato.getComida());
        System.out.println("Número de patas: " + gato.getNumeroPatas());
        System.out.println("Color: " + gato.getColor());

        System.out.println("\n--- Método sobrescrito ---");
        gato.mostrarInfo();
    }

    private static void ejercicioClasesYObjetos() {

        System.out.println("\n===== CLASES Y OBJETOS =====");

        Lampara led = new Lampara();
        Lampara halogena = new Lampara();

        led.encender();
        halogena.apagar();

        System.out.println("-----");

        led.mostrarEstado();
        halogena.mostrarEstado();
    }

    private static void ejercicioTransporte() { // Polimorfismo

        System.out.println("-----");
        System.out.println("Transporte");

        Transporte transporte = new Avion();
        transporte.movimiento();
    }

    private static void ejercicioOverloadingYOverriding() {

        System.out.println("\n===== OVERLOADING Y OVERRIDING =====");

        Moto moto = new Moto();

        moto.encender();

        moto.acelerar();

        moto.acelerar(80);

        moto.acelerar("Sport");
    }

    private static void ejercicioArrayList() {

        System.out.println("\n===== ARRAYLIST =====");

        ArrayListEjemplo lista = new ArrayListEjemplo();

        lista.agregarEstudiante("Jose");
        lista.agregarEstudiante("Briana");
        lista.agregarEstudiante("Sara");
        lista.agregarEstudiante("Carlos");

        System.out.println("\nBuscando estudiante:");
        lista.buscarEstudiante("Jose");

        System.out.println("\nEliminando estudiante:");
        lista.eliminarEstudiante("Sara");

        System.out.println("\nMostrando lista:");
        lista.mostrarEstudiantes();
    }

    private static void ejercicioExceptionHandling() {

        System.out.println("\n===== EXCEPTION HANDLING =====");

        EjemploExceptionHandling ejemplo =
                new EjemploExceptionHandling();

        ejemplo.dividir(20, 5);

        System.out.println("-----");

        ejemplo.dividir(20, 0);
    }
    private static void ejercicioAccessModifiers() {
    	System.out.println("\n===== ACCESS MODIFIERS =====");

        EstudianteAcceso estudiante =
                new EstudianteAcceso(
                        "Jose",
                        
                        26,
                        "Guatemala",
                        "20240001"
                );

        System.out.println("\n--- Datos iniciales ---");
        estudiante.mostrarInformacion();

        System.out.println("\n--- Modificando nombre con Setter ---");

        estudiante.setNombre("Carlos");

        System.out.println("Nombre actualizado: "
                + estudiante.getNombre());

        System.out.println("\n--- Accediendo a atributo public ---");

        System.out.println("Pais: "
                + estudiante.pais);
    }
    private static void ejercicioGettersYSetters() {
		System.out.println("\n===== GETTERS Y SETTERS =====");

		CuentaBancaria cuenta =
				new CuentaBancaria("Jose", 1000);

		System.out.println("\n--- Datos iniciales ---");
		cuenta.mostrarCuenta();

		System.out.println("\n--- Modificando saldo con Setter ---");
		cuenta.setSaldo(1500);

		System.out.println("Saldo actualizado: "
				+ cuenta.getSaldo());

		System.out.println("\n--- Intentando asignar saldo negativo ---");
		cuenta.setSaldo(-500);
    } 
}