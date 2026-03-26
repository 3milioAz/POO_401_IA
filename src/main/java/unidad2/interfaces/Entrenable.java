package unidad2.interfaces;

interface Serializable {

    public void s();
}

interface Tokenizable {

    public void r();
}

public interface Entrenable {

    public void n();
}

class modelo implements Serializable, Tokenizable, Entrenable {

    @Override
    public void s() {

    }

    @Override
    public void r() {

    }

    @Override
    public void n() {

    }
}
