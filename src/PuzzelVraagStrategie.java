import java.util.*;

public class PuzzelVraagStrategie implements VraagStrategie {
    private final Map<String, String> definitiesEnTermen;

    public PuzzelVraagStrategie(Map<String, String> definitiesEnTermen) {
        this.definitiesEnTermen = definitiesEnTermen;
    }

    @Override
    public boolean stelVraag(Scanner scanner, int kamerNummer) {
        System.out.println("Match de juiste Scrum-termen met de definities:");

        int juist = 0;
        for (String definitie : definitiesEnTermen.keySet()) {
            System.out.println("Definitie: " + definitie);
            System.out.print("Jouw antwoord: ");
            String antwoord = scanner.nextLine().trim().toLowerCase();
            if (antwoord.equals(definitiesEnTermen.get(definitie).toLowerCase())) {
                juist++;
            }
        }

        if (juist == definitiesEnTermen.size()) {
            System.out.println("Alle termen correct gematcht!");
            return true;
        } else {
            System.out.println("Sommige antwoorden waren fout. Een monster verschijnt.");
            new Monster().verschijnt(kamerNummer);
            return true;
        }
    }
}
