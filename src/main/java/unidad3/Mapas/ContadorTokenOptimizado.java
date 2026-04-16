package unidad3.Mapas;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokenOptimizado {

    public static void main(String[] args) {
        // Arreglo de cadenas
        String [] tokens = {"ia", "python", "redes", "neuronas", "ia", "neuronas"};

        Map<String, Integer> frecuencias = new HashMap<>();

        for(String t: tokens){
            // Metodo Merge de la interfaz Map
            // si t no existe pone 1
            // si t ya existe, suma el valor anterior + el valor nuevo
            frecuencias.merge(t, 1,
                    (valorAnterior, valorNuevo) -> valorAnterior + valorNuevo);
        }

        System.out.println("------------ Frecuencias con el metodo Merge de Map");
        frecuencias.forEach((k, v) -> System.out.println(k + " " + v));


    }
}










