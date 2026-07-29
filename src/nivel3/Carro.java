package nivel3;

public class Carro implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Carro: Girando la llave... Motor encendido.");
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("Carro: Pisando el acelerador a " + velocidad + " km/h.");
    }

    @Override
    public void detener() {
        System.out.println("Carro: Pisando el freno de pedal. Detenido.");
    }
}