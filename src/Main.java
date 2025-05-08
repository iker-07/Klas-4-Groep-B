import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Kamer {
    String Naam;
    String Beschrijving;
    String Thema;
    String Opdracht;
    String Vragen;



public void BinnenKomen() {
    }


}
class kamer1 extends Kamer {
    public Vloer(String..., int...) {
        super(..., ...);
    }
}
class kamer2 extends Kamer {
    public Vloer(String..., int...) {
        super(..., ...);
    }
}
class kamer3 extends Kamer {
    public Vloer(String..., int...) {
        super(..., ...);
    }
}
class kamer4 extends Kamer {
    public Vloer(String..., int...) {
        super(..., ...);
    }
}
class kamer5 extends Kamer {
    public Vloer(String..., int...) {
        super(..., ...);
    }
}class kamer6 extends Kamer {
    public Vloer(String..., int...) {
        super(..., ...);
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