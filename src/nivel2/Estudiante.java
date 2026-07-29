package nivel2;

import java.util.ArrayList;

// 1. Crear clase Estudiante
public class Estudiante {
    private String nombre;
    // 2. Agregar notas privadas
    private ArrayList<Double> notas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    // 5. Validar notas entre 0 y 100
    public void agregarNota(double nota) {
        if (nota >= 0 && nota <= 100) {
            notas.add(nota);
            System.out.println("Nota " + nota + " agregada a " + nombre);
        } else {
            System.out.println("Error: La nota debe estar entre 0 y 100.");
        }
    }

    // 3. Calcular promedio
    public double calcularPromedio() {
        if (notas.isEmpty()) return 0.0;
        
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    // 4. Mostrar resultado
    public void mostrarResultado() {
        double promedio = calcularPromedio();
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);
        if (promedio >= 60) {
            System.out.println("Estado: APROBADO\n");
        } else {
            System.out.println("Estado: REPROBADO\n");
        }
    }

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Maria");
        est1.agregarNota(67);
        est1.agregarNota(209); // Nota inválida
        est1.agregarNota(89);
        est1.mostrarResultado();
    }
}