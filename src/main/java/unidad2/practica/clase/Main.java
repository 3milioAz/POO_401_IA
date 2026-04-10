package unidad2.practica.clase;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(12));
        figuras.add(new Rectangulo(15, 4));

        for (FiguraGeometrica f: figuras) {
            f.mostrarNombre();
            System.out.println(f.calcularArea());
        }


        System.out.println("--------------- Implementacion 2 ---------------");

        Rectangulo02 rectangulov2 = new Rectangulo02();
        rectangulov2.setBase(10);
        rectangulov2.setAltura(5);
        rectangulov2.mostrarNombre();
        System.out.println(rectangulov2.calcularArea());


    }
}
