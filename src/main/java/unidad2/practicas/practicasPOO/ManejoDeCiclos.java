package unidad2.practicas.practicasPOO;

public class ManejoDeCiclos {

    public static void main(String[] args) {

        System.out.println("------------ Tarea 1 ------------");
        int cont = 1;
        while(cont <= 5){
            System.out.println("Valor del numero en la iteracion del while: " + cont);
            cont++;
        }

        System.out.println("\n------------ Tarea 2 ------------");
        cont = 10;
        do {
            System.out.println("Valor del numero en la iteracion del while: " + cont);
            cont--;
        }while (cont >= 8);

        System.out.println("\n------------ Sección 3 ------------");

        System.out.println("Tabla de multiplicar del numero 7.");
        for(int i = 1; i <= 10; i++){
            int resultado = 7 * i;
            System.out.println("--> 7 x " + i + " = " + resultado);
        }

    }
}
