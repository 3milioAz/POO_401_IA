package unidad2.practicas.paradigmaoo;

public class Empleado {
    private int id;
    private double salario;

    public Empleado(int id, double salario) {
        this.id = id;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);    // Asi convertimos tipo 55.4 (porcentaje) a valor multiplicable (0.554).
    }

    public double getSalario() {
        return salario;
    }
}

class Main2 {

    public static void main(String[] args) {

        Empleado carlos = new Empleado(1, 1000);

        carlos.aumentarSalario(10);
        System.out.println(carlos.getSalario());
    }
}