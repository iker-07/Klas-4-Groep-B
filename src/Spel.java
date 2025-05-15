import java.util.Scanner;

public class Spel {
    static String spelerNaam;

    public static void main(String[] args) {
        StartGame();
        Scanner scanner = new Scanner(System.in);

        for (int kamerNummer = 1; kamerNummer <= 6; kamerNummer++) {
            Kamer kamer = kiesKamer(kamerNummer);
            if (kamer != null) {
                System.out.println("\n=== Je betreedt " + kamer.Naam + " ===");
                kamer.kamerMenu(scanner);
            } else {
                System.out.println("Kamer " + kamerNummer + " bestaat niet. Spel wordt beëindigd.");
                break;
            }
        }

        System.out.println("\nGefeliciteerd " + spelerNaam + ", je hebt alle kamers doorlopen!");
        scanner.close();
    }

    public static void StartGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vul je GamerTag in:");
        spelerNaam = scanner.nextLine();
        System.out.println("Welkom bij het Scrum Escape Spel, " + spelerNaam + "!");
    }

    public static Kamer kiesKamer(int keuze) {
        switch (keuze) {
            case 1:
                return new Retrospective("Kamer 1", "Een mysterieuze kamer", "Scrum Event", "Zoek de sleutel", "Wat is 2 + 2?");
            case 2:
                return new Sprintplanning("Kamer 2", "Sprint Planning", "Scrum Event", "Bepaal het Sprint Doel", "Wat gebeurt er tijdens Sprint Planning?");
            case 3:
                return new Dailyscrum("Kamer 3", "Daily Scrum", "Scrum Event", "Geef een team update", "Hoe lang duurt een Daily Scrum?");
            case 4:
                return new Sprintreview("Kamer 4", "Sprint Review", "Scrum Event", "Laat je werk zien", "Wat is het doel van de Sprint Review?");
            case 5:
                return new Scrumboard("Kamer 5", "Scrum Master", "Scrum Rol", "Help het team", "Wat doet een Scrum Master?");
            case 6:
                return new TIA("Finale Kamer", "Scrum Finale", "Scrum Overzicht", "Beantwoord finale vragen", "Wat is het doel van Scrum?");
            default:
                return null;
        }
    }
}
