package unidad1.agenteInteligente;

import java.util.ArrayList;
import java.util.List;

public abstract class AgenteInteligente {

    public abstract void tomarDecision();

    public static void main(String[] args) {

        List<AgenteInteligente> ordenes = new ArrayList<>();

        ordenes.add(new Explorador());
        ordenes.add(new Recolector());
        ordenes.add(new Defensor());

        for (AgenteInteligente f: ordenes){
            f.tomarDecision();
        }
    }
}
