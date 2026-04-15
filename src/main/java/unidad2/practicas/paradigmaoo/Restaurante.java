package unidad2.practicas.paradigmaoo;

public class Restaurante {
    String nombre;
    String tipoDeComida;
    int calificacion; // Valor entre 1-5

    public Restaurante(String nombre, String tipoDeComida, int calificacion) {
        this.nombre = nombre;
        this.tipoDeComida = tipoDeComida;
        this.calificacion = calificacion;
    }

    public void abrir(){
        System.out.println("El restaurante " + nombre + " está abierto.");
    }
}

class Main1 {
    public static void main(String[] args) {

            Restaurante pampas = new Restaurante("Pampas", "Carnes", 4);
            Restaurante lirusisa = new Restaurante("Lirusisa", "Pizzas", 5);

            pampas.abrir();
            lirusisa.abrir();
        }
    }