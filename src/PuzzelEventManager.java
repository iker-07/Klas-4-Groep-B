import java.util.ArrayList;
import java.util.List;

public class PuzzelEventManager {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyCorrectAntwoord() {
        for (Observer o : observers) {
            o.correctAntwoord();
        }
    }

    public void notifyFoutAntwoord() {
        for (Observer o : observers) {
            o.foutAntwoord();
        }
    }
}
