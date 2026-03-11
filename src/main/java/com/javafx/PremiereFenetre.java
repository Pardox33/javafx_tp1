package com.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PremiereFenetre extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();

        Line ligne = new Line(50, 50, 200, 50);
        ligne.setStroke(Color.DARKBLUE);

        Rectangle rectangle = new Rectangle(50, 100, 150, 80);
        rectangle.setFill(Color.BLUEVIOLET);

        Circle cercle = new Circle(200, 250, 50);
        cercle.setFill(Color.CRIMSON);

        root.getChildren().add(ligne);
        root.getChildren().add(rectangle);
        root.getChildren().add(cercle);

        Scene scene = new Scene(root, 400, 400, Color.LIGHTGRAY);

        stage.setTitle("Exemple de dessin de formes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}