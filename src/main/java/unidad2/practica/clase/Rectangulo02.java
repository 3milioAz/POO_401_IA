package unidad2.practica.clase;

public class Rectangulo02 extends FiguraGeometrica{

    double base, altura;

    public Rectangulo02() {
        super("Rectangulo");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void mostrarNombre() {
        super.mostrarNombre();
    }

    @Override
    double calcularArea() {
        double area = getBase() * getAltura();
        return area;
    }
}
