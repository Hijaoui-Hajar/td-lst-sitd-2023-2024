package td3.ex1;

import td3.ex1.Point;

    public class PointA extends Point {
        public PointA(int x, int y) {
            super(x, y);
        }

        public void affiche() {
            System.out.println("Coordonnées : (" + getX() + ", " + getY() + ")");
        }
    }



