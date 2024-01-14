package td3.ex2;

public class PointNom32 extends Point32 {
        private char nom;

        public PointNom32(int x, int y, char nom) {
            super(x, y);
            this.nom = nom;
        }

        public void setPointNom32(int x, int y, char nom) {
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
    }





