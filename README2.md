# Algoritmicos

Proyecto trabajo final Lab. Prog. 4

# Catálogo Oficial de Carreras - UASD

Sistema de consulta interactivo del catálogo de carreras de la Universidad Autónoma de Santo Domingo (UASD).

---

## Descripción

Aplicación de escritorio desarrollada en **Java** con interfaz gráfica Swing que permite consultar de forma rápida y eficiente todas las carreras de la UASD, filtradas por facultad o mediante búsqueda de texto.

---

## Tecnologías utilizadas

| Tecnología | Versión       | Uso                                   |
| ---------- | ------------- | ------------------------------------- |
| Java       | 17 o superior | Lenguaje principal                    |
| Swing      | —             | Interfaz gráfica de escritorio        |
| MySQL      | 8.0           | Base de datos                         |
| Maven      | 3.8+          | Gestión de dependencias y compilación |
| JDBC       | —             | Conexión entre Java y MySQL           |

---

## Requisitos previos

Antes de instalar el proyecto, asegúrate de tener lo siguiente instalado y funcionando en tu computadora:

### 1. Java 17 o superior

- Descarga: https://adoptium.net (versión **Temurin 17 LTS** recomendada)
- Después de instalar, verifica en la terminal:

```
java -version
```

Debe mostrar algo como: `java version "17.x.x"`

### 2. Apache Maven 3.8+

- Descarga: https://maven.apache.org/download.cgi (archivo **Binary zip archive**)
- Guía de instalación (Windows): extrae el zip en `C:\Program Files\Maven\` y agrega `C:\Program Files\Maven\apache-maven-X.X.X\bin` a la variable de entorno `PATH`
- Verifica en la terminal:

```
mvn -version
```

Debe mostrar: `Apache Maven 3.x.x`

### 3. MySQL 8.0

- Descarga: https://dev.mysql.com/downloads/mysql/
- Durante la instalación, **anota bien la contraseña** del usuario `root`, la necesitarás más adelante
- Opcional pero recomendado: instala también **MySQL Workbench** para administrar la base de datos visualmente

---

## Instalación paso a paso

### Paso 1 — Clonar el repositorio

Abre una terminal (CMD, PowerShell o Git Bash) y ejecuta:

```bash
git clone https://github.com/Ayunaelnene/Algoritmicos.git
cd Algoritmicos
```

> Si no tienes Git instalado, descárgalo en: https://git-scm.com/downloads

---

### Paso 2 — Crear la base de datos

Tienes dos opciones:

**Opción A — Usando MySQL Workbench (recomendado):**

1. Abre MySQL Workbench y conéctate a tu servidor local
2. En el menú: `File → Open SQL Script...`
3. Navega y abre el archivo `db/init.sql` del repositorio
4. Ejecuta todo con `Ctrl + Shift + Enter`
5. En el panel izquierdo (Schemas) debe aparecer la base de datos `uasd_catalog`

**Opción B — Usando la terminal:**

```bash
mysql -u root -p < db/init.sql
```

Te pedirá tu contraseña de MySQL. Si el comando `mysql` no es reconocido, agrega `C:\Program Files\MySQL\MySQL Server 8.0\bin` a tu variable de entorno `PATH`.

---

### Paso 3 — Configurar la contraseña de la base de datos

Abre el archivo:

```
Proyecto/src/main/java/com/uasd_Catalog/CatalogoDB.java
```

Busca esta línea y reemplaza la contraseña por la tuya:

```java
private static final String PASSWORD = "+Juandelospalotes.01*";
```

Por ejemplo, si tu contraseña es `mi_password`:

```java
private static final String PASSWORD = "mi_password";
```

Si no configuraste contraseña en MySQL:

```java
private static final String PASSWORD = "";
```

---

### Paso 4 — Compilar y ejecutar

Desde la carpeta `Algoritmicos/Proyecto`, ejecuta:

```bash
cd Proyecto
mvn clean compile exec:java
```

La primera ejecución puede tardar un poco porque Maven descarga automáticamente el driver de MySQL. Las siguientes veces será más rápido.

---

## Solución de errores comunes

| Error                             | Causa                                | Solución                                                                          |
| --------------------------------- | ------------------------------------ | --------------------------------------------------------------------------------- |
| `'mvn' is not recognized`         | Maven no está en el PATH             | Agrega la carpeta `bin` de Maven a las variables de entorno                       |
| `'mysql' is not recognized`       | MySQL no está en el PATH             | Agrega `C:\Program Files\MySQL\MySQL Server 8.0\bin` al PATH                      |
| `Access denied for user 'root'`   | Contraseña incorrecta en el código   | Edita `CatalogoDB.java` con tu contraseña real de MySQL                           |
| `Unknown database 'uasd_catalog'` | No se ejecutó el init.sql            | Ejecuta el archivo `db/init.sql` en MySQL (Paso 2)                                |
| `Communications link failure`     | MySQL no está corriendo              | Inicia el servicio MySQL desde el Administrador de servicios de Windows           |
| Error de versión de Java          | Java configurado para v17 en pom.xml | Cambia `<maven.compiler.source>` y `<maven.compiler.target>` a tu versión de Java |

---

## Estructura del proyecto

```
Algoritmicos/
├── db/
│   └── init.sql                  → Script para crear y poblar la base de datos
└── Proyecto/
    ├── pom.xml                   → Configuración de Maven y dependencias
    └── src/main/java/com/uasd_Catalog/
        ├── Main.java             → Punto de entrada, lanza la ventana principal
        ├── CatalogoDB.java       → Configuración de conexión y consultas SQL
        └── CatalogoCarrerasUASD.java → Interfaz gráfica y lógica de la aplicación
```

---

## Captura

<img width="1286" height="773" alt="image" src="https://github.com/user-attachments/assets/622d3ce6-38d8-4afe-a802-03e2edd436fc" />

---

## Autores

Estudiantes de Licenciatura en Informática — UASD

| Nombre                    | Matrícula |
| ------------------------- | --------- |
| Nelson Arjuna Mendoza     | 100643232 |
| Cristal Leidy Del Rosario | 100635951 |
| Edward Cedano             | 100630954 |
| Eduard D. Castro Pérez    | 100597934 |
| Jomil Mota                | 100617004 |
| Wondel Antonio Alonso     | 100604431 |
