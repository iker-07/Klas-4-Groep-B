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
        System.out.println("Vraag: Wat is het doel van Scrum?");
        System.out.println("a) Om zoveel mogelijk documenten te maken\nb) Om controle te houden\nc) Om waarde te leveren via werkende software\nd) Om dagelijks te vergaderen");

        String antwoord = scanner.nextLine().trim().toLowerCase();
        if (antwoord.equals("c")) {
            System.out.println("Correct antwoord!");
            return true;
        } else {
            System.out.println("Fout antwoord! Een impediment (monster) verschijnt.");
            new Monster().verschijnt(6);
            return true;
        }
    }
}




