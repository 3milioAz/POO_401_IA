package unidad1.practica01;

/*Tu Reto (TODOs)
Definir la Clase Drone: Crea los atributos necesarios (ID, Nivel de Batería).
Crear el Constructor: Permite que cada drone nazca con un ID único.
Instanciar Objetos: En el Main, crea 3 drones diferentes.
Modificar el Estado: Cambia la batería de un solo drone y observa si los demás se ven afectados.
        Reflexión
Si cambio la batería del Drone-01, ¿por qué la batería del Drone-02 no cambia si ambos vienen de la misma clase?
    R= Porque ambos son 2 objetos distintos que pertenecen a la misma clsase, el ser de la misma clase solo hace que tengan los mismos tipos de atributos no el mismo atributo en si. */


public class Drone {

    private static int contador = 1;  // con "static" el contador pertenece a la clase, no al objeto
    private int id;
    private double nivelBateria;

    public Drone(double bateria) {
        this.id = contador;
        contador++;
        this.nivelBateria = bateria;

    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public static void main(String[] args) {

        Drone drone1 = new Drone(50);
        Drone drone2 = new Drone(70);
        Drone drone3 = new Drone(25);

        System.out.println(drone1.getNivelBateria()+" , "+
                drone2.getNivelBateria()+" , "+
                drone3.getNivelBateria());

        drone1.nivelBateria = 30;

        System.out.println(drone1.getNivelBateria()+" , "+
                drone2.getNivelBateria()+" , "+
                drone3.getNivelBateria());


    }
}
