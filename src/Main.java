import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Spel.StartGame();  // Geen scanner meegeven — methode maakt zelf een scanner

        for (int kamerNummer = 1; kamerNummer <= 6; kamerNummer++) {
            Kamer kamer = Spel.kiesKamer(kamerNummer);
            if (kamer != null) {
                System.out.println("\n=== Je betreedt " + kamer.Naam + " ===");
                kamer.kamerMenu(scanner);  // Gebruik dezelfde scanner
            } else {
                System.out.println("Kamer " + kamerNummer + " bestaat niet.");
                break;
            }
        }

        System.out.println("\n🎉 Gefeliciteerd, je hebt alle kamers doorlopen!");
        scanner.close();
    }
}
