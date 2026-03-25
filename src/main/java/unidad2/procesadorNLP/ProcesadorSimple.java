package unidad2.procesadorNLP;

import java.util.List;

public class ProcesadorSimple extends ProcesadorNLP {

    @Override
    public List<String> tokenizar() {
        return List.of();
    }

    @Override
    public void limpiarTexto() {

    }

    @Override
    public Object transformarModelo() {
        return null;
    }
}
