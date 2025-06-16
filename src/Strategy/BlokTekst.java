package Strategy;

import java.util.Scanner;
import Entiteiten.Monster;
import Jokers.Joker;
import Jokers.KeyJoker;
import Objects.Zwaard;
import Hint.HintProvider;
import Entiteiten.Speler;


public class BlokTekst {
    private static Joker gekozenJoker;

    public static boolean behandelFoutMetMonster(Scanner scanner, int kamerNummer, Zwaard zwaard, HintProvider hintProvider) {
        System.out.println("Onjuist. Hint: " + hintProvider.getHint());
        System.out.println("Een monster verspert je pad!!️");
        System.out.println("Wil je het zwaard gebruiken om het monster te verslaan? (ja/nee)");
        String keuze = scanner.nextLine().trim().toLowerCase();

        if (keuze.equals("ja") || keuze.equals("j")) {
            if (Speler.kanZwaardGebruiken()) {
                zwaard.attack();
                System.out.println("Het monster is verslagen. Je mag doorgaan.");
                return true;
            } else {
                System.out.println("Je hebt het zwaard al 2 keer gebruikt. Je kunt het niet meer gebruiken.");
                System.out.println("Het monster blijft staan.");
                return false;
            }
        }
        else {
            Monster monster = new Monster();
            monster.verschijnt(kamerNummer);
            System.out.println("Je blijft geblokkeerd. Het monster staat nog steeds in de weg.");
            return false;
        }
    }
}