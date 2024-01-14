package td3.ex2;

public class Point32 {
    public Point32(int x, int y) {
    }

    public void Point(int x, int y) {
        this.x = x;
        this.y = y; }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy; }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    int x;
    int y;

    protected String getY() {
        return null;
    }

    protected String getX() {
        String o = null;
        return o;
    }
}
