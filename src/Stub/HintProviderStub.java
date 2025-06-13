package Stub;

import Hint.HintProvider;

public class HintProviderStub implements HintProvider {
    @Override
    public String getHint() {
        return "Altijd dezelfde hint";
    }
}

