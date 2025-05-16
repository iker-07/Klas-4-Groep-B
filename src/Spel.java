
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
                return new Scrumbord();
            case 2:
                return new Sprintplanning();
            case 3:
                return new DailyScrum(); // Pas deze ook aan met strategie
            case 4:
                return new Sprintreview(); // idem
            case 5:
                return new SprintRetrospective(); // idem
            case 6:
                return new TIA(); // idem
            default:
                return null;
        }
    }
}