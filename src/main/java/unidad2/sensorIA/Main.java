package unidad2.sensorIA;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHub = new ArrayList<>();

        SensorLidar obj1 = new SensorLidar();
        SensorLidar obj2 = new SensorLidar();

        SensorVision obj3 = new SensorVision();
        SensorVision obj4 = new SensorVision();

        SensorUltrasonido obj5 = new SensorUltrasonido();
        SensorUltrasonido obj6 = new SensorUltrasonido();

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
