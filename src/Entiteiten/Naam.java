package Entiteiten;

import java.util.Scanner;

import static Entiteiten.Speler.spelerNaam;

public class Naam {

    public boolean naamding() {
        Scanner scanner = new Scanner(System.in);
        SpelController spelController = new SpelController(scanner);
        System.out.println("Wat is uw naam?");

        spelerNaam = scanner.nextLine();
        while (spelerNaam.trim().isEmpty()) {
            System.out.println("Naam mag niet leeg zijn. Probeer opnieuw.");
            spelerNaam = scanner.nextLine();

            if (!spelerNaam.trim().isEmpty()) {
                System.out.println("Hallo " + spelerNaam + ". Veel succes!");
                return true;
            }
            scanner.close();
        }
        return false;
    }
}

