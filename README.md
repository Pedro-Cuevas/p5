# Práctica 5: Desarrollo de API REST con Spring Boot

### Pedro Cuevas

---

## Introducción

He implementado una API REST con Spring Boot. Para ello, he reutilizado mi web de Telefónica usada en las prácticas 3 y 4.

Tras corregir los fallos que tenía en mi formulario de contacto, lo he conectado con un endpoint.

Cuando el usuario pulsa el botón de enviar, se realiza una petición PUT para guardar la información de contacto, y una petición GET para volver a obtener dicha información para usarla en un mensaje al usuario.

## Archivos relevantes

- HTML del formulario: spring/src/main/resources/static/contacto.html

- Javascript del formulario: spring/src/main/resources/static/assets/js/contacto.js

- Archivos JAVA: spring/src/main/java/com/example/demo