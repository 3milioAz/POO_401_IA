package unidad2.tiendita;

public class Main {

    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        Producto p1 = new Bebida("Coca-Cola (Bien fría)", 21, false);
        Producto p2 = new Comida("Hamburguesa", 67, 500);
        Producto p3 = new Comida("Mazapán", 12, 140);

        carrito.tomarProducto(p1);
        carrito.tomarProducto(p2);
        carrito.tomarProducto(p3);

        carrito.mostrarCarrito();
    }
}
