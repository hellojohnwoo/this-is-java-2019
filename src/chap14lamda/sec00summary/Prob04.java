package chap14lamda.sec00summary;

import java.util.function.IntSupplier;

public class Prob04 {
    public static int method(int x, int y) {    // final
        IntSupplier supplier = () -> {
            // x *= 10;
            int result = x + y;
            return result;
        };

        int result = supplier.getAsInt();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(method(3,5));
    }

}
