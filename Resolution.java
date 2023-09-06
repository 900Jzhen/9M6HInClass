package BuildAPC;

public class Resolution {
    private int Length;
    private int height;

    public Resolution(int length, int height) {
        Length = length;
        this.height = height;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
