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
                return new Scrumbord("Scrumbord kamer", "Scrumbord", "Scrum Event", "Scrumbord kennis", "Wat is het hoofddoel van een scrumbord?");
            case 2:
                return new Sprintplanning("Sprint Planning kamer", "Sprint Planning", "Scrum Event", "Bepaal het Sprint Doel", "Wat gebeurt er tijdens Sprint Planning?");
            case 3:
                return new DailyScrum("Daily Scrum kamer", "Daily Scrum", "Scrum Event", "Geef een team update", "Hoe lang duurt een Daily Scrum?");
            case 4:
                return new Sprintreview("Sprint Review kamer", "Sprint Review", "Scrum Event", "Laat je werk zien", "Wat is het doel van de Sprint Review?");
            case 5:
                return new SprintRetrospective("Sprint Retrospective kamer", "Sprint Retrospective", "Scrum Event", "Terugblik Sprint", "Wanneer vind een sprint retrospective plaats?");
            case 6:
                return new TIA("TIA Kamer", "Scrum Finale", "Scrum Overzicht", "Beantwoord finale vragen", "Wat is een mogelijke betekenis van een TIA binnen de scrummethode?");
            default:
                return null;
        }
    }
}
