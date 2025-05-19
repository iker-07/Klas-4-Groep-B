import java.util.Scanner;

public class Spel {
    static String spelerNaam;
    static Speler speler;

    public static void main(String[] args) {
        DatabaseManager.initializeDatabase();
        StartGame();
        Scanner scanner = new Scanner(System.in);

        for (int kamerNummer = 1; kamerNummer <= 6; kamerNummer++) {
            if (DatabaseManager.isKamerVoltooid(speler.getGamertag(), kamerNummer)) {
                System.out.println("⏭️ Kamer " + kamerNummer + " is al voltooid. Sla over.");
                continue;
            }

            Kamer kamer = kiesKamer(kamerNummer);
            if (kamer != null) {
                System.out.println("\n=== Je betreedt " + kamer.Naam + " ===");
                kamer.kamerMenu(scanner);
                DatabaseManager.markeerKamerAlsVoltooid(speler.getGamertag(), kamerNummer);
            } else {
                System.out.println("Kamer " + kamerNummer + " bestaat niet. Spel wordt beëindigd.");
                break;
            }
        }

        System.out.println("\nGefeliciteerd " + spelerNaam + ", je hebt alle kamers doorlopen!");
        scanner.close();
    }

    public static void StartGame() {
        DatabaseManager.initializeDatabase();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vul je GamerTag in: ");
        String tag = scanner.nextLine();
        spelerNaam = tag;
        speler = new Speler(spelerNaam, "onbekend", spelerNaam);
        System.out.println("Welkom terug, " + speler.getGamertag() + "!");
        System.out.println("Huidige voortgang: " + speler.getVoortgang());
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
