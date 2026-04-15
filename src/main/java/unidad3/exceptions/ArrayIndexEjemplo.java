package unidad3.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexEjemplo {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        try {
            lista.add(1);
            lista.add(4);
            lista.add(3);
            lista.add(2);

            System.out.println(lista.get(5));
        }catch (Exception e){
            System.out.println("Nombre de la clase: " + " " + e.getClass());
            System.out.println("Excepcion: " + " " + e.getStackTrace());
            System.out.println("Causa: " + " " + e.getCause());
            System.out.println("Metodo: " + " " + "Main");
        }
    }

}
