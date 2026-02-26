package unidad1.elementos.robot;

public class Bateria {

    private Float PorcentajeCarga;

    public static void main(String[] args) {
        Bateria bateria = new Bateria();
        bateria.nivelCarga(44.5f);
        System.out.println("Porcentaje de Batería: "+ bateria.PorcentajeCarga);
    }

    public void nivelCarga(Float porcentaje){
        this.PorcentajeCarga = porcentaje;
    }
}

