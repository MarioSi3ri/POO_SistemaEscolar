/* RETO 5. Proyecto final del paradigma orientado a objetos. */

package main.java.com.si3ri.reto;

import java.util.Scanner;

public class RioGrande {

    public static void main(String[] args) {

       Maestro maestro = new Maestro(30, "Alan", "Turing", "alanturing@rgrande.com");
       Alumno alumno = new Alumno(10, "Mario", "Jablovnski", "mariojablovnski@gmai.com");
       Tutor tutor = new Tutor(20, "Lionel", "Messi", "liomessi@rgrande.com", alumno); // Objeto 'alumno' ya instanciado.

        System.out.println();
        System.out.println("=====DATOS COMPLETOS DEL MAESTRO, ALUMNO Y TUTOR=====");
        System.out.println();

        System.out.println("=====MAESTRO=====");
        maestro.imprimirPerfil();
        System.out.println();

        System.out.println("=====ALUMNO=====");
        alumno.imprimirPerfil();
        alumno.guardarCalificacion(9.5);
        System.out.println();

        System.out.println("=====TUTOR=====");
        tutor.imprimirPerfil();
        tutor.mostrarCalificaciones();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String respuesta; // La respuesta escrita del usuario será de tipo 'String' que se almacena en 'respuesta'.

        do { //Se define un bucle "do-while".
            System.out.println();
            System.out.println("=====BÚSQUEDA INDIVIDUAL POR NOMBRE=====");
            System.out.println();

            System.out.print("Iniciando la primera letra con mayúscula, ingrese el nombre a buscar: ");
            String nombreBusqueda = scanner.nextLine(); // Espera que el usuario ingrese una cadena de texto. El texto ingresado por el usuario se almacena en la variable 'nombreBusqueda'.
            System.out.println();

            if (maestro.getNombre().equals(nombreBusqueda)) { // Comprueba si el nombre ingresado coincide con el nombre del 'Maestro', se utiliza la palabara reservada 'equals'.
                maestro.imprimirPerfil(); // Se llama a 'Maestro' y se imprime el perfil del Maestro.
                System.out.println();
                System.out.println("=====ESPERANDO QUE SU CONSULTA HAYA SIDO SATISFACTORIA=====");
                System.out.println();
            } else if (alumno.getNombre().equals(nombreBusqueda)) {
                alumno.imprimirPerfil();
                System.out.println();
                System.out.println("=====ESPERANDO QUE SU CONSULTA HAYA SIDO SATISFACTORIA=====");
                System.out.println();
            } else if (tutor.getNombre().equals(nombreBusqueda)) {
                tutor.imprimirPerfil();
                System.out.println();
                System.out.println("=====ESPERANDO QUE SU CONSULTA HAYA SIDO SATISFACTORIA=====");
                System.out.println();
            } else {
                System.out.println("*NO SE ENCONTRÓ REGISTRO*");
                System.out.println();
            }

            System.out.print("¿Desea realizar otra búsqueda? (S/N): ");
            respuesta = scanner.nextLine().toLowerCase(); // Se muestra un mensaje en la consola y espera que el usuario ingrese texto.

        } while (respuesta.equals("S") || respuesta.equals("s")); // La condición en este caso verifica si 'respuesta' es igual a "S" o "s". Si es verdadero, el bucle se repita; de lo contrario, el bucle termina.

        scanner.close(); // Línea que cierra el 'scanner' al final para evitar la salida de recursos.

    }
}