import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Goedendag! Welkom bij het Scrum Escape Game!");
        Scanner scanner = new Scanner(System.in);
        Spel.StartGame();

        Set<Integer> voltooideKamers = new HashSet<>();

        while (voltooideKamers.size() < 6) {
            System.out.print("Typ een commando (bijv. 'ga naar kamer x' of 'stop'): \n");
            String input = scanner.nextLine().trim().toLowerCase();

            System.out.println();

            if (input.equals("stop") || input.equals("quit")) {
                System.out.println("Spel wordt gestopt. Tot ziens!");
                break;
            }

            if (input.startsWith("ga naar kamer")) {
                try {
                    int kamerNummer = Integer.parseInt(input.replaceAll("[^0-9]", ""));
                    if (kamerNummer >= 1 && kamerNummer <= 6) {
                        if (voltooideKamers.contains(kamerNummer)) {
                            System.out.println("Je hebt deze kamer al afgerond.");
                        } else {
                            if (kamerNummer == 6 && voltooideKamers.size() < 5) {
                                System.out.println("Je mag pas naar kamer 6 als je kamer 1 t/m 5 hebt voltooid.");
                            } else {
                                Kamer kamer = Spel.kiesKamer(kamerNummer);
                                if (kamer != null && kamer.kamerMenu(scanner)) {
                                    voltooideKamers.add(kamerNummer);
                                }
                            }
                        }
                    } else if (kamerNummer == 7) {
                        System.out.println("Je mag pas naar kamer 7 als je alle voorgaande kamers hebt voltooid.");
                    } else {
                        System.out.println("Ongeldig kamer nummer.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Kan kamer nummer niet herkennen.");
                }
            } else {
                System.out.println("Ongeldig commando.");
            }
        }

        if (voltooideKamers.size() == 6) {
            System.out.println("\nGoed gedaan! Je mag naar de finale kamer.");
            Kamer finaleKamer = Spel.kiesKamer(7);
            if (finaleKamer != null) {
                finaleKamer.kamerMenu(scanner);
            }
            System.out.println("\nGefeliciteerd " + Spel.spelerNaam + ", je hebt alle kamers doorlopen!");
        }

        scanner.close();
    }
}
