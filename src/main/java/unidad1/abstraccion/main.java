package unidad1.abstraccion;

public class main {

    public static void main(String[] args) {
        ModeloIA agente = new ReconocimientoFacial();
        agente.procesarEntrada("Imagen_usuario.jpg");
    }
}
