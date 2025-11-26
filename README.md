# 🎮 **LEGENDS OF AETHER**

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
| `Main` | Es la clase principal, el cerebro. |
| `Objeto` | Elementos que se pueden recolectar y usar. |
| `CriaturaEnemiga` | Enemigos que atacan al jugador durante la exploración. |
| `Nivel` | Lugar que contiene objetos y criaturas. |
| `Enum` (`TipoPersonaje`, `TipoCriatura`, `RarezaObjeto`) | Clasifican entidades con propiedades predefinidas. |

---

## 🧠 **Aplicación Real de Principios POO**

Aquí se analizan **solo los principios que realmente se utilizaron en el código:**

### 🔐 **1. Encapsulamiento**
- Todos los atributos de las entidades fueron declarados como `private`.
- Su lectura o modificación solo se realiza mediante:
  - Métodos getters y setters
  - Métodos públicos que representan acciones del objeto (como `recibirDanio`, `curar`, `usarObjeto`, etc.)


Esto impide que la lógica interna del sistema sea alterada directamente, y garantiza el control de valores delicados como la salud del jugador.

---

### 🌐 **2. Abstracción**

- Define lo que un personaje debe tener y hacer, pero no cómo lo hace.
- Se implementó mediante la clase **abstracta `Personaje`**, que define atributos y acciones que todo personaje debe poseer (por ejemplo, salud, ataque y habilidad especial).
- Las acciones específicas se detallan a través de una **instancia anónima dentro de la clase `Jugador`**, la cual reescribe acciones como `atacar()` o `mostrarInfo()`.

  
Con esto, el código oculta la complejidad y solo expone los comportamientos necesarios para interactuar con el personaje.

---

### 🏷️ **Enumeraciones Especializadas (Enums)**

El programa incorpora tres enumeraciones para clasificar elementos del juego, cada una con propiedades y métodos propios:

- `TipoPersonaje`  
Define el rol narrativo de un personaje (Sanador, Guerrero, Mago, etc.), junto con su descripción.

- `TipoCriatura`  
Representa la amenaza y el comportamiento de enemigos.

- `RarezaObjeto`  
Clasifica los objetos según su valor y probabilidad de aparición (Común, Raro, Épico y Legendario).

Cada enum contiene:  
✔ Campos internos  
✔ Constructor privado  
✔ Métodos para retornar descripciones completas

---


## ⚔️ **Interacción Entre Componentes**

El sistema simula acciones comunes dentro de un juego de aventuras:

- El jugador **recolecta objetos** y puede **utilizarlos**.
- Las criaturas **atacan al personaje** y pueden ser derrotadas.
- El nivel actúa como contenedor, **agrupando objetos y enemigos** en un mismo entorno.


## 🏁 **Conclusión**

El proyecto demuestra cómo mediante encapsulamiento y abstracción bien aplicados, se puede diseñar un sistema organizado, seguro y fácil de expandir. No se usaron más principios de POO, y aun así el sistema es funcional y claro.

