# Jeu d'Échecs en JavaScript ♟️

Ce projet est une implémentation d'un jeu d'échecs simple en Java. Il permet de déplacer les pièces selon les règles classiques des échecs.

## Fonctionnalités

- Plateau d'échecs 8x8
- Déplacement des pièces selon les règles :
  - Reine (déplacements horizontaux, verticaux et diagonaux)
- Vérification de la validité des positions

## Exemple de logique pour la Reine

return (
    newPosition.row > 0 && newPosition.column > 0 &&
    newPosition.row <= 8 && newPosition.column <= 8 &&
    (
        newPosition.column == this.column ||
        newPosition.row == this.row ||
        Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)
    )
);
