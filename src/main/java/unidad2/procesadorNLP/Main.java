package unidad2.procesadorNLP;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.spi.SoundbankReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        String texto = "El modelo es excelente, es un modelo muy bueno y genial.";

        List<ProcesadorNLP> procesadores = new ArrayList<>();

        procesadores.add(new ProcesadorSimple());
        procesadores.add(new ProcesadorAnalisisSentimiento());

        for (ProcesadorNLP p: procesadores){
            System.out.println("\n=== Procesador" + p.getClass().getSimpleName() + " ===");
            p.cargarTexto(texto);
            p.limpiarTexto();
            List<String> tokens = p.tokenizar();
            Object resultado = p.transformarParaModelo();

            System.out.println("Tokens: " + tokens);
            System.out.println("Resultado: " + resultado);

        }
    }
}
