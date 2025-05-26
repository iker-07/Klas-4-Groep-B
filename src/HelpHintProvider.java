import java.util.List;
import java.util.Random;

public class HelpHintProvider implements HintProvider {
    private final List<String> hints;
    private final Random random = new Random();

    public HelpHintProvider(List<String> hints) {
        this.hints = hints;
    }

    @Override
    public String getHint() {
        if (hints.isEmpty()) return "Geen inhoudelijke hints beschikbaar.";
        return hints.get(random.nextInt(hints.size()));
    }
}


