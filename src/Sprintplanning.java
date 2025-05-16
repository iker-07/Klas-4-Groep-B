import java.util.Map;

public class Sprintplanning extends Kamer {
    private PuzzelEventManager eventManager;

    public Sprintplanning() {
        super(
                "Sprint Planning kamer",
                "Sprint Planning",
                "Scrum Event",
                "Koppel termen aan juiste uitleg\n",
                new PuzzelVraagStrategie(Map.of(
                        "Het moment waarop werk voor de sprint wordt geselecteerd", "Sprint Planning",
                        "Het doel voor de aankomende sprint", "Sprint Doel"
                ))
        );

        // Maak event manager aan en voeg observers toe
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
        // Bijvoorbeeld: zodra een antwoord juist/fout is, roep eventManager aan
        // eventManager.notifyCorrectAntwoord();
        // of eventManager.notifyFoutAntwoord();
    }

    @Override
    protected int getKamerNummer() { return 2; }
}
