package nivel2;
// 1. Crear clase Empleado
public class Empleado {
    private String nombre;
    private String puesto;
    // 2. Encapsular salario
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        setSalario(salario);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    
    public double getSalario() { return salario; }

    // 3. Validar salario positivo
    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Aviso: Salario no puede ser negativo o cero. Se asignará el salario mínimo (Q1000).");
            this.salario = 1000.0;
        }
    }

    // 4. Mostrar datos
    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre + " | Puesto: " + puesto + " | Salario: Q" + salario);
    }

    public static void main(String[] args) {
        System.out.println("--- REGISTRO DE EMPLEADOS ---");
        // 5. Crear varios objetos
        Empleado emp1 = new Empleado("Pablo ", "Manager", 5000.0);
        Empleado emp2 = new Empleado("Rocio", "Secretaria", 4200.0);
        Empleado emp3 = new Empleado("Marta", "Director", -799.0); // Dispara validación

        emp1.mostrarDatos();
        emp2.mostrarDatos();
        emp3.mostrarDatos();
    }
}