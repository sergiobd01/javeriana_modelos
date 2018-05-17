# Calculador REST

> Proyecto AES PUJ

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

## Detalles Tecnicos
