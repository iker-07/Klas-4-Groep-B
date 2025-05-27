package Entiteiten;

import observer.Observer;

public class StatusDisplay implements Observer {
    @Override
    public void correctAntwoord() {
        System.out.println("Status: Correct antwoord!");
    }

    @Override
    public void foutAntwoord() {
        System.out.println("Status: Fout antwoord.");
    }
}
