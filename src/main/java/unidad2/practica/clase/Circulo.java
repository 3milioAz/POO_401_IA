package unidad2.practica.clase;

public class Circulo extends FiguraGeometrica{

    double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public void mostrarNombre() {
        super.mostrarNombre();
    }
}
