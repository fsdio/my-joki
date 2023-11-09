import javax.swing.*;
import java.awt.*;

public class Tree {
    private int x;
    private int y;

    public Tree(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        x -= 2;
        if (x < -20) {
            x = 800;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, 20, 100);
    }
}
