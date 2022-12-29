package com.example.dictiinaryusinghashmap29dec;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Dictionary extends Application {
    BuildUIUX buildUIUX = new BuildUIUX();
    BorderPane createContent() {
        BorderPane root = new BorderPane();

        root.setTop(buildUIUX.setSearchBar());
        return root;
    }
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(createContent(),600,400);
        stage.setTitle("Dictionary Book");
        stage.setScene(scene);
        Image image = new Image("C:\\Users\\krish_uv7qyqm\\IdeaProjects\\DictiinaryUsingHashMap29Dec\\src\\main\\DictionaryIcon.png");
        stage.getIcons().add(image);
        stage.getIcons();
        stage.setMaxHeight(415);
        stage.setMaxWidth(615);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}