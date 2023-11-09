import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class UnionTigaLingkaran extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Membuat jendela utama
        primaryStage.setTitle("Lingkaran Union dengan Garis Tepi JavaFX");

        Pane root = new Pane();
        Scene scene = new Scene(root, 300, 250);

        // Membuat lingkaran pertama
        Circle circle1 = new Circle(100, 100, 50);
        circle1.setFill(Color.RED);
        root.getChildren().add(circle1);

        // Membuat lingkaran kedua
        Circle circle2 = new Circle(150, 100, 50);
        circle2.setFill(Color.YELLOW);
        root.getChildren().add(circle2);
        
        // Membuat lingkaran ketiga
        Circle circle3 = new Circle(200, 100, 50);
        circle3.setFill(Color.GREEN);
        root.getChildren().add(circle3);

        // Menggabungkan dua lingkaran dengan operasi "add"
        Shape union = Shape.union(circle1, circle2);
        union = Shape.union(union, circle3);
        union.setFill(Color.GREEN);
        union.setStroke(Color.BLACK);
        union.setStrokeWidth(2);       // Ketebalan garis tepi

        // Menampilkan jendela utama
        root.getChildren().add(union);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
