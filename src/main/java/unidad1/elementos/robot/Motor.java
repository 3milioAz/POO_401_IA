package unidad1.elementos.robot;

public class Motor {

    private int fuerza;

    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.fuerzaMotor(15);
        System.out.println("Fuerza del Motor: "+ motor.fuerza + "N");
    }

    public void fuerzaMotor(int newtons){
        this.fuerza = newtons;
    }
}
