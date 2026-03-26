package unidad2.procesadorNLP;

import java.util.List;

abstract class ProcesadorNLP {

    private String textoCrudo;

    public String getTextoCrudo() {
        return textoCrudo;
    }

    public void setTextoCrudo(String textoCrudo) {
    }

    public void cargarTexto(String texto){
        this.textoCrudo = texto;
    };

    public abstract List<String> tokenizar();
    public abstract void limpiarTexto();
    public abstract Object transformarParaModelo();
}
