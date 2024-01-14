package td3.ex4;

    public class Bâtiment {
        private String adresse;

        public Bâtiment() {
            this.adresse = "";
        }

        public Bâtiment(String adresse) {
            this.adresse = adresse;
        }

        public String getAdresse() {
            return adresse;
        }

        public void setAdresse(String adresse) {
            this.adresse = adresse;
        }

        @Override
        public String toString() {
            return "Bâtiment [adresse=" + adresse + "]";
        }
    }









