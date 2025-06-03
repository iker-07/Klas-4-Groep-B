package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.OpenVraagStrategie;
import Objects.Kamerinfo;
import Objects.Zwaard;

public class DailyScrum extends Kamer {

    private Kamerinfo infoBoek;
    private Zwaard zwaard;

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
        infoBoek.showMessage();
    }

    @Override
    protected int getKamerNummer() {
        return 1;
    }
}
