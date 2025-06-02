package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.OpenVraagStrategie;

public class SprintRetrospective extends Kamer {
    public SprintRetrospective(HintProviderFactory hintProviderFactory) {
        super(
                "Sprint Retrospective kamer",
                "Sprint Retrospective",
                "Scrum Event",
                "Koppel termen aan juiste uitleg",
                new OpenVraagStrategie(
                        "Wat is het doel van een Sprint Retrospective?",
                        "Het team bespreekt wat goed en beter kan",
                        hintProviderFactory,
                        3 // 👈 toegevoegd: kamerNummer
                ),
                new HintService(hintProviderFactory, 3)
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
        return 3;
    }
}