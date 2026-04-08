package unidad2.interfaces.practica04;

public class Main {

    public static void main(String[] args) {

        EjemploSobrecargarMetodos carga = new EjemploSobrecargarMetodos();

        Dataset[] datasets = new Dataset[5];
        int epoca = 1;

        carga.entrenar(datasets, epoca);

    }
}
