package unidad2.sensorIA;

public abstract class SensorIA {

    protected String modelo;
    protected double consumoEnergia;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }
    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public abstract void leerDatos();
}
