public class DailyScrum extends Kamer {
    public DailyScrum() {
        super(
                "Daily Scrum kamer",
                "Daily Scrum",
                "Scrum Event",
                "Wat wordt er besproken in een Daily Scrum?",
                new OpenVraagStrategie(
                        "Wat is het doel van de Daily Scrum?",
                        "de voortgang van het team bespreken"
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
    protected int getKamerNummer() { return 3; }
}
