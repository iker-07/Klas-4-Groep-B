package Hint;

import java.util.*;

public class HintProviderFactory {
    private final Map<Integer, List<String>> helpHintsPerKamer = new HashMap<>();
    private final Map<Integer, List<String>> funnyHintsPerKamer = new HashMap<>();
    private final Random random = new Random();

    public HintProviderFactory() {
        // kamers.Kamer 1 - Daily Scrum
        helpHintsPerKamer.put(1, List.of(
                "Een standup duurt maximaal 15 minuten.",
                "Iedereen deelt wat hij heeft gedaan sinds de vorige meeting."
        ));
        funnyHintsPerKamer.put(1, List.of(
                "De Daily Scrum is geen dagvullende soapaflevering.!",
                "Niet te veel koffie, blijf wakker tijdens de meeting!"
        ));

        // kamers.Kamer 2 - kamers.Sprintplanning
        helpHintsPerKamer.put(2, List.of(
                "In de Sprint Planning bepaal je wat je gaat doen in de sprint.",
                "Je maakt een backlog voor de sprint."
        ));
        funnyHintsPerKamer.put(2, List.of(
                "Plan niet om pizza te eten tijdens de sprint!",
                "Sprint Planning is geen sportwedstrijd, maar bijna."
        ));

        // kamers.Kamer 3 - Sprint Retrospective
        helpHintsPerKamer.put(3, List.of(
                "Tijdens de Sprint Retrospective bespreek je wat beter kan.",
                "Reflecteer op de afgelopen sprint."
        ));
        funnyHintsPerKamer.put(3, List.of(
                "Je hoeft niet echt te schreeuwen tijdens de retrospective.",
                "Reflecteren mag, maar niet in de badkamer."
        ));

        // kamers.Kamer 4 - Sprint Review
        helpHintsPerKamer.put(4, List.of(
                "Feedback verzamelen is essentieel voor verbetering.",
                "Demonstraties tonen wat je hebt gemaakt."
        ));
        funnyHintsPerKamer.put(4, List.of(
                "Toon niet je dansmoves tijdens de sprint review.",
                "Het monster houdt niet van saaie demo's!"
        ));

        // kamers.Kamer 5 - kamers.Scrumboard
        helpHintsPerKamer.put(5, List.of(
                "kamers.Scrumboard toont je voortgang.",
                "Taken worden zichtbaar tijdens de sprint."
        ));
        funnyHintsPerKamer.put(5, List.of(
                "Niet staren naar het scrumboard, anders word je er hypnotisch van!",
                "Het scrumboard is geen magnetisch bord voor koelkastpoëzie."
        ));

        // kamers.Kamer 6 - kamers.TIA (Technische Informatie Analyse)
        helpHintsPerKamer.put(6, List.of(
                "Tijdens de Daily Scrum synchroniseer je dagelijks.",
                "De standup duurt maximaal 15 minuten."
        ));
        funnyHintsPerKamer.put(6, List.of(
                "Wees niet de laatste die binnenkomt, de deur kan dichtgaan!",
                "Praat niet over het weer, focus op werk!"
        ));

        // kamers.Kamer 7 - Finale kamer
        helpHintsPerKamer.put(7, List.of(
                "Technische informatie analyse helpt problemen te doorgronden.",
                "Analyseer grondig om de oorzaak te vinden."
        ));
        funnyHintsPerKamer.put(7, List.of(
                "Niet alles hoeft met duct tape te worden opgelost!",
                "Computer zegt nee, maar probeer het toch."
        ));
    }

    public HintProvider kiesRandomProvider(int kamerNummer) {
        boolean kiesHelp = random.nextBoolean();
        if (kiesHelp) {
            List<String> hints = helpHintsPerKamer.getOrDefault(kamerNummer, List.of("Geen hints beschikbaar."));
            return new HelpHintProvider(hints);
        } else {
            List<String> hints = funnyHintsPerKamer.getOrDefault(kamerNummer, List.of("Geen hints beschikbaar."));
            return new FunnyHintProvider(hints);
        }
    }
}