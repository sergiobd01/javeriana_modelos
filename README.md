# Calculador REST

> Proyecto AES PUJ

Los contratos RAML y Swagger de la segunda tarea tambien se encuentran en este repositorio

## Docker Container

Para ejecutar la maquina desde un contenedor Docker:

```bash
## Run Docker Container
docker run -p 7593:7593 seriobd/api:cal
```

## Ejecucion

* Sumar: http://localhost:7593/api/v1/calculator/add/1/2
* Restar: http://localhost:7593/api/v1/calculator/subs/1/2
* Dividir: http://localhost:7593/api/v1/calculator/mult/1/2
* Multiplicar: http://localhost:7593/api/v1/calculator/div/1/2

## Contratos segunda tarea

* swagger.yaml
* Contrato.raml

## Detalles Tecnicos
* NetBeans 8.1
* Java: 1.8.0_161
* Apache Tomcat 8.0.27
