package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.OpenVraagStrategie;

public class DailyScrum extends Kamer {
    public DailyScrum(HintProviderFactory hintProviderFactory) {
        super(
                "Daily Scrum kamer",
                "Daily Scrum",
                "Scrum Event",
                "Koppel termen aan juiste uitleg",
                new OpenVraagStrategie(
                        "Wat gebeurt er tijdens een Daily Scrum?",
                        "Het team stemt dagelijks werk af",
                        hintProviderFactory,
                        1 // kamerNummer meegeven
                ),
                new HintService(hintProviderFactory, 1)
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
        return 1;
    }
}
