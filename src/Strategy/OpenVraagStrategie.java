package Strategy;

import Entiteiten.Monster;
import Hint.HintProvider;
import Hint.HintProviderFactory;

import java.util.Scanner;

public class OpenVraagStrategie implements VraagStrategie {
    private final String vraag;
    private final String correctAntwoord;

    private final HintProviderFactory hintProviderFactory;
    private final HintProvider hintProvider;

    public OpenVraagStrategie(String vraag, String correctAntwoord, HintProviderFactory hintProviderFactory, int kamerNummer) {
        this.vraag = vraag;
        this.correctAntwoord = correctAntwoord.toLowerCase();
        this.hintProviderFactory = hintProviderFactory;
        this.hintProvider = hintProviderFactory.kiesRandomProvider(kamerNummer);
    }

    @Override
    public boolean stelVraag(Scanner scanner, int kamerNummer) {
        System.out.println("Vraag: " + vraag);
        String antwoord = scanner.nextLine().trim().toLowerCase();

        if (antwoord.equals(correctAntwoord)) {
            System.out.println("Juist!");
        } else {
            System.out.println("Onjuist. Hint: " + hintProvider.getHint());
            new Monster().verschijnt(kamerNummer);
        }
        return true;
    }
}
