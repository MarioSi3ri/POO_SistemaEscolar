package main.java.com.si3ri.reto;

public abstract class Usuario { // Clase abstracta que define características.
    private final int id;
    private final String nombre;
    private final String apellido;
    private final String correoElectronico;

    public Usuario(int id, String nombre, String apellido, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
    }

    // Método abstracto para imprimir perfil, que debe ser implementado por subclases.
    public abstract void imprimirPerfil();

    // Getters y setters para los atributos privados
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}