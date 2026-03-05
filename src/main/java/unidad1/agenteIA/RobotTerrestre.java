package unidad1.agenteIA;

public class RobotTerrestre extends AgenteIA{

    private int energia;

    public void setEnergia(int energia){
        this.energia = energia;
    }

    @Override
    public float moverse(float coordenada){
        System.out.println("El Robot se esta moviendo a: " + coordenada);
        return coordenada;
    }
}
