package test;

import Hint.HintProvider;

public class SpelKamer {
    private HintProvider hintProvider;

    public SpelKamer(HintProvider hintProvider) {
        this.hintProvider = hintProvider;
    }

    public String vraagHint() {
        return hintProvider.getHint();
    }

}


