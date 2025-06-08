package Entiteiten;

import Jokers.HintJoker;
import Jokers.Joker;
import Jokers.KeyJoker;
import Jokers.KeyJokerSupport;
import kamers.Kamer;

import java.util.*;

import static Entiteiten.Speler.positie;
import static Entiteiten.Speler.toonStatus;
import static Entiteiten.Speler.markeerKamerVoltooid;

public class SpelController {
    private final Scanner scanner;
    private final Set<Integer> voltooideKamers = new HashSet<>();
    private Joker gekozenJoker;

    public SpelController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        Spel.StartGame();

        // Joker laten kiezen
        kiesJoker();

        while (voltooideKamers.size() < 6) {
            System.out.println("\nTyp een commando:");
            System.out.println("- 'ga naar kamer x' (1 t/m 6)");
            System.out.println("- 'gebruik joker'");
            System.out.println("- 'stop'");
            System.out.print("Invoer: ");
            String input = scanner.nextLine().trim().toLowerCase();
            System.out.println();

            if ("stop".equals(input) || "quit".equals(input)) {
                System.out.println("Spel wordt gestopt. Tot ziens!");
                break;
            }

            if ("gebruik joker".equals(input)) {
                if (gekozenJoker == null) {
                    System.out.println("Je hebt geen joker gekozen.");
                    continue;
                }

                if (gekozenJoker.isUsed()) {
                    System.out.println("Je hebt je joker al volledig gebruikt.");
                    continue;
                }

                gebruikJoker();
                continue;
            }

            if (input.startsWith("ga naar kamer")) {
                try {
                    int kamerNummer = Integer.parseInt(input.replaceAll("[^0-9]", ""));

                    if (isKamerToegestaan(kamerNummer)) {
                        Kamer kamer = Spel.kiesKamer(kamerNummer);
                        positie = "Kamer " + kamerNummer;

                        if (kamer != null && kamer.kamerMenu(scanner)) {
                            markeerKamerVoltooid(kamerNummer);
                            voltooideKamers.add(kamerNummer);
                        }


                        toonStatus();
                        if (voltooideKamers.size() == 5) {
                            System.out.println("Goed gedaan! Je mag nu naar kamer 6, de Finale kamer!");
                        }
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

            Kamer finaleKamer = Spel.kiesKamer(7);
            if (finaleKamer != null) {
                finaleKamer.kamerMenu(scanner);
            }
            System.out.println("\nGefeliciteerd " + Speler.spelerNaam + ", je hebt alle kamers doorlopen!");
        }
    }

    private void kiesJoker() {
        System.out.println("Kies een joker om mee te nemen:");
        System.out.println("1 = Hint Joker (in elke kamer bruikbaar)");
        System.out.println("2 = Key Joker (alleen in kamer 'Daily Scrum (1)' en 'Sprint Review (4)', 2 keer te gebruiken)");

        while (gekozenJoker == null) {
            System.out.print("Typ 1 of 2: ");
            String keuze = scanner.nextLine().trim();

            if (keuze.equals("1")) {
                gekozenJoker = new HintJoker(Spel.hintService); // Verondersteld dat Spel.hintService bestaat
                System.out.println("Je hebt gekozen voor de Hint Joker.");
            } else if (keuze.equals("2")) {
                gekozenJoker = new KeyJoker();
                System.out.println("Je hebt gekozen voor de Key Joker.");
            } else {
                System.out.println("Ongeldige keuze.");
            }
        }
    }

    private void gebruikJoker() {
        System.out.print("Voor welke kamer wil je de joker gebruiken? (typ kamer nummer): ");
        try {
            int kamerNummer = Integer.parseInt(scanner.nextLine().trim());
            Kamer kamer = Spel.kiesKamer(kamerNummer);

            if (kamer == null) {
                System.out.println("Onbekende kamer.");
                return;
            }

            if (gekozenJoker instanceof KeyJoker) {
                if (!(kamer instanceof KeyJokerSupport)) {
                    System.out.println("Key Joker kan alleen in de kamers 'Daily Scrum' en 'Sprint Review' gebruikt worden.");
                    return;
                }
            }

            gekozenJoker.useIn(kamer);


            if (!voltooideKamers.contains(kamerNummer)) {
                markeerKamerVoltooid(kamerNummer);
                voltooideKamers.add(kamerNummer);
            }

        } catch (NumberFormatException e) {
            System.out.println("Ongeldig kamer nummer.");
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
            return "Je mag pas naar de finale kamer als je alle voorgaande kamers hebt voltooid.";
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
