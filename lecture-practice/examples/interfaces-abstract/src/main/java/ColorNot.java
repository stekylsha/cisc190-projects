public enum ColorNot {
    RED(255, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    CYAN(0, 255, 255),
    BLUE(0, 0, 255),
    VIOLET(255, 0, 255);

    private int r, g, b;

    private ColorNot(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String toString() {
        return name() + "[" + Integer.toString(r) + ", " + Integer.toString(g) + ", " + Integer.toString(b) + "]";
    }
}
