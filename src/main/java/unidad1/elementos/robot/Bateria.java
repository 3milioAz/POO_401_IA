package unidad1.elementos.robot;

public class Bateria {

    private float porcentajeCarga;

    public static void main(String[] args) {
        Bateria bateria = new Bateria();
        bateria.nivelCarga(44.5f);
        System.out.println("Porcentaje de Batería: "+ bateria.porcentajeCarga);
    }

    public void nivelCarga(float porcentaje){
        this.porcentajeCarga = porcentaje;
    }
}

