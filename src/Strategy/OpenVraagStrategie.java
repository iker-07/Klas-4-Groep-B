package Strategy;

import Entiteiten.Monster;
import Hint.HintProvider;
import Hint.HintProviderFactory;
import Objects.Zwaard;
import java.util.Scanner;

public class OpenVraagStrategie implements VraagStrategie {
    private final String vraag;
    private final String correctAntwoord;

    private final HintProviderFactory hintProviderFactory;
    private final HintProvider hintProvider;
    private final Zwaard zwaard;

    public OpenVraagStrategie(String vraag, String correctAntwoord, HintProviderFactory hintProviderFactory, int kamerNummer, Zwaard zwaard) {
        this.vraag = vraag;
        this.correctAntwoord = correctAntwoord.toLowerCase();
        this.hintProviderFactory = hintProviderFactory;
        this.hintProvider = hintProviderFactory.kiesRandomProvider(kamerNummer);
        this.zwaard = zwaard;
    }

    @Override
    public boolean stelVraag(Scanner scanner, int kamerNummer) {
        System.out.println("Vraag: " + vraag);
        String antwoord = scanner.nextLine().trim().toLowerCase();

        if (antwoord.equals(correctAntwoord)) {
            System.out.println("Juist!");
            return true; // direct goed
        } else {

            return BlokTekst.behandelFoutMetMonster(scanner, kamerNummer, zwaard, hintProvider);

        }
    }

}




