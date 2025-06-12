package Mock;

import Jokers.Joker;
import kamers.Kamer;

public class JokerMock extends Joker {
    public boolean isUsedCalled = false;
    public boolean useInCalled = false;
    public Kamer kamerUsedIn = null;

    @Override
    public boolean isUsed() {
        isUsedCalled = true;
        return false;
    }

    @Override
    public void useIn(Kamer kamer) {
        useInCalled = true;
        kamerUsedIn = kamer;
        System.out.println("[Mock] Joker useIn aangeroepen met kamer: " + kamer.getNaam());
    }
}
