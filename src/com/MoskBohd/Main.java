package com.MoskBohd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;


public class Main {

    public static void main(String[] args) throws IOException {

        // harry.txt to string
        String content = new String(Files.readAllBytes(Paths.get("harry.txt")));

        // clean the words from a punctuation signs and spaces
        content = content.toLowerCase(Locale.ROOT).replaceAll("[^A-Za-z]", " ");

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




        /* Laboratory work No. 1 */
        // find the longest word in the above text
        String longestWord = "";
        for (int i = 0; i < uniqueAsArray.length; i++){
           if (uniqueAsArray[i].length() >= longestWord.length()) {
               longestWord = uniqueAsArray[i];
           }
        }
        System.out.println("The longest word is " + longestWord.toUpperCase(Locale.ROOT));

        // count the LINES where the word "Harry" is met.
        int wordsHarryCounts = 0;
        for (int i =0; i < words.length; i++){
            if (words[i].equalsIgnoreCase("Harry")) {
                wordsHarryCounts++;
            }
            if(!uniqueAsString.contains(words[i])){
                uniqueAsString += words[i] + " ";
            }
        }
        System.out.println("The word 'Harry' is met " + wordsHarryCounts);

        // take the array of distinct words from Harry Potter
        for (int i = 0; i < uniqueAsArray.length; i++){
            System.out.println(uniqueAsArray[i]);
        }

        // how many distinct words begin from the letter "C"
        int distinctWordC = 0;
        for (String st : uniqueAsArray){
            if (st.startsWith("c")){
                distinctWordC++;
            }
        }
        System.out.println(distinctWordC + " begin from the letter 'C'");

        // create an array of hashes
        Faculties [] faculty = new Faculties[4];
        faculty[0] = new Faculties("Gryffindor");
        faculty[1] = new Faculties("Hufflepuff");
        faculty[2] = new Faculties("Ravenclaw");
        faculty[3] = new Faculties("Slytherin");

        for (Faculties faculties : faculty) {
            System.out.println(faculties.getFacultiesName());
        }

        int hashCode1 = Objects.hash(faculty[0], faculty[1]);
        System.out.println(hashCode1);
        
        // count the intersections of hashes.

    }
}
