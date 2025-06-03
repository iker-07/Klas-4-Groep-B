package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.MeerkeuzeVraagStrategie;
import Objects.Kamerinfo;
import Objects.Zwaard;

public class Sprintreview extends Kamer {

    private Kamerinfo infoBoek;
    private Zwaard zwaard;

    public Sprintreview(HintProviderFactory hintProviderFactory) {
        super(
                "Sprint Review kamer",
                "Sprint Review",
                "Scrum Event",
                "Koppel termen aan juiste uitleg",
                null, // wordt later ingesteld
                new HintService(hintProviderFactory, 4)
        );

        this.zwaard = new Zwaard();
        this.infoBoek = new Kamerinfo("Tijdens de Sprint Review wordt het sprintresultaat aan belanghebbenden gedemonstreerd.");

        this.vraagStrategie = new MeerkeuzeVraagStrategie(
                "Wat gebeurt er tijdens de Sprint Review?",
                new String[]{
                        "Het sprintresultaat wordt gedemonstreerd",
                        "De sprint wordt geëvalueerd",
                        "Het team plant de volgende sprint",
                        "Er wordt gewerkt aan het sprintdoel"
                },
                "Het sprintresultaat wordt gedemonstreerd",
                hintProviderFactory,
                4,
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
        return 4;
    }
}
