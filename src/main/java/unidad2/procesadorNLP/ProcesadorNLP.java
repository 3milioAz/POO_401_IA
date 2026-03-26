package unidad2.procesadorNLP;

import java.util.ArrayList;
import java.util.List;

public abstract class ProcesadorNLP {
    private String textoCrudo;
    protected List<String> tokens = new ArrayList<>();
    public void cargarTexto(String texto){
        this.textoCrudo = texto;
    };
    public abstract List <String> tokenizar();
    public abstract void limpiarTexto();
    public abstract Object transformarParaModelo();

    public String getTextoCrudo() {
        return textoCrudo;
    }

    public void setTextoCrudo(String textoCrudo) {
        this.textoCrudo = textoCrudo;
    }

    public final Object procesarTexto (){
        limpiarTexto();
        tokenizar();
        return transformarParaModelo();
    }

}
