package chap16stream.sec02;

import java.util.stream.IntStream;

public class FromIntRangeEx {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,100);
        stream.forEach(a->sum+=a);
        System.out.println("Sum : " + sum);
    }
}
