package unidad2.practicas.paradigmaoo;

import java.util.ArrayList;
import java.util.List;

public interface Encendible {
    public void encender();
    public void apagar();
}

class TV implements Encendible {
    public void encender() {
        System.out.println("TV encendida");
    }
    public void apagar() {
        System.out.println("TV apagada");
    }
}

class Bombilla implements Encendible {
    public void encender() { System.out.println("Bombilla encendida"); }
    public void apagar() { System.out.println("Bombilla apagada"); }
}

class Main5 {
    public static void main(String[] args) {

        List<Encendible> dispositivos = new ArrayList<>();

        dispositivos.add(new TV());
        dispositivos.add(new Bombilla());

        for(Encendible d : dispositivos){
            d.encender();
            d.apagar();
        }
    }
}
