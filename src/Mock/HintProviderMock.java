package Mock;

import Hint.HintProvider;

public class HintProviderMock implements HintProvider {
    public boolean isGetHintAangeroepen = false;

    @Override
    public String getHint() {
        isGetHintAangeroepen = true;
        return "Mock hint";
    }
}
