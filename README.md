# 🎮 **LEGENDS OF AETHER**
> Juego narrativo por consola basado en principios de Programación Orientada a Objetos (POO)

---

##  Integrantes
- **Anthony Caldas**
- **Ibrahim Angulo**
- **Cristopher Farias**

---

## 📌 **Descripción del Sistema**

**Legends of Aether** es un juego de batalla y exploración por consola donde un jugador se enfrenta a criaturas, recolecta objetos y gana experiencia. El sistema está construido mediante clases que representan elementos del entorno del juego:

| Elemento | Función |
|----------|--------|
| `Jugador` | Representa al usuario. Puede atacar, curarse, usar objetos y ganar experiencia. |
| `Personaje` | Clase abstracta que define atributos y acciones comunes de un personaje. |
| `Objeto` | Elementos que se pueden recolectar y usar. |
| `CriaturaEnemiga` | Enemigos que atacan al jugador durante la exploración. |
| `Nivel` | Lugar que contiene objetos y criaturas. |
| `Enum` (`TipoPersonaje`, `TipoCriatura`, `RarezaObjeto`) | Clasifican entidades con propiedades predefinidas. |

---

## 🧠 **Aplicación Real de Principios POO**

Aquí se analizan **solo los principios que realmente se utilizaron en el código:**

### 🧱 **1. Encapsulamiento**
- Los atributos son privados (`private`) y solo se accede mediante métodos `get` y `set`.
- Se evita la modificación directa de valores sensibles como la salud del jugador.

# 🎮 **LEGENDS OF AETHER**
> Juego narrativo por consola basado en principios de Programación Orientada a Objetos (POO)

---

## 👥 **Autores / Integrantes**
- **Nombre 1**
- **Nombre 2**
- **Nombre 3**
> *(Colocar tu nombre o el de tu equipo)*

---

## 📌 **Descripción del Sistema**

**Legends of Aether** es un juego de batalla y exploración por consola donde un jugador se enfrenta a criaturas, recolecta objetos y gana experiencia. El sistema está construido mediante clases que representan elementos del entorno del juego:

| Elemento | Función |
|----------|--------|
| `Jugador` | Representa al usuario. Puede atacar, curarse, usar objetos y ganar experiencia. |
| `Personaje` | Clase abstracta que define atributos y acciones comunes de un personaje. |
| `Objeto` | Elementos que se pueden recolectar y usar. |
| `CriaturaEnemiga` | Enemigos que atacan al jugador durante la exploración. |
| `Nivel` | Lugar que contiene objetos y criaturas. |
| `Enum` (`TipoPersonaje`, `TipoCriatura`, `RarezaObjeto`) | Clasifican entidades con propiedades predefinidas. |

---

## 🧠 **Aplicación Real de Principios POO**

Aquí se analizan **solo los principios que realmente se utilizaron en el código:**

### 🧱 **1. Encapsulamiento**
- Los atributos son privados (`private`) y solo se accede mediante métodos `get` y `set`.
- Se evita la modificación directa de valores sensibles como la salud del jugador.
- Ejemplo real: en `Personaje`, la salud **solo puede cambiarse mediante `setSalud()`**, que valida que no sea menor que 0 o mayor que el máximo.

### 🌐 **2. Abstracción**

- La clase Personaje es abstracta, por lo tanto no se puede instanciar directamente.
-  Define lo que un personaje debe tener y hacer, pero no cómo lo hace.
- El comportamiento concreto es definido después mediante una clase anónima dentro de Jugador, sobrescribiendo atacar(), usarHabilidadEspecial() y mostrarInfo()

## 🏁 **Conclusión**

El proyecto demuestra cómo mediante encapsulamiento y abstracción bien aplicados, se puede diseñar un sistema organizado, seguro y fácil de expandir. No se usaron más principios de POO, y aun así el sistema es funcional y claro.

