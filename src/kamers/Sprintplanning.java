package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.MeerkeuzeVraagStrategie;
import Objects.Kamerinfo;
import Objects.Zwaard;

public class Sprintplanning extends Kamer {

    private Zwaard zwaard;

    public Sprintplanning(HintProviderFactory hintProviderFactory) {
        super(
                "Sprint Planning kamer",
                "Sprint Planning",
                "Scrum Event",
                "Koppel termen aan juiste uitleg",
                null, // vraagStrategie wordt hieronder pas gezet
                new HintService(hintProviderFactory, 2)
        );

        this.zwaard = new Zwaard();
        super.infoBoek = new Kamerinfo("Tijdens Sprint Planning bepaalt het team de doelen voor de komende sprint.");

        this.vraagStrategie = new MeerkeuzeVraagStrategie(
                "Wat gebeurt er tijdens Sprint Planning?",
                new String[]{
                        "Sprint doelen bepalen",
                        "Review van vorige sprint",
                        "Dagelijkse stand-up",
                        "Sprint Retrospective"
                },
                "Sprint doelen bepalen",
                hintProviderFactory,
                2,
                zwaard // doorgeven om monster te verslaan
        );
    }


    @Override
    public int getKamerNummer() {
        return 2;
    }
}
