package test;


import Entiteiten.SpelController;

import java.util.Arrays;
import java.util.Scanner;

public class KamerRandwaardenTest {

    public static void main(String[] args) {
        SpelController controller = new SpelController(new Scanner(System.in));

        // Simuleer al 5 kamers voltooid
        controller.voltooideKamers.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("al voltooide kamers (1, 2, 3, 4, 5)");

        System.out.println("Kamer 0 toegestaan? " + controller.isKamerToegestaan(0));
        System.out.println("Kamer 1 toegestaan? " + controller.isKamerToegestaan(1));
        System.out.println("Kamer 6 toegestaan? " + controller.isKamerToegestaan(6));
        System.out.println("Kamer 7 toegestaan? " + controller.isKamerToegestaan(7));
        controller.voltooideKamers.add(6);
        System.out.println("Kamer 7 toegestaan na kamer 6? " + controller.isKamerToegestaan(7));
        System.out.println("Kamer 8 toegestaan? " + controller.isKamerToegestaan(8));
    }
}
