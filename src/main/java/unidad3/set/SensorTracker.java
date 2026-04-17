package unidad3.set;

import java.util.HashSet;
import java.util.Set;

public class SensorTracker {

    public static void main(String[] args) {

        Set<String> camarasActivas = new HashSet<>();
        camarasActivas.add("CAM-01");
        camarasActivas.add("CAM-02");
        camarasActivas.add("CAM-03");
        camarasActivas.add("CAM-04");
        camarasActivas.add("CAM-02");
        camarasActivas.add("CAM-05");
        camarasActivas.add("CAM-06");
        camarasActivas.add("CAM-07");
        camarasActivas.add("CAM-06");

        // Metodo remove para desactivar una camara
        camarasActivas.remove("CAM-03");

        // Operaciones de conjuntos (Teoria de Conjuntos aplicada a la IA)
        Set<String> camarasEnMantenimiento = new HashSet<>();
        camarasEnMantenimiento.add("CAM-01");
        camarasEnMantenimiento.add("CAM-05");

        // Metodo RemoveAll(); Referencia de conjuntos
        // (Camaras activas que no estan en mantenimiento
        camarasActivas.removeAll(camarasEnMantenimiento);
        System.out.println("Camaras activas despues de remover " +
                "las camaras en mantenimiento: " + camarasActivas);

        // Metodo clear para reiniciar la coleccion
        camarasActivas.clear();
    }
}