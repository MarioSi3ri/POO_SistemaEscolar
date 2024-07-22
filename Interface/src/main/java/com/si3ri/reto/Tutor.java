package main.java.com.si3ri.reto;

public class Tutor extends Usuario implements IPerfil { // La Clase 'main.java.com.si3ri.reto.Tutor' hereda de 'main.java.com.si3ri.reto.Usuario' e implementa la interfaz 'main.java.com.si3ri.reto.IPerfil'.
    private final Alumno alumno;

    public Tutor(int id, String nombre, String apellido, String correoElectronico, Alumno alumno) {
        super(id, nombre, apellido, correoElectronico);
        this.alumno = alumno;
    }

    @Override // Implementación del método para imprimir perfil 'main.java.com.si3ri.reto.Tutor'.
    public void imprimirPerfil() {
        System.out.println("- Se muestran los datos del main.java.com.si3ri.reto.Tutor:");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Correo Electrónico: " + getCorreoElectronico());
    }

    @Override // Implementación de los métodos de la interfaz 'main.java.com.si3ri.reto.IPerfil' para mostrar las calificaciones del alumno junto al 'main.java.com.si3ri.reto.Tutor'.
    public void mostrarCalificaciones() {
        System.out.println("ALUMNO TUTARADO:");
        System.out.println("Nombre completo del main.java.com.si3ri.reto.Alumno (Tutorado): " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Calificación del main.java.com.si3ri.reto.Alumno (Tutorado): " + alumno.getCalificacion());
    }

    @Override
    public void guardarCalificacion(double calificacion) {
        alumno.guardarCalificacion(calificacion);
    }

}