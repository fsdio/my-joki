import javax.swing.*;
import java.awt.*;

public class MovingText {
    private int x;
    private int y;
    private String text;

    public MovingText(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public void move() {
        x += 2;
        if (x > 800) {
            x = -100;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 18));
        g.drawString(text, x, y);
    }
}
