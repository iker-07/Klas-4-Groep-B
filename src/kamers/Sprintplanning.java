package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.MeerkeuzeVraagStrategie;

public class Sprintplanning extends Kamer {
    public Sprintplanning(HintProviderFactory hintProviderFactory) {
        super(
                "Sprint Planning kamer","Sprint Planning","Scrum Event","Koppel termen aan juiste uitleg",
                new MeerkeuzeVraagStrategie(

                        "Wat gebeurt er tijdens Sprint Planning?",
                        new String[] {
                                "Sprint doelen bepalen",
                                "Review van vorige sprint",
                                "Dagelijkse stand-up",
                                "Sprint Retrospective"
                        },
                        "Sprint doelen bepalen", hintProviderFactory
                ),
                new HintService(hintProviderFactory, 2)
        );
    }

    @Override
    protected void toonNaam() {
        System.out.println("Kamernaam: " + Naam);
    }

    @Override
    protected void toonBeschrijving() {
        System.out.println("Beschrijving: " + Beschrijving);
    }

    @Override
    protected void voerOpdrachtUit() {
        System.out.println("Opdracht uitvoeren: " + Opdracht);
    }

    @Override
    protected int getKamerNummer() {
        return 2;
    }
}
