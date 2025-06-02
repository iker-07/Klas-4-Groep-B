
import Entiteiten.SpelController;
import ISP.KamerInfo;
import ISP.Zwaard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Goedendag! Welkom bij het Scrum Escape Game!");
        System.out.println("Veel succes en plezier!\n");

                // Gebruik Kamerinfo
                KamerInfo info = new KamerInfo("In deze kamer leer je over de Sprint Retrospective.");
                info.showMessage();

                // Gebruik Zwaard
                Zwaard zwaard = new Zwaard("Oud Scrumzwaard");
                zwaard.attack();

                // Opmerkelijk: geen foutmeldingen, alleen relevante methodes




        Scanner scanner = new Scanner(System.in);
        SpelController spelController = new SpelController(scanner);
        spelController.start();

        scanner.close();
    }
}
