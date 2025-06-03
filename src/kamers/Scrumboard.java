package kamers;

import Hint.HintProviderFactory;
import Hint.HintService;
import Strategy.PuzzelVraagStrategie;
import Objects.Kamerinfo;
import Objects.Zwaard;

import java.util.Map;

public class Scrumboard extends Kamer {

    private Kamerinfo infoBoek;
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

        // Initieer objecten na super()
        this.zwaard = new Zwaard();
        this.infoBoek = new Kamerinfo("Het ScrumBoard helpt teams visueel bij het volgen van de voortgang en taken tijdens een sprint.");

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
    protected void toonNaam() {
        System.out.println("Kamernaam: " + Naam);
    }

    @Override
    protected void toonBeschrijving() {
        System.out.println("Beschrijving: " + Beschrijving);
    }

    @Override
    protected void voerOpdrachtUit() {
        System.out.println("🧩 Opdracht uitvoeren: " + Opdracht);
        infoBoek.showMessage(); // 📘 toon uitleg
        // zwaard.attack(); // Alleen via strategie bij monster
    }

    @Override
    protected int getKamerNummer() {
        return 5;
    }
}
