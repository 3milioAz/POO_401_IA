package unidad2.procesadorNLP;

import java.util.*;
import java.util.stream.Collectors;

public class ProcesadorAnalisisSentimiento extends ProcesadorNLP{

    private static final List<String> STOP_WORDS = Arrays.asList("el", "la", "un");
    @Override
    public List<String> tokenizar() {
        tokens = new ArrayList<>(Arrays.asList(getTextoCrudo().split("\\s+")));
        return tokens;
    }

    @Override
    public void limpiarTexto() {
        tokens = tokens.stream().filter(p -> !STOP_WORDS.contains(p.toLowerCase())).collect(Collectors.toList());
    }

    @Override
    public Object transformarParaModelo() {
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String palabra: tokens) {
            if (tokens.contains(palabra.toLowerCase())){
                frecuencia.merge(palabra, 1, Integer::sum);
            }
        }
        return frecuencia.toString();
    }

}