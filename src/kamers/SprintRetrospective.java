package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.OpenVraagStrategie;
import Objects.Kamerinfo;
import Objects.Zwaard;

public class SprintRetrospective extends Kamer {

    private Kamerinfo infoBoek;
    private Zwaard zwaard;

    public SprintRetrospective(HintProviderFactory hintProviderFactory) {
        super(
                "Sprint Retrospective kamer",
                "Sprint Retrospective",
                "Scrum Event",
                "Koppel termen aan juiste uitleg",
                null,
                new HintService(hintProviderFactory, 3)
        );


        this.zwaard = new Zwaard();
        this.infoBoek = new Kamerinfo("Tijdens een Sprint Retrospective bespreekt het team wat goed ging en wat beter kan.");


        this.vraagStrategie = new OpenVraagStrategie(
                "Wat is het doel van een Sprint Retrospective?",
                "Het team bespreekt wat goed en beter kan",
                hintProviderFactory,
                3,
                zwaard
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
        infoBoek.showMessage();

    }

    @Override
    protected int getKamerNummer() {
        return 3;
    }
}
