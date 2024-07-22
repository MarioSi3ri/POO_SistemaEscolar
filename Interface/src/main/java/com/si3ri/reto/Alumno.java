package main.java.com.si3ri.reto;

public class Alumno extends Usuario implements IPerfil { // La Clase 'main.java.com.si3ri.reto.Alumno' hereda de 'main.java.com.si3ri.reto.Usuario' e implementa la interfaz 'main.java.com.si3ri.reto.IPerfil'.
    private double calificacion;

    public Alumno(int id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico); // Constructor de la clase 'main.java.com.si3ri.reto.Alumno' que llama al constructor de la superclase ('main.java.com.si3ri.reto.Usuario') para inicializar los atributos.
    }

    @Override // Implementación del método para imprimir perfil del main.java.com.si3ri.reto.Alumno.
    public void imprimirPerfil() {
        System.out.println("- Se muestran los datos del main.java.com.si3ri.reto.Alumno:");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Correo Electrónico: " + getCorreoElectronico());
    }

    @Override
    public void mostrarCalificaciones() {
        System.out.println("Calificación del main.java.com.si3ri.reto.Alumno: " + calificacion);
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