package main.java.com.si3ri.reto;

public class Maestro extends Usuario { // La Clase 'Maestro' hereda de la Clase Abstracta 'Usuario'.
    public Maestro(int id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico);
    }

    @Override // Implementación de Override del método para imprimir perfil del 'Maestro'.
    public void imprimirPerfil() {
        System.out.println("- Se muestran los datos del main.java.com.si3ri.reto.Maestro:");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Correo Electrónico: " + getCorreoElectronico());
    }
}