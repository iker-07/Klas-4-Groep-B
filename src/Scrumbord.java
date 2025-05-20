import java.util.Map;

public class Scrumbord extends Kamer {
    private PuzzelEventManager eventManager;

    public Scrumbord() {
        super(
                "Scrum Bord kamer",
                "Scrum Bord",
                "Scrum Tool",
                "Koppel termen aan juiste uitleg\n",
                new PuzzelVraagStrategie(Map.of(
                        "Visuele weergave van taken ", "Scrum Bord",
                        "Taken in kolommen: To Do, In Progress, Done", "Workflow"
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
    protected int getKamerNummer() { return 6; }
}
