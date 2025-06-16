package Objects;

import Interfaces.Weapon;
import Entiteiten.Speler;

public class Zwaard implements Weapon {
    @Override
    public void attack() {
        if (Speler.kanZwaardGebruiken()) {
            System.out.println("Je zwaait met het zwaard en valt het monster aan!");
            Speler.gebruikZwaard();
        } else {
            System.out.println("Je hebt het zwaard al 2 keer gebruikt. Je kunt het niet meer gebruiken.");
        }
    }
}
