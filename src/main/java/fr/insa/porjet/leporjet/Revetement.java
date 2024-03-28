/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.porjet.leporjet;

/**
 *
 * @author Elève
 */

import java.util.Map;
import java.util.Scanner;

public class Revetement {

    private static final String FICHIER_REVETEMENTS = "revetements.txt";

    public static void main(String[] args) {
        Map<String, String> revetements = chargerRevêtements();

        /*   if (revetements.isEmpty()) {
            System.out.println("Aucun revêtement n'est disponible pour le moment.");
            return;*/
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez le type de surface (mur, sol, plafond) : ");
        String typeSurface = scanner.nextLine().toLowerCase();

        System.out.println("Revêtements disponibles pour " + typeSurface + " :");
        for (Map.Entry<String, String> entry : revetements.entrySet()) {
            String nomRevêtement = entry.getKey();
            String applicabilite = entry.getValue();
            if (applicabilite.charAt(getIndex(typeSurface)) == '1') {
                System.out.println("- " + nomRevêtement);
            }
        }

        scanner.close();
    }

    private static int getIndex(String typeSurface) {
        switch (typeSurface) {
            case "mur":
                return 2;
            case "sol":
                return 3;
            case "plafond":
                return 4;
            default:
                return -1;
        }
    }

    private static Map<String, String> chargerRevêtements() {
        Map<String, String> revetements = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FICHIER_REVETEMENTS))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] elements = ligne.split(";");
                if (elements.length >= 6) {
                    String nomRevêtement = elements[1].trim();
                    String applicabilite = elements[2] + elements[3] + elements[4];
                    double prix = Double.parseDouble(elements[5].replace(',', '.').trim());
/*estc-ce que modifier la , en . est utile ?*/
                    revetements.put(nomRevêtement, applicabilite);
                }
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier des revêtements : " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erreur de format des prix dans le fichier des revêtements : " + e.getMessage());
        }
/*nécessaire*/
        return revetements;
    }
}

/*chaque revêtement est associé à une chaîne de caractères représentant son applicabilité aux surfaces, 
où chaque chiffre indique si le revêtement est applicable à une surface donnée (1 pour oui, 0 pour non). 
Quand l'utilisateur choisit une surface, le programme parcourt les revêtements et affiche uniquement ceux 
qui sont applicables à cette surface en fonction de l'index correspondant dans la chaîne de caractères 
d'applicabilité.*/
}
