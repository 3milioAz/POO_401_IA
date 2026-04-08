package unidad2.interfaces.practica05;

import unidad2.sensorIA.SensorIA;

public class ProcesadorDeListas {

    public static void main(String[] args) {

        String[] frutas = {"Manzana", "Pera", "Platano", "Guayaba"};

        for (int i = 0; i < frutas.length; i++){
            System.out.println("Frutas: " + frutas[i]);
        }

        int contador = 0;
        String resultado;

        while (contador < frutas.length){
            // toLowerCase() ayuda a que sea insensible a mayúsculas/minúsculas
            if (frutas[contador].toLowerCase().startsWith("p")) {
                resultado = frutas[contador];
                break; // Romper el bucle al encontrar el primero
            }
            contador++;
        }


    }
}
