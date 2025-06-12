package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.OpenVraagStrategie;
import Objects.Kamerinfo;
import Objects.Zwaard;
import Jokers.KeyJokerSupport;

public class Sprintreview extends Kamer implements KeyJokerSupport {

    private final Kamerinfo infoBoek;
    private final Zwaard zwaard;

    public Sprintreview(HintProviderFactory hintProviderFactory) {
        super(
                "Sprint Review kamer",
                "Sprint Review",
                "Scrum Event",
                "Beantwoord de vraag over de Sprint Review",
                null,
                new HintService(hintProviderFactory, 4)
        );

        this.zwaard = new Zwaard();
        this.infoBoek = new Kamerinfo("De Sprint Review is een bijeenkomst om het resultaat van de sprint te inspecteren en feedback te krijgen.");

        this.vraagStrategie = new OpenVraagStrategie(
                "Wat is het doel van de Sprint Review?",
                "Feedback verzamelen en het product aanpassen",
                hintProviderFactory,
                4,
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
        return 4;
    }

    @Override
    public void geefExtraSleutel() {
        System.out.println("Je hebt een extra sleutel gekregen in de Sprint Review kamer!");
    }

    @Override
    public void gebruikKeyJoker() {
        if (!monsterVerslagen) {
            System.out.println("Key Joker gebruikt!");
            monsterVerslagen = true;
            geefExtraSleutel();
        } else {
            System.out.println("Het monster is al verslagen.");
        }
    }
}
