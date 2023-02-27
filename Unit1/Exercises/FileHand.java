//Write a program to read an input string from the user and write the vowels of that string in VOWEL.txt and consonants in CONSONANT.txt
package Unit1.Exercises;

import java.io.*;

public class FileHand {
    public static void main(String[] args) {
        // Get input string from the user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String input = "";
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create two FileWriter objects for writing to the files
        FileWriter vowelFile;
        FileWriter consonantFile;
        try {
            vowelFile = new FileWriter("VOWEL.TXT");
            consonantFile = new FileWriter("CONSONANT.TXT");

            // Iterate through the input string
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e'
                        || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o'
                        || Character.toLowerCase(c) == 'u') {
                    // Write the vowel to the VOWEL.TXT file
                    vowelFile.write(c);
                } else {
                    // Write the consonant to the CONSONANT.TXT file
                    consonantFile.write(c);
                }
            }

            // Close the files
            vowelFile.close();
            consonantFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

