package dmme.kuvid.domain.GameObjects;

public class Position {
    int x;
    int y;

    public Position(int x, int y) {
        super();
        this.x = x;
        this.x = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
