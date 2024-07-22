package main.java.com.si3ri.reto;

public class Alumno extends Usuario implements IPerfil { // La Clase 'Alumno' hereda de 'Usuario' e implementa la interfaz 'IPerfil'.
    private double calificacion;

    public Alumno(int id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico); // Constructor de la clase 'Alumno' que llama al constructor de la superclase ('Usuario') para inicializar los atributos.
    }

    @Override // Implementación del método para imprimir perfil del 'Alumno'.
    public void imprimirPerfil() {
        System.out.println("- Se muestran los datos del Alumno:");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Correo Electrónico: " + getCorreoElectronico());
    }

    @Override
    public void mostrarCalificaciones() {
        System.out.println("Calificación del Alumno: " + calificacion);
    }

    @Override
    public void guardarCalificacion(double calificacion) {
        this.calificacion = calificacion;
        System.out.println("Calificación guardada: " + calificacion);
    }

    public double getCalificacion() {
        return calificacion;
    }

}