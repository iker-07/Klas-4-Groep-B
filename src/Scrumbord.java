
public class Scrumbord extends Kamer {
    public Scrumbord() {
        super(
                "Scrumbord kamer",
                "Scrumbord",
                "Scrum Event",
                "Vul het bord correct in",
                new MeerkeuzeVraagStrategie(
                        "Wat is het hoofddoel van een scrumbord?",
                        new String[]{
                                "a) Om de vergaderplanning van de Scrum Master te tonen",
                                "b) Om de voortgang van het team visueel inzichtelijk te maken",
                                "c) Om te bepalen wie welke vakantie krijgt",
                                "d) Om klantfeedback te verzamelen"
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
    protected int getKamerNummer() { return 1; }
}
