import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Goedendag! Welkom bij het Scrum Escape Game!");
        System.out.println("Veel succes en plezier!\n");

        Scanner scanner = new Scanner(System.in);
        SpelController spelController = new SpelController(scanner);
        spelController.start();

        scanner.close();
    }
}
