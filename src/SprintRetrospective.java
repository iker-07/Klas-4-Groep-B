import java.util.Map;

public class SprintRetrospective extends Kamer {
    public SprintRetrospective(HintProviderFactory hintProviderFactory) {
        super("Sprint Retrospective kamer", "Sprint Retrospective", "Scrum Event", "Koppel termen aan juiste uitleg",
                new PuzzelVraagStrategie(
                        Map.of("Verbeterpunten bespreken", "Sprint Retrospective", "Team feedback verzamelen", "Sprint Retrospective"
                        ), hintProviderFactory
                ),
                new HintService(hintProviderFactory, 3)
        );
    }

    @Override
    protected void toonNaam() { System.out.println("Kamernaam: " + Naam); }

    @Override
    protected void toonBeschrijving() { System.out.println("Beschrijving: " + Beschrijving); }

    @Override
    protected void voerOpdrachtUit() { System.out.println("Opdracht uitvoeren: " + Opdracht); }

    @Override
    protected int getKamerNummer() { return 3; }
}
