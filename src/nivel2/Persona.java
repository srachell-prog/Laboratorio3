package nivel2;
public class Persona{
    // 1. Crear clase Persona con atributos privados
    private String nombre;
    private int edad;

    // 4. Crear constructor básico
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad); // Usamos el setter para aprovechar la validación
    }

    // 2. Crear getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    // 3. Validar edad en setter
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa. Se asignará 0.");
            this.edad = 0;
        }
    }

    // 5. Mostrar datos con método
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Rachell", 19);
        persona1.mostrarDatos();

        Persona persona2 = new Persona("Nahomy", -10); // Probando validación
        persona2.mostrarDatos();
    }
}