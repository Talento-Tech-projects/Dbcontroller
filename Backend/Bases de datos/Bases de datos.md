Modelo E-R
- Modelo conceptual que se usa para representar los datos y la relacion entre ellos en un sistema.
- Desarrollado por Peter Chen en 1976.
 - Entidad: Objeto o conceptos en el sistema (estudiante, profesor, etc)
 - Atributo: Propiedad de la entidad (nombre, telefono, edad, etc)
 - Relacion: Asociacion entre las entidades ( un estudiante se matricula en un curso)
 - Cardinalidad: Que tantas instancias de una entidad tienen relacion con las instancias de otras endidades.

Atributos
- Simple vs compuesto: edad vs direccion (calle, carrera, numero)
- Valor unico vs multiples valores: identificacion vs titulos
- Almacenador vs derivador: fecha nacimiento vs edad
- Clave o unicos: conjunto de atributos cuyos valores son unicos para cada instancia de la entidad.

Relacion
- Se representa con un rombo

Cardinalidad
- 1-1: Una instancia de a se relaciona con solo una instancia de B

Convertir E-R a SQL
- Entidad: Cada entidad se convierte en una tabla
- Atributos: Los atributos de la relacion se vuelven columnas de la tabla
- Relaciones: Se convierten segun la cardinalidad
 - 1-1: Se agrega una FK a una de las 2 tablas y en la otra se agrega UK
 - 1-N: Se agrega una FK en la tabla del lado N con referencia a la PK de la otra tabla
 - N-M: Se crea una nueva tabla que referencia las PK de ambas tablas\


BASE DE DATOS CLASS


