package unidad1.examen1;

public abstract class AgenteConversacional {
    private String entrada;

    public AgenteConversacional(String entrada){
        this.entrada = entrada;
    }

    public abstract String analizarEntrada(String entrada);
    public abstract void responderEntrada();
}
