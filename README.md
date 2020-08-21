# Calculadora Basica De Estadistica

Esta aplicación soluciona algunos cálculos de estadística que son:
  - Promedio de n datos
  - Derivación estándar de n datos
Esta con la estructura Maven y una implantación de un linked list para el almacenamiento de los datos

#

# Pre-requisitos
  -Java SE Development Kit 8
  -Java SE Runtime Environment 8
  -Apache Maven.

# Instalación
Copiaremos la aplicación en nuestra maquina local con el siguiente comando
```sh
$ git clone https://github.com/jose-gome/AREP-Calculadora-estadistica.git
 ```
Ahora compilaremos y empaquetaremos con el siguiente comando
```sh
$ mvn package 
```
Para ejecuta la aplicación:
```sh
$ mvn exec:java -Dexec.mainClass="edu.escuelaing.arem.ASE.app.AppWeb"
```
[Aplicación](https://morning-chamber-39299.herokuapp.com/) en funcionamiento
# Ejecutando pruebas
Para ejecutar las pruebas automatizadas utilizaremos el siguiente comando.
```sh
$ mvn test 
```
# Generar Javadoc

```sh
$ mvn javadoc:javadoc 
```
# Integracion Continua
[![CircleCI](https://circleci.com/gh/jose-gome/AREP-2020-1-Calculadora-estadistica.svg?style=svg)](https://circleci.com/gh/jose-gome/AREP-2020-1-Calculadora-estadistica)
# Construido con
  - [Maven](https://maven.apache.org/) - Dependency Management
  - [SPARK](http://sparkjava.com/) Framework para desarrollar aplicaciones web
 
# Autores
  - José Luis Gómez Camacho - Estudiante de la Escuela Colombiana De Ingeniería Julio Garavito
# Licencia
Este proyecto está licenciado bajo la GNU v3.0 - ver el archivo LICENSE.md para más detalles
