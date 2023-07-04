package veriBigSum;

import java.util.*;

/*
In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
 */

public class Solution {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        long result = 0;

        for (long elem : ar) {
            result += elem;
        }
        return result;

    }
}

