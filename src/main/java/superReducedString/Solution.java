package superReducedString;

/*
Reduce a string of lowercase characters in range ascii[‘a’..’z’] by doing a series of operations.
In each operation, select a pair of adjacent letters that match, and delete them.
Delete as many characters as possible using this method and return the resulting string.
If the final string is empty, return Empty String

Description:
https://www.hackerrank.com/challenges/reduced-string/problem
 */

public class Solution {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
        int i = 1;
        while(i < s.length()){
            if (s.charAt(i - 1) == s.charAt(i)){
                s = s.substring(0, i - 1) + s.substring(i + 1, s.length());
                i = 1;
                continue;
            }
            i++;
        }
        if (s.length() == 0){
            s = "Empty String";
        }

        return s;
    }

}
