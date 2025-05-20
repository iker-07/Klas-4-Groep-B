import java.util.Map;

public class SprintRetrospective extends Kamer {
    private PuzzelEventManager eventManager;

    public SprintRetrospective() {
        super(
                "Sprint Retrospective kamer",
                "Sprint Retrospective",
                "Scrum Event",
                "Koppel termen aan juiste uitleg\n",
                new PuzzelVraagStrategie(Map.of(
                        "Moment om terug te kijken op het proces", "Sprint Retrospective",
                        "Verbeteringen voor de volgende sprint", "Actiepunten"
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
    protected int getKamerNummer() { return 5; }
}
