package unidad1.optimizador;

public class DescensoGradiente extends OptimizadorIA{
    public DescensoGradiente(String nombreAlgoritmo){
        super(nombreAlgoritmo);
    }

    @Override
    public void ajustarParametros() {
        System.out.println("Calculando derivadas parciales y actualizando pesos...");
    }
}