package ISP;

public class KamerInfo implements message {
    private final String boodschap;

    public KamerInfo(String boodschap) {
        this.boodschap = boodschap;
    }

    @Override
    public void showMessage() {
        System.out.println(" Kamerinfo: " + boodschap);
    }
}

