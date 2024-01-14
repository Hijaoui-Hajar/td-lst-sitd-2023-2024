package td3.ex3;

    public class PointNom33 extends Point33 {
        private char nom;

        public PointNom33(int x, int y, char nom) {
            super(x, y);
            this.nom = nom;
        }

        public void setPointNom(int x, int y, char nom) {
            super.x = x;
            super.y = y;
            this.nom = nom;
        }

        public void setNom(char nom) {
            this.nom = nom;
        }

        public void affCoordNom() {
            System.out.println("Coordonnées : (" + super.getX() + ", " + super.getY() + ") Nom : " + nom);
        }

        public void affNom() {
            System.out.println("Nom : " + nom);
        }
    }


