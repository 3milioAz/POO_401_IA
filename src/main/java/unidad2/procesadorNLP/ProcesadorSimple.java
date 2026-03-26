package unidad2.procesadorNLP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcesadorSimple extends ProcesadorNLP {

    private List<String> tokens = new ArrayList<>();

    @Override
    public List<String> tokenizar() {
        tokens = new ArrayList<>(Arrays.asList(getTextoCrudo().split("\\s+")));
        return tokens;
    }

    @Override
    public void limpiarTexto() {
        String textoLimpio = getTextoCrudo().replace(".", " ").replace(",", " ");
    }

    @Override
    public Object transformarParaModelo() {
        return tokens.size();
    }
}
