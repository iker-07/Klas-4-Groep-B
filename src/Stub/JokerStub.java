package Stub;

import Jokers.Joker;
import kamers.Kamer;

public class JokerStub extends Joker {
    private boolean used = false;

    @Override
    public boolean isUsed() {
        return used;
    }

    @Override
    public void useIn(Kamer kamer) {
        used = true;
        System.out.println("[Stub] Joker gebruikt in kamer: " + kamer.getNaam());
    }
}
