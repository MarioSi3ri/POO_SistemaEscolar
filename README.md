# 🎓 POO Sistema Escolar

![Java](https://img.shields.io/badge/Java-100%25-orange?style=for-the-badge&logo=openjdk)
![Paradigma](https://img.shields.io/badge/Paradigma-POO-blue?style=for-the-badge)
![Tema](https://img.shields.io/badge/Tema-Interfaces%20y%20herencia-purple?style=for-the-badge)
![Estado](https://img.shields.io/badge/Estado-Académico-success?style=for-the-badge)

Proyecto académico desarrollado en **Java** para practicar los fundamentos de la **Programación Orientada a Objetos**, con énfasis en el uso de **clases abstractas, herencia, interfaces, encapsulamiento y polimorfismo**.

La aplicación simula un sistema escolar sencillo capaz de registrar perfiles de maestros, alumnos y tutores, mostrar su información y consultar las calificaciones asociadas a un alumno.

> Proyecto correspondiente al **Reto 5: Proyecto final del paradigma orientado a objetos** de la UVEG.

---

## 📖 Contenido

- [Acerca del proyecto](#-acerca-del-proyecto)
- [Objetivos de aprendizaje](#-objetivos-de-aprendizaje)
- [Funcionalidades](#-funcionalidades)
- [Estructura del proyecto](#-estructura-del-proyecto)
- [Tecnologías utilizadas](#-tecnologías-utilizadas)
- [Requisitos previos](#-requisitos-previos)
- [Instalación](#-instalación)
- [Ejecución](#-ejecución)
- [Cómo usarlo](#-cómo-usarlo)
- [Conceptos de POO aplicados](#-conceptos-de-poo-aplicados)
- [Consideraciones](#-consideraciones)
- [Posibles mejoras](#-posibles-mejoras)
- [Autor](#-autor)

---

## 🧾 Acerca del proyecto

**POO Sistema Escolar** es una aplicación de consola que representa un registro escolar básico mediante diferentes tipos de usuarios.

El diseño parte de la clase abstracta `Usuario`, que contiene los datos comunes de cualquier perfil escolar: identificador, nombre, apellido y correo electrónico. A partir de ella se crean las clases `Maestro`, `Alumno` y `Tutor`.

Además, la interfaz `IPerfil` define las operaciones relacionadas con las calificaciones. Tanto `Alumno` como `Tutor` implementan esta interfaz, aunque cada uno resuelve sus métodos de acuerdo con su responsabilidad:

- El **alumno** puede guardar y consultar su propia calificación.
- El **tutor** puede consultar y actualizar la calificación del alumno que tiene asociado.
- El **maestro** puede mostrar su información mediante la implementación del método abstracto `imprimirPerfil()`.

La clase `RioGrande` contiene el método principal de la aplicación y permite realizar búsquedas de usuarios por nombre desde la consola.

---

## 🎯 Objetivos de aprendizaje

El proyecto permite practicar los siguientes conceptos:

- Definición de clases abstractas.
- Implementación de interfaces.
- Herencia entre clases.
- Polimorfismo mediante referencias de tipos base.
- Sobrescritura de métodos con `@Override`.
- Encapsulamiento de atributos.
- Uso de constructores y de la palabra reservada `super`.
- Composición entre objetos, mediante la relación entre `Tutor` y `Alumno`.
- Captura de información desde la consola usando `Scanner`.
- Búsqueda de registros mediante comparaciones de cadenas.

---

## ✨ Funcionalidades

### 👨‍🏫 Gestión de maestros

- Crea un perfil de maestro con ID, nombre, apellido y correo electrónico.
- Muestra la información completa del perfil.

### 👨‍🎓 Gestión de alumnos

- Crea un perfil de alumno.
- Muestra sus datos personales.
- Permite guardar una calificación.
- Permite consultar la calificación almacenada.

### 👨‍👩‍👦 Gestión de tutores

- Crea un perfil de tutor asociado a un alumno.
- Muestra la información del tutor.
- Consulta los datos y la calificación del alumno tutorado.
- Puede guardar una calificación para el alumno asociado.

### 🔎 Búsqueda por nombre

- Solicita al usuario el nombre que desea consultar.
- Busca coincidencias entre el maestro, el alumno y el tutor registrados.
- Muestra el perfil correspondiente cuando encuentra una coincidencia.
- Permite realizar búsquedas adicionales mediante un ciclo `do-while`.

---

## 📁 Estructura del proyecto

```text
POO_SistemaEscolar/
├── Interface/
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           └── com/
│   │               └── si3ri/
│   │                   └── reto/
│   │                       ├── Alumno.java
│   │                       ├── IPerfil.java
│   │                       ├── Maestro.java
│   │                       ├── RioGrande.java
│   │                       ├── Tutor.java
│   │                       └── Usuario.java
│   ├── .idea/
│   └── Interface.iml
├── .idea/
└── POO_SistemaEscolar.iml
```

### Descripción de las clases

| Archivo | Responsabilidad |
|---|---|
| `Usuario.java` | Clase abstracta que define los datos comunes y el método abstracto para imprimir perfiles. |
| `IPerfil.java` | Interfaz que establece las operaciones para mostrar y guardar calificaciones. |
| `Maestro.java` | Representa un maestro y muestra la información de su perfil. |
| `Alumno.java` | Representa un alumno y administra su calificación. |
| `Tutor.java` | Representa un tutor asociado a un alumno y gestiona las operaciones sobre su calificación. |
| `RioGrande.java` | Clase principal; crea los perfiles, muestra información y realiza búsquedas interactivas. |

---

## 🛠️ Tecnologías utilizadas

- **Java** — lenguaje principal del proyecto.
- **JDK** — compilación y ejecución de la aplicación.
- **`java.util.Scanner`** — captura de datos desde la consola.
- **IntelliJ IDEA** — estructura del proyecto y archivos de configuración incluidos.
- **Git/GitHub** — control de versiones y publicación del código.

No se utilizan bases de datos, dependencias externas ni frameworks.

---

## ✅ Requisitos previos

Antes de ejecutar el proyecto, asegúrate de contar con:

- **JDK 8 o superior** instalado.
- Una terminal o consola de comandos.
- Opcionalmente, **IntelliJ IDEA** u otro IDE compatible con Java.

Puedes comprobar la instalación de Java con los siguientes comandos:

```bash
java -version
javac -version
```

---

## 📥 Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/MarioSi3ri/POO_SistemaEscolar.git
```

### 2. Entrar al directorio del proyecto

```bash
cd POO_SistemaEscolar
```

### 3. Abrir el proyecto

Puedes abrir la carpeta en IntelliJ IDEA o trabajar directamente desde la terminal.

En IntelliJ IDEA:

1. Selecciona **Open**.
2. Elige la carpeta `POO_SistemaEscolar`.
3. Configura un JDK instalado en tu equipo.
4. Ubica la clase principal `RioGrande.java`.

---

## ▶️ Ejecución

### Opción A: desde IntelliJ IDEA

1. Abre el archivo:

   ```text
   Interface/src/main/java/com/si3ri/reto/RioGrande.java
   ```

2. Haz clic derecho sobre la clase `RioGrande`.
3. Selecciona **Run 'RioGrande.main()'**.
4. Introduce el nombre que deseas buscar en la consola.
5. Indica si deseas realizar otra búsqueda escribiendo `S` o `N`.

### Opción B: desde la terminal

Desde la raíz del repositorio, crea una carpeta para los archivos compilados:

```bash
mkdir -p out
```

En Windows PowerShell puedes utilizar:

```powershell
New-Item -ItemType Directory -Force out
```

Compila las clases Java:

```bash
javac -d out Interface/src/main/java/com/si3ri/reto/*.java
```

Ejecuta la clase principal:

```bash
java -cp out main.java.com.si3ri.reto.RioGrande
```

> El paquete declarado en las clases es `main.java.com.si3ri.reto`, por lo que el nombre completo de la clase principal incluye ese prefijo al ejecutar desde la terminal.

---

## 🧭 Cómo usarlo

Al iniciar la aplicación, se crean automáticamente los siguientes perfiles:

- **Maestro:** Alan Turing, ID `30`.
- **Alumno:** Mario Jablovnski, ID `10`.
- **Tutor:** Lionel Messi, ID `20`, asociado al alumno anterior.

El flujo principal es el siguiente:

1. El sistema muestra los datos del maestro.
2. Muestra los datos del alumno.
3. Guarda la calificación `9.5` para el alumno.
4. Muestra los datos del tutor.
5. El tutor consulta la información y la calificación del alumno asociado.
6. El sistema solicita un nombre para realizar una búsqueda individual.
7. Si encuentra el nombre, imprime el perfil correspondiente.
8. Pregunta si se desea realizar otra búsqueda.

Ejemplo de interacción:

```text
=====DATOS COMPLETOS DEL MAESTRO, ALUMNO Y TUTOR=====

=====MAESTRO=====
ID: 30
Nombre: Alan
Apellido: Turing
Correo Electrónico: alanturing@rgrande.com

=====ALUMNO=====
ID: 10
Nombre: Mario
Apellido: Jablovnski
Correo Electrónico: mariojablovnski@gmai.com
Calificación guardada: 9.5

=====TUTOR=====
ID: 20
Nombre: Lionel
Apellido: Messi
Correo Electrónico: liomessi@rgrande.com

=====BÚSQUEDA INDIVIDUAL POR NOMBRE=====
Iniciando la primera letra con mayúscula, ingrese el nombre a buscar: Mario
```

La búsqueda distingue entre mayúsculas y minúsculas, por lo que se recomienda escribir el nombre con la primera letra en mayúscula, tal como está registrado.

---

## 🧠 Conceptos de POO aplicados

### Clase abstracta

`Usuario` es una clase abstracta que concentra los atributos comunes de los perfiles escolares y declara el método abstracto `imprimirPerfil()`.

```java
public abstract class Usuario {
    public abstract void imprimirPerfil();
}
```

Esto permite que cada tipo de usuario implemente la forma específica de mostrar sus datos.

### Herencia

`Maestro`, `Alumno` y `Tutor` heredan de `Usuario`:

```java
public class Alumno extends Usuario implements IPerfil {
    // comportamiento especializado
}
```

La herencia evita duplicar atributos como el ID, nombre, apellido y correo electrónico.

### Interfaces

`IPerfil` define un contrato para las operaciones relacionadas con las calificaciones:

```java
public interface IPerfil {
    void mostrarCalificaciones();
    void guardarCalificacion(double calificacion);
}
```

Las clases que implementan esta interfaz deben proporcionar su propia lógica para ambos métodos.

### Polimorfismo

Los objetos de las clases concretas comparten el tipo base `Usuario` y pueden responder al método `imprimirPerfil()` con una implementación diferente según su clase.

### Encapsulamiento

Los atributos de `Usuario` y las calificaciones se mantienen privados. El acceso se realiza mediante métodos públicos, como `getId()`, `getNombre()` y `getCalificacion()`.

### Composición

La clase `Tutor` mantiene una referencia a un objeto `Alumno`, lo que representa la relación entre un tutor y el alumno que tiene asociado.

---

## ⚠️ Consideraciones

- Es una simulación académica y no un sistema escolar listo para producción.
- Los perfiles se crean directamente en el código fuente.
- La información se conserva únicamente durante la ejecución del programa.
- No existe persistencia en archivos ni en una base de datos.
- La búsqueda compara los nombres de forma exacta y distingue mayúsculas de minúsculas.
- La validación de datos de entrada es básica.
- Solo se maneja una calificación por alumno.
- El proyecto no incluye autenticación, roles de acceso ni pruebas automatizadas.

---

## 🚀 Posibles mejoras

Como futuras extensiones del proyecto se podrían incorporar:

- Menú interactivo para administrar alumnos, maestros y tutores.
- Registro dinámico de múltiples usuarios.
- Uso de colecciones como `ArrayList` para almacenar perfiles.
- Búsquedas sin distinguir mayúsculas y minúsculas.
- Validación de correos electrónicos y calificaciones.
- Historial de varias calificaciones por alumno.
- Persistencia mediante archivos o una base de datos.
- Separación de las capas de presentación, lógica y datos.
- Pruebas unitarias con JUnit.
- Manejo de excepciones para entradas inválidas.

---

## 👤 Autor

**Mario Si3ri**

- GitHub: [@MarioSi3ri](https://github.com/MarioSi3ri)
- Repositorio: [POO_SistemaEscolar](https://github.com/MarioSi3ri/POO_SistemaEscolar)

---

## 📄 Licencia

Este proyecto no especifica una licencia de código abierto. Para reutilizarlo o redistribuirlo, consulta al autor del repositorio.

---

⭐ Si este proyecto te resulta útil para estudiar interfaces y Programación Orientada a Objetos, considera darle una estrella al repositorio.
