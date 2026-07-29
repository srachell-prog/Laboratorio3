package nivel1;

import java.util.InputMismatchException;
import java.util.Scanner;

// ============================================================================
// 1. EXCEPCIONES PERSONALIZADAS (Ejercicios 14 y 15)
// ============================================================================

class ErrorPersonalizado extends Exception {
    public ErrorPersonalizado(String msg) {
        super(msg);
    }
}

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String msg) { 
        super(msg); 
    }
}

// ============================================================================
// 2. CLASE PRINCIPAL
// ============================================================================

public class NIVEL1 {

    // ------------------------------------------------------------------------
    // MÉTODOS AUXILIARES
    // ------------------------------------------------------------------------

    // Ejercicio 7
    public static void validarPositivo(int n) throws Exception {
        if (n < 0) {
            throw new Exception("El valor (" + n + ") no puede ser negativo.");
        }
        System.out.println("Número procesado: " + n);
    }

    // Ejercicio 8
    public static void procesarDatos() {
        try {
            int[] nums = {10, 20, 30};
            System.out.println("Elemento: " + nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción manejada dentro de procesarDatos().");
        }
    }

    // Ejercicio 15
    public static void retirar(double saldo, double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Disponible: $" + saldo);
        }
        System.out.println("Retiro exitoso: $" + monto);
    }

    // Ejercicio 18
    public static double divisionSegura(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return (double) a / b;
    }

    // Ejercicio 20
    public static void simularProceso() {
        throw new IllegalStateException("Error de conexión con la base de datos.");
    }

