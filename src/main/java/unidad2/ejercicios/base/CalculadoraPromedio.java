package unidad2.ejercicios.base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {

    public static void main(String[] args) {

        double nota1;
        double nota2;

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Ingresa la nota 1: ");
            nota1 = sc.nextDouble();

            System.out.println("Ingresa la nota 2: ");
            nota2 = sc.nextDouble();

            double promedio = (nota1 + nota2) / 2;
            System.out.println("Promedio de las notas =  " + promedio);

        }catch (InputMismatchException e){
            System.out.println("Solo se permite ingresar valores numericos "+ e.getMessage());
        }finally {
            System.out.println("Liberando recursos.");
            sc.close();
        }
    }
}
