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
                System.out.println("Onjuist. Hint: " + hintProvider.getHint());

                System.out.println("Een monster verspert je pad!!️");
                System.out.println("Wil je het zwaard gebruiken om het monster te verslaan? (ja/nee)");
                String keuze = scanner.nextLine().trim().toLowerCase();

                if (keuze.equals("ja") || keuze.equals("j")) {
                    zwaard.attack();
                    System.out.println("Het monster is verslagen. Je mag doorgaan.");
                    return true;
                } else {
                    Monster monster = new Monster();
                    monster.verschijnt(kamerNummer);
                    System.out.println("Je blijft geblokkeerd. Het monster staat nog steeds in de weg.");
                    return false;
                }
            }
        }
        System.out.println("Alle antwoorden correct!");
        return true;
    }
}
