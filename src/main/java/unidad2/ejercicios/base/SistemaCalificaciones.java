package unidad2.ejercicios.base;

public class SistemaCalificaciones {

    public static void main(String[] args) {

        int notaExamen = 77;

        // Sentencia if-else
        if (notaExamen >= 60){
            System.out.println("¡Felicidades, has aprobado!");
            if (notaExamen >= 90) {
                System.out.println("¡Excelente desempeño!");
            }
        }else{
            System.out.println("Lo sentimos, no has aprobado.");
        }

        // Sentencia switch
        char calificacionLetra;
        if(notaExamen > 0 && notaExamen <= 100){
            switch (notaExamen / 10){   // Al dividirla sobre 10 la volvemos un valor que sea maximo de 2 cifras (10) por lo cual el switch puede ignorar los decimales y solo agarrar los enteros con el switch.
                case 9, 10:
                    calificacionLetra = 'A';
                    break;
                case 8:
                    calificacionLetra = 'B';
                    break;
                case 7:
                    calificacionLetra = 'C';
                    break;
                case 6:
                    calificacionLetra = 'D';
                    break;
                default:
                    calificacionLetra = 'F';
                    break;
            }
            System.out.println("Tu calificacion es: " + calificacionLetra);
        }else{
            System.out.println("La nota es inválida.");
        }
    }
}
