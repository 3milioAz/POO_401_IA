package ollama.client.context;

import ollama.client.strategy.InteligenciaArtificialStrategy;
import ollama.client.template.PromptConfig;
import ollama.client.intent.routing.IntentRouter;

public class AgenteConversacional {

    private InteligenciaArtificialStrategy modelo;
    private IntentRouter router;

    public AgenteConversacional() {
        this.router = new IntentRouter();
    }

    public void setModelo(InteligenciaArtificialStrategy modelo) {
        this.modelo = modelo;
        System.out.println("Modelo actual: " + modelo.getNombreModelo());
    }

    public void interactuar(String mensaje) {

        if (modelo == null) {
            System.out.println("No hay modelo seleccionado.");
            return;
        }

        // 1. Usamos el IntentRouter para determinar el rol automáticamente según el mensaje
        String rolDeterminado = router.determinarRol(mensaje);

        // 2. Optimizamos las instrucciones
        String instruccionesOptimizadas = router.optimizarInstrucciones(mensaje);

        // 3. Preparamos la configuración usando PromptConfig (necesaria para Llama3Strategy)
        PromptConfig config = new PromptConfig(
                rolDeterminado,
                instruccionesOptimizadas,
                mensaje
        );

        System.out.println(" ---------- Prompt Config ---------- ");
        System.out.println("Rol: " + config.getRol());
        System.out.println("Instrucción: " + config.getInstrucciones());
        System.out.println(" ----------------------------------- ");

        // 4. Generamos la respuesta a través de la estrategia del modelo
        String respuesta = modelo.generarRespuesta(config);
        System.out.println(respuesta);
    }
}