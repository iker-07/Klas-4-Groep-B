package Entiteiten;

import kamers.Kamer;


import java.util.*;

import static Entiteiten.Speler.positie;
import static Entiteiten.Speler.toonStatus;
import static Entiteiten.Speler.Voltooid;

public class SpelController {
    private final Scanner scanner;
    private final Set<Integer> voltooideKamers = new HashSet<>();

    public SpelController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        Spel.StartGame();

        while (voltooideKamers.size() < 6) {
            System.out.println("Kies een kamer tussen 1 t/m 5). Kamer 6 kan nog niet ;-)");
            System.out.print("Typ een commando (bijv. 'ga naar kamer x' of 'stop'): ");
            String input = scanner.nextLine().trim().toLowerCase();
            System.out.println();

            if ("stop".equals(input) || "quit".equals(input)) {
                System.out.println("Spel wordt gestopt. Tot ziens!");
                break;
            }

            if (input.startsWith("ga naar kamer")) {
                try {
                    int kamerNummer = Integer.parseInt(input.replaceAll("[^0-9]", ""));

                    if (isKamerToegestaan(kamerNummer)) {
                        Kamer kamer = Spel.kiesKamer(kamerNummer);
                        positie = "Kamer " + kamerNummer;


                        if (kamer != null && kamer.kamerMenu(scanner)) {
                            Speler.markeerKamerVoltooid(kamerNummer);
                        }

                        toonStatus();
                    } else {
                        System.out.println(getFoutmeldingVoorKamer(kamerNummer));
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
    }

    private boolean isKamerToegestaan(int kamerNummer) {
        if (kamerNummer < 1 || kamerNummer > 7) {
            return false;
        }
        if (kamerNummer == 6 && voltooideKamers.size() < 5) {
            return false;
        }
        if (kamerNummer == 7 && voltooideKamers.size() < 6) {
            return false;
        }
        if (voltooideKamers.contains(kamerNummer)) {
            return false;
        }
        return true;
    }

    private String getFoutmeldingVoorKamer(int kamerNummer) {
        if (kamerNummer == 6) {
            return "Je mag pas naar kamer 6 als je kamer 1 t/m 5 hebt voltooid.";
        }
        if (kamerNummer == 7) {
            return "Je mag pas naar kamer 7 als je alle voorgaande kamers hebt voltooid.";
        }
        if (kamerNummer < 1 || kamerNummer > 7) {
            return "Ongeldig kamer nummer.";
        }
        if (voltooideKamers.contains(kamerNummer)) {
            return "Je hebt deze kamer al afgerond.";
        }
        return "Ongeldig commando.";
    }
}
