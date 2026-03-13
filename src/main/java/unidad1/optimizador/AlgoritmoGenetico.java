package unidad1.optimizador;

public class AlgoritmoGenetico extends OptimizadorIA{
    public AlgoritmoGenetico (String nombreAlgoritmo){
        super(nombreAlgoritmo);
    }

    @Override
    public void ajustarParametros() {
        System.out.println("Aplicando cruce, mutacion y selección natural de individuos...");
    }
}