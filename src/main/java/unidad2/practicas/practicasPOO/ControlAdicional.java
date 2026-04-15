package unidad2.practicas.practicasPOO;

public class ControlAdicional {

    public static String encontrarNumero(int [] enteros, int numObjetivo){
        for(int e: enteros){
            if(e == numObjetivo){
                return ("El numero " + numObjetivo + " fue encontrado en el arreglo.");
            }
        }
        return("El numero no fue encontrado en el arreglo.");

    }

    public static void main(String[] args) {

        System.out.println("------------ Sección 1 ------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Valor del numero en la iteracion: " + i);
            if (i == 5) {
                break;
            }
        }

        System.out.println("\n------------ Sección 2 ------------");
        for (int i = 1; i <= 10; i++) {
            if ((i % 2) == 0) {
                continue;
            }
            System.out.println("Valor del numero en la iteracion: " + i);
        }

        System.out.println("\n------------ Sección 3 ------------");

        int [] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String resultado = encontrarNumero(arreglo, 7);
        System.out.println(resultado);

    }
}