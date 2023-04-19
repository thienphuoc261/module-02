import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, List<String>> dictionary = new HashMap<>();
        while (true) {
            System.out.print("Action: ");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");

            if (tokens[0].equals("lookup")) {
                String word = tokens[1];
                List<String> definitions = dictionary.get(word);

                if (definitions == null) {
                    System.out.println(word + " is not found in the dictionary.");
                } else {
                    System.out.println(word + " definitions:");
                    for (String definition : definitions) {
                        System.out.println("- " + definition);
                    }
                }
            } else if (tokens[0].equals("define")) {
                String word = tokens[1];
                String type = tokens[2].substring(2);
                String definition = scanner.nextLine();
                String sentence = "";
                String meaning = "";

                if (type.equals("p")) {
                    // Process pronunciation definition
                } else {
                    System.out.print("Sentence: ");
                    sentence = scanner.nextLine();
                    System.out.print("Sentence's meaning: ");
                    meaning = scanner.nextLine();
                }

                if (!dictionary.containsKey(word)) {
                    dictionary.put(word, new ArrayList<String>());
                    System.out.println(word + " is not existed in database, created new one!");
                }

                List<String> definitions = dictionary.get(word);
                definitions.add("- " + type + " " + definition + (sentence.isEmpty() ? "" : ("\n  Example: " + sentence + "\n  Meaning: " + meaning)));
                System.out.println("Saved!");
            } else if (tokens[0].equals("drop")) {
                String word = tokens[1];
                dictionary.remove(word);
                System.out.println(word + " is removed from the dictionary.");
            } else {
                System.out.println("Invalid action. Please try again.");
            }
        }
    }
}