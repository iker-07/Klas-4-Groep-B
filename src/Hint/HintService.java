package Hint;

public class HintService {
    private final HintProviderFactory factory;
    private final int kamerNummer;

    public HintService(HintProviderFactory factory, int kamerNummer) {
        this.factory = factory;
        this.kamerNummer = kamerNummer;
    }

    public String getHint() {
        HintProvider provider = factory.kiesRandomProvider(kamerNummer);
        return provider.getHint();

    }
}