package unidad2.procesadorNLP;

import java.util.List;
import java.util.Objects;

abstract class ProcesadorNLP {

    private String textoCrudo;

    public String getTextoCrudo() {
        return textoCrudo;
    }

    public void setTextoCrudo(String textoCrudo) {
        this.textoCrudo = textoCrudo;
    }

    public void cargarTexto(String texto){};

    public abstract List<String> tokenizar();
    public abstract void limpiarTexto();
    public abstract Object transformarModelo();
}
