package nivel2;

public class Cuenta {
    // 1. Crear clase Cuenta con saldo privado
    private double saldo;

    public Cuenta(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // 2. Crear método depositar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de: Q" + monto);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }

    // 3 y 4. Crear método retirar con validación y evitar saldo negativo
    public void retirar(double monto) {
        if (monto > 0 && (saldo - monto) >= 0) {
            saldo -= monto;
            System.out.println("Retiro exitoso de: Q" + monto);
        } else if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a 0.");
        } else {
            System.out.println("Error: Fondos insuficientes. Evitando saldo negativo.");
        }
    }

    // 5. Mostrar saldo
    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + saldo);
    }

    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(100.0);
        miCuenta.mostrarSaldo();
        miCuenta.depositar(89.0);
        miCuenta.retirar(700.0); // Intento de saldo negativo
        miCuenta.retirar(50.0);  // Retiro válido
        miCuenta.mostrarSaldo();
    }
}