import javax.swing.*;
import java.awt.*;

public class Cloud {
    private int x;
    private int y;

    public Cloud(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        x += 1;
        if (x > 800) {
            x = -50;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 50, 20);
    }
}
