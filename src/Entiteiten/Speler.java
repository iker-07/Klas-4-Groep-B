package Entiteiten;

import java.util.ArrayList;

public class Speler {
    public static String positie;

    public static String spelerNaam;

    public static ArrayList<Integer> Voltooid = new ArrayList<>();
//    int voortgang;

    public Speler(String spelerNaam, String geslacht, String gamertag) {




    }
    public static void markeerKamerVoltooid(int kamerNummer) {
        if (!Voltooid.contains(kamerNummer)) {
            Voltooid.add(kamerNummer);
            System.out.println("Kamer " + kamerNummer + " voltooid.");
        }
    }

//    public void Move(String nieuwePositie) {
//        this.positie = nieuwePositie;
//    }


    public static void toonStatus() {
        System.out.println("==== Spelerstatus ====");
        System.out.println("Naam: " + spelerNaam);

        System.out.println("Huidige locatie: " + positie);
        System.out.println("voltooid: " + Voltooid);
        System.out.println("======================");
    }


}