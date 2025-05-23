import java.util.Map;

public class DailyScrum extends Kamer {
    private PuzzelEventManager eventManager = new PuzzelEventManager();

    public DailyScrum() {
        super("Daily Scrum kamer", "Daily Scrum", "Scrum Event", "Koppel termen aan juiste uitleg\n", new PuzzelVraagStrategie(Map.of("Dagelijkse korte meeting van het team", "Daily Scrum", "Wat is voltooid sinds gisteren?", "Wat heb je gedaan?")));
        this.eventManager.addObserver(new Deur());
        this.eventManager.addObserver(new MonsterObserver());
        this.eventManager.addObserver(new StatusDisplay());
    }

    protected void toonNaam() {
        System.out.println("Kamernaam: " + this.Naam);
    }

    protected void toonBeschrijving() {
        System.out.println("Beschrijving: " + this.Beschrijving);
    }

    protected void voerOpdrachtUit() {
        System.out.println("Opdracht uitvoeren: " + this.Opdracht);
    }

    protected int getKamerNummer() {
        return 3;
    }
}
