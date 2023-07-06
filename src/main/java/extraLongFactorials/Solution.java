package extraLongFactorials;

import java.math.*;

public class Solution {
    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger result = new BigInteger("1");

        for(int i = 2; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }

}