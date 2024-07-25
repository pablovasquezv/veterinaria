# Proyecto Veterinaria

Este proyecto de una veterinaria ha sido desarrollado aplicando los principios SOLID. Estos principios son un conjunto de reglas que nos ayudan a diseñar software de calidad, que sea fácil de mantener, extender y modificar.

## Principios SOLID aplicados

### 1. Principio de Responsabilidad Única (SRP)

Cada clase en este proyecto tiene una única responsabilidad. Por ejemplo, la clase `Paciente` se encarga únicamente de representar un paciente y almacenar su información. Esto nos permite tener clases más cohesivas y fáciles de entender.

### 2. Principio de Abierto/Cerrado (OCP)

Este proyecto cumple con el principio de OCP al ser fácilmente extensible sin necesidad de modificar el código existente. Por ejemplo, si se desea agregar una nueva funcionalidad, como el registro de historiales médicos, se puede crear una nueva clase que implemente la interfaz `HistorialMedico` sin necesidad de modificar las clases existentes.

### 3. Principio de Sustitución de Liskov (LSP)

En este proyecto, se asegura que las clases derivadas puedan ser utilizadas en lugar de sus clases base sin causar problemas. Por ejemplo, la clase `Gato` y la clase `Perro` derivan de la clase base `Animal`, y se pueden utilizar en cualquier lugar donde se espera un `Animal` sin afectar el comportamiento del programa.

### 4. Principio de Segregación de Interfaces (ISP)

Las interfaces en este proyecto están diseñadas de manera específica para cada cliente. Por ejemplo, la interfaz `ClientePerro` solo contiene los métodos necesarios para interactuar con un cliente que tiene un perro, evitando así que los clientes que no tienen un perro tengan que implementar métodos innecesarios.

### 5. Principio de Inversión de Dependencia (DIP)

En este proyecto, las dependencias entre las clases se basan en abstracciones. Por ejemplo, la clase `Veterinario` depende de una interfaz `RepositorioPacientes` en lugar de depender directamente de una implementación concreta. Esto permite una mayor flexibilidad y facilita la sustitución de implementaciones.

## Contribuir

Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

1. Haz un fork de este repositorio.
2. Crea una rama para tu contribución.
3. Realiza tus cambios y mejoras.
4. Envía un pull request.

## Licencia

Este proyecto se encuentra bajo la Licencia MIT. Para más información, consulta el archivo LICENSE.

#### README UPDATE
* ***Juan Pablo Vásquez***  *24-07-2024*