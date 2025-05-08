import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Kamer {
    String Naam;
    String Beschrijving;
    String Thema;
    String Opdracht;
    String Vragen;

    public Kamer(String naam, String Beschrijving, String Thema, String Opdracht, String Vragen) {
        this.Naam = Naam;
        this.Beschrijving = Beschrijving;
        this.Thema = Thema;
        this.Opdracht = Opdracht;
        this.Vragen = Vragen;

    }

    public String getNaam() {
        return Naam;
    }

    public String getBeschrijving() {
        return Beschrijving;
    }
    public String getThema() {
        return Thema;
    }
    public String getOpdracht() {
        return Opdracht;
    }
    public String getVragen() {
        return Vragen;
    }



public void BinnenKomen() {
    }


}
class kamer1 extends Kamer {
    public kamer1(String Naam, String Beschrijving,String Thema, String Opdracht, String Vragen) {
        super(Naam, Beschrijving, Thema, Opdracht, Vragen);
    }
}
class kamer2 extends Kamer {
    public kamer2(String Naam, String Beschrijving,String Thema, String Opdracht, String Vragen) {
        super(Naam, Beschrijving, Thema, Opdracht, Vragen);
    }
}
class kamer3 extends Kamer {
    public kamer3(String Naam, String Beschrijving,String Thema, String Opdracht, String Vragen) {
        super(Naam, Beschrijving, Thema, Opdracht, Vragen);
    }
}
class kamer4 extends Kamer {
    public kamer4(String Naam, String Beschrijving,String Thema, String Opdracht, String Vragen) {
        super(Naam, Beschrijving, Thema, Opdracht, Vragen);
    }
}
class kamer5 extends Kamer {
    public kamer5(String Naam, String Beschrijving,String Thema, String Opdracht, String Vragen) {
        super(Naam, Beschrijving, Thema, Opdracht, Vragen);
    }
}class kamer6 extends Kamer {
    public kamer6(String Naam, String Beschrijving,String Thema, String Opdracht, String Vragen) {
        super(Naam, Beschrijving, Thema, Opdracht, Vragen);
    }
}
class Hub {
}

class Spel{
    String Speler;
    String Hub;
    String Kamer;


public static void StartGame() {
    System.out.println("vul je GamerTag in:");
    Scanner GamerTag = new Scanner(System.in);
    String Naam = GamerTag.nextLine();
    System.out.println("Naam: " + Naam );



}

public static void KiesKamer() {
    System.out.println("Kies een kamer");
    Scanner Kamer = new Scanner(System.in);
    int Kamernr = Kamer.nextInt();

    switch (Kamernr) {
        case 1:
            break;
        case 2:
            System.out.println("Kies een kamer");
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;
        case 6:
            break;
    }





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