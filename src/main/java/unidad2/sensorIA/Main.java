package unidad2.sensorIA;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHub = new ArrayList<>();

        SensorLidar obj1 = new SensorLidar("Modelo 1", 1.27);
        SensorLidar obj2 = new SensorLidar("Modelo 2", 1.32);

        SensorVision obj3 = new SensorVision("Modelo 3", 1.45);
        SensorVision obj4 = new SensorVision("Modelo 4", 1.56);

        SensorUltrasonido obj5 = new SensorUltrasonido("Modelo 5", 1.21);
        SensorUltrasonido obj6 = new SensorUltrasonido("Modelo 6", 1.35);

        percepcionHub.add(obj1);
        percepcionHub.add(obj2);
        percepcionHub.add(obj3);
        percepcionHub.add(obj4);
        percepcionHub.add(obj5);
        percepcionHub.add(obj6);

        for (SensorIA f: percepcionHub){
            f.leerDatos();
        }




    }
}
