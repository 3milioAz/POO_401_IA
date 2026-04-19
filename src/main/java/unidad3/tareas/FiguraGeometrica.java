package unidad3.tareas;

import java.util.ArrayList;
import java.util.List;

public abstract class FiguraGeometrica {

    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    abstract double calcularArea();

    public void mostrarNombre(){
        System.out.println("Nombre de la figura: " + nombre);
    }
}

class Circulo extends FiguraGeometrica{

    double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

class Rectangulo extends FiguraGeometrica{

    double base, altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }
}

class Main{

    public static void main(String[] args) {

        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo("Circulito", 2.54));
        figuras.add(new Rectangulo("Rectangulito", 12, 7));

        for(FiguraGeometrica f: figuras){
            f.mostrarNombre();
            System.out.println("Area: " + f.calcularArea());
        }
    }
}