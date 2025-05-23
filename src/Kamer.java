import java.util.Scanner;

public abstract class Kamer {
    String Naam;
    String Beschrijving;
    String Thema;
    String Opdracht;
    protected VraagStrategie vraagStrategie;

    public Kamer(String Naam, String Beschrijving, String Thema, String Opdracht, VraagStrategie vraagStrategie) {
        this.Naam = Naam;
        this.Beschrijving = Beschrijving;
        this.Thema = Thema;
        this.Opdracht = Opdracht;
        this.vraagStrategie = vraagStrategie;
    }

    public final boolean kamerMenu(Scanner scanner) {
        toonNaam();
        toonBeschrijving();
        voerOpdrachtUit();

        if (vraagStrategie.stelVraag(scanner, getKamerNummer())) {
            System.out.println("Je mag doorgaan naar de volgende kamer.");
            return true;
        } else {
            System.out.println("Je moet de opdracht goed afronden om door te gaan.");
            return false;
        }
    }

    protected abstract void toonNaam();
    protected abstract void toonBeschrijving();
    protected abstract void voerOpdrachtUit();
    protected abstract int getKamerNummer(); // nodig voor Monster
}