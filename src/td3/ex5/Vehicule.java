package td3.ex5;

    public class Vehicule {
        private int nbPassager;

        public Vehicule(int n) {
            this.nbPassager = n;
        }

        public int getNbPassager() {
            return nbPassager;
        }

        public void setNbPassager(int nbPassager) {
            this.nbPassager = nbPassager;
        }

        @Override
        public String toString() {
            return "Vehicule [nbPassager=" + nbPassager + "]";
        }
    }



