package oop.point;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point() {

    }

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public Point(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public Point setX(final int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Point setY(final int y) {
        this.y = y;
        return this;
    }

    public int getZ() {
        return z;
    }

    public Point setZ(final int z) {
        this.z = z;
        return this;
    }

    @Override
    public String toString() {
        return "X = " + x +
                ", Y = " + y +
                ", Z = " + z;
    }
}
