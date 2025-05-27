package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.PuzzelVraagStrategie;

import java.util.Map;

public class TIA extends Kamer {
    public TIA(HintProviderFactory hintProviderFactory) {
        super("Technische Informatie Analyse kamer", "kamers.TIA", "Analyse", "Koppel termen aan juiste uitleg",
                new PuzzelVraagStrategie(
                        Map.of("Probleem grondig analyseren", "kamers.TIA", "Technische oorzaak achterhalen", "kamers.TIA"
                        ), hintProviderFactory
                ),
                new HintService(hintProviderFactory, 6)
        );
    }

    @Override
    protected void toonNaam() { System.out.println("Kamernaam: " + Naam); }

    @Override
    protected void toonBeschrijving() { System.out.println("Beschrijving: " + Beschrijving); }

    @Override
    protected void voerOpdrachtUit() { System.out.println("Opdracht uitvoeren: " + Opdracht); }

    @Override
    protected int getKamerNummer() { return 6; }
}
