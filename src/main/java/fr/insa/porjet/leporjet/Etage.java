/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet;

/**
 *
 * @author Elève
 */
public class Etage {
    

        // Demander le nombre d'étages
        System.out.print("Combien d'étages y a-t-il ? ");
        int nombreEtages = Lire.i();

        // Demander la hauteur du bâtiment
        System.out.print("Quelle est la hauteur du bâtiment ? ");
        double hauteurBatiment = Lire.d();

        // Vérifier si tous les étages ont la même hauteur
        System.out.print("Est-ce que tous les étages sont de même hauteur (true/false) ? ");
        boolean memeHauteur = Lire.boolean();

        double hauteurEtage = 0;

        // Si les étages ont la même hauteur, demander la hauteur d'un étage
        if (memeHauteur) {
            System.out.print("Quelle est la hauteur de chaque étage ? ");
            hauteurEtage = Lire.d();
        }

        for (int i = 1; i <= nombreEtages; i++) {
            System.out.println("Étage " + i + ":");

            // Si les étages n'ont pas la même hauteur, demander la hauteur de chaque étage
            if (!memeHauteur) {
                System.out.print("Quelle est la hauteur de l'étage " + i + " ?");
                hauteurEtage = Lire.d();
            }

            // Demander le nombre de pièces par étage
            System.out.print("Combien de pièces pour cet étage ? ");
            int nombrePieces = Lire.i();

            for (int j = 1; j <= nombrePieces; j++) {
                System.out.println("Pièce " + j + " de l'étage " + i + ":");

                // Demander la fonction de la pièce
                System.out.print("Quelle est la fonction de cette pièce ? ");
                String fonctionPiece = Lire.S();

                // Demander le nombre de murs de la pièce
                System.out.print("Combien de murs possède cette pièce ? ");
                int nombreMurs = Lire.i();

                for (int k = 1; k <= nombreMurs; k++) {
                    System.out.println("Mur " + k + " de la pièce " + j + " de l'étage " + i + ":");

                    // Demander les coordonnées des coins du mur
                    System.out.print("Coin de début (x,y) : ");
                    String debutMur = Lire.S;
                    System.out.print("Coin de fin (x,y) : ");
                    String finMur = Lire.S();

                    // Demander le revêtement du mur
                    System.out.print("Quel est le revêtement de ce mur ? ");
                    String revetementMur = scanner.next();
                }
            }
        }
    }
}
```

// CHAT GPT !!!//
}
