package funnyString;

/*
In this challenge, you will determine whether a string is funny or not.
To determine whether a string is funny, create a copy of the string in reverse e.g. abc -> cba.
Iterating through each string, compare the absolute difference in the ascii values of the characters at positions 0 and 1, 1 and 2 and so on to the end.
If the list of absolute differences is the same for both strings, they are funny.

Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.

Description: https://www.hackerrank.com/challenges/funny-string/problem
 */
public class Solution {

    public static String funnyString(String s) {
        StringBuilder original = new StringBuilder(s);
        StringBuilder reversed = new StringBuilder(s).reverse();

        int[] difOriginal = calculateASCIIdif(original);
        int[] difReversed = calculateASCIIdif(reversed);

        for (int i = 0; i < difOriginal.length; i++){
            if (difOriginal[i] != difReversed[i]){
                return "Not Funny";
            }
        }
        return "Funny";

    }

    private static int[] calculateASCIIdif(StringBuilder s){
        int[] result = new int[s.length() - 1];

        for (int i = 0; i < s.length() - 1; i++){
            result[i] = Math.abs((int)s.charAt(i) - (int)s.charAt(i + 1));
        }
        return result;
    }
}
