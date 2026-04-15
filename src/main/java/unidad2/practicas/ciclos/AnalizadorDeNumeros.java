package unidad2.practicas.ciclos;

import java.util.Scanner;

public class AnalizadorDeNumeros {

    public static void main(String[] args) {

        System.out.println("------------ Tarea 1 ------------");
        int suma = 0;
        for(int i = 1; i <= 100; i++){
            suma = suma + 1;
        }
        System.out.println("Resultado de la suma de todos los enteros del 1 al 100 =" + suma);

        System.out.println("\n------------ Tarea 2 ------------");
        int num = 1;
        while(num < 100){
            num++;
            if(num > 50){
                System.out.println("Numero mayor a 50 encontrado: " + num);
                break;
            }
        }

        System.out.println("\n------------ Tarea 3 ------------");

        Scanner sc = new Scanner(System.in);
        String pass = "qwerty123";
        boolean esIncorrecta;

        do {
            System.out.println("Ingresa una contraseña:");
            String entrada = sc.nextLine();
            esIncorrecta = !entrada.equals(pass);
        }while (esIncorrecta);

        System.out.println("Contraseña aceptada.");
    }
}