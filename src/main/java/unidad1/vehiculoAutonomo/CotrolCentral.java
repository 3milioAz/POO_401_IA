package unidad1.vehiculoAutonomo;

public class CotrolCentral {
    public static void main(String[] args) {
        VehiculoAutonomo[]vehiculos = new VehiculoAutonomo[2];
        vehiculos[0] = new Drone();
        vehiculos[1] = new Rover();

        for(VehiculoAutonomo f: vehiculos){
            f.calcularRuta();
        }
    }
}
