package td3.ex3;

    class Point33 {
        public Point33(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void affCoord() {
            System.out.println("Coordonnees : " + x + " " + y);
        }
        public void affiche() {
            System.out.println("Coordonnees : " + x + " " + y);
        }
        int x;
        int y;

        protected String getX() {
            String o = null;
            return o;
        }

        protected String getY() {
            return null;
        }
    }
