package Strategy;

import Entiteiten.Monster;
import Hint.HintProviderFactory;

import java.util.Scanner;

public class OpenVraagStrategie implements VraagStrategie {
    private final String vraag;
    private final String correctAntwoord;

    private final HintProviderFactory hintProviderFactory;

    public OpenVraagStrategie(String vraag, String correctAntwoord, HintProviderFactory hintProviderFactory) {
        this.vraag = vraag;
        this.correctAntwoord = correctAntwoord.toLowerCase();
        this.hintProviderFactory = hintProviderFactory;

    }

    @Override
    public boolean stelVraag(Scanner scanner, int kamerNummer) {
        System.out.println("Vraag: " + vraag);
        String antwoord = scanner.nextLine().trim().toLowerCase();

        if (antwoord.equals(correctAntwoord)) {
            System.out.println("Juist!");
            return true;
        } else {
            System.out.println("Onjuist. Een monster verschijnt.");
            new Monster().verschijnt(kamerNummer);
            return true;
        }
    }
}