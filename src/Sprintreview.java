import java.util.Map;

public class Sprintreview extends Kamer {
    public Sprintreview(HintProviderFactory hintProviderFactory) {
        super("Sprint Review kamer", "Sprint Review", "Scrum Event", "Koppel termen aan juiste uitleg",
                new PuzzelVraagStrategie(
                        Map.of("Feedback verzamelen op het sprintresultaat", "Sprint Review", "Demonstratie van opgeleverde functionaliteit", "Demo"
                        ), hintProviderFactory
                ),
                new HintService(hintProviderFactory, 4)
        );
    }

    @Override
    protected void toonNaam() { System.out.println("Kamernaam: " + Naam); }

    @Override
    protected void toonBeschrijving() { System.out.println("Beschrijving: " + Beschrijving); }

    @Override
    protected void voerOpdrachtUit() { System.out.println("Opdracht uitvoeren: " + Opdracht); }

    @Override
    protected int getKamerNummer() { return 4; }
}
