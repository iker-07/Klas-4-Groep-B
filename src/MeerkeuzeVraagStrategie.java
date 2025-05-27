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
        for (int i = 0; i < opties.length; i++) {
            char letter = (char) ('A' + i);
            System.out.println(letter + ". " + opties[i]);
        }

        String invoer = "";
        char keuze = ' ';
        boolean geldigeKeuze = false;

        while (!geldigeKeuze) {
            System.out.print("Kies een optie (A-" + (char)('A' + opties.length - 1) + "): ");
            invoer = scanner.nextLine().trim().toUpperCase();

            if (invoer.length() == 1) {
                keuze = invoer.charAt(0);
                int index = keuze - 'A';
                if (index >= 0 && index < opties.length) {
                    geldigeKeuze = true;
                    if (opties[index].equalsIgnoreCase(correctAntwoord)) {
                        System.out.println("✅ Correct antwoord!");
                    } else {
                        System.out.println("❌ Fout antwoord! Het juiste antwoord was: " + correctAntwoord);
                        new Monster().verschijnt(kamerNummer);
                    }
                } else {
                    System.out.println("Ongeldige letter. Kies A t/m " + (char)('A' + opties.length - 1));
                }
            } else {
                System.out.println("Voer één letter in.");
            }
        }
        return true;
    }

}