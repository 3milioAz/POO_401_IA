package unidad2.practicas.actAprenIndep;

public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInfo() {
        System.out.println(" -- Información del libro -- ");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("-----------------------------");
    }
}

class Main1 {
    public static void main(String[] args) {

        Libro l1 = new Libro("Lagrimas de Sol", "Jovanni", 300);
        Libro l2 = new Libro("It", "Stephen King", 10000);

        l1.mostrarInfo();
        l2.mostrarInfo();
    }
}
