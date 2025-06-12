package test;

import Mock.HintProviderMock;
import Stub.HintProviderStub;

public class SpelKamerTest {

    public static void testGedragMetStub() {
        HintProviderStub stub = new HintProviderStub();
        SpelKamer kamer = new SpelKamer(stub);

        String hint = kamer.vraagHint();
        assert hint.equals("Altijd dezelfde hint") : "Test met stub mislukt";
        System.out.println("Test met stub geslaagd!");
    }

    public static void testInteractieMetMock() {
        HintProviderMock mock = new HintProviderMock();
        SpelKamer kamer = new SpelKamer(mock);

        kamer.vraagHint();

        assert mock.isGetHintAangeroepen : "Test met mock mislukt: getHint is niet aangeroepen";
        System.out.println("Test met mock geslaagd!");
    }

    public static void main(String[] args) {
        testGedragMetStub();
        testInteractieMetMock();
    }
}
