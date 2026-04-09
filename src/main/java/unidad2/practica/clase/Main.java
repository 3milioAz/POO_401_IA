package unidad2.practica.clase;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo("Circulo"));
        figuras.add(new Rectangulo("Rectangulito"));

        for (FiguraGeometrica f: figuras) {
            f.mostrarNombre();
            f.calcularArea();
        }
    }
}
