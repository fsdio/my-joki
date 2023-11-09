import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import java.awt.*;

public class IntersectEmpatLingkaran extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Membuat jendela utama
        primaryStage.setTitle("Potongan Lingkaran JavaFX");

        Pane root = new Pane();
        Scene scene = new Scene(root, 250, 250);

        // Membuat lingkaran pertama
        Circle circle1 = new Circle(100, 100, 50);
        circle1.setFill(Color.WHITE);
        root.getChildren().add(circle1);
        
        Circle _circle1 = new Circle(100, 100, 50);
        _circle1.setFill(Color.WHITE);
        root.getChildren().add(_circle1);

        // Membuat lingkaran kedua
        Circle circle2 = new Circle(150, 100, 50);
        circle2.setFill(Color.WHITE);
        root.getChildren().add(circle2);
        
        Circle _circle2 = new Circle(150, 100, 50);
        _circle2.setFill(Color.WHITE);
        root.getChildren().add(_circle2);
        
        // Membuat lingkaran kedua
        Circle circle3 = new Circle(100, 150, 50);
        circle3.setFill(Color.WHITE);
        root.getChildren().add(circle3);
        
        Circle _circle3 = new Circle(100, 150, 50);
        _circle3.setFill(Color.WHITE);
        root.getChildren().add(_circle3);
        
        // Membuat lingkaran kedua
        Circle circle4 = new Circle(150, 150, 50);
        circle4.setFill(Color.WHITE);
        root.getChildren().add(circle4);
        
        Circle _circle4 = new Circle(150, 150, 50);
        _circle4.setFill(Color.WHITE);
        root.getChildren().add(_circle4);

        // Menggabungkan dua lingkaran dengan operasi "intersect"
        Shape intersection1 = Shape.intersect(circle1, circle2);
        intersection1.setFill(Color.GREEN);
        
        Shape intersection2 = Shape.intersect(circle1, circle3);
        intersection2.setFill(Color.GREEN);
        
        Shape intersection3 = Shape.intersect(circle2, circle4);
        intersection3.setFill(Color.GREEN);
        
        Shape intersection4 = Shape.intersect(circle3, circle4);
        intersection4.setFill(Color.GREEN);
        
        Shape union_all = Shape.union(intersection1, intersection2);
        union_all = Shape.union(union_all, intersection3);
        union_all = Shape.union(union_all, intersection4);
        union_all.setFill(Color.GREEN);
        union_all.setStroke(Color.BLACK);
        union_all.setStrokeWidth(2);
        
        Shape _intersection = Shape.union(_circle1, _circle2);
        _intersection = Shape.union(_intersection, _circle3);
        _intersection = Shape.union(_intersection, _circle4);
        _intersection.setStroke(Color.BLACK);  // Warna garis tepi
        _intersection.setFill(Color.WHITE);
        _intersection.setStrokeWidth(2);

        // Menampilkan jendela utama
        root.getChildren().add(_intersection);
        root.getChildren().add(union_all);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
