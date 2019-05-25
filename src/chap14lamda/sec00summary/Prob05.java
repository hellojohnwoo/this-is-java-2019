package chap14lamda.sec00summary;

import java.util.function.IntBinaryOperator;

public class Prob05 {
    private static int[] scores = {11, 55, 22, 33};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(
            (a,b) -> {
                if(a>=b) return a;
                else return b;
        }
        );
        System.out.println("Max : " + max);

        int min = maxOrMin(
                (a,b) -> (a<=b) ? a : b
                // (a,b) -> { return ( (a<=b) ? a:b ); }

        );
        System.out.println("Min : " + min);
    }
}
