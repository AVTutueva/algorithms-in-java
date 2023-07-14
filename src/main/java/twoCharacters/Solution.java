package twoCharacters;

import java.util.*;

/*
Given a string, remove characters until the string is made up of any two alternating characters.
When you choose a character to remove, all instances of that character must be removed.
Determine the longest string possible that contains just two alternating letters.

Description:
https://www.hackerrank.com/challenges/two-characters/problem
 */
public class Solution {

    public static int alternate(String s) {
        Set<Character> uniqueCharacters = new HashSet<>();
        for (char character: s.toCharArray()){
            uniqueCharacters.add(character);
        }

        int length = 0;
        if (uniqueCharacters.size() == 1){
            return 0;
        }

        List<Character> charactersList = new LinkedList<>(uniqueCharacters);

        for (int i = 0; i < charactersList.size() - 1; i++){
            for (int j = i + 1; j < charactersList.size(); j++){
                String str = "";
                for (Character character : s.toCharArray()) {
                    if (character.equals(charactersList.get(i)) || character.equals(charactersList.get(j))) {
                        str = str + character;
                    }
                }
                if (isAlternation(str) && str.length() > length) {
                    length = str.length();
                }
            }
        }

        return length;
    }

    private static boolean isAlternation(String s) {
        char previous = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == previous) {
                return false;
            }
            previous = s.charAt(i);
        }
        return true;
    }
}
