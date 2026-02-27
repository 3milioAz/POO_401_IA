package unidad1.elementos.robot;

public class Sensor {

    private String estatus;

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.estatusActual("Activo");
        System.out.println("Estatus del Sensor: "+ sensor.estatus);
    }

    public void estatusActual(String estatus){
        this.estatus = estatus;
    }
}
