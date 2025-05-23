import java.util.HashMap;
import java.util.Map;

public class Spel {
    public static String spelerNaam = "Speler";
    private static final Map<Integer, Kamer> kamers = new HashMap<>();
    private static HintProviderFactory hintProviderFactory;

    public static void StartGame() {
        hintProviderFactory = new HintProviderFactory();

        kamers.put(1, new DailyScrum(hintProviderFactory));
        kamers.put(2, new Sprintplanning(hintProviderFactory));
        kamers.put(3, new SprintRetrospective(hintProviderFactory));
        kamers.put(4, new Sprintreview(hintProviderFactory));
        kamers.put(5, new Scrumbord(hintProviderFactory));// of een andere kamer
        kamers.put(6, new TIA(hintProviderFactory));
    }

    public static Kamer kiesKamer(int nummer) {
        return kamers.get(nummer);
    }
}
