package kamers;

import Hint.HintService;
import Strategy.VraagStrategie;

import java.util.Scanner;

public abstract class Kamer {
    protected String naam;
    protected String beschrijving;
    protected String type;
    protected String opdracht;

    protected VraagStrategie vraagStrategie;
    protected HintService hintService;

    protected boolean monsterAanwezig = false;
    protected boolean monsterVerslagen = false;

    public Kamer(String naam, String beschrijving, String type, String opdracht,
                 VraagStrategie vraagStrategie, HintService hintService) {
        this.naam = naam;
        this.beschrijving = beschrijving;
        this.type = type;
        this.opdracht = opdracht;
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

            if (monsterAanwezig && !monsterVerslagen) {
                System.out.println("Een monster verspert je pad!");
                while (true) {
                    System.out.print("Wil je het zwaard gebruiken om het monster te verslaan? (ja/nee): ");
                    String antwoord = scanner.nextLine().trim().toLowerCase();

                    if ("ja".equals(antwoord)) {
                        System.out.println("Je zwaait met het zwaard en valt het monster aan!");
                        monsterVerslagen = true;
                        System.out.println("Monster verslagen! Je mag doorgaan.");
                        break;
                    } else if ("nee".equals(antwoord)) {
                        System.out.println("Je blijft geblokkeerd. Het monster staat nog steeds in de weg.");
                        return false;
                    } else {
                        System.out.println("Typ 'ja' of 'nee'.");
                    }
                }
            }

            System.out.print("Wil je een hint? (ja/nee): ");
            String keuze = scanner.nextLine().trim().toLowerCase();
            if ("ja".equals(keuze)) {
                System.out.println("Hint: " + hintService.getHint());
            }

            correct = vraagStrategie.stelVraag(scanner, getKamerNummer());
        }

        System.out.println("Je mag doorgaan naar de volgende kamer.");
        return true;
    }

    protected abstract void toonNaam();
    protected abstract void toonBeschrijving();
    protected abstract void voerOpdrachtUit();
    public abstract int getKamerNummer();

    /**
     * KeyJoker ondersteuning: standaard doet een kamer niets,
     * maar specifieke kamers kunnen dit overschrijven.
     */
    public void gebruikKeyJoker() {
        // Default geen effect, voorkomt fouten en if-checks in de KeyJoker zelf
    }

    /**
     * Optioneel extra sleutel aan de speler geven.
     */
    public void geefExtraSleutel() {
        System.out.println("Je hebt een extra sleutel ontvangen!");
    }

    public boolean isMonsterVerslagen() {
        return monsterVerslagen;
    }

    public boolean isMonsterAanwezig() {
        return monsterAanwezig;
    }

    public String getNaam() {
        return naam;
    }
}
