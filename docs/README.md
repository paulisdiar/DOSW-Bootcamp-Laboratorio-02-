# DOSW-Bootcamp-Laboratorio-02-
02. ¿Por qué una clase inmutable puede mejorar la seguridad en un sistema?

En una clase inmutable los objetos no pueden modificar su estado después de ser creados. Esto puede mejorar la seguridad porque evita que otros objetos cambien accidentalmente los datos.

04. Según el principio Abierto/Cerrado, ¿cómo deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?

Una clase debe estar abierta para extensión, pero cerrada para modificación. Cuando se necesita agregar una nueva funcionalidad se usa herencia, interfaces o composición sin modificar directamente las clases que ya funcionan. 

06. ¿Qué es y para qué usamos el pom.xml?

El pom.xml es el archivo principal de configuración de un proyecto Maven, se utiliza este archivo para saber cómo compilar, probar y empaquetar la aplicación.

08. ¿Qué diferencia existe entre una interfaz y una clase abstracta?

Una interfaz define unos comportamientos que las clases deben implementar. Una clase puede implementar varias interfaces, lo que permite que diferentes clases compartan un mismo comportamiento, en cambio, una clase abstracta no puede ser instanciada directamente y puede contener tanto métodos abstractos como métodos con implementación. Una clase solo puede heredar de una clase abstracta.
