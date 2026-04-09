package unidad2.practica.clase;

import java.sql.SQLOutput;

abstract class FiguraGeometrica {

    protected String nombre;

    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    };

    abstract double calcularArea ();

    public void mostrarNombre(){
        System.out.println("Nombre: " + nombre);
    }

}
