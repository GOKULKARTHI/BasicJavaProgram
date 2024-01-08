package pPck;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Dhanabal";
        
        // Method call to count characters
        HashMap<Character, Integer> charCountMap = countCharacters(str);

        // Display character counts
        System.out.println("Character Counts:");
        for (char c : charCountMap.keySet()) {
            System.out.println("'" + c + "': " + charCountMap.get(c));
        }
    }

    public static HashMap<Character, Integer> countCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Convert the string to char array
        char[] charArray = str.toCharArray();

        // Iterate through the char array to count characters
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                // If character is already present, increment its count
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If character is encountered for the first time, add it to the map with count 1
                charCountMap.put(c, 1);
            }
        }
        return charCountMap;
    }
}



