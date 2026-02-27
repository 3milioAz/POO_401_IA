package unidad1.abstraccion.practicaEncapAbstr;

// 2. LA IMPLEMENTACIÓN: El detalle complejo (Oculto al usuario)
class AnalizadorSentimientos extends MotorIA {

    public AnalizadorSentimientos() {
        super("Sentiment-BERT-Lite", 0.89);
    }

    @Override
    public void analizar(String texto) {
        System.out.println("--- Ejecutando Modelo: " + getNombre() + " ---");

        // Simulación de "Detalle Complejo" (Implementación oculta)
        System.out.println("[INFO] Tokenizando texto...");
        System.out.println("[INFO] Extrayendo embeddings semánticos...");

        // Lógica simple para la práctica
        if (texto.toLowerCase().contains("feliz") || texto.toLowerCase().contains("bueno")) {
            System.out.println("RESULTADO: Sentimiento Positivo (Score: " + Math.random() + ")");
        } else {
            System.out.println("RESULTADO: Sentimiento Negativo o Neutro.");
        }
    }
}
