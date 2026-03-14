package unidad1.clasificadorIA;

import java.util.ArrayList;
import java.util.List;

public abstract class ClasificadorIA {

    public abstract void predecir();

    public static void main(String[] args) {
        List<ClasificadorIA> modelos = new ArrayList<>();

        modelos.add(new ArbolDeDecision());
        modelos.add(new RedNeuronal());
        modelos.add(new SupportVectorMachine());

        for (ClasificadorIA f: modelos){
            f.predecir();
        }
    }
}