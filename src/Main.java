import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Kamer {
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

    // TEMPLATE METHOD
    public final void kamerMenu() {
        toonNaam();
        toonBeschrijving();
        voerOpdrachtUit();
        stelVragen();
    }

    // ABSTRACTE STAPPEN
    protected abstract void toonNaam();
    protected abstract void toonBeschrijving();
    protected abstract void voerOpdrachtUit();
    protected abstract void stelVragen();
}




//public void BinnenKomen() {




class kamer1 extends Kamer {
    public kamer1(String Naam, String Beschrijving,String Thema, String Opdracht, String Vragen) {
        super(Naam, Beschrijving, Thema, Opdracht, Vragen);
    }
    @Override
    protected void toonNaam() {
        System.out.println("Kamernaam: " + Naam);
    }
    @Override
    protected void toonBeschrijving() {
        System.out.println("Beschrijving: " + Beschrijving);
    }

    @Override
    protected void voerOpdrachtUit() {
        System.out.println("Opdracht uitvoeren: " + Opdracht);
    }

    @Override
    protected void stelVragen() {
        System.out.println("Beantwoord de vraag: " + Vragen);
    }
}
class kamer2 extends Kamer {
    public kamer2(String Naam, String Beschrijving, String Thema, String Opdracht, String Vragen) {
        super(Naam, Beschrijving, Thema, Opdracht, Vragen);
    }

    @Override
    protected void toonNaam() {
        System.out.println("Kamernaam: " + Naam);
    }

    @Override
    protected void toonBeschrijving() {
        System.out.println("Beschrijving: " + Beschrijving);
    }

    @Override
    protected void voerOpdrachtUit() {
        System.out.println("Opdracht uitvoeren: " + Opdracht);
    }

    @Override
    protected void stelVragen() {
        System.out.println("Beantwoord de vraag: " + Vragen);
    }
}

class Hub {
}

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
                kamer = new kamer1("Kamer 1", "Een mysterieuze kamer", "Mysterie", "Zoek de sleutel", "Wat is 2 + 2?");
                break;
            case 2:
                kamer = new kamer2("Kamer 2", "Een enge kamer", "Horror", "Ontsnap uit de kooi", "Wat is je grootste angst?");
                break;
            // Voeg de rest toe
            default:
                System.out.println("Ongeldige keuze.");
                return;
        }

        kamer.kamerMenu();  // Template method uitvoeren
    }
}









class Speler{
    String Positite;
    String StatusPet;
    String Naam;
    String geslacht;


public void Move() {
}

public void Damage() {


    }
}
class Monster{
    String Naam="Marcel";

    public void GeeftDamage() {
        System.out.println("Geeft damage of "+Naam);
    }


}


public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster();
        Spel spel = new Spel();
     //   monster.GeeftDamage();
        Spel.StartGame();
        Spel.KiesKamer();
    }
}