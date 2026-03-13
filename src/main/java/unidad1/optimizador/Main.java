package unidad1.optimizador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OptimizadorIA> optimizadores = new ArrayList<>();

        optimizadores.add(new DescensoGradiente("Descenso Gradiente"));
        optimizadores.add(new AlgoritmoGenetico("Algoritmo Genetico"));

        for (OptimizadorIA f: optimizadores){
            f.ajustarParametros();
        }
    }
}
