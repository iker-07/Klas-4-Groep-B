class Speler {
    String positie;
    String statusPet;
    String spelerNaam;
    String geslacht;
    String gamertag;
    int voortgang;

    public Speler(String spelerNaam, String geslacht, String gamertag) {
        this.geslacht = geslacht;
        this.positie = "Hub";
        this.statusPet = "Gezond";
        this.gamertag = gamertag;
        this.voortgang = DatabaseManager.laadVoortgang(gamertag);
        System.out.println("Voortgang geladen voor " + gamertag + ": " + voortgang);
    }

    public Speler(String spelerNaam) {
    }

    public void Move(String nieuwePositie) {
        this.positie = nieuwePositie;
    }

    public void Damage() {
        this.statusPet = "Gewond";
    }

    public void toonStatus() {
        System.out.println("==== Spelerstatus ====");
        System.out.println("Naam: " + spelerNaam);
        System.out.println("Geslacht: " + geslacht);
        System.out.println("Huidige locatie: " + positie);
        System.out.println("Status: " + statusPet);
        System.out.println("======================");
    }

    public void verhoogVoortgang() {
        voortgang++;
        System.out.println("Nieuwe voortgang: " + voortgang);
    }

    public void slaVoortgangOp() {
        DatabaseManager.slaVoortgangOp(gamertag, voortgang);
    }

    public int getVoortgang() {
        return voortgang;
    }

    public String getGamertag() {
        return gamertag;
    }
}