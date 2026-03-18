package unidad1.examen1;

public class AgenteSoporteTecnico extends AgenteConversacional{
    public AgenteSoporteTecnico(String entrada){
        super(entrada);
    }

    @Override
    public String analizarEntrada(String entrada) {
        return("Analizando duda... " + entrada);
    }

    @Override
    public void responderEntrada() {
        System.out.println("Bienvenido.");
        System.out.println("Soy el ChatBot de Soporte Tecnico.");
        System.out.println("En que te puedo ayudar?");
    }
}
