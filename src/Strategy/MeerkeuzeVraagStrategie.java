package Strategy;

import Entiteiten.Monster;
import Hint.HintProvider;
import Hint.HintProviderFactory;
import Objects.Zwaard;

import java.util.Scanner;

public class MeerkeuzeVraagStrategie implements VraagStrategie {
    private final String vraag;
    private final String[] opties;
    private final String correctAntwoord;
    private final HintProvider hintProvider;
    private final Zwaard zwaard;

    public MeerkeuzeVraagStrategie(String vraag, String[] opties, String correctAntwoord, HintProviderFactory hintProviderFactory, int kamerNummer, Zwaard zwaard) {
        this.vraag = vraag;
        this.opties = opties;
        this.correctAntwoord = correctAntwoord.toLowerCase();
        this.hintProvider = hintProviderFactory.kiesRandomProvider(kamerNummer);
        this.zwaard = zwaard;
    }

    @Override
    public boolean stelVraag(Scanner scanner, int kamerNummer) {
        System.out.println("Vraag: " + vraag);
        for (int i = 0; i < opties.length; i++) {
            System.out.printf("%c) %s%n", 'a' + i, opties[i]);
        }
        System.out.print("Jouw keuze (a/" + (char)('a' + opties.length - 1) + "): ");
        String antwoord = scanner.nextLine().trim().toLowerCase();

        int index = antwoord.charAt(0) - 'a';
        if (index >= 0 && index < opties.length) {
            String gekozenAntwoord = opties[index].toLowerCase();
            if (gekozenAntwoord.equals(correctAntwoord)) {
                System.out.println("Juist!");
                return true;
            } else {
                System.out.println("Fout. Hint: " + hintProvider.getHint());

                System.out.println("Een monster verspert je pad! ️");
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
        } else {
            System.out.println("Ongeldige keuze.");
            return false;
        }
    }
}
