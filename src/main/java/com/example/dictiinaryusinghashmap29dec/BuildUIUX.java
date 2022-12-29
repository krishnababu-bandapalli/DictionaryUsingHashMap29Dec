package com.example.dictiinaryusinghashmap29dec;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class BuildUIUX {
    Pane pane = new Pane();

    void setImage() {  // Set Background Wallpaper to App
        String path = "C:\\Users\\krish_uv7qyqm\\IdeaProjects\\DictiinaryUsingHashMap29Dec\\src\\main\\DictionaryWall.jpg";
        Image image = new Image(path);
        ImageView backgroundImage = new ImageView(image);
        backgroundImage.setImage(image);
        backgroundImage.setFitHeight(400);
        backgroundImage.setFitWidth(600);

        pane.getChildren().add(backgroundImage);
    }

    Pane setSearchBar() {   // Set Search Bar

        // Search TextField
        TextField searchTextField = new TextField();
        searchTextField.setFont(new Font("Times New Roman",12));
        searchTextField.setLayoutX(182.5);
        searchTextField.setTranslateY(10);
        searchTextField.setMaxWidth(150);

        // Search Button
        Button searchButton = new Button("Search");
        searchButton.setPrefWidth(75);
        searchButton.setLayoutX(342.5);
        searchButton.setTranslateY(10);

        // Set Background Image
        setImage();

        // Add searchTextField,searchButton to Pane
        pane.getChildren().addAll(searchTextField, searchButton);

        return pane;
    }
}
