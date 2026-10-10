# API de gestión de usuarios

Proyecto de práctica que implementa una API REST para gestionar usuarios con **arquitectura hexagonal**. La separación
entre dominio, casos de uso y adaptadores ayuda a reducir el acoplamiento y facilita las pruebas.

## Funcionalidades

- Crear usuarios.
- Consultar uno o todos los usuarios.
- Editar usuarios.
- Eliminar usuarios.

## Tecnologías

- Java 25
- Spring Boot y Spring MVC
- Spring Data JPA
- PostgreSQL

## Configuración

La conexión a PostgreSQL se configura mediante estas variables de entorno, utilizadas en
`src/main/resources/application.yaml`:

| Variable      | Descripción                    |
|---------------|--------------------------------|
| `DB_HOST`     | Host de PostgreSQL             |
| `DB_PORT`     | Puerto de PostgreSQL           |
| `DB_NAME`     | Nombre de la base de datos     |
| `DB_USERNAME` | Usuario de la base de datos    |
| `DB_PASSWORD` | Contraseña de la base de datos |

Puedes definirlas en el entorno o en un archivo `.env` en la raíz del proyecto, que Spring Boot carga de forma opcional:

```dotenv
DB_HOST=localhost
DB_PORT=5432
DB_NAME=arquitectura_hexagonal
DB_USERNAME=postgres
DB_PASSWORD=postgres
```