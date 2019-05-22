package chap14lamda.sec05.O4;

import java.util.function.IntBinaryOperator;

public class OperatorEx {
    private static int[] scores = { 00, 22, 11, 33 };

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[3];
        for(int score : scores) {
            return operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(
                (a, b) -> {
                    if(a >= b)
                        return a;
                    else
                        return b;
                }
        );
        System.out.println("max : " + max);


        int min = maxOrMin(
                (a, b) -> {
                    if(a <= b)
                        return a;
                    else
                        return b;
                }
        );
        System.out.println("min : " + min);
    }

}
