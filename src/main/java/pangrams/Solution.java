package pangrams;

import java.util.HashSet;
import java.util.Set;

/*
A pangram is a string that contains every letter of the alphabet.
Given a sentence determine whether it is a pangram in the English alphabet. Ignore case and spaces.
Return either pangram or not pangram as appropriate.

Description: https://www.hackerrank.com/challenges/pangrams/problem
 */
public class Solution {

    public static String pangrams(String s) {
        Set<Character> alphabet = new HashSet<>();
        String sLowerCase = s.toLowerCase();
        for (char ch: sLowerCase.toCharArray()){
            if (ch != ' '){
                alphabet.add(ch);
            }
        }

        return alphabet.size() == 26 ? "pangram" : "not pangram";

    }
}
