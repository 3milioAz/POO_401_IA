package unidad2.ejercicios.base;

import java.text.BreakIterator;

public class SistemaCalificaciones {

    public static void main(String[] args) {

        int notaExamen = 77;

        if (notaExamen >= 60){
            System.out.println("Felicidades has aprobado.");
            if (notaExamen >= 90) {
                System.out.println("Excelente desempeño");
            }
        }else{
            System.out.println("Lo sentimos no has aprobado");
        }

        // Sentencia switch

        char calificacionLetra;
        switch (notaExamen){
            case 100:
            case 90:
                calificacionLetra = 'A';
                break;
            case 80:
                calificacionLetra = 'B';
                break;
            case 70:
                calificacionLetra = 'C';
                break;
            case 60:
                calificacionLetra = 'D';
                break;
            default:
                calificacionLetra = 'F';
                break;
        }
        System.out.println("Tu calificacion es: " + calificacionLetra);
    }
}
