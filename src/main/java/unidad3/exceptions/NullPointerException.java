package unidad3.exceptions;

public class NullPointerException {
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static void main(String[] args) {

        try {
            NullPointerException objeto = null;
            System.out.println(objeto.getNumero());
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
