package unidad1.pipelineDeProcesamiento;

import java.util.ArrayList;
import java.util.List;

public class FiltroImagen {

    public void procesar(){
        System.out.println("Procesando Imagen...");
    }

    public static void main(String[] args) {

        List<FiltroImagen> pipeline = new ArrayList<>();

        pipeline.add(new ReductorDeRuido());
        pipeline.add(new DetectorDeBordes());
        pipeline.add(new EscalaDeGrises());

        // El motor de ejecución no sabe que filtro es, solo sabe que todos "procesan".
        for (FiltroImagen f: pipeline){
            f.procesar();
        }
    }
}






