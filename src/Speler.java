class Speler {
    String positie;
    String statusPet;
    String naam;
    String geslacht;

    public Speler(String naam, String geslacht) {
        this.naam = naam;
        this.geslacht = geslacht;
        this.positie = "Hub";
        this.statusPet = "Gezond";
    }

    public void Move(String nieuwePositie) {
        this.positie = nieuwePositie;
    }

    public void Damage() {
        this.statusPet = "Gewond";
    }

    public void toonStatus() {
        System.out.println("==== Spelerstatus ====");
        System.out.println("Naam: " + naam);
        System.out.println("Geslacht: " + geslacht);
        System.out.println("Huidige locatie: " + positie);
        System.out.println("Status: " + statusPet);
        System.out.println("======================");
    }
}
