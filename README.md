# Microservicio de Productos (ms-productos)

Este es el microservicio encargado de gestionar los productos. Está construido con Spring Boot y utiliza PostgreSQL como base de datos.

## Tecnologías Utilizadas
- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Lombok
- Docker

## Requisitos Previos
- Tener JDK 17 instalado.
- Tener Maven instalado.
- Tener una base de datos PostgreSQL en la nube (como Neon) o de forma local.

## Configuración y Ejecución

1. Clona este repositorio o descarga el código fuente.
2. Configura las variables de entorno para conectarte a tu base de datos:
   - `DB_URL`: La URL JDBC de tu base de datos (ej. `jdbc:postgresql://<host>/<database>`).
   - `DB_USERNAME`: Tu usuario de base de datos.
   - `DB_PASSWORD`: Tu contraseña de base de datos.

   Si no configuras las variables, por defecto intentará conectarse a `jdbc:postgresql://localhost:5432/productos_db` con usuario y contraseña `postgres`.

3. Compila el proyecto con Maven:
   ```bash
   mvn clean package -DskipTests
   ```

4. Ejecuta la aplicación:
   ```bash
   java -jar target/ms-productos-0.0.1-SNAPSHOT.jar
   ```

## Despliegue con Docker

Si quieres construir la imagen de Docker, puedes usar el `Dockerfile` incluido:

```bash
docker build -t ms-productos .
docker run -p 8080:8080 -e DB_URL="jdbc:postgresql://..." -e DB_USERNAME="tu_usuario" -e DB_PASSWORD="tu_password" ms-productos
```

## Endpoints Principales

- `GET /api/productos`: Lista todos los productos.
- `GET /api/productos/{id}`: Obtiene un producto por su ID.
- `POST /api/productos`: Crea un nuevo producto.
- `PUT /api/productos/{id}`: Actualiza un producto existente.
- `DELETE /api/productos/{id}`: Elimina un producto.
