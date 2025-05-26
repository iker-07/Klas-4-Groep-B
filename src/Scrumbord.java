import java.util.Map;

public class Scrumbord extends Kamer {
    public Scrumbord(HintProviderFactory hintProviderFactory) {
        super("ScrumBoard kamer", "ScrumBoard", "Scrum Artefact", "Koppel termen aan juiste uitleg",
                new PuzzelVraagStrategie(
                        Map.of("Visualiseert taken en voortgang", "ScrumBoard", "Wordt bijgehouden tijdens sprint", "ScrumBoard"
                        ), hintProviderFactory
                ),
                new HintService(hintProviderFactory, 5)
        );
    }

    @Override
    protected void toonNaam() {
        System.out.println("Kamernaam: " + Naam);
    }

    @Override
    protected void toonBeschrijving() {
        System.out.println("Beschrijving: " + Beschrijving);
    }

    @Override
    protected void voerOpdrachtUit() {
        System.out.println("Opdracht uitvoeren: " + Opdracht);
    }

    @Override
    protected int getKamerNummer() {
        return 5;
    }
}
