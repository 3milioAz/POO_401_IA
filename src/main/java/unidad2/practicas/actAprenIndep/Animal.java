package unidad2.practicas.actAprenIndep;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    String sonido;
    public void hacerSonido() {
        System.out.println("Sonido");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

class Main3 {
    public static void main(String[] args) {

        System.out.println("------------------ Practica 3 ---------------------");

        Perro firu = new Perro();
        Gato pepe = new Gato();

        firu.hacerSonido();
        pepe.hacerSonido();


        System.out.println("------------------ Practica 4 ---------------------");

        List<Animal> animales = new ArrayList<>();
        animales.add(firu);
        animales.add(pepe);

        for (Animal a: animales){
            a.hacerSonido();
        }

    }
}
