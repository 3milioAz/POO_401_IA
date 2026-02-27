package unidad1.abstraccion.practicaEncapAbstr;

import unidad1.abstraccion.ModeloIA;
import unidad1.abstraccion.ReconocimientoFacial;

// 3. EL USO: Interfaz simplificada
public class Main {
    public static void main(String[] args) {

        //Cambiar esto
        MotorIA analizador = new AnalizadorSentimientos();

        // TODO: Instanciar un objeto de tipo AnalizadorSentimientos usando la referencia de la clase abstracta.
        // Ejemplo: MotorIA miModelo = new ...

        System.out.println("Sistema de IA Iniciado...");

        analizador.analizar("Hoy es un día muy bueno y estoy feliz");
        analizador.analizar("El servicio fue terrible");


        // TODO: Llamar al método analizar con los siguientes textos:
        // 1. "Hoy es un día muy bueno y estoy feliz"
        // 2. "El servicio fue terrible"

        /* REFLEXIÓN PARA EL ALUMNO:
           ¿Puedes cambiar la precisión del modelo directamente con miModelo.precision = 5.0?
           R= No, primero deberia de hacer un metodo que la cambie usando el this.precision

           ¿Por qué es importante que el método analizar() oculte los pasos de tokenización?
           R= Porque protege los datos al analizarnos internamente y porque el usuario no necesita observar todo el proceso, solamente requiere el resultado.        */
    }
}
