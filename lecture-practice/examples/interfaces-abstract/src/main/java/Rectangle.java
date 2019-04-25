import java.awt.Color;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("I have four sides of color " + getColor().toString() + ".");
    }
}
