package unidad2.tiendita;

public class Comida extends Producto {

    private int calorias;

    public Comida(String nombre, double precio, int calorias){
        super(nombre, precio);
        this.calorias = calorias;
    }

    @Override
    public void mostrarInfo(){ // Herencia
        System.out.println("Comida: " + getNombre() + " | Precio: $" + getPrecio() +
                " | Calorias: " + calorias + " kcal");
    }
}
