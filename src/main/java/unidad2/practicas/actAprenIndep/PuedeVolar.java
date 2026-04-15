package unidad2.practicas.actAprenIndep;

import java.util.ArrayList;
import java.util.List;

public interface PuedeVolar {
    abstract void volar();
}

class Avion implements PuedeVolar {
    @Override
    public void volar() {
        System.out.println("El avion enciende motores");
    }
}

class Pajaro implements PuedeVolar {
    @Override
    public void volar() {
        System.out.println("El pajaro bate sus alas");
    }
}

class Main {
    public static void main(String[] args) {

        List<PuedeVolar> voladores = new ArrayList<>();
        voladores.add(new Avion());
        voladores.add(new Pajaro());

        for (PuedeVolar v: voladores){
            v.volar();
        }
    }
}
