## <1.0> - <07-02-2024>

### Sprint learnings

-Hacer test unitarios de mis clases.
-Mostrar el número de suposiciones e intentos de cada jugador y agregar la lógica dependiendo de quien sea el ganador.
-Aprender un poco más de como se usa While.

### Added

- En el método checkGuess incorporé condicionales para entregar mensajes finales, historial de suposición e intentos de cada uno de los jugadores.
- En el main de GuessTheNumberGame agregué la lógica para el ganador usando un booleano.
- Agregué los test unitarios de los métodos de la clase HumanPlayer.
- Agregué una Demo del juego en el Readme

### Changed

- Cambié un poco el bucle While que tenía y algunas condicionales para generar respuestas distintas dependiendo del ganador.

### Fixed

El juego al finalizar me mostraba el mismo historial para ambos jugadores y me pedía ingresar nuevamente una suposición cuando ya había un ganador y debería terminar.

### Removed

No eliminé funcionalidades, solo las modifiqué.