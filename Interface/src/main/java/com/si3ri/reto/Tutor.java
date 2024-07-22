package main.java.com.si3ri.reto;

public class Tutor extends Usuario implements IPerfil { // La Clase 'Tutor' hereda de 'Usuario' e implementa la interfaz 'IPerfil'.
    private final Alumno alumno;

    public Tutor(int id, String nombre, String apellido, String correoElectronico, Alumno alumno) {
        super(id, nombre, apellido, correoElectronico);
        this.alumno = alumno;
    }

    @Override // Implementación del método para imprimir perfil 'Tutor'.
    public void imprimirPerfil() {
        System.out.println("- Se muestran los datos del Tutor:");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Correo Electrónico: " + getCorreoElectronico());
    }

    @Override // Implementación de los métodos de la interfaz 'IPerfil' para mostrar las calificaciones del alumno junto al 'Tutor'.
    public void mostrarCalificaciones() {
        System.out.println("ALUMNO TUTORADO:");
        System.out.println("Nombre completo del Alumno (Tutorado): " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Calificación del Alumno (Tutorado): " + alumno.getCalificacion());
    }

    @Override
    public void guardarCalificacion(double calificacion) {
        alumno.guardarCalificacion(calificacion);
    }

}