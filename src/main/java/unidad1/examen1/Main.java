package unidad1.examen1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AgenteConversacional> agentes = new ArrayList<>();

        agentes.add(new AgenteVentas("Deseo comprar papel"));
        agentes.add(new AgenteSoporteTecnico("Tengo una duda"));

        for (AgenteConversacional f: agentes){
            f.responderEntrada();
        }
    }
}
