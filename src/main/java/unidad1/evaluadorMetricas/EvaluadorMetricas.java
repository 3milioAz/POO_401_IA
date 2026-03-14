package unidad1.evaluadorMetricas;

import java.util.ArrayList;
import java.util.List;

public abstract class EvaluadorMetricas {

    public abstract void calcularError();

    public static void main(String[] args) {

        List<EvaluadorMetricas> evaluadores = new ArrayList<>();

        evaluadores.add(new ErrorCuadraticoMedio());
        evaluadores.add(new ErrorAbsolutoMedio());

        for (EvaluadorMetricas f: evaluadores){
            f.calcularError();
        }
    }
}
