package test;

import Mock.HintProviderMock;
import Mock.KamerMock;
import Jokers.HintJoker;
import Hint.HintProviderFactory;
import Hint.HintProvider;
import kamers.Kamer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HintJokerTest {

    @Test
    void testHintJokerGebruikEenKeer() {
        // Arrange
        HintProviderMock mock = new HintProviderMock();

        HintProviderFactory mockFactory = new HintProviderFactory() {
            @Override
            public HintProvider kiesRandomProvider(int kamerNummer) {
                return mock;
            }
        };

        HintJoker joker = new HintJoker(mockFactory);
        Kamer kamer = new KamerMock(1);

        // Eerste gebruik
        joker.useIn(kamer);
        assertTrue(mock.isGetHintAangeroepen, "Hint moet aangeroepen zijn");

        // Reset
        mock.isGetHintAangeroepen = false;

        // Tweede gebruik
        joker.useIn(kamer);
        assertFalse(mock.isGetHintAangeroepen, "Hint mag niet opnieuw aangeroepen worden");
    }
}