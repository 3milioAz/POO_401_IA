package unidad1.optimizador;

public abstract class OptimizadorIA {
    protected String nombreAlgoritmo;

    public OptimizadorIA (String nombreAlgoritmo){
        this.nombreAlgoritmo = nombreAlgoritmo;
    }

    public abstract void ajustarParametros();
}