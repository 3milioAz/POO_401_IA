package unidad2.practicas.ciclos;

import java.util.Scanner;

public class ProcesadorDeListas {

    public static void main(String[] args) {

        System.out.println("------------ Tarea 1 ------------");

        String[] frutas = {"Manzana", "Pera", "Platano", "Guayaba", "Sandia", "Uva"};

        for(int i = 0; i < frutas.length; i++){
            System.out.println("Frutas: " + frutas[i]);
        }

        System.out.println("\n------------ Tarea 2 ------------");

        int contador = 0;
        String resultado;

        while (contador < frutas.length){
            // toLowerCase() ayuda a que sea insensible a mayúsculas/minúsculas
            if (frutas[contador].toLowerCase().startsWith("p")) {
                resultado = frutas[contador];
                System.out.println("La fruta  " + resultado + " fue encotrada en la lista. Con el indice " + contador);
                break; // Romper el bucle al encontrar el primero
            }
            contador++;
        }

        System.out.println("\n------------ Tarea 3 ------------");

        Scanner sc = new Scanner(System.in);
        boolean estaEnLista = false;

        do {
            System.out.println("Ingresa una fruta: ");
            String entrada = sc.nextLine();
            for(int i = 0; i < frutas.length; i++){
                estaEnLista = entrada.equals(frutas[i]);
            }
        }while(!estaEnLista);

        System.out.println("La fruta se encuentra en la lista.");
    }
}
