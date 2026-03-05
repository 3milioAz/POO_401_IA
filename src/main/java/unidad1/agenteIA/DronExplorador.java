package unidad1.agenteIA;

public class DronExplorador extends AgenteIA{

    private int energia;

    public void setEnergia(int energia){
        this.energia = energia;
    }

    @Override
    public float moverse(float coordenada){
        System.out.println("El Dron se esta moviendo a: " + coordenada);
        return coordenada;
    }


}
