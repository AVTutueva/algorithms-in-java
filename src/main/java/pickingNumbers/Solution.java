package pickingNumbers;

import java.util.*;

/*
Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.
Constraints:
2 <= n <= 100
0 < a[i] < 100

Description: https://www.hackerrank.com/challenges/picking-numbers/problem
 */
public class Solution {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        int[] freq = new int[100];
        for (int i: a){
            freq[i] = freq[i] + 1;
        }
        int max = 0;
        for (int i = 0; i < freq.length - 1; i++){
            int temp = freq[i] + freq[i+1];
            if (max < temp){
                max = temp;
            }
        }
        return max;
    }

}

