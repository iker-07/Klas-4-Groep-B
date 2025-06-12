package Assistent;

import Interfaces.Actie;
import java.util.List;

public class AssistentActie {
    private List<Actie> acties;

    public AssistentActie(List<Actie> acties) {
        this.acties = acties;
    }

    public void activeer() {
        for (Actie actie : acties) {
            actie.uitvoer();
        }
    }
}
