import java.util.Map;
public class Sprintplanning extends Kamer {
    public Sprintplanning() {
        super(
                "Sprint Planning kamer",
                "Sprint Planning",
                "Scrum Event",
                "Koppel termen aan juiste uitleg",
                new PuzzelVraagStrategie(Map.of(
                        "Het moment waarop werk voor de sprint wordt geselecteerd", "Sprint Planning",
                        "Het doel voor de aankomende sprint", "Sprint Doel"
                ))
        );
    }

    @Override
    protected void toonNaam() { System.out.println("Kamernaam: " + Naam); }

    @Override
    protected void toonBeschrijving() { System.out.println("Beschrijving: " + Beschrijving); }

    @Override
    protected void voerOpdrachtUit() { System.out.println("Opdracht uitvoeren: " + Opdracht); }

    @Override
    protected int getKamerNummer() { return 2; }
}
