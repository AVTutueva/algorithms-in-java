package migratoryBirds;

import java.util.*;
/*
Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type.
If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

Description: https://www.hackerrank.com/challenges/migratory-birds/problem
 */

public class Solution {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int[] birdFreq = new int[5];
        for(int bird: arr){
            birdFreq[bird - 1] += 1;
        }

        int maxFreq = birdFreq[0];
        int minID = 0;

        for(int i = 1; i < 5; i++){
            if(birdFreq[i] > maxFreq){
                maxFreq = birdFreq[i];
                minID = i;
            }
        }

        return minID + 1;
    }

}