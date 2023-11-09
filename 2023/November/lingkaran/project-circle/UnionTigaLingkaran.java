import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class UnionTigaLingkaran extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Membuat jendela utama
        primaryStage.setTitle("Lingkaran Union dengan Garis Tepi JavaFX");

        Pane root = new Pane();
        Scene scene = new Scene(root, 350, 350);

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
        union.setStrokeWidth(2);// Ketebalan garis tepi

        // Membuat teks judul
        Text title = new Text("NAMA: MUHAMMAD GHORA SAMUDRA\nNPM: 202043500890");
        title.setFont(Font.font(16));
        title.setFill(Color.BLACK);
        title.setX(10); // Atur posisi teks
        title.setY(15); // Atur posisi teks
        root.getChildren().add(title);
        
        // Menampilkan jendela utama
        root.getChildren().add(union);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
