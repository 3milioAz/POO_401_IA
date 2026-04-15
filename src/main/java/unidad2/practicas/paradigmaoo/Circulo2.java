package unidad2.practicas.paradigmaoo;

public class Circulo2 {
    private double radio;

    public Circulo2 (double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
}

class Main {
    public static void main(String[] args) {

        Circulo2 circle = new Circulo2(5.2);

        System.out.println(circle.calcularArea());
        System.out.println(circle.calcularCircunferencia());
    }
}
