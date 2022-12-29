package com.example.dictiinaryusinghashmap29dec;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class BuildUIUX {
    private final Pane searchBarPane = new Pane();
    private final Pane meaningPane = new Pane();

    private final Pane addWordsPane = new Pane();
    TextField searchTextField;
    Button searchButton;
    Text meaningText = new Text();
    TextField addWordTextField;
    TextField addMeaningTextField;
    Button addWordButton;
    Dictionary dictionary = new Dictionary();


    Pane searchBarPane() {   // Set Search Bar
        setSearchTextField();
        setSearchButton();

        searchBarPane.setPrefSize(600,70);
        return searchBarPane;
    }
    Pane meaningPane() {
        meaningPane.setPrefSize(600,200);
        meaningText.setFont(new Font("Times New Rome",12));
        meaningPane.setMaxWidth(400);
        meaningPane.setTranslateX(50);
        meaningText.setTextAlignment(TextAlignment.JUSTIFY);
        meaningText.setWrappingWidth(400);
        meaningPane.getChildren().add(meaningText);

        return meaningPane;
    }
    Pane addNewWordsPane() {
        setAddWordTextField();
        setAddMeaningTextField();
        setAddWordButton();

        addWordsPane.setPrefSize(600,200);
        return addWordsPane;
    }


    private void setSearchTextField() {  // Search TextField
        searchTextField = new TextField();
        searchTextField.setFont(new Font("Times New Roman",12));
        searchTextField.setPromptText("Enter a word");
        searchTextField.setFocusTraversable(false);
        searchTextField.setTranslateX(182.5);
        searchTextField.setTranslateY(12);
        searchTextField.setMaxWidth(150);

        searchTextField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setMeaning(searchTextField.getText());
            }
        });

        searchBarPane.getChildren().add(searchTextField);
    }

    private void setSearchButton() {   // Search Button
        searchButton = new Button("Search");
        searchButton.setPrefWidth(75);
        searchButton.setPrefHeight(10);
        searchButton.setTranslateX(342.5);
        searchButton.setTranslateY(10);

        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setMeaning(searchTextField.getText());
            }
        });

        searchBarPane.getChildren().add(searchButton);
    }

    private void setAddWordTextField() {
        addWordTextField = new TextField();
        addWordTextField.setPrefWidth(150);
        addWordTextField.setTranslateX(225);
        addWordTextField.setTranslateY(50);
        addWordTextField.setPromptText("Enter word");
        addWordTextField.setFocusTraversable(false);

        addWordsPane.getChildren().add(addWordTextField);
    }

    private  void setAddMeaningTextField() {
        addMeaningTextField = new TextField();
        addMeaningTextField.setPrefWidth(150);
        addMeaningTextField.setTranslateX(225);
        addMeaningTextField.setTranslateY(80);
        addMeaningTextField.setPromptText("Enter meaning");
        addMeaningTextField.setFocusTraversable(false);

        addWordsPane.getChildren().add(addMeaningTextField);
    }

    private void setAddWordButton() {
        addWordButton = new Button("Add To Dictionary");
        addWordButton.setFont(new Font("Times New Roman",11));
        addWordButton.setPrefWidth(150);
        addWordButton.setTranslateX(225);
        addWordButton.setTranslateY(120);

        addWordButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                dictionary.addWord(addWordTextField.getText(), addMeaningTextField.getText());
                setAddWordTextField();
                setAddMeaningTextField();

            }
        });

        addWordsPane.getChildren().add(addWordButton);
    }

    private void setMeaning(String word) {
        word = word.trim();
        word = word.replaceAll(" ","");

        if (word.length() == 0){
            meaningText.setText("Please enter a word");
        }
        else if(dictionary.wordExist(word)) {
            word = word.substring(0,1).toUpperCase() + word.substring(1,word.length()).toLowerCase();
            meaningText.setText("Word :  "+ word +"\n\nMeaning :   " + dictionary.getMeaning(word));
        }
        else meaningText.setText(dictionary.getMeaning(word) +
                    "\n\n\nDo you want to add the meaning of ' " + word + " ' to your Dictionary?" +
                    "\n\nEnter word, enter meaning, and click the Button   \n'Add To Dictionary'");

    }


}
