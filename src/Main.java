import Entiteiten.SpelController;
import java.util.Scanner;

import static Entiteiten.Speler.spelerNaam;

public class Main {
    public static void main(String[] args) {
        System.out.println("Goedendag! Welkom bij het Scrum Escape Game!");
        System.out.println("Veel succes en plezier!\n");

        Scanner scanner = new Scanner(System.in);
        SpelController spelController = new SpelController(scanner);
        System.out.println("Wat is uw naam?");

        spelerNaam = scanner.nextLine() ;
        while(spelerNaam.trim().isEmpty()) {
            System.out.println("Naam mag niet leeg zijn. Probeer opnieuw.");
            spelerNaam = scanner.nextLine();
        }
        if(!spelerNaam.trim().isEmpty()){
            System.out.println("Hallo " + spelerNaam + ". Veel succes!");
            spelController.start();
        }

        scanner.close();
    }
}