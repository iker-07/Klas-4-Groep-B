package Jokers;

import kamers.Kamer;

public abstract class Joker {
    public abstract boolean isUsed();
    public abstract void useIn(Kamer kamer);
}
