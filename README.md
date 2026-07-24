# Task Manager API

API REST para gestión de tareas, construida con Spring Boot. Es un proyecto que hice para practicar y demostrar manejo de arquitectura backend en Java, incluyendo autenticación y documentación de API.

## Tecnologías utilizadas

- Java 17
- Spring Boot 4
- Spring Data JPA (persistencia de datos)
- Spring Security (autenticación)
- H2 Database (base de datos en memoria)
- Swagger / OpenAPI (documentación interactiva)

## Arquitectura

El proyecto está organizado en capas, separando responsabilidades:

Controller → Service → Repository → Base de datos

- El Controller recibe las peticiones HTTP.
- El Service contiene la lógica de negocio.
- El Repository se comunica con la base de datos.

Esta separación hace que el código sea más fácil de mantener y de escalar si el proyecto crece.

## Endpoints disponibles

GET /tareas - Lista todas las tareas
POST /tareas - Crea una nueva tarea
PUT /tareas/{id} - Actualiza una tarea existente
DELETE /tareas/{id} - Elimina una tarea

Todos los endpoints, salvo Swagger, requieren autenticación básica.

## Documentación interactiva

El proyecto incluye documentación automática con Swagger. Con el proyecto corriendo, se puede probar en:

http://localhost:8081/swagger-ui.html

## Cómo ejecutar el proyecto

1. Clona el repositorio:

git clone https://github.com/javiercastillo00010123-cell/api-demo.git

2. Ábrelo en IntelliJ IDEA (o el IDE que prefieras).

3. Ejecuta la clase ApiDemoApplication.

4. La API queda disponible en http://localhost:8081

## Autenticación

Al iniciar la aplicación, se genera una contraseña temporal en la consola. Se usa junto con el usuario user para acceder a los endpoints protegidos.

## Ejemplo de uso

Crear una tarea (POST /tareas):

{
  "titulo": "Aprender Spring Boot",
  "completada": false
}
