package ISP;

public class Zwaard implements weapon {
    private final String naam;

    public Zwaard(String naam) {
        this.naam = naam;
    }

    @Override
    public void attack() {
        System.out.println("zwaard" + naam + " wordt gebruikt om een monster aan te vallen!");
    }
}

