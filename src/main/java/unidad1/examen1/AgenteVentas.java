package unidad1.examen1;

public class AgenteVentas extends AgenteConversacional{
    public AgenteVentas(String entrada){
        super(entrada);
    }

    @Override
    public String analizarEntrada(String entrada) {
        return("Analizando pedido... " + entrada);
    }

    @Override
    public void responderEntrada() {
        System.out.println("Bienvenido.");
        System.out.println("Soy el ChatBot de Ventas.");
        System.out.println("Que te puedo ofrecer?");
    }
}
