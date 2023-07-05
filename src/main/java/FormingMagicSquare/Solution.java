package FormingMagicSquare;

/*
You will be given a 3x3 matrix s of integers in the inclusive range [1; 9].
We can convert any digit a to any other digit b in the range [1; 9] at cost of |a - b|.
Given s, convert it into a magic square at minimal cost. Print this cost on a new line.
 */

import java.util.*;

public class Solution {

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static int formingMagicSquare(List<List<Integer>> s) {
        List<List<List<Integer>>> allSquares = new ArrayList<>();
        allSquares.add(List.of(
                List.of(2, 7, 6),
                List.of(9, 5, 1),
                List.of(4, 3, 8)
        ));
        allSquares.add(List.of(
                List.of(6, 1, 8),
                List.of(7, 5, 3),
                List.of(2, 9, 4)
        ));
        allSquares.add(List.of(
                List.of(8, 3, 4),
                List.of(1, 5, 9),
                List.of(6, 7, 2)
        ));
        allSquares.add(List.of(
                List.of(4, 9, 2),
                List.of(3, 5, 7),
                List.of(8, 1, 6)
        ));
        allSquares.add(List.of(
                List.of(2, 9, 4),
                List.of(7, 5, 3),
                List.of(6, 1, 8)
        ));
        allSquares.add(List.of(
                List.of(4, 3, 8),
                List.of(9, 5, 1),
                List.of(2, 7, 6)
        ));
        allSquares.add(List.of(
                List.of(8, 1, 6),
                List.of(3, 5, 7),
                List.of(4, 9, 2)
        ));
        allSquares.add(List.of(
                List.of(6, 7, 2),
                List.of(1, 5, 9),
                List.of(8, 3, 4)
        ));

        int minCosts = Integer.MAX_VALUE;

        for (var curSquare : allSquares) {
            int curCosts = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    curCosts += Math.abs(s.get(i).get(j) - curSquare.get(i).get(j));
                }
            }
            if (curCosts < minCosts) {
                minCosts = curCosts;
            }
        }


        return minCosts;

    }
}

