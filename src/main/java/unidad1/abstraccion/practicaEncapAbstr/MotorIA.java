package unidad1.abstraccion.practicaEncapAbstr;

/**
 * PRACTICA: ABSTRACCIÓN Y ENCAPSULAMIENTO EN IA
 * Alumno: Emilio Azael Valencia Lopez
 * Materia: POO - Ingeniería en IA
 */

// 1. LA ABSTRACCIÓN: El contrato general
abstract class MotorIA {
    // Atributos encapsulados (Protegidos de acceso externo indebido)
    private String nombreModelo;
    private double precision;

    public MotorIA(String nombre, double precision) {
        this.nombreModelo = nombre;
        this.precision = precision;
    }

    // GETTERS Y SETTERS (Encapsulamiento)
    public String getNombre() { return nombreModelo; }

    public void setPrecision(double precision) {
        if (precision < 0.0 || precision > 1.0) {
            throw new IllegalArgumentException("La precision no puede ser menor a 0.0 ni mayor a 1.0.");
        }
        this.precision = precision;
    }

    // TODO: Implementar el setter para precision con una validación:
    // La precisión no puede ser menor a 0.0 ni mayor a 1.0.


    // Metodo abstracto
    public abstract void analizar(String texto);

    // EL QUÉ: Contrato abstracto
    // TODO: Define un método abstracto llamado 'analizar' que reciba un String.

}
