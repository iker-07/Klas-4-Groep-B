package Jokers;

import kamers.Kamer;

public class KeyJoker extends Joker {

    private int gebruiksTeller = 0;
    private final int MAX_GEBRUIK = 2;

    @Override
    public boolean isUsed() {
        return gebruiksTeller >= MAX_GEBRUIK;
    }

    @Override
    public void useIn(Kamer kamer) {
        if (isUsed()) {
            System.out.println("Je hebt deze joker al twee keer gebruikt.");
            return;
        }

        if (kamer instanceof KeyJokerSupport) {
            System.out.println("Key Joker gebruikt in kamer: " + kamer.getNaam());
            ((KeyJokerSupport) kamer).gebruikKeyJoker();
            gebruiksTeller++;
        } else {
            // Volgens LSP geen foutmelding of lege actie hier
        }
    }
}
