package unidad2.tiendita;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> productos = new ArrayList<>();

    public void tomarProducto(Producto p){
        productos.add(p);
    }

    public void mostrarCarrito(){
        System.out.println("--------------- Contenido del Carrito de Compras ---------------");
        for (Producto p : productos){
            p.mostrarInfo(); // Aqui hacemos uso del polimorfismo
        }
    }
}
