package unidad1.elementos.robot;

public class Brazo {

    private String tipoMovimiento;
    private float velocidad;

    public static void main(String[] args) {
        Brazo brazo = new Brazo();
        brazo.asignarMovimiento("Rotacion", 5.5f);
        brazo.mostrarMovimiento();
    }

    public void asignarMovimiento(String tipo, Float vel){
        this.tipoMovimiento = tipo;
        this.velocidad = vel;
    }

    public void mostrarMovimiento() {
        System.out.println("Movimiento: " + tipoMovimiento);
        System.out.println("Velocidad: " +  velocidad);
    }
}
