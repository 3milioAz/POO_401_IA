package unidad1.elementos.robot;

public class Brazo {

    private String TipoMovimiento;
    private Float Velocidad;

    public static void main(String[] args) {
        Brazo brazo = new Brazo();
        brazo.asignarMovimiento("Rotacion", 5.5f);
        brazo.mostrarMovimiento();
    }

    public void asignarMovimiento(String tipo, Float vel){
        this.TipoMovimiento = tipo;
        this.Velocidad = vel;
    }

    public void mostrarMovimiento() {
        System.out.println("Movimiento: " + TipoMovimiento);
        System.out.println("Velocidad: " +  Velocidad);
    }
}
