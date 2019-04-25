import java.awt.Color;

public class Main {
    public static void main(String... args) {
        Drawable[] things = new Drawable[10];
        int i = 0;
        things[i++] = new Rectangle(Color.RED);
        things[i++] = new Triangle(Color.BLUE);
        things[i++] = new Rectangle(Color.RED);
        things[i++] = new Triangle(Color.BLUE);
        things[i++] = new Triangle(Color.BLUE);
        things[i++] = new Rectangle(Color.RED);
        things[i++] = new Rectangle(Color.CYAN);
        things[i++] = new Rectangle(Color.RED);
        things[i++] = new Triangle(Color.BLUE);
        things[i++] = new Triangle(Color.BLUE);
        for (Drawable d : things) {
            d.draw();
        }
    }
}
