package unidad2.tiendita;

public class Bebida extends Producto {

    private boolean esAlcoholica;

    public Bebida(String nombre, double precio, boolean esAlcoholica){
        super(nombre, precio);
        this.esAlcoholica = esAlcoholica;
    }

    @Override
    public void mostrarInfo(){ // Herencia
        System.out.println("Bebida: " + getNombre() + " | Precio: $" + getPrecio() +
                " | Alcoholica: " + esAlcoholica);
    }

}
