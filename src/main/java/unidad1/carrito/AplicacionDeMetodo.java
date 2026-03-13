package unidad1.carrito;

public class AplicacionDeMetodo extends FuncionesVehiculo{


    @Override
    public String frenar() {
        return "Se esta frenando";
    }

    @Override
    public String acelerar() {
        return "Se esta acelerando";
    }

    public static void main(String[] args) {
        AplicacionDeMetodo frenar = new AplicacionDeMetodo();
        System.out.println(frenar.frenar());
        System.out.println(frenar.acelerar());
    }
}