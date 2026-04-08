package unidad2.interfaces.practica04;

class Dataset{

}

public class EjemploSobrecargarMetodos {

     public void entrenar (Dataset[] datasets){
         System.out.println("Metodo entrenar con 1 parametro.");
     };

     public void entrenar (Dataset[] datasets, int epocas){
         System.out.println("Metodo entrenar sobrecargado.");
     };


}
