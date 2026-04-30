# Algoritmicos
Proyecto trabajo final Lab. Prog. 4
# Catálogo Oficial de Carreras - UASD

Sistema de consulta interactivo del catálogo de carreras de la Universidad Autónoma de Santo Domingo (UASD).

---

## Descripción

Aplicación de escritorio desarrollada en **Java** con interfaz gráfica Swing que permite consultar de forma rápida y eficiente todas las carreras de la UASD, filtradas por facultad o mediante búsqueda de texto.

---

## Tecnologías Utilizadas

- **Java 17**
- **Swing** (para la interfaz gráfica)
- **MySQL 8.0** (Base de datos)
- **Maven** (Gestión de dependencias)

---

## Requisitos

- **Java 17** o superior
- **Maven** 3.8+
- Conexión a internet (solo la primera vez para descargar dependencias)

---

## Instalación y Ejecución

Asegúrate de tener MySQL corriendo en el puerto 3306.
Ejecuta el archivo init.sql en tu base de datos.
Compila y ejecuta:
mvn clean compile exec:java (en una linea)
o
mvn clean compile (en una linea, y luego ejecuta)
mvn exec:java (para ejecutar)

**Estructura del Proyecto**

└───Proyecto
    │   pom.xml
    │
    ├───.github
    │   └───java-upgrade
    │       │   .gitignore
    │       │
    │       └───hooks
    │           └───scripts
    │                   recordToolUse.ps1
    │                   recordToolUse.sh
    │
    ├───.vscode
    │       settings.json
    │
    ├───bin
    ├───src
    │   ├───main
    │   │   └───java
    │   │       └───com
    │   │           └───uasd_Catalog
    │   │                   CatalogoCarrerasUASD.java
    │   │                   CatalogoDB.java
    │   │                   Main.java
    │   │
    │   └───test
    │       └───java
    └───target
        ├───classes
        │   └───com
        │       └───uasd_Catalog
        │               CatalogoCarrerasUASD$1.class
        │               CatalogoCarrerasUASD$2.class
        │               CatalogoCarrerasUASD.class
        │               CatalogoDB.class
        │               Main.class
        │
        ├───generated-sources
        │   └───annotations
        └───maven-status
            └───maven-compiler-plugin
                └───compile
                    └───default-compile
                            createdFiles.lst
                            inputFiles.lst
                            
**Captura**

<img width="1286" height="773" alt="image" src="https://github.com/user-attachments/assets/622d3ce6-38d8-4afe-a802-03e2edd436fc" />

**Autores**
Nelson Arjuna Mendoza 100643232
Cristal Leidy del rosario - 100635951
Edward Cedano o - 100630954
Eduard d castro perez - 100597934
Jomil Mota - 100617004
Wondel Antonio Alonso - 100604431

Estudiantes de Lic. en Informática - UASD