    // Ejercicio 21
    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Correo inválido: falta el @.");
        }
        System.out.println("Correo válido: " + email);
    }

    // ------------------------------------------------------------------------
    // MÉTODO MAIN
    // ------------------------------------------------------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("\n--- Ejercicio 1 ---");
        try {
            System.out.print("Ingrese dividendo: ");
            int a = sc.nextInt();
            System.out.print("Ingrese divisor: ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Resultado: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese solo enteros.");
            sc.nextLine();
        }

        // Ejercicio 2
        System.out.println("\n--- Ejercicio 2 ---");
        try {
            System.out.print("Ingrese un entero: ");
            int num = sc.nextInt();
            System.out.println("Número ingresado: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error: Tipo de dato no entero.");
            sc.nextLine();
        }

        // Ejercicio 3
        System.out.println("\n--- Ejercicio 3 ---");
        String txt = "Cincuenta";
        try {
            int val = Integer.parseInt(txt);
            System.out.println("Convertido: " + val);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + txt + "' no es un número válido.");
        }

        // Ejercicio 4
        System.out.println("\n--- Ejercicio 4 ---");
        try {
            int x = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Mensaje de error: " + e.getMessage());
        }

        // Ejercicio 5
        System.out.println("\n--- Ejercicio 5 ---");
        try {
            System.out.println("Ejecutando try...");
            int aux = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error capturado en catch.");
        } finally {
            System.out.println("Bloque finally: Se ejecuta siempre.");
        }

        // Ejercicio 6
        System.out.println("\n--- Ejercicio 6 ---");
        try {
            System.out.print("Ingrese stock positivo: ");
            int stock = sc.nextInt();
            if (stock < 0) {
                throw new Exception("El stock no puede ser negativo.");
            }
            System.out.println("Stock guardado: " + stock);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            if (e instanceof InputMismatchException) sc.nextLine();
        }

        // Ejercicio 7
        System.out.println("\n--- Ejercicio 7 ---");
        try {
            validarPositivo(-8);
        } catch (Exception e) {
            System.out.println("Respuesta del método: " + e.getMessage());
        }

        // Ejercicio 8
        System.out.println("\n--- Ejercicio 8 ---");
        procesarDatos();

        // Ejercicio 9
        System.out.println("\n--- Ejercicio 9 ---");
        try {
            System.out.print("Ingrese edad: ");
            int edad = sc.nextInt();
            if (edad < 18 || edad > 99) {
                throw new IllegalArgumentException("Edad fuera de rango (18-99).");
            }
            System.out.println("Edad aceptada: " + edad);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            if (e instanceof InputMismatchException) sc.nextLine();
        }

        // Limpieza de buffer
        sc.nextLine();

        // Ejercicio 10
        System.out.println("\n--- Ejercicio 10 ---");
        System.out.print("Ingrese clave (min 8 car): ");
        String pass = sc.nextLine();
        try {
            if (pass.length() < 8) {
                throw new Exception("Clave demasiado corta.");
            }
            System.out.println("Clave válida.");
        } catch (Exception e) {
            System.out.println("Error de clave: " + e.getMessage());
        }

        // Ejercicio 11
        System.out.println("\n--- Ejercicio 11 ---");
        int[] arr = {5, 10, 15};
        try {
            System.out.println("Valor en pos 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        }

        // Ejercicio 12
        System.out.println("\n--- Ejercicio 12 ---");
        try {
            System.out.print("Ingrese divisor de 100: ");
            int div = sc.nextInt();
            System.out.println("Resultado: " + (100 / div));
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un entero.");
            sc.nextLine();
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }

        // Ejercicio 13
        System.out.println("\n--- Ejercicio 13 ---");
        try {
            boolean activo = false;
            if (!activo) {
                throw new RuntimeException("El servicio no está activo.");
            }
        } catch (RuntimeException e) {
            System.out.println("Error de ejecución: " + e.getMessage());
        }

        // Ejercicio 14
        System.out.println("\n--- Ejercicio 14 ---");
        try {
            throw new ErrorPersonalizado("Ocurrió un error personalizado.");
        } catch (ErrorPersonalizado e) {
            System.out.println("Capturado: " + e.getMessage());
        }

        // Ejercicio 15
        System.out.println("\n--- Ejercicio 15 ---");
        try {
            retirar(500.0, 900.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Cajero: " + e.getMessage());
        }

        // Limpieza de buffer
        sc.nextLine();

        // Ejercicio 16
        System.out.println("\n--- Ejercicio 16 ---");
        System.out.print("Ingrese nombre: ");
        String nom = sc.nextLine();
        try {
            if (nom.trim().isEmpty()) {
                throw new Exception("El nombre no puede estar vacío.");
            }
            System.out.println("Nombre: " + nom);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Ejercicio 17
        System.out.println("\n--- Ejercicio 17 ---");
        String str = "Hola";
        try {
            System.out.println("Carácter pos 8: " + str.charAt(8));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Posición fuera del texto.");
        }

        // Ejercicio 18
        System.out.println("\n--- Ejercicio 18 ---");
        try {
            double res = divisionSegura(50, 0);
        } catch (ArithmeticException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        // Ejercicio 19
        System.out.println("\n--- Ejercicio 19 ---");
        try {
            System.out.print("Ingrese valor mayor a 100: ");
            int pts = sc.nextInt();
            if (pts <= 100) {
                throw new Exception("El valor (" + pts + ") no es mayor a 100.");
            }
            System.out.println("Valor correcto.");
        } catch (Exception e) {
            System.out.println("Validación fallida: " + e.getMessage());
            if (e instanceof InputMismatchException) sc.nextLine();
        }

        // Ejercicio 20
        System.out.println("\n--- Ejercicio 20 ---");
        try {
            simularProceso();
        } catch (IllegalStateException e) {
            System.out.println("Fallo del sistema: " + e.getMessage());
        }

        // Ejercicio 21
        System.out.println("\n--- Ejercicio 21 ---");
        try {
            validarEmail("correo_sin_arroba.com");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Limpieza de buffer
        sc.nextLine();

        // Ejercicio 22
        System.out.println("\n--- Ejercicio 22 ---");
        System.out.print("Ingrese texto (máx 20 car): ");
        String msg = sc.nextLine();
        try {
            if (msg.length() > 20) {
                throw new Exception("Texto supera los 20 caracteres.");
            }
            System.out.println("Texto guardado.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Ejercicio 23
        System.out.println("\n--- Ejercicio 23 ---");
        System.out.print("Escriba 'true' o 'false': ");
        try {
            boolean flag = sc.nextBoolean();
            System.out.println("Entrada: " + flag);
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no booleana.");
            sc.nextLine();
        }

        // Ejercicio 24
        System.out.println("\n--- Ejercicio 24 ---");
        boolean ok = false;
        while (!ok) {
            try {
                System.out.print("Ingrese un entero: ");
                int input = sc.nextInt();
                System.out.println("Correcto: " + input);
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Dato incorrecto. Intente de nuevo.");
                sc.nextLine();
            }
        }

        // Ejercicio 25
        System.out.println("\n--- Ejercicio 25 ---");
        int op = -1;
        while (op != 0) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Saludar");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            try {
                op = sc.nextInt();
                if (op == 1) {
                    System.out.println("¡Hola!");
                } else if (op == 0) {
                    System.out.println("Fin del programa.");
                } else {
                    System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un entero.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}