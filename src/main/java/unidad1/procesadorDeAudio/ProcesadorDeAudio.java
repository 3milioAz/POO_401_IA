package unidad1.procesadorDeAudio;

import java.util.ArrayList;
import java.util.List;

public abstract class ProcesadorDeAudio {

    public abstract void filtrar();

    public static void main(String[] args) {
        List<ProcesadorDeAudio> audios = new ArrayList<>();

        audios.add(new Ecualizador());
        audios.add(new Normalizador());
        audios.add(new ReductorDeEco());

        for (ProcesadorDeAudio f: audios){
            f.filtrar();
        }
    }
}
