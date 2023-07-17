package HackerRankInString;

/*
We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank.
Remeber that a subsequence maintains the order of characters selected from a sequence.

Description: https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
 */

class Solution {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
        char[] hackerrank = new char[]{'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        int j = 0;
        for (char chr: s.toCharArray()){
            if (chr == hackerrank[j]){
                j++;
            }
            if (j == hackerrank.length){
                return "YES";
            }
        }
        return "NO";
    }

}