package climbingTheLeaderboard;

import java.util.*;

/*
An arcade game player wants to climb to the top of the leaderboard and track their ranking.
The game uses Dense Ranking, so its leaderboard works like this:
1. The player with the highest score is ranked number  on the leaderboard.
2. Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.
 */

public class Solution {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        Set<Integer> set = new LinkedHashSet<>();
        for (Integer i : ranked) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        List<Integer> res = new ArrayList<>();
        int rank = list.size() + 1;
        for (Integer i : player) {
            for (int j = rank - 2; j >= 0; j--) {
                if (i < list.get(j)) break;
                else if (i == list.get(j)) {
                    rank--;
                    break;
                } else rank--;
            }
            res.add(rank);
        }
        return res;
    }

}