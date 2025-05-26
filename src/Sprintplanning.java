import java.util.Map;

public class Sprintplanning extends Kamer {
    public Sprintplanning(HintProviderFactory hintProviderFactory) {
        super("Sprint Planning kamer", "Sprint Planning", "Scrum Event", "Koppel termen aan juiste uitleg",
                new PuzzelVraagStrategie(
                        Map.of("Sprint doelen bepalen", "Sprint Planning", "Taken inschatten en plannen", "Sprint Planning"
                        ), hintProviderFactory
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
