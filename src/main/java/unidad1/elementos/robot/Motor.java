package unidad1.elementos.robot;

public class Motor {

    private Integer Fuerza;

    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.fuerzaMotor(15);
        System.out.println("Fuerza del Motor: "+ motor.Fuerza + "N");
    }

    public void fuerzaMotor(Integer newtons){
        this.Fuerza = newtons;
    }
}
