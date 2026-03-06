package unidad1.filtroImagen;

public class ReductorDeRuido extends FiltroImagen{

    @Override
    public void aplicar(int[][] pixeles) {
        System.out.println("Alicado el Reductor de Ruido a la matriz...");

        for(int i = 0; i < pixeles.length; i++){
            for(int j = 0; j < pixeles[i].length; j++){
                System.out.print(pixeles[i][j] + " ");
            }
            System.out.println();
        }
    }
}
