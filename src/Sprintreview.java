public class Sprintreview extends Kamer {
    public Sprintreview() {
        super(
                "Sprint Review kamer",
                "Sprint Review",
                "Scrum Event",
                "Bespreek het resultaat van de sprint",
                new MeerkeuzeVraagStrategie(
                        "Wat gebeurt er tijdens een Sprint Review?",
                        new String[]{
                                "a) Het team viert het afronden van de sprint met een feest",
                                "b) Stakeholders worden geïnformeerd over het resultaat van de sprint",
                                "c) De backlog wordt vernietigd",
                                "d) De Scrum Master evalueert individuele prestaties"
                        },
                        "b"
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
    protected int getKamerNummer() { return 4; }
}
