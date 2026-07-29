package nivel2;

import java.util.ArrayList;

// 1. Crear clase Producto
public class Producto {
    private String nombre;
    // 2. Encapsular precio
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio); // Pasa por la validación
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public double getPrecio() { return precio; }

    // 3. Validar precio positivo
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo para " + nombre);
            this.precio = 0.0;
        }
    }

    // 4. Crear método mostrar producto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: Q" + precio);
    }

    public static void main(String[] args) {
        // 5. Crear lista de productos
        ArrayList<Producto> inventario = new ArrayList<>();
        
        inventario.add(new Producto("base", 375.90));
        inventario.add(new Producto("corrector", 255.00));
        inventario.add(new Producto("Rimel ", -30.00)); // Validación en acción

        System.out.println("--- LISTA DE PRODUCTOS ---");
        for (Producto prod : inventario) {
            prod.mostrarProducto();
        }
    }
}