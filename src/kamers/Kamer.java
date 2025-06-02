package kamers;

import Hint.HintService;
import Strategy.VraagStrategie;

import java.util.Scanner;

public abstract class Kamer {
    protected String Naam;
    protected String Beschrijving;
    protected String Type;
    protected String Opdracht;

    protected VraagStrategie vraagStrategie;
    protected HintService hintService;

    public Kamer(String naam, String beschrijving, String type, String opdracht, VraagStrategie vraagStrategie, HintService hintService) {
        this.Naam = naam;
        this.Beschrijving = beschrijving;
        this.Type = type;
        this.Opdracht = opdracht;
        this.vraagStrategie = vraagStrategie;
        this.hintService = hintService;
    }

    public final boolean kamerMenu(Scanner scanner) {
        toonNaam();
        toonBeschrijving();
        voerOpdrachtUit();

        boolean correct = vraagStrategie.stelVraag(scanner, getKamerNummer());
        while (!correct) {
            System.out.println("Fout antwoord.");
            System.out.print("Wil je een hint? (ja/nee): ");
            String keuze = scanner.nextLine().trim().toLowerCase();
            if (keuze.equals("ja")) {
                System.out.println("Hint: " + hintService.getHint());
            }
            // Vraag opnieuw
            correct = vraagStrategie.stelVraag(scanner, getKamerNummer());
        }

        System.out.println("Je mag doorgaan naar de volgende kamer.");
        return true;
    }

    protected abstract void toonNaam();
    protected abstract void toonBeschrijving();
    protected abstract void voerOpdrachtUit();
    protected abstract int getKamerNummer();
}
