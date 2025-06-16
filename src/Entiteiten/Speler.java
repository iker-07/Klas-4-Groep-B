package Entiteiten;

import java.util.ArrayList;

public class Speler {
    public static String positie;

    public static String spelerNaam;

    public static ArrayList<Integer> Voltooid = new ArrayList<>();

    private static int zwaardGebruiken = 0;

    public static boolean kanZwaardGebruiken() {
        return zwaardGebruiken < 2;
    }

    public static void gebruikZwaard() {
        zwaardGebruiken++;
    }

    public Speler(String spelerNaam) {

    }
    public static void markeerKamerVoltooid(int kamerNummer) {
        if (!Voltooid.contains(kamerNummer)) {
            Voltooid.add(kamerNummer);
            System.out.println("Kamer " + kamerNummer + " voltooid.");
        }
    }

    public static void toonStatus() {
        System.out.println("==== Spelerstatus ====");
        System.out.println("Naam: " + spelerNaam);

        System.out.println("Huidige locatie: " + positie);
        System.out.println("voltooid: " + Voltooid);
        System.out.println("======================");
    }


}