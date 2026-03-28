package unidad2.tiendita;

public abstract class Producto {
    private String nombre; // Doble
    private double precio; //ncapsulamiento

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public abstract void mostrarInfo();
}

