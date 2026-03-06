package unidad1.filtroImagen;

public class FiltroImagen {

    public void aplicar(int[][] pixeles){
        System.out.println("Alicado el Filtro de Imagen a la matriz...");

        for(int i = 0; i < pixeles.length; i++){
            for(int j = 0; j < pixeles[i].length; j++){
                System.out.print(pixeles[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Ejemplo de uso:

FiltroImagen imagen = new FiltroImagen();

int[][] pixeles = {
    {120,130,140},
    {100,110,120},
    {90,80,70}
};

imagen.aplicar(pixeles);
 */