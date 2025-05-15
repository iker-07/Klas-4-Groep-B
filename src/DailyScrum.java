import java.util.Scanner;

public class DailyScrum extends Kamer {

    public DailyScrum(String Naam, String Beschrijving, String Thema, String Opdracht, String Vragen) {
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
        System.out.println("Vraag: Hoe lang duurt een Daily Scrum?");
        System.out.println("a) 1 uur\nb) 30 minuten\nc) 15 minuten\nd) Zolang als nodig is");

        String antwoord = scanner.nextLine().trim().toLowerCase();

        if (antwoord.equals("c")) {
            System.out.println("Correct antwoord!");
            return true;
        } else {
            System.out.println("Fout antwoord! Een impediment (monster) verschijnt.");
            new Monster().verschijnt(3);
            return true;
        }
    }

}
