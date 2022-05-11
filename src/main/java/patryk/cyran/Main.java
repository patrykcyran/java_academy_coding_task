package patryk.cyran;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        SortedMap<Character, Integer> letters = new TreeMap<>();

        String argument = String.join("", args).toLowerCase(Locale.ROOT);

        for (int i = 0; i < argument.length(); i++) {
            Character currChar = argument.charAt(i);
            if (!letters.containsKey(currChar)) {
                letters.put(currChar, 1);
            } else {
                int currSize = letters.get(currChar);
                letters.replace(currChar, ++currSize);
            }
        }

        System.out.println("Counted letters:");

        for (var entrySet :letters.entrySet()) {
            System.out.println(entrySet.getKey() + " = " + entrySet.getValue());
        }
    }
}