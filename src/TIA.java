import java.util.Scanner;
public class TIA extends Kamer {
    public TIA(String Naam, String Beschrijving, String Thema, String Opdracht, String Vragen) {
        super(Naam, Beschrijving, Thema, Opdracht, Vragen);
    }
    @Override
    protected void toonNaam() {
        System.out.println("Kamernaam: " + Naam);
    }

    @Override
    protected void toonBeschrijving() {
        System.out.println("Beschrijving: " + Beschrijving);
    }

    @Override
    protected void voerOpdrachtUit() {
        System.out.println("Opdracht uitvoeren: " + Opdracht);
    }

    @Override
    protected boolean stelVragen(Scanner scanner) {
        System.out.println("Vraag: Wat is een mogelijke betekenis van een TIA binnen de scrummethode?");
        System.out.println("a) Een technische test voor het increment\nb) Een actiepunt om het teamproces te verbeteren\nc) Een deadline voor het opleveren van de sprint backlog\nd) Een extra rol naast de Scrum Master");

        String antwoord = scanner.nextLine().trim().toLowerCase();
        if (antwoord.equals("b")) {
            System.out.println("Correct antwoord!");
            return true;
        } else {
            System.out.println("Fout antwoord! Een impediment (monster) verschijnt.");
            new Monster().verschijnt(6);
            return true;
        }
    }
}