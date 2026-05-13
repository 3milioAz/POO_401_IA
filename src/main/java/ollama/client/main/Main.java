package ollama.client.main;

import ollama.client.context.AgenteConversacional;
import ollama.client.context.*;
import ollama.client.intent.routing.IntentRouter;
import ollama.client.strategy.InteligenciaArtificialStrategy;
import ollama.client.template.PromptBuilder;
import ollama.client.template.PromptConfig;

public class Main {

    public static void main(String[] args) {

        AgenteConversacional agente = new AgenteConversacional();

        int opcion = 2;

        switch (opcion) {

            case 1:
                agente.setModelo(new Llama3Strategy());
                break;

            case 2:
                agente.setModelo(new GemmaStrategy());
                break;

            case 3:
                agente.setModelo(new Phi3Strategy());
                break;

            default:
                System.out.println("Modelo no válido.");
                return;
        }

        agente.interactuar("Explica qué es inteligencia artificial");
    }
}