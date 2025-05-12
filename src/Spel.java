import java.util.Scanner;

class Spel {
    String Speler;
    String Hub;
    String Kamer;


    public static void StartGame() {
        System.out.println("vul je GamerTag in:");
        Scanner GamerTag = new Scanner(System.in);
        String Naam = GamerTag.nextLine();
        System.out.println("Naam: " + Naam);


    }

    public static void KiesKamer() {
        System.out.println("Kies een kamer (1-6):");
        Scanner scanner = new Scanner(System.in);
        int keuze = scanner.nextInt();

        Kamer kamer = null;
        switch (keuze) {
            case 1:
                kamer = new Sprintplanning("Sprintplanning", "Een mysterieuze kamer", "Mysterie", "Zoek de sleutel", "Wat is 2 + 2?");
                break;
            case 2:
                kamer = new Dailyscrum("Dailyscrum", "Een enge kamer", "Horror", "Ontsnap uit de kooi", "Wat is je grootste angst?");
                break;
            case 3:
                kamer = new Scrumboard("Scrumboard", "Een kamer", "een thema", "Opdracht", "vraag" );
            case 4:
                kamer = new Sprintreview("Sprintreview", "Een kamer", "een thema", "opdracht", "vraag");
            case 5:
                kamer = new Retrospective("Retrospective", "Een kamer", "een thema", "opdracht", "vraag ");
            case 6:
                kamer = new TIA("TIA", "een kamer", "een thema", "opdracht", "vraag");
            // Voeg de rest toe
            default:
                System.out.println("Ongeldige keuze.");
                return;
        }

        kamer.kamerMenu();  // Template method uitvoeren
    }
}
