package formingMagicSquare;

/*
You will be given a 3x3 matrix s of integers in the inclusive range [1; 9].
We can convert any digit a to any other digit b in the range [1; 9] at cost of |a - b|.
Given s, convert it into a magic square at minimal cost. Print this cost on a new line.
 */

import java.util.*;

class MagicSquare {
    private int[][] magicSquare;

    MagicSquare(List<List<Integer>> square) {
        int size = square.get(0).size();
        this.magicSquare = new int[square.size()][square.get(0).size()];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.magicSquare[i][j] = square.get(i).get(j);
            }
        }
    }

    public static MagicSquare fromList(List<Integer> square, int size) {
        List<List<Integer>> data = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                line.add(square.get(size * i + j));
            }
            data.add(line);
        }
        return new MagicSquare(data);
    }


    public int compareTo(MagicSquare squareToCompare) {
        int costs = 0;
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                costs += Math.abs(this.magicSquare[i][j] - squareToCompare.magicSquare[i][j]);
            }
        }
        return costs;
    }
}

public class Solution {

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static int formingMagicSquare(List<List<Integer>> s) {

        MagicSquare originalSquare = new MagicSquare(s);
        List<MagicSquare> allSquares = new ArrayList<>();

        allSquares.add(MagicSquare.fromList(Arrays.asList(2, 7, 6, 9, 5, 1, 4, 3, 8), 3));
        allSquares.add(MagicSquare.fromList(Arrays.asList(6, 1, 8, 7, 5, 3, 2, 9, 4), 3));
        allSquares.add(MagicSquare.fromList(Arrays.asList(8, 3, 4, 1, 5, 9, 6, 7, 2), 3));
        allSquares.add(MagicSquare.fromList(Arrays.asList(4, 9, 2, 3, 5, 7, 8, 1, 6), 3));
        allSquares.add(MagicSquare.fromList(Arrays.asList(2, 9, 4, 7, 5, 3, 6, 1, 8), 3));
        allSquares.add(MagicSquare.fromList(Arrays.asList(4, 3, 8, 9, 5, 1, 2, 7, 6), 3));
        allSquares.add(MagicSquare.fromList(Arrays.asList(8, 1, 6, 3, 5, 7, 4, 9, 2), 3));
        allSquares.add(MagicSquare.fromList(Arrays.asList(6, 7, 2, 1, 5, 9, 8, 3, 4), 3));

        int minCosts = Integer.MAX_VALUE;

        for (var curSquare : allSquares) {
            int curCosts = originalSquare.compareTo(curSquare);
            if (curCosts < minCosts) {
                minCosts = curCosts;
            }
        }

        return minCosts;
    }
}

