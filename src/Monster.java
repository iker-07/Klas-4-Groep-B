import java.util.Scanner;

public class Monster {
    public void verschijnt(int kamerNummer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEen impediment verschijnt!");

        switch (kamerNummer) {
            case 1:
                System.out.println("Blokkade: Je begrijpt de basis van rekenen niet goed.");
                System.out.println("Alternatieve vraag: Wat is 3 + 3?");
                System.out.println("a) 5\nb) 6\nc) 7\nd) 33");
                if (wachtOpAntwoord(scanner, "b")) return;
                break;

            case 2:
                System.out.println("Blokkade: Je weet niet precies wat er gebeurt tijdens Sprint Planning.");
                System.out.println("Alternatieve vraag: Wie bepaalt het Sprintdoel?");
                System.out.println("a) De Scrum Master\nb) De Product Owner samen met het team\nc) De CEO\nd) De developers alleen");
                if (wachtOpAntwoord(scanner, "b")) return;
                break;

            case 3:
                System.out.println("Blokkade: Je weet niet hoe lang een Daily Scrum duurt.");
                System.out.println("Alternatieve vraag: Wat is het doel van de Daily Scrum?");
                System.out.println("a) Klagen over problemen\nb) Plannen van de volgende Sprint\nc) Afstemmen over voortgang\nd) Koffie drinken");
                if (wachtOpAntwoord(scanner, "c")) return;
                break;

            case 4:
                System.out.println("Blokkade: Je weet niet wat het doel is van de Sprint Review.");
                System.out.println("Alternatieve vraag: Wie wordt uitgenodigd voor de Sprint Review?");
                System.out.println("a) Alleen developers\nb) Scrum Master en Product Owner\nc) Stakeholders en team\nd) Alleen de klant");
                if (wachtOpAntwoord(scanner, "c")) return;
                break;

            case 5:
                System.out.println("Blokkade: Je weet niet precies wat een Scrum Master doet.");
                System.out.println("Alternatieve vraag: Wat is de rol van de Scrum Master?");
                System.out.println("a) Controle uitvoeren op planning\nb) Team helpen obstakels te verwijderen\nc) Taken toewijzen\nd) Backlog beheren");
                if (wachtOpAntwoord(scanner, "b")) return;
                break;

            case 6:
                System.out.println("Blokkade: Je weet niet wat het hoofddoel is van Scrum.");
                System.out.println("Alternatieve vraag: Wat levert Scrum op?");
                System.out.println("a) Meer vergaderingen\nb) Documentatie\nc) Regelmatige waarde voor de klant\nd) Volledige controle voor managers");
                if (wachtOpAntwoord(scanner, "c")) return;
                break;

            default:
                System.out.println("Onbekende kamer, geen impediment gegenereerd.");
        }
    }

    private boolean wachtOpAntwoord(Scanner scanner, String correctAntwoord) {
        while (true) {
            System.out.print("Jouw keuze (a/b/c/d): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals(correctAntwoord)) {
                System.out.println("Monster verslagen! Je mag doorgaan.");
                return true;
            } else {
                System.out.println("Fout. Probeer opnieuw.");
            }
        }
    }
}
