import java.util.Scanner;
public class Retrospective extends Kamer {
    public Retrospective(String Naam, String Beschrijving, String Thema, String Opdracht, String Vragen) {
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
        System.out.println("Vraag: Wat doet een Scrum Master?");
        System.out.println("a) Schrijft alle code\nb) Plant de vakantie van het team\nc) Helpt het team Scrum goed toe te passen\nd) Houdt vergaderingen");

        String antwoord = scanner.nextLine().trim().toLowerCase();
        if (antwoord.equals("c")) {
            System.out.println("Correct antwoord!");
            return true;
        } else {
            System.out.println("Fout antwoord! Een impediment (monster) verschijnt.");
            new Monster().verschijnt(5);
            return true;
        }
    }


}




