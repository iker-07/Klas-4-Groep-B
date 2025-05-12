//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Kamer {
    String Naam;
    String Beschrijving;
    String Thema;
    String Opdracht;
    String Vragen;

    public Kamer(String Naam, String Beschrijving, String Thema, String Opdracht, String Vragen) {
        this.Naam = Naam;
        this.Beschrijving = Beschrijving;
        this.Thema = Thema;
        this.Opdracht = Opdracht;
        this.Vragen = Vragen;
    }

    // TEMPLATE METHOD
    public final void kamerMenu() {
        toonNaam();
        toonBeschrijving();
        voerOpdrachtUit();
        stelVragen();
    }

    // ABSTRACTE STAPPEN
    protected abstract void toonNaam();

    protected abstract void toonBeschrijving();

    protected abstract void voerOpdrachtUit();

    protected abstract void stelVragen();
}
