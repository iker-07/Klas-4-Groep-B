package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.PuzzelVraagStrategie;
import Objects.Kamerinfo;
import Objects.Zwaard;

import java.util.Map;

public class TIA extends Kamer {

    private final Zwaard zwaard;

    public TIA(HintProviderFactory hintProviderFactory) {
        super("Technische Informatie Analyse kamer", "TIA", "Analyse", "Koppel termen aan juiste uitleg",
                null,  // wordt later ingesteld
                new HintService(hintProviderFactory, 6)
        );

        this.zwaard = new Zwaard();
        super.infoBoek = new Kamerinfo("Bij Technische Informatie Analyse wordt het probleem grondig geanalyseerd en de technische oorzaak achterhaald.");

        this.vraagStrategie = new PuzzelVraagStrategie(
                Map.of(
                        "Probleem grondig analyseren", "Probleem grondig analyseren",
                        "Technische oorzaak achterhalen", "Technische oorzaak achterhalen"
                ),
                hintProviderFactory,
                6,
                zwaard
        );
    }

    @Override
    public int getKamerNummer() {
        return 6;
    }
}
