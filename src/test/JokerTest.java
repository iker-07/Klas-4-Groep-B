package test;

import Jokers.Joker;
import Stub.JokerStub;
import Mock.JokerMock;
import kamers.Kamer;

public class JokerTest {

    public static void testGedragMetStub() {
        JokerStub stub = new JokerStub();
        Kamer kamer = new Kamer("Testkamer", null, null, null, null, null) {
            @Override
            protected void toonNaam() {}
            @Override
            protected void toonBeschrijving() {}
            @Override
            protected void voerOpdrachtUit() {}
            @Override
            public int getKamerNummer() { return 0; }
        };

        System.out.println("isUsed vóór gebruik: " + stub.isUsed());
        stub.useIn(kamer);
        System.out.println("isUsed ná gebruik: " + stub.isUsed());

        assert stub.isUsed() : "Test met stub mislukt: Joker moet na gebruik gebruikt zijn";
        System.out.println("Stub test geslaagd");
    }

    public static void testInteractieMetMock() {
        JokerMock mock = new JokerMock();
        Kamer kamer = new Kamer("Testkamer", null, null, null, null, null) {
            @Override
            protected void toonNaam() {}
            @Override
            protected void toonBeschrijving() {}
            @Override
            protected void voerOpdrachtUit() {}
            @Override
            public int getKamerNummer() { return 0; }
        };

        mock.isUsed();
        mock.useIn(kamer);

        assert mock.isUsedCalled : "Test met mock mislukt: isUsed() niet aangeroepen";
        assert mock.useInCalled : "Test met mock mislukt: useIn() niet aangeroepen";
        assert mock.kamerUsedIn == kamer : "Test met mock mislukt: verkeerde kamer doorgegeven";

        System.out.println("Mock test geslaagd");
    }

    public static void main(String[] args) {
        testGedragMetStub();
        testInteractieMetMock();
    }
}
