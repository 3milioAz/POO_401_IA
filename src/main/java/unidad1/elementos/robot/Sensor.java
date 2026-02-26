package unidad1.elementos.robot;

public class Sensor {

    private String Estatus;

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.estatusActual("Activo");
        System.out.println("Estatus del Sensor: "+ sensor.Estatus);
    }

    public void estatusActual(String estatus){
        this.Estatus = estatus;
    }
}
