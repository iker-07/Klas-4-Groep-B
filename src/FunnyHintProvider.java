import java.util.List;
import java.util.Random;

public class FunnyHintProvider implements HintProvider {
    private final List<String> hints;
    private final Random random = new Random();

    public FunnyHintProvider(List<String> hints) {
        this.hints = hints;
    }

    @Override
    public String getHint() {
        if (hints.isEmpty()) return "Geen grappige hints beschikbaar.";
        return hints.get(random.nextInt(hints.size()));
    }
}
