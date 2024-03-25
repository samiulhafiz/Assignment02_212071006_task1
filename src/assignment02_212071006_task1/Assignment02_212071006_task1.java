/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package assignment02_212071006_task1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment02_212071006_task1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My First JavaFX App");
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);

        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        Button button4 = new Button("Button4");
        Button exitButton = new Button("Exit");

        button1.setOnAction(e -> System.out.println("Button1 is pressed."));
        button2.setOnAction(e -> System.out.println("Button2 is pressed."));
        button3.setOnAction(e -> System.out.println("Button3 is pressed."));
        button4.setOnAction(e -> System.out.println("Button4 is pressed."));
        exitButton.setOnAction(e -> primaryStage.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(button1, button2, button3, button4, exitButton);

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
