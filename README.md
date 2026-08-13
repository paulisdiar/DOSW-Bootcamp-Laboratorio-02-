# PREGUNTAS INICIALES
01. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?
- El polimorfismo permite que cada clase defina su propio comportamiento mediante un método común, evitando condicionales repetitivos y logrando código más flexible, mantenible y abierto a extensión sin modificar lo existente.


02. ¿Por qué una clase inmutable puede mejorar la seguridad en un sistema?

- En una clase inmutable los objetos no pueden modificar su estado después de ser creados. Esto puede mejorar la seguridad porque evita que otros objetos cambien accidentalmente los datos.

03. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?
- Si los atributos son públicos, cualquier clase externa puede modificarlos directamente sin validación, rompiendo el encapsulamiento y dejando el objeto en estados inconsistentes o inválidos.

04. Según el principio Abierto/Cerrado, ¿cómo deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?

- Una clase debe estar abierta para extensión, pero cerrada para modificación. Cuando se necesita agregar una nueva funcionalidad se usa herencia, interfaces o composición sin modificar directamente las clases que ya funcionan.

05. ¿Por qué es importante que una clase cumpla con el Principio de Única Responsabilidad? Da un ejemplo donde se vulnere.
- El SRP importa porque una clase con una sola responsabilidad es más fácil de mantener, probar y modificar sin afectar funcionalidades no relacionadas.

Ejemplo de violación:

```java
public class Empleado {
    public double calcularPago() { ... }
    public void guardarEnBaseDeDatos() { ... }
    public void imprimirReciboPDF() { ... }
}
```

Se rompe porque mezcla tres razones distintas para cambiar en una sola clase, así que modificar una puede afectar sin querer a las otras.

06. ¿Qué es y para qué usamos el pom.xml?

- El pom.xml es el archivo principal de configuración de un proyecto Maven, se utiliza este archivo para saber cómo compilar, probar y empaquetar la aplicación.

07. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?
- mvn compile: compila el código fuente a .class, sin generar artefacto empaquetado.
- mvn package: compila, corre las pruebas y empaqueta el proyecto en jar o war dentro de target.
- mvn install: hace todo lo de package y además instala ese artefacto en el repositorio local de Maven para que otros proyectos puedan usarlo.

Son fases acumulativas: compile, luego test, luego package, luego install.

08. ¿Qué diferencia existe entre una interfaz y una clase abstracta?

- Una interfaz define unos comportamientos que las clases deben implementar. Una clase puede implementar varias interfaces, lo que permite que diferentes clases compartan un mismo comportamiento, en cambio, una clase abstracta no puede ser instanciada directamente y puede contener tanto métodos abstractos como métodos con implementación. Una clase solo puede heredar de una clase abstracta.
