package unidad1.agenteIA;

public class AgenteIA {

    private int energia;

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public float moverse(float coordenada){
        System.out.println("El Agente se esta moviendo a: " + coordenada);
        return coordenada;
    }
}
