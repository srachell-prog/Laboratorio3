package nivel3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        
        System.out.println("--- 1. HERENCIA Y POLIMORFISMO ---");
        // Crear objeto y probar herencia simple
        Perro miPerro = new Perro();
        System.out.print("Prueba individual de perro: ");
        miPerro.sonido();

        // Crear lista de animales genéricos
        ArrayList<Animal> refugio = new ArrayList<>();
        refugio.add(new Perro());
        refugio.add(new Gato());
        refugio.add(new Animal());

        System.out.println("\nEjecutando polimorfismo en la lista de animales:");
        // Recorrer lista y ejecutar métodos (cada uno hace su propio sonido)
        for (Animal animal : refugio) {
            animal.sonido();
        }

        System.out.println("\n--- 2. ABSTRACCIÓN ---");
        // Usar varias figuras en lista
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(5.0));  
        figuras.add(new Circulo(2.0));   
        figuras.add(new Cuadrado(4.5)); 
        System.out.println("Calculando áreas con polimorfismo:");
        for (Figura fig : figuras) {
            System.out.println("Área calculada: " + String.format("%.2f", fig.area()));
        }

        System.out.println("\n--- 3. INTERFACES (VEHÍCULOS) ---");
        Vehiculo miAuto = new Carro();
        Vehiculo miMotocicleta = new Moto();

        System.out.println("Probando el Carro:");
        miAuto.arrancar();
        miAuto.acelerar(80);
        miAuto.detener();

        System.out.println("\nProbando la Moto:");
        miMotocicleta.arrancar();
        miMotocicleta.acelerar(110);
        miMotocicleta.detener();
    }
}
