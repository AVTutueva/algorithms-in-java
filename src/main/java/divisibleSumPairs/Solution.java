package divisibleSumPairs;
import java.util.*;

/*
Given an array of integers ar and a positive integer k, determine the number of pairs (i, j) where i < j and ar[i] + ar[j] is divisible by k.

Description: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
public class Solution {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int counter = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    counter += 1;
                }
            }
        }

        return counter;
    }

}