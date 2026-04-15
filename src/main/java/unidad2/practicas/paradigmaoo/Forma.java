package unidad2.practicas.paradigmaoo;

import java.util.ArrayList;
import java.util.List;

public class Forma {
    public double calcularArea() {
        return 0;
    }
}

class Circulo extends Forma {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

class Rectangulo extends Forma {
    double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

class Main4 {
    public static void main(String[] args) {

        List<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(2.5));
        formas.add(new Rectangulo(2,5));

        for (Forma f : formas){
            System.out.println(f.calcularArea());
        }
    }
}
