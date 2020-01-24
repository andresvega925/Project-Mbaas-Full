# Plantilla para microservicios Java de backend

Este repositorio contiene la estructura, instrumentación y herramientas estándares para utilizar en la creación de microservicios de backend en el BaaS de Davivienda.

## Setup

- Una vez clonado el "repositorio api-java-template", copiar el contenido a un nuevo directorio para la API a crear.
- Desvincular GIT desde la plantilla borrando la carpeta ".git".
- Luego inicializar un repositorio nuevo para la API utilizando `git flow init`.
- Modificar package.json y reemplazar este README con los datos de la API.
- Crear un commit inicial "chore: creación de microservicio desde plantilla"
- Hacer Push al repositorio nuevo para la API

## Variables de entorno

Ver documentacion de [Variables de Entorno](src/main/resources/EnvVars.md) por la lista de valores posibles a configurar.

En entornos de desarrollo o testing se puede utilizar un archivo `.application.properties` en la base del proyecto con las opciones deseadas.
Ver [.application-dev.properties](.application-dev.properties) como ejemplo.

## Scripts
- `mvn spring-boot:run` Inicia servidor (refresco automatico ante cambios)
- `mvn test` Corre los test unitarios y de integración del proyecto

## Copyright Davivienda

Todo archivo de código fuente debe llevar en su encabezado la siguiente leyenda en referencia a los derchos de autor:

`// Copyright (C) <año> - Banco Davivienda S.A. y sus filiales.`

Reemplazando `<año>` por el año de creación del archivo.

### Java

Se utiliza [Java](https://www.java.com/) como lenguaje de desarrollo, compilando con Maven 3 y Java 1.8.

### Framework

Este proyecto utiliza [Spring](https://spring.io/projects/spring-framework) como framework con tecnologia [Spring](https://spring.io/projects/spring-boot) para simplificar la implementación.

### Spotbugs

En el proyecto se utiliza [Spotbugs](https://spotbugs.github.io/) para análisis estático de código. 


### Documentación de la API

El proyecto utiliza el estándar [OpenAPI](https://www.openapis.org/) de documentación utilizando Swagger como editor y visualización de API Docs con Swagger-UI embebido y ejecutándose solo en ambientes de development y testing.
Se debe documentar la especificación del API la clase `SwaggerConfiguration.java`.

Si el ambiente es development o testing, se podrá acceder a Swagger-UI en la ruta `/swagger-ui.html`

Ejemplo: `http://localhost:6001/api/v1/swagger-ui.html`



### Docker

Se puede generar localmente la imagen de Docker para esta API ejecutando el comando:

`mvn clean package`

El nombre de la imagen se genera de la siguiente manera ${docker.image.prefix}/${project.artifactId}:${project.version}

Luego iniciar un contenedor con:

`docker run -d -e spring.profiles.active=dev -p 6005:6001 --name dv-api-java-template davivienda/api-java-template:0.0.1-SNAPSHOT`