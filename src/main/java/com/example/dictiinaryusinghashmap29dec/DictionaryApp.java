package com.example.dictiinaryusinghashmap29dec;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class DictionaryApp extends Application {
    BuildUIUX buildUIUX = new BuildUIUX();
    BorderPane createContent() {
        BorderPane root = new BorderPane();

        // Set Background Image
        Image image = new Image("C:\\Users\\krish_uv7qyqm\\IdeaProjects\\DictiinaryUsingHashMap29Dec\\src\\main\\DictionaryWall.jpg");
        BackgroundSize bSize = new BackgroundSize(600, 400, false, false, true, true);
        root.setBackground(new Background(new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                bSize)));

        root.setTop(buildUIUX.searchBarPane());
        root.setLeft(buildUIUX.meaningPane());
        root.setBottom(buildUIUX.addNewWordsPane());
        return root;
    }
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(createContent(),600,400);
        stage.setTitle("Dictionary Book");
        stage.setScene(scene);
        Image image = new Image("C:\\Users\\krish_uv7qyqm\\IdeaProjects\\DictiinaryUsingHashMap29Dec\\src\\main\\DictionaryIcon.png");
        stage.getIcons().add(image);
        stage.setMaxWidth(625);
        stage.setMinHeight(425);
        stage.setMaxHeight(425);
        stage.setMaxWidth(625);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}