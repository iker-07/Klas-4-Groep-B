import Entiteiten.Speler;
import Entiteiten.SpelController;
import java.util.Scanner;

import static Entiteiten.Speler.spelerNaam;

public class Main {
    public static void main(String[] args) {
        System.out.println("Goedendag! Welkom bij het Scrum Escape Game!");
        System.out.println("Veel succes en plezier!\n");


        Scanner scanner = new Scanner(System.in);
        SpelController spelController = new SpelController(scanner); System.out.println("wat is uw Naam");
        spelerNaam = scanner.nextLine() ;
        System.out.println("Hallo "+ spelerNaam + ". Veel succes!");
        spelController.start();

        scanner.close();
    }
}
