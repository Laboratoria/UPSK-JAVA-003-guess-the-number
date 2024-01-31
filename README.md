# Adivina el Número - Guess the Number

## Índice

- [1. Preámbulo](#1-preámbulo)
- [2. Conceptos de Programación Orientada a Objetos (POO) Utilizados](#2-conceptos-de-programación-orientada-a-objetos-poo-utilizados)
- [3. Instrucciones de Ejecución](#3-instrucciones-de-ejecución)
- [4. Diagrama de Clases](#4-diagrama-de-clases)

---

## 1. Preámbulo

Este es un simple juego de adivinanzas de números implementado en Java. El juego involucra a jugadores humanos y a la computadora, todos compitiendo para adivinar un número aleatorio.

![GUESS THE NUMBER](https://firebasestorage.googleapis.com/v0/b/laboratoria-945ea.appspot.com/o/guess-the-number.png?alt=media)

## 2. Conceptos de Programación Orientada a Objetos (POO) Utilizados

### 1. Clases y Objetos

En el código, se utilizan clases para representar diferentes entidades en el juego. Por ejemplo, hay clases para jugadores humanos (`HumanPlayer`), jugadores de la computadora (`ComputerPlayer`), y una clase principal para el juego (`GuessTheNumberGame`).

### 2. Herencia

El concepto de herencia se emplea al tener una clase base llamada `Player` de la cual derivan otras clases como `HumanPlayer` y `ComputerPlayer`. Esto permite compartir comportamientos y propiedades comunes entre diferentes tipos de jugadores.

### 3. Abstracción

El uso de clases abstractas e interfaces ayuda a abstraer detalles internos y proporcionar una representación simplificada de conceptos en el juego. Por ejemplo, la interfaz `GuessingGame` abstrae la lógica del juego de adivinanzas, permitiendo que las clases concretas la implementen de manera específica.

### 4. Encapsulamiento

Se utiliza el encapsulamiento al declarar atributos como `private` y proporcionar métodos públicos (`getGuesses()`, `makeGuess()`) para acceder y manipular esos atributos de manera controlada.

### 5. Polimorfismo

El polimorfismo se manifiesta al tratar diferentes tipos de jugadores de manera uniforme a través de la interfaz `GuessingGame`. Esto permite a la clase principal (`GuessTheNumberGame`) interactuar con jugadores de manera genérica, independientemente de su tipo específico.

![GUESS THE NUMBER DEMO](https://firebasestorage.googleapis.com/v0/b/laboratoria-945ea.appspot.com/o/guess-the-number-demo.gif?alt=media)

## 3. Instrucciones de Ejecución

Para ejecutar el juego, sigue estos pasos:

### Requisitos de compilación e instalación:

Antes de comenzar, asegúrate de tener instalados los componentes.

1. Clona el repositorio con:  git clone https://github.com/Yennyferjp/UPSK-JAVA-003-guess-the-number.git
2. Abre la terminal y navega al directorio del juego.
3. Compila el código ejecutando el comando `javac GuessTheNumberGame.java`.
4. Ejecuta el juego con `java GuessTheNumberGame`.

¡Disfruta del juego de adivinanzas de números! 🎮🎲

### 4. Diagrama de Clases

![Diagrama de Clases](https://firebasestorage.googleapis.com/v0/b/laboratoria-945ea.appspot.com/o/class-diagram.png?alt=media)

#### `GuessTheNumberGame`

**Propósito:**
Maneja la lógica principal, decide qué jugador asume el próximo turno.

**Atributos:**

- `random`: Generador de números aleatorios.
- `targetNumber`: Número aleatorio entre 1 y 100 a adivinar en la partida actual.

**Métodos estáticos (`static`):**

- `main(String[] args)`: Inicia el juego y genera el número aleatorio.
- `checkGuess(Player player)`: Ejecuta un turno, obtiene la suposición
  y evalúa el nuevo estado de la partida.

#### `Player`

**Propósito:**
Representa a una jugadora genérica. Es una clase abstracta.
Define los atributos y métodos que todas las _clases_ de jugadoras deben compartir:

**Atributos:**

- `name`: El nombre de la jugadora.
- `guesses`: El historial de suposiciones de la jugadora.

**Métodos:**

- `makeGuess()`: Devuelve la suposición de la jugadora. Es un método abstracto.
- `getName()`: Devuelve el nombre de la jugadora.
- `getGuesses()`: Devuelve el historial de suposiciones de la jugadora.

#### `HumanPlayer` y `ComputerPlayer` (heredan de `Player`)

**Propósito:**
Representa a las jugadoras _Humana_ y _Computadora_, respectivamente.

**Métodos:**

- `makeGuess()`: Método que cada clase que hereda de `Player` debe implementar.

**Relaciones:**

- La clase `GuessTheNumberGame` interactúa con las clases `HumanPlayer`
  y `ComputerPlayer` para gestionar el juego.
- Tanto la clase `HumanPlayer` como `Computer Player` son subclases de `Player`,
  lo que implica que heredan todas sus propiedades y métodos,
  pero también tienen algunas características adicionales propias.

Este diseño de clases permite separar las responsabilidades,
facilitando el mantenimiento y posibles extensiones del juego en el futuro.

Por ejemplo, podríamos añadir diferentes jugadoras "máquina" con diferentes
estrategias para la suposición automática, un nuevo tipo de
jugadora "remota" o incluso diferentes niveles de dificultad.


