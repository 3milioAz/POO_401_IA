package unidad3.Mapas;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokens {

    public static void main(String[] args) {
        // Arreglo de cadenas
        String [] tokens = {"ia", "python", "redes", "neuronas", "ia", "neuronas"};

        // Instanciar Map (interface) la implementacion Hashmap
        Map<String, Integer> frecuencias = new HashMap<>();

        // Iterar el arreglo y rellenar el mapa de frecuencias
        for(String d: tokens){
            frecuencias.put(d, frecuencias.getOrDefault(d, 0) + 1);
        }

        // Obtener las palabras unicas
        System.out.println("Vocabulario:" + " " + frecuencias.keySet());

        // Iteramos el map
        for(Map.Entry<String, Integer> entrada: frecuencias.entrySet()){
            System.out.println("Token: " + " " + entrada.getKey() +
                    " " + "| Frecuencia: " + entrada.getValue());
        }
    }
}














