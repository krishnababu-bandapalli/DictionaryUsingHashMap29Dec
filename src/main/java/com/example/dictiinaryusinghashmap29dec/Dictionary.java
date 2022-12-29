package com.example.dictiinaryusinghashmap29dec;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {
    Map<String, String> dictionary = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    public Dictionary() {
        this.dictionary = dictionary;
        addWordsList();
    }

    private void addWordsList() {
        addWord("English", "English is a Language");
        addWord("Dictionary","a book or electronic resource that lists the words of a language (typically in alphabetical order) and gives their meaning, or gives the equivalent words in a different language, often also providing information about pronunciation, origin, and usage.");
        addWord("Java", "Java is a widely used object-oriented programming language and software platform that runs on billions of devices, including notebook computers, mobile devices, gaming consoles, medical devices and many others");
    }

    void addWord(String word, String meaning) {
        try {
            dictionary.put(word, meaning);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    String getMeaning(String word) {
        if (dictionary.containsKey(word)) return dictionary.get(word);

        else return "The meaning of  " + "' " + word + " '" + "  is not exist in Dictionary";
    }
    boolean wordExist(String word) {
        return dictionary.containsKey(word);
    }
}
