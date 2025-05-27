package observer;

public class Deur implements Observer {
    @Override
    public void correctAntwoord() {
        System.out.println("De deur gaat open.");
    }

    @Override
    public void foutAntwoord() {
        System.out.println("De deur blijft dicht.");
    }
}
