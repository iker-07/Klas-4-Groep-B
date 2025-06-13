package Mock;

import kamers.Kamer;

public class KamerMock extends Kamer {

    private final int kamerNummer;

    public KamerMock(int kamerNummer) {
        super(
                "Mock Kamer",
                "Beschrijving",
                "TestType",
                "Opdracht",
                null,
                null
        );
        this.kamerNummer = kamerNummer;
    }

    @Override
    protected void toonNaam() {
        // niets doen
    }

    @Override
    protected void toonBeschrijving() {
        // niets doen
    }

    @Override
    protected void voerOpdrachtUit() {
        // niets doen
    }

    @Override
    public int getKamerNummer() {
        return kamerNummer;
    }

    @Override
    public String getNaam() {
        return "MockKamer " + kamerNummer;
    }
}