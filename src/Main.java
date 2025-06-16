import Entiteiten.SpelController;
import java.util.Scanner;
import Entiteiten.Naam;


public class Main {
    public static void main(String[] args) {

        System.out.println("Goedendag! Welkom bij het Scrum Escape Game!");
        System.out.println("Veel succes en plezier!\n");

        Naam naam = new Naam();
        naam.naamding();
        boolean Naamvery = false;

        Scanner scanner = new Scanner(System.in);
        SpelController spelController = new SpelController(scanner);
        if (Naamvery = true)

            spelController.start();


    }
}