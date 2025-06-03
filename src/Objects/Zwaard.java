package Objects;

import Interfaces.Weapon;

public class Zwaard implements Weapon {
    @Override
    public void attack() {
        System.out.println("🗡️ Je zwaait met het zwaard en valt het monster aan!");
    }
}
