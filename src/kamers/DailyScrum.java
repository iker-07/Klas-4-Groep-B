package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.OpenVraagStrategie;
import Objects.Kamerinfo;
import Objects.Zwaard;
import Jokers.KeyJokerSupport;
import java.util.Scanner;

public class DailyScrum extends Kamer implements KeyJokerSupport {
    Scanner scanner = new Scanner(System.in);
    private final Kamerinfo infoBoek;
    private final Zwaard zwaard;

    public DailyScrum(HintProviderFactory hintProviderFactory) {
        super(
                "Daily Scrum kamer",
                "Daily Scrum",
                "Scrum Event",
                "Beantwoord de vraag over de Daily Scrum",
                null,
                new HintService(hintProviderFactory, 1)
        );

        this.zwaard = new Zwaard();
        this.infoBoek = new Kamerinfo("De Daily Scrum is een dagelijkse bijeenkomst van het ontwikkelteam om de voortgang te bespreken.");

        this.vraagStrategie = new OpenVraagStrategie(
                "Wie leidt de Daily Scrum?",
                "De developers zelf",
                hintProviderFactory,
                1,
                zwaard
        );

        this.monsterAanwezig = true;


    }


    @Override
    protected void toonNaam() {
        System.out.println("Kamernaam: " + naam);
    }

    @Override
    protected void toonBeschrijving() {
        System.out.println("Beschrijving: " + beschrijving);
    }

    @Override
    protected void voerOpdrachtUit() {
        System.out.println("Opdracht uitvoeren: " + opdracht);
        infoBoek.showMessage();
    }

    @Override
    public int getKamerNummer() {
        return 1;
    }

    @Override
    public void geefExtraSleutel() {
        System.out.println("Je hebt een extra sleutel gekregen in de Daily Scrum kamer!");
    }

    @Override
    public void gebruikKeyJoker() {
        if (!monsterVerslagen) {
            System.out.println("Key Joker gebruikt! Het monster verdwijnt.");
            monsterVerslagen = true;
            geefExtraSleutel();
        } else {
            System.out.println("Het monster is al verslagen.");
        }
    }

}


