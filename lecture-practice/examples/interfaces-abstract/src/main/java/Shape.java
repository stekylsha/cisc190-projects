import java.awt.Color;

public abstract class Shape implements Drawable {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
