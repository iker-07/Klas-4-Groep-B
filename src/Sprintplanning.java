import java.util.Scanner;

public class Sprintplanning extends Kamer {

    public Sprintplanning(String Naam, String Beschrijving, String Thema, String Opdracht, String Vragen) {
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
        System.out.println("Opdracht: " + Opdracht);
    }

    protected boolean stelVragen(Scanner scanner) {
        System.out.println("Vraag: Wat is het doel van de Sprint Review?");
        System.out.println("a) Teambuilding\nb) Werk demonstreren aan stakeholders\nc) Klanten bellen\nd) Vakantie bespreken");

        String antwoord = scanner.nextLine().trim().toLowerCase();

        if (antwoord.equals("b")) {
            System.out.println("Correct antwoord!");
            return true;
        } else {
            System.out.println("Fout antwoord! Een impediment (monster) verschijnt.");
            new Monster().verschijnt(4);
            return true;
        }
    }
}