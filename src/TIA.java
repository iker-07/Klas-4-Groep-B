import java.util.Map;
public class TIA extends Kamer {
    public TIA() {
        super(
                "Team Improvement Area kamer",
                "TIA",
                "Scrum Improvement",
                "Koppel scrum-termen aan hun betekenis",
                new PuzzelVraagStrategie(Map.of(
                        "De persoon die verantwoordelijk is voor het maximaliseren van de waarde van het product", "Product Owner",
                        "Het ontwikkelteam dat verantwoordelijk is voor het opleveren van werkende software", "Development Team",
                        "De facilitator van het Scrum-proces", "Scrum Master"
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
    protected int getKamerNummer() { return 6; }
}
