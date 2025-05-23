import java.util.Map;

public class TIA extends Kamer {
    private PuzzelEventManager eventManager;

    public TIA() {
        super(
                "TIA kamer",
                "TIA",
                "Technologie",
                "Koppel termen aan juiste uitleg\n",
                new PuzzelVraagStrategie(Map.of(
                        "Technische informatie analyse", "TIA",
                        "Diagnose en probleemoplossing", "Analyse"
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
    protected int getKamerNummer() { return 7; }
}
