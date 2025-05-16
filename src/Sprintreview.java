import java.util.Map;

public class Sprintreview extends Kamer {
    private PuzzelEventManager eventManager;

    public Sprintreview() {
        super(
                "Sprint Review kamer",
                "Sprint Review",
                "Scrum Event",
                "Koppel termen aan juiste uitleg\n",
                new PuzzelVraagStrategie(Map.of(
                        "Feedback verzamelen op het sprintresultaat", "Sprint Review",
                        "Demonstratie van opgeleverde functionaliteit", "Demo"
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
    protected int getKamerNummer() { return 4; }
}
