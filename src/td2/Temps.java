package td2;

    public class Temps {
        private int heures;
        private int minutes;
        private int secondes;

// Constructeur par défaut
        public Temps() {
            this.heures = 0;
            this.minutes = 0;
            this.secondes = 0;
        }

// Constructeur avec heures
        public Temps(int heures) {
            this.heures = heures;
            this.minutes = 0;
            this.secondes = 0;
        }

// Constructeur avec heures et minutes
        public Temps(int heures, int minutes) {
            this.heures = heures;
            this.minutes = minutes;
            this.secondes = 0;
        }

// Constructeur avec heures, minutes et secondes
        public Temps(int heures, int minutes, int secondes) {
            this.heures = heures;
            this.minutes = minutes;
            this.secondes = secondes;
        }

// Constructeur de copie
        public Temps(Temps temps) {
            this.heures = temps.heures;
            this.minutes = temps.minutes;
            this.secondes = temps.secondes;
        }

// Getters et setters
        public int getHeures() {
            return heures;
        }

        public void setHeures(int heures) {
            this.heures = heures;
        }

        public int getMinutes() {
            return minutes;
        }

        public void setMinutes(int minutes) {
            this.minutes = minutes;
        }

        public int getSecondes() {
            return secondes;
        }

        public void setSecondes(int secondes) {
            this.secondes = secondes;
        }

// Méthodes pour ajouter des heures, minutes et secondes
        public void ajouterHeures(int heures) {
            this.heures += heures;
            this.heures = this.heures % 24;
        }

        public void ajouterMinutes(int minutes) {
            this.minutes += minutes;
            this.minutes = this.minutes % 60;
            this.heures += this.minutes / 60;
            this.minutes %= 60;
        }

        public void ajouterSecondes(int secondes) {
            this.secondes += secondes;
            this.secondes = this.secondes % 60;
            this.minutes += this.secondes / 60;
            this.secondes %= 60;
            this.heures += this.minutes / 60;
            this.minutes %= 60;
        }

// Méthode toString
        @Override
        public String toString() {
            return String.format("%02d:%02d:%02d", heures, minutes, secondes);
        }
    }


