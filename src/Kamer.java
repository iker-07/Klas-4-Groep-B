import java.util.Scanner;

public abstract class Kamer {
    String Naam;
    String Beschrijving;
    String Thema;
    String Opdracht;
    String Vragen;

    public Kamer(String Naam, String Beschrijving, String Thema, String Opdracht, String Vragen) {
        this.Naam = Naam;
        this.Beschrijving = Beschrijving;
        this.Thema = Thema;
        this.Opdracht = Opdracht;
        this.Vragen = Vragen;
    }

    public final boolean kamerMenu(Scanner scanner) {
        toonNaam();
        toonBeschrijving();
        voerOpdrachtUit();

        if (stelVragen(scanner)) {
            System.out.println("Je mag doorgaan naar de volgende kamer.");
            return true;
        } else {
            System.out.println("Je moet de opdracht of alternatieve opdracht goed afronden om door te gaan.");
            return false;
        }
    }

    protected abstract void toonNaam();
    protected abstract void toonBeschrijving();
    protected abstract void voerOpdrachtUit();
    protected abstract boolean stelVragen(Scanner scanner);
}
