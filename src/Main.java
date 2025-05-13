import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Spel.StartGame();

        Set<Integer> voltooideKamers = new HashSet<>();

        while (voltooideKamers.size() < 5) {
            System.out.print("Typ een commando (bijv. 'ga naar kamer 1'): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.startsWith("ga naar kamer")) {
                try {
                    int kamerNummer = Integer.parseInt(input.replaceAll("[^0-9]", ""));
                    if (kamerNummer >= 1 && kamerNummer <= 5) {
                        if (voltooideKamers.contains(kamerNummer)) {
                            System.out.println("Je hebt deze kamer al afgerond.");
                        } else {
                            Kamer kamer = Spel.kiesKamer(kamerNummer);
                            if (kamer != null && kamer.kamerMenu(scanner)) {
                                voltooideKamers.add(kamerNummer);
                            }
                        }
                    } else if (kamerNummer == 6) {
                        System.out.println("Je mag pas naar kamer 6 als je kamer 1 t/m 5 hebt voltooid.");
                    } else {
                        System.out.println("Ongeldige kamer.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Kan kamer nummer niet herkennen.");
                }
            } else {
                System.out.println("Ongeldig commando.");
            }
        }

        // Alle kamers voltooid
        System.out.println("\nGoed gedaan! Je mag naar de finale kamer.");
        Kamer kamer6 = Spel.kiesKamer(6);
        if (kamer6 != null) {
            kamer6.kamerMenu(scanner);
        }

        System.out.println("\nGefeliciteerd " + Spel.spelerNaam + ", je hebt alle kamers doorlopen!");
        scanner.close();
    }
}
