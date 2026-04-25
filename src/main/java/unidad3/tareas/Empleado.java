package unidad3.tareas;

import java.util.ArrayList;

// Clase base abstracta
abstract class Empleado {

    // Método concreto
    public void trabajar() {
        System.out.println("El empleado está realizando su trabajo.");
    }

    // Método que será sobrescrito
    public void saludar() {
        System.out.println("Hola, soy un empleado.");
    }
}

// Subclase Cocinero
class Cocinero extends Empleado {

    @Override
    public void saludar() {
        System.out.println("Hola, soy el cocinero. Prepararé tu comida.");
    }
}

// Subclase Mesero
class Mesero extends Empleado {

    @Override
    public void saludar() {
        System.out.println("Hola, soy el mesero. Te atenderé en tu mesa.");
    }
}

class MainEmp {
    public static void main(String[] args) {

        // Lista de tipo Empleado
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Agregar objetos
        empleados.add(new Cocinero());
        empleados.add(new Mesero());

        // Recorrer la lista
        for (Empleado e : empleados) {
            e.saludar();
            e.trabajar();
            System.out.println("-----");
        }
    }
}

// Pregunta: ¿Por qué, al llamar a saludar() en la lista de tipo Empleado,se ejecuta
// la versión específica de cada subclase (Cocinero y Mesero)en lugar de la versión
// genérica de Empleado?

// Porque Java usa algo llamado polimorfismo dinámico (o late binding), por lo cual aunque
// la lista es de tipo Empleado, los objetos reales que contiene son Cocinero y Mesero, así
// que se ejecutan las versiones especificas de saludar de cada uno de los objetos.