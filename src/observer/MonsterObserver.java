package observer;

public class MonsterObserver implements Observer {
    @Override
    public void correctAntwoord() {
        System.out.println("Het monster is verslagen!");
    }

    @Override
    public void foutAntwoord() {
        System.out.println("Het monster valt aan!");
    }
}
