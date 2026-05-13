package ollama.client.context;

import ollama.client.OllamaClient;
import ollama.client.strategy.InteligenciaArtificialStrategy;
import ollama.client.template.PromptBuilder;
import ollama.client.template.PromptConfig;

public class GemmaStrategy implements InteligenciaArtificialStrategy {

    private final OllamaClient cliente = new OllamaClient();

    @Override
    public String generarRespuesta(PromptConfig config) {

        String promptFinal = new PromptBuilder()
                .conRol(config.getRol())
                .conInstrucciones(config.getInstrucciones())
                .conEntrada(config.getEntrada())
                .build();

        String jsonRespuesta = cliente.enviarPeticion("gemma2:2b", promptFinal);

        return "Respuesta de Gemma:\n" + jsonRespuesta;
    }

    @Override
    public String getNombreModelo() {
        return "Gemma-2B";
    }
}