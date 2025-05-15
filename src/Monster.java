import java.util.Scanner;

public class Monster {
    public void verschijnt(int kamerNummer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEen impediment verschijnt!");

        switch (kamerNummer) {
            case 1:
                System.out.println("Blokkade: Je snapt het nut van een scrumbord niet.");
                System.out.println("Alternatieve vraag: Waarvoor wordt een scrumbord gebruikt?");
                System.out.println("a) Voor het bijhouden van persoonlijke doelen");
                System.out.println("b) Voor het organiseren van taken binnen het Scrumteam");
                System.out.println("c) Voor het meten van klanttevredenheid");
                System.out.println("d) Voor het documenteren van de sprintreview");
                if (wachtOpAntwoord(scanner, "b")) return;
                break;

            case 2:
                System.out.println("Blokkade: Je weet niet precies wat er gebeurt tijdens Sprint Planning.");
                System.out.println("Alternatieve vraag: Wat is het doel van de Sprint Planning?");
                System.out.println("a) Een lijst met bugs verzamelen");
                System.out.println("b) Het team instrueren over hun werktijden");
                System.out.println("c) Samen het werk plannen en een Sprint Doel vaststellen");
                System.out.println("d) Feedback verzamelen van stakeholders");
                if (wachtOpAntwoord(scanner, "c")) return;
                break;

            case 3:
                System.out.println("Blokkade: Je weet niet hoe lang een Daily Scrum duurt.");
                System.out.println("Alternatieve vraag: Wie leidt de Daily Scrum?");
                System.out.println("a) De Scrum Master");
                System.out.println("b) De Product Owner");
                System.out.println("c) De developers zelf");
                System.out.println("d) De projectmanager");
                if (wachtOpAntwoord(scanner, "c")) return;
                break;

            case 4:
                System.out.println("Blokkade: Je weet niet wat het doel is van de Sprint Review.");
                System.out.println("Alternatieve vraag: Wat toont het team tijdens de Sprint Review?");
                System.out.println("a) De volledige backlog");
                System.out.println("b) De technische documentatie");
                System.out.println("c) De voortgangsgrafiek");
                System.out.println("d) Het werk dat tijdens de sprint is voltooid");
                if (wachtOpAntwoord(scanner, "d")) return;
                break;

            case 5:
                System.out.println("Blokkade: Je begrijpt het doel van de retrospective niet.");
                System.out.println("Alternatieve vraag: Wanneer vindt een Sprint Retrospective plaats?");
                System.out.println("a) Aan het begin van elke sprint");
                System.out.println("b) Tijdens de Daily Scrum");
                System.out.println("c) Na de Sprint Review en vóór de volgende Sprint Planning");
                System.out.println("d) Alleen als er problemen zijn geweest");
                if (wachtOpAntwoord(scanner, "c")) return;
                break;

            case 6:
                System.out.println("Blokkade: Je weet niet wat TIA betekent binnen Scrum.");
                System.out.println("Alternatieve vraag: Wat is een mogelijke betekenis van een TIA in Scrumcontext?");
                System.out.println("a) Tijd voor Individuele Analyse");
                System.out.println("b) Team Improvement Action");
                System.out.println("c) Tussentijdse Iteratie Activiteit");
                System.out.println("d) Technisch Informatie Archief");
                if (wachtOpAntwoord(scanner, "b")) return;
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