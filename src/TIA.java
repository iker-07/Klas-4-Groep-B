    class TIA extends Kamer {
        public TIA(String Naam, String Beschrijving, String Thema, String Opdracht, String Vragen) {
            super(Naam, Beschrijving, Thema, Opdracht, Vragen);
        }

        @Override
        protected void toonNaam() {
            System.out.println("Kamernaam: " + Naam);
        }

        @Override
        protected void toonBeschrijving() {
            System.out.println("Beschrijving: " + Beschrijving);
        }

        @Override
        protected void voerOpdrachtUit() {
            System.out.println("Opdracht uitvoeren: " + Opdracht);
        }

        @Override
        protected void stelVragen() {
            System.out.println("Beantwoord de vraag: " + Vragen);
        }
    }

