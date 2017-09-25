package Tree;

import java.math.BigInteger;

public class FibNums {

    public static void main(String[] args) {
        int n = 5;
        //int fbPrev = 1, fbPrevM1 = 1, tmp;
        BigInteger fbPrev = new BigInteger(String.valueOf(1));
        BigInteger fbPrevM1 = new BigInteger(String.valueOf(1));
        BigInteger tmp = new BigInteger(String.valueOf(0));

        for (int i = 1; i < n + 1; i++) {
            System.out.println(i + " " + fbPrev.toString());
            tmp = fbPrev;
            fbPrev = fbPrevM1.add(fbPrev);
            fbPrevM1 = tmp;
        }
    }
}