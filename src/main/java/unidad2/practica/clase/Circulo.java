package unidad2.practica.clase;

public class Circulo extends FiguraGeometrica{

    double radio;

    public Circulo(String nombre) {
        super(nombre);
    }

    @Override
    double calcularArea() {
        double pi = 3.1416;
        double area = pi * Math.pow(radio, 2);
        return area;
    }

    @Override
    public void mostrarNombre() {
        super.mostrarNombre();
    }
}
