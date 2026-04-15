package unidad3.Listas;

import java.util.ArrayList;
import java.util.List;

class MetricaEntrenamiento {
    int epoca;
    double loss;
    double accuracy;

    public MetricaEntrenamiento(int epoca, double loss, double accuracy) {
        this.epoca = epoca;
        this.loss = loss;
        this.accuracy = accuracy;

    }

    @Override
    public String toString() {
        return "MetricaEntrenamiento{" +
                "epoca=" + epoca +
                ", loss=" + loss +
                ", accuracy=" + accuracy +
                '}';
    }
}

public class MonitorIA {

    public static void main(String[] args) {

        List<MetricaEntrenamiento> metricas = new ArrayList<>();

        metricas.add(new MetricaEntrenamiento(10, 0.20, 30.3));
        metricas.add(new MetricaEntrenamiento(23, 0.32, 53.4));
        metricas.add(new MetricaEntrenamiento(45, 0.21, 777.7));

        System.out.println("Lista de Metricas de Entrenamiento" + " " + metricas);

        // Imprimir el primer y ultimo elemento
        System.out.println("\nPrimer elemento:" + " " + metricas.get(0) + " " + "Ultimo elemento:" + " " + metricas.get(metricas.size() - 1));

        // Eliminar el primer y ultimo elemento
        System.out.println("\nLista pre-eliminaciones: " + metricas);

        metricas.remove(0);
        metricas.remove(metricas.size() - 1);

        System.out.println("Lista pos-eliminaciones: " + metricas);

        // Iterar la lista de metricas y detectar el orden de insercion


    }
}


