import java.awt.Color;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("I have three sides of color " + getColor().toString() + ".");
    }
}
