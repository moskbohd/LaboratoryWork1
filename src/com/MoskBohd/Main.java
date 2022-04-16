package com.MoskBohd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {

        // harry.txt to string
        String content = new String(Files.readAllBytes(Paths.get("harry.txt")));

        // clean the words from a punctuation signs and spaces
        content = content.toLowerCase(Locale.ROOT).replaceAll("[^A-Za-z ]", "");

        // split the novel into an array of words
        String[] words = content.split(" +");

        // create another array containing distinct words
        String uniqueAsString = "";

        for (int i =0; i < words.length; i++){
            if(!uniqueAsString.contains(words[i])){
                uniqueAsString += words[i] + " ";
            }
        }
        String[] uniqueAsArray = uniqueAsString.split(" ");

        // order the words in alphabetic order
        Arrays.sort(uniqueAsArray);


        for (int i = 0; i < uniqueAsArray.length; i++){
            System.out.println(uniqueAsArray[i]);
        }

    }
}
