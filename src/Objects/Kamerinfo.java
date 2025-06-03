package Objects;

import Interfaces.Readable;

public class Kamerinfo implements Readable {
    private final String boodschap;

    public Kamerinfo(String boodschap) {
        this.boodschap = boodschap;
    }

    @Override
    public void showMessage() {
        System.out.println("Kamerinfo: " + boodschap);
    }
}
