package unidad2.practicas.paradigmaoo;

public abstract class Personaje {
    abstract void atacar();
}

class Guerrero extends Personaje {
    @Override
    void atacar() {
        System.out.println("Ataca con espada");
    }
}

class Mago extends Personaje {
    @Override
    void atacar() {
        System.out.println("Ataca con hechizo");
    }
}

class Main8 {
    public static void main(String[] args) {
        Personaje kratos = new Guerrero();
        Personaje gandalf = new Mago();

        kratos.atacar();
        gandalf.atacar();
    }
}
