import javax.swing.*;
import java.awt.*;

public class Car {
    private int x;
    private int y;

    public Car(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        x += 5;
        if (x > 800) {
            x = -100;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 100, 50);
        g.setColor(Color.BLACK);
        g.fillOval(x + 10, y + 50, 30, 30);
        g.fillOval(x + 60, y + 50, 30, 30);
    }
}
