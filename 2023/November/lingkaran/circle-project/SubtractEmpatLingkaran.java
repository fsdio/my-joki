import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class SubtractEmpatLingkaran extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Membuat jendela utama
        primaryStage.setTitle("Hilangkan Hasil Potongan di Tengah Dua Lingkaran JavaFX");

        Pane root = new Pane();
        Scene scene = new Scene(root, 250, 250);

        // Membuat lingkaran pertama
        Circle circle1 = new Circle(100, 100, 50);
        circle1.setFill(Color.BLUE);
        root.getChildren().add(circle1);

        // Membuat lingkaran kedua
        Circle circle2 = new Circle(150, 100, 50);
        circle2.setFill(Color.WHITE);
        root.getChildren().add(circle2);
        
        // Membuat lingkaran pertama
        Circle circle3 = new Circle(100, 185, 50);
        circle3.setFill(Color.BLUE);
        root.getChildren().add(circle3);

        // Membuat lingkaran kedua
        Circle circle4 = new Circle(150, 185, 50);
        circle4.setFill(Color.WHITE);
        root.getChildren().add(circle4);

        // Menghitung pemotongan untuk lingkaran pertama
        Shape subtraction1 = Shape.subtract(circle1, circle2);

        // Menghitung pemotongan untuk lingkaran kedua
        Shape subtraction2 = Shape.subtract(circle2, circle1);
        
        // Menghitung pemotongan untuk lingkaran pertama
        Shape subtraction3 = Shape.subtract(circle3, circle4);

        // Menghitung pemotongan untuk lingkaran kedua
        Shape subtraction4 = Shape.subtract(circle4, circle3);

        // Menghitung area tengah yang tumpang tindih
        Shape intersection1 = Shape.intersect(circle1, circle2);
        Shape intersection2 = Shape.intersect(circle3, circle4);

        // Menggabungkan hasil pemotongan dan area tengah
        Shape result1 = Shape.union(subtraction1, subtraction2);
        result1 = Shape.union(result1, intersection1);
        
        Shape result2 = Shape.union(subtraction3, subtraction4);
        result2 = Shape.union(result2, intersection2);

        // Menghilangkan hasil potongan di tengah
        Shape withoutCenter1 = Shape.subtract(result1, intersection1);
        withoutCenter1.setFill(Color.GREEN);
        withoutCenter1.setStroke(Color.BLACK);
        withoutCenter1.setStrokeWidth(2); 
        
        Shape withoutCenter2 = Shape.subtract(result2, intersection2);
        withoutCenter2.setFill(Color.GREEN);
        withoutCenter2.setStroke(Color.BLACK);
        withoutCenter2.setStrokeWidth(2); 
        
        Shape union_all = Shape.union(withoutCenter1, withoutCenter2);
        union_all.setFill(Color.GREEN);
        union_all.setStroke(Color.BLACK);
        union_all.setStrokeWidth(2);

        root.getChildren().add(union_all);
        
        // Menampilkan jendela utama
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
