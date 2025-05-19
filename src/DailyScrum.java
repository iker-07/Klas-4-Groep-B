import java.util.Map;

public class DailyScrum extends Kamer {
    private PuzzelEventManager eventManager;

    public DailyScrum() {
        super(
                "Daily Scrum kamer",
                "Daily Scrum",
                "Scrum Event",
                "Koppel termen aan juiste uitleg\n",
                new PuzzelVraagStrategie(Map.of(
                        "Dagelijkse korte meeting van het team", "Daily Scrum",
                        "Wat is voltooid sinds gisteren?", "Wat heb je gedaan?"
                ))
        );

        eventManager = new PuzzelEventManager();
        eventManager.addObserver(new Deur());
        eventManager.addObserver(new MonsterObserver());
        eventManager.addObserver(new StatusDisplay());
    }

    @Override
    protected void toonNaam() { System.out.println("Kamernaam: " + Naam); }

    @Override
    protected void toonBeschrijving() { System.out.println("Beschrijving: " + Beschrijving); }

    @Override
    protected void voerOpdrachtUit() {
        System.out.println("Opdracht uitvoeren: " + Opdracht);
    }

    @Override
    protected int getKamerNummer() { return 3; }
}
