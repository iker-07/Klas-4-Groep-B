public class SprintRetrospective extends Kamer {
    public SprintRetrospective() {
        super(
                "Sprint Retrospective kamer",
                "Sprint Retrospective",
                "Scrum Event",
                "Evalueer het proces van de sprint",
                new OpenVraagStrategie(
                        "Wat is het doel van de Sprint Retrospective?",
                        "het proces verbeteren"
                )
        );
    }

    @Override
    protected void toonNaam() { System.out.println("Kamernaam: " + Naam); }

    @Override
    protected void toonBeschrijving() { System.out.println("Beschrijving: " + Beschrijving); }

    @Override
    protected void voerOpdrachtUit() { System.out.println("Opdracht uitvoeren: " + Opdracht); }

    @Override
    protected int getKamerNummer() { return 5; }
}
