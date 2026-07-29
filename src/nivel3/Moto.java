package nivel3;

public class Moto implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Moto: Presionando botón de ignición... Motor encendido.");
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("Moto: Acelerando con el manubrio a " + velocidad + " km/h.");
    }

    @Override
    public void detener() {
        System.out.println("Moto: Apretando los frenos de mano. Detenida.");
    }
}