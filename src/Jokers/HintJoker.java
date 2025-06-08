package Jokers;

import Hint.HintProviderFactory;
import kamers.Kamer;
import Hint.HintService;

public class HintJoker extends Joker {
    private boolean used = false;
    private final HintProviderFactory hintProviderFactory;

    public HintJoker(HintProviderFactory hintProviderFactory) {
        this.hintProviderFactory = hintProviderFactory;
    }

    @Override
    public boolean isUsed() {
        return used;
    }

    @Override
    public void useIn(Kamer kamer) {
        if (used) {
            System.out.println("Je hebt deze joker al gebruikt.");
            return;
        }
        System.out.println("Hint Joker gebruikt in kamer: " + kamer.getNaam());

        // Maak HintService aan met factory en kamerNummer
        HintService hintService = new HintService(hintProviderFactory, kamer.getKamerNummer());

        // Roep getHint() aan op HintService
        System.out.println("Hint: " + hintService.getHint());

        used = true;
    }
}
