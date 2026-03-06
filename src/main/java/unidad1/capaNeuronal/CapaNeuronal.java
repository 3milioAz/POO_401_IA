package unidad1.capaNeuronal;

public abstract class CapaNeuronal {

    public abstract double[] propagacionHaciaAdelante(double[] entrada);
}

/* Ejemplo de uso:
CapaNeuronal capa1 = new CapaConvolucional();
CapaNeuronal capa2 = new CapaDensa();

double[] datos = {1.0, 2.0, 3.0};

datos = capa1.propagacionHaciaAdelante(datos);
datos = capa2.propagacionHaciaAdelante(datos);
 */