package unidad2.practicas.paradigmaoo;

import java.util.ArrayList;

public class Estudiante {
    String nombre;
    int id;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
}

class Clase {
    String nombreDeClase;
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Clase(String nombreDeClase) {
        this.nombreDeClase = nombreDeClase;
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void nombrarEstudiantes() {
        System.out.println("Los estudiantes de la clase " + nombreDeClase + " son: ");
        for(Estudiante e : estudiantes){
            System.out.println(e.nombre);
        }
    }
}

class Main7 {
    public static void main(String[] args) {

        Clase poo = new Clase("POO");

        Estudiante est1 = new Estudiante("Pepe");
        Estudiante est2 = new Estudiante("Emilio");
        Estudiante est3 = new Estudiante("Juana");

        poo.agregarEstudiante(est1);
        poo.agregarEstudiante(est2);
        poo.agregarEstudiante(est3);

        poo.nombrarEstudiantes();
    }
}
