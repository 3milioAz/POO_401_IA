package unidad3.genericos.version2;

import java.util.List;

public interface Modelo<T> {
    void activar (List<T> activaciones);

}

class ImplementacionModelo implements Modelo<String>{
    @Override
    public void activar(List<String> activaciones) {;
    }
}

class ImplementacionModeloEnteros implements Modelo<Integer>{
    @Override
    public void activar(List<Integer> activaciones) {;
    }
}









