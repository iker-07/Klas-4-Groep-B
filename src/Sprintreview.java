import java.util.Map;

public class Sprintreview extends Kamer {
    public Sprintreview(HintProviderFactory hintProviderFactory) {
        super(
                "Sprint Review kamer",
                "Sprint Review",
                "Scrum Event",
                "Koppel termen aan juiste uitleg",
                new MeerkeuzeVraagStrategie(
                        "Wat gebeurt er tijdens de Sprint Review?",
                        new String[] {
                                "Het sprintresultaat wordt gedemonstreerd",
                                "De sprint wordt geëvalueerd",
                                "Het team plant de volgende sprint",
                                "Er wordt gewerkt aan het sprintdoel"
                        },
                        "Het sprintresultaat wordt gedemonstreerd"
                ),
                new HintService(hintProviderFactory, 4)
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
        return 4;
    }
}
