package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.PuzzelVraagStrategie;
import Objects.Kamerinfo;
import Objects.Zwaard;

import java.util.Map;

public class Scrumboard extends Kamer {

    private Zwaard zwaard;

    public Scrumboard(HintProviderFactory hintProviderFactory) {
        super(
                "ScrumBoard kamer",
                "ScrumBoard",
                "Scrum Artefact",
                "Koppel termen aan juiste uitleg",
                null, // vraagStrategie later toevoegen
                new HintService(hintProviderFactory, 5)
        );

        this.zwaard = new Zwaard();
        super.infoBoek = new Kamerinfo("Het ScrumBoard helpt teams visueel bij het volgen van de voortgang en taken tijdens een sprint.");

        this.vraagStrategie = new PuzzelVraagStrategie(
                Map.of(
                        "Visualiseert taken en voortgang", "ScrumBoard",
                        "Wordt bijgehouden tijdens sprint", "ScrumBoard"
                ),
                hintProviderFactory,
                5,
                zwaard
        );
    }


    @Override
    public int getKamerNummer() {
        return 5;
    }
}
