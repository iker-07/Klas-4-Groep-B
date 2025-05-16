import java.util.Scanner;

public class MeerkeuzeVraagStrategie implements VraagStrategie {
    private final String vraag;
    private final String[] opties;
    private final String correctAntwoord;

    public MeerkeuzeVraagStrategie(String vraag, String[] opties, String correctAntwoord) {
        this.vraag = vraag;
        this.opties = opties;
        this.correctAntwoord = correctAntwoord;
    }

    @Override
    public boolean stelVraag(Scanner scanner, int kamerNummer) {
        System.out.println("Vraag: " + vraag);
        for (String optie : opties) {
            System.out.println(optie);
        }

        String antwoord = scanner.nextLine().trim().toLowerCase();

        if (antwoord.equals(correctAntwoord)) {
            System.out.println("Correct antwoord!");
            return true;
        } else {
            System.out.println("Fout antwoord! Een impediment (monster) verschijnt.");
            new Monster().verschijnt(kamerNummer);
            return true; // doorgaan na het verslaan van monster
        }
    }
}