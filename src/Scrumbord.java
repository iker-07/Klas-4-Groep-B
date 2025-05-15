import java.util.Scanner;

public class Scrumbord extends Kamer {

    public Scrumbord(String Naam, String Beschrijving, String Thema, String Opdracht, String Vragen) {
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
        System.out.println("Vraag: Wat is het hoofddoel van een scrumbord?");
        System.out.println("a) Om de vergaderplanning van de Scrum Master te tonen\nb) Om de voortgang van het team visueel inzichtelijk te maken\nc) Om te bepalen wie welke vakantie krijgt\nd) Om klantfeedback te verzamelen");

        String antwoord = scanner.nextLine().trim().toLowerCase();

        if (antwoord.equals("b")) {
            System.out.println("Correct antwoord!");
            return true;
        } else {
            System.out.println("Fout antwoord! Een impediment (monster) verschijnt.");
            new Monster().verschijnt(1);
            return true;
        }
    }

}

