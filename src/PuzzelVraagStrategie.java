import java.util.Map;
import java.util.Scanner;

public class PuzzelVraagStrategie implements VraagStrategie {
    private final Map<String, String> vragenEnAntwoorden;
    private final HintProviderFactory hintProviderFactory;

    public PuzzelVraagStrategie(Map<String, String> vragenEnAntwoorden, HintProviderFactory hintProviderFactory) {
        this.vragenEnAntwoorden = vragenEnAntwoorden;
        this.hintProviderFactory = hintProviderFactory;
    }

    @Override
    public boolean stelVraag(Scanner scanner, int kamerNummer) {
        for (Map.Entry<String, String> entry : vragenEnAntwoorden.entrySet()) {
            System.out.println("Wat hoort bij: " + entry.getKey());
            String antwoord = scanner.nextLine().trim();
            if (!antwoord.equalsIgnoreCase(entry.getValue())) {
                return false; // Fout antwoord
            }
        }
        return true; // Alle antwoorden correct
    }
}
