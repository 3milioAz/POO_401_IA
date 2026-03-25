package unidad2.sensorIA;

public class SensorUltrasonido extends SensorIA{

    public SensorUltrasonido(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    @Override
    public void leerDatos() {
        System.out.println("Enviando pulso sónico... Midiendo tiempo de rebote para proximidad." +" "+"Modelo: " + getModelo() +" "+"Consumo Energia: "+ getConsumoEnergia());
    }
}
