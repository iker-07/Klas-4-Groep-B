package Strategy;

import Entiteiten.Monster;
import Hint.HintProvider;
import Hint.HintProviderFactory;
import Objects.Zwaard;
import java.util.Map;
import java.util.Scanner;

public class PuzzelVraagStrategie implements VraagStrategie {
    private final Map<String, String> vragenEnAntwoorden;
    private final HintProvider hintProvider;
    private final Zwaard zwaard;

    public PuzzelVraagStrategie(Map<String, String> vragenEnAntwoorden, HintProviderFactory hintProviderFactory, int kamerNummer, Zwaard zwaard) {
        this.vragenEnAntwoorden = vragenEnAntwoorden;
        this.hintProvider = hintProviderFactory.kiesRandomProvider(kamerNummer);
        this.zwaard = zwaard;
    }

    @Override
    public boolean stelVraag(Scanner scanner, int kamerNummer) {
        for (Map.Entry<String, String> entry : vragenEnAntwoorden.entrySet()) {
            System.out.println("Wat hoort bij: " + entry.getKey());
            String antwoord = scanner.nextLine().trim();
            if (!antwoord.equalsIgnoreCase(entry.getValue())) {

                return BlokTekst.behandelFoutMetMonster(scanner, kamerNummer, zwaard, hintProvider);

            }
        }
        System.out.println("Alle antwoorden correct!");
        return true;
    }
}
