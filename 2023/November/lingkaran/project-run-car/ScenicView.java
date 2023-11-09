import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScenicView {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scenic View");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        ScenicComponent scenicComponent = new ScenicComponent();
        frame.add(scenicComponent);

        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scenicComponent.moveElements();
            }
        });
        timer.start();

        frame.setVisible(true);
    }
}

class ScenicComponent extends JComponent {
    private List<Car> cars = new ArrayList<>();
    private List<Cloud> clouds = new ArrayList<>();
    private List<Tree> trees = new ArrayList();
    private List<MovingText> movingTexts = new ArrayList<>();

    public ScenicComponent() {
        // Inisialisasi mobil
        cars.add(new Car(0, 250));

        // Inisialisasi awan
        for (int i = 0; i < 5; i++) {
            int cloudX = (int) (Math.random() * (getWidth() - 50));
            int cloudY = (int) (Math.random() * 80 + 20);
            clouds.add(new Cloud(cloudX, cloudY));
        }
        
        // Inisialisasi pohon
        for (int i = 0; i < 10; i++) {
            int treeX = (int) (Math.random() * (getWidth() - 20));
            int treeY = 200;
            trees.add(new Tree(treeX, treeY));
        }
        
        // Inisialisasi teks yang bergerak
        movingTexts.add(new MovingText(0, 50, "Nama: Septian Adi Pratomo"));
        movingTexts.add(new MovingText(0, 80, "NPM: 202043500348"));
    
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Menggambar latar belakang
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Menggambar gunung
        g.setColor(Color.GRAY);
        g.fillPolygon(new int[]{100, 300, 500}, new int[]{300, 100, 300}, 3);
        g.fillPolygon(new int[]{300, 500, 700}, new int[]{300, 150, 300}, 3);

        // Menggambar jalan
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 300, getWidth(), 100);

        // Menggambar awan
        for (Cloud cloud : clouds) {
            cloud.draw(g);
        }

        // Menggambar pepohonan
        for (Tree tree : trees) {
            tree.draw(g);
        }
        
        // Menggambar mobil
        for (Car car : cars) {
            car.draw(g);
        }
        
        // Menggambar teks yang bergerak
        for (MovingText text : movingTexts) {
            text.draw(g);
        }
    }

    public void moveElements() {
        for (Car car : cars) {
            car.move();
        }

        for (Cloud cloud : clouds) {
            cloud.move();
        }

        for (Tree tree : trees) {
            tree.move();
        }
        
        // Memindahkan teks yang bergerak
        for (MovingText text : movingTexts) {
            text.move();
        }


        repaint();
    }
}
