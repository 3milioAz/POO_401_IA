package unidad2.practicas.paradigmaoo;

public class Vehiculo {
    protected double velocidad;
    protected int numLlantas;

    public void acelerar() {
        velocidad += 5;
        System.out.println("Velocidad: " + velocidad);
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void acelerar() {
        super.acelerar();
    }
}

class Automovil extends Vehiculo {
    @Override
    public void acelerar() {
        velocidad += 20;
        System.out.println("Velocidad: " + velocidad);
    }
}

class Main3 {
    public static void main(String[] args) {

        Bicicleta bici = new Bicicleta();
        Automovil jetta = new Automovil();

        bici.acelerar();
        jetta.acelerar();
    }
}
