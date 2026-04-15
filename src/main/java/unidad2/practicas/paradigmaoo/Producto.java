package unidad2.practicas.paradigmaoo;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println(nombre + " $" + precio);
    }
}

class Electronica extends Producto {
    int garantia;

    public Electronica(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(nombre + " | $" + precio + " | Garantia: " + garantia + " años");
    }
}

class Alimento extends Producto {
    String fechaDeCaducidad ;

    public Alimento(String nombre, double precio, String fechaDeCaducidad ) {
        super(nombre, precio);
        this.fechaDeCaducidad  = fechaDeCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(nombre + " | $" + precio + " | Caduca: " + fechaDeCaducidad );
    }
}

class Main9 {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        productos.add(new Electronica("TV",5000,2));
        productos.add(new Alimento("Croasant",30,"18/04/2026"));

        for(Producto p : productos){
            p.mostrarDetalles();
        }
    }
}
